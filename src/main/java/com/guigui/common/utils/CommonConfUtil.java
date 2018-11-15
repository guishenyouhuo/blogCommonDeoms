package com.guigui.common.utils;

import com.guigui.common.annotation.Attribute;
import com.guigui.common.model.DictionaryConfig;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 配置转换处理工具类
 * 将数据库中属性字段转换为有具体含义的映射类字段
 */
public final class CommonConfUtil {

    private static final String  GET_ATTRIBUTE_METHOD = "getAttribute";

    public static <T> Map<String, T> transformDict(List<DictionaryConfig> dictList, Class<T> clazz) throws Exception {
        // 新建一个Map用于存放字典Key和具体对象的映射
        Map<String, T> resultMap = new HashMap<>();
        // 遍历数据库中对象列表，依次进行转换
        for (DictionaryConfig dictConf : dictList) {
            // 反射获取转换的目标对象字段（有具体含义的）
            Field[] clazzFields = clazz.getDeclaredFields();
            // 将类型T实例化一个对象出来
            T obj = clazz.newInstance();
            // 遍历字段列表逐个进行赋值处理
            for (Field field : clazzFields) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                // 字段上面存在Attribute注解
                if (field.isAnnotationPresent(Attribute.class)) {
                    // 获取注解的number，确定对应到字典表哪个字段
                    Attribute attrAnno = field.getAnnotation(Attribute.class);
                    int number = attrAnno.number();
                    Method getAttribute = DictionaryConfig.class.getDeclaredMethod(GET_ATTRIBUTE_METHOD + number);
                    // 将字典表对应属性字段设置到转换后的映射字段上
                    Object attrVal = getAttribute.invoke(dictConf);
                    field.set(obj, attrVal);
                }
            }
            resultMap.put(dictConf.getDictKey(), obj);
        }
        return resultMap;
    }
}
