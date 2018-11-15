package com.guigui.common;

import com.alibaba.fastjson.JSON;
import com.guigui.common.config.MerFilterConfig;
import com.guigui.common.config.MerSmsConfig;
import com.guigui.common.model.DictionaryConfig;
import com.guigui.common.utils.CommonConfUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testDictTransform() throws Exception{
        System.out.println();
        // 类型为MerSmsConfig的配置列表
        List<DictionaryConfig> merSmsConfList = new ArrayList<>();
        // mer0001商户的sms配置
        DictionaryConfig merSmsConf1 = new DictionaryConfig();
        merSmsConf1.setDictKey("mer0001");
        merSmsConf1.setAttribute1("L1001");
        merSmsConf1.setAttribute2("L1002");
        merSmsConf1.setAttribute3("R1001");
        merSmsConf1.setAttribute4("R1002");
        merSmsConf1.setAttribute5("R1003");
        merSmsConf1.setAttribute6("R1004");
        merSmsConf1.setAttribute7("R1005");
        merSmsConf1.setAttribute8("R1006");
        merSmsConfList.add(merSmsConf1);

        // mer0002商户的sms配置
        DictionaryConfig merSmsConf2 = new DictionaryConfig();
        merSmsConf2.setDictKey("mer0002");
        merSmsConf2.setAttribute1("L2001");
        merSmsConf2.setAttribute2("L2002");
        merSmsConf2.setAttribute3("R2001");
        merSmsConf2.setAttribute4("R2002");
        merSmsConf2.setAttribute5("R2003");
        merSmsConf2.setAttribute6("R2004");
        merSmsConf2.setAttribute7("R2005");
        merSmsConf2.setAttribute8("R2006");
        merSmsConfList.add(merSmsConf2);

        Map<String, MerSmsConfig> merSmsConfigMap = CommonConfUtil.transformDict(merSmsConfList, MerSmsConfig.class);
        System.out.println("MerSmsConfig配置：");
        for (String dictKey : merSmsConfigMap.keySet()) {
            System.out.println("\t" + dictKey + ": " + JSON.toJSONString(merSmsConfigMap.get(dictKey)));
        }
        System.out.println("==============================================");


        // 类型为MerFilterConfig的配置列表
        List<DictionaryConfig> merFilterConfList = new ArrayList<>();
        // mer0001商户的Filter配置
        DictionaryConfig merFilterConf1 = new DictionaryConfig();
        merFilterConf1.setDictKey("mer0001");
        merFilterConf1.setAttribute1("1");
        merFilterConf1.setAttribute2("0");
        merFilterConf1.setAttribute3("1");
        merFilterConf1.setAttribute4("1");
        merFilterConf1.setAttribute5("0");
        merFilterConf1.setAttribute6("0");
        merFilterConf1.setAttribute7("1");
        merFilterConfList.add(merFilterConf1);

        // mer0002商户的Filter配置
        DictionaryConfig merFilterConf2 = new DictionaryConfig();
        merFilterConf2.setDictKey("mer0002");
        merFilterConf2.setAttribute1("0");
        merFilterConf2.setAttribute2("0");
        merFilterConf2.setAttribute3("1");
        merFilterConf2.setAttribute4("0");
        merFilterConf2.setAttribute5("1");
        merFilterConf2.setAttribute6("1");
        merFilterConf2.setAttribute7("0");
        merFilterConfList.add(merFilterConf2);

        Map<String, MerFilterConfig> merFilterConfigMap = CommonConfUtil.transformDict(merFilterConfList, MerFilterConfig.class);
        System.out.println("MerFilterConfig配置：");
        for (String dictKey : merFilterConfigMap.keySet()) {
            System.out.println("\t" + dictKey + ": " + JSON.toJSONString(merFilterConfigMap.get(dictKey)));
        }
    }
}
