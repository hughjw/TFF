package com.yakesoft.tff.entity;

import java.util.Date;

public class Tffvchrpurchase {
    private int vchar_id;
    private Date vchr_date;
    private int qty;
    private float amount;
    private String remark;

    @Override
    public String toString() {
        return "Tffvchrpurchase{" +
                "vchar_id=" + vchar_id +
                ", vchr_date=" + vchr_date +
                ", qty=" + qty +
                ", amount=" + amount +
                ", remark='" + remark + '\'' +
                '}';
    }

    public int getVchar_id() {
        return vchar_id;
    }

    public void setVchar_id(int vchar_id) {
        this.vchar_id = vchar_id;
    }

    public Date getVchr_date() {
        return vchr_date;
    }

    public void setVchr_date(Date vchr_date) {
        this.vchr_date = vchr_date;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
