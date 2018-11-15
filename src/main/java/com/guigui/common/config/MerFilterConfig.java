package com.guigui.common.config;

import com.guigui.common.annotation.Attribute;

/**
 * 商户过滤特殊处理配置，每个字段分别代表不同过滤维度
 */
public class MerFilterConfig {
    @Attribute(number = 1)
    private String notSendSms;

    @Attribute(number = 2)
    private String notSendMq;

    @Attribute(number = 3)
    private String useExtOrder;

    @Attribute(number = 4)
    private String accountSpecial;

    @Attribute(number = 5)
    private String specialBank;

    @Attribute(number = 6)
    private String remindAlone;

    @Attribute(number = 7)
    private String deudctAlone;

    public String getNotSendSms() {
        return notSendSms;
    }

    public void setNotSendSms(String notSendSms) {
        this.notSendSms = notSendSms;
    }

    public String getNotSendMq() {
        return notSendMq;
    }

    public void setNotSendMq(String notSendMq) {
        this.notSendMq = notSendMq;
    }

    public String getUseExtOrder() {
        return useExtOrder;
    }

    public void setUseExtOrder(String useExtOrder) {
        this.useExtOrder = useExtOrder;
    }

    public String getAccountSpecial() {
        return accountSpecial;
    }

    public void setAccountSpecial(String accountSpecial) {
        this.accountSpecial = accountSpecial;
    }

    public String getSpecialBank() {
        return specialBank;
    }

    public void setSpecialBank(String specialBank) {
        this.specialBank = specialBank;
    }

    public String getRemindAlone() {
        return remindAlone;
    }

    public void setRemindAlone(String remindAlone) {
        this.remindAlone = remindAlone;
    }

    public String getDeudctAlone() {
        return deudctAlone;
    }

    public void setDeudctAlone(String deudctAlone) {
        this.deudctAlone = deudctAlone;
    }
}
