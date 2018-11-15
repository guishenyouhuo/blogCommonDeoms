package com.guigui.common.config;

import com.guigui.common.annotation.Attribute;

/**
 * 商户短信配置，每一个字段表示一类短信业务码
 */
public class MerSmsConfig {

    @Attribute(number = 1)
    private String loanSucc;

    @Attribute(number = 2)
    private String loanFail;

    @Attribute(number = 3)
    private String perRepay;

    @Attribute(number = 4)
    private String advanceRepay;

    @Attribute(number = 5)
    private String repayFail;

    @Attribute(number = 6)
    private String deductRepay;

    @Attribute(number = 7)
    private String remindT;

    @Attribute(number = 8)
    private String remindT3;

    public String getLoanSucc() {
        return loanSucc;
    }

    public void setLoanSucc(String loanSucc) {
        this.loanSucc = loanSucc;
    }

    public String getLoanFail() {
        return loanFail;
    }

    public void setLoanFail(String loanFail) {
        this.loanFail = loanFail;
    }

    public String getPerRepay() {
        return perRepay;
    }

    public void setPerRepay(String perRepay) {
        this.perRepay = perRepay;
    }

    public String getAdvanceRepay() {
        return advanceRepay;
    }

    public void setAdvanceRepay(String advanceRepay) {
        this.advanceRepay = advanceRepay;
    }

    public String getRepayFail() {
        return repayFail;
    }

    public void setRepayFail(String repayFail) {
        this.repayFail = repayFail;
    }

    public String getDeductRepay() {
        return deductRepay;
    }

    public void setDeductRepay(String deductRepay) {
        this.deductRepay = deductRepay;
    }

    public String getRemindT() {
        return remindT;
    }

    public void setRemindT(String remindT) {
        this.remindT = remindT;
    }

    public String getRemindT3() {
        return remindT3;
    }

    public void setRemindT3(String remindT3) {
        this.remindT3 = remindT3;
    }
}
