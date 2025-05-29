package com.pharmacy.code.dto;

import java.io.Serializable;
import java.util.Date;

public class PharmaContext implements Serializable  {

    private String orderNumber;
    private Integer uhid;
    private String sequenceNumber;
    private String billNumber;
    private String transactionId;
    private Date orderDate;
    private Date lastModifiedDate;
    private String createdBy;
    private String lastModifiedBy;
    private Double amountPaid;
    private Double dueAmount;
    private String status;

    public PharmaContext(){ }

    public PharmaContext(String orderNumber, Integer uhid, String sequenceNumber, String billNumber, String transactionId,
                         Date orderDate, Date lastModifiedDate, String createdBy, String lastModifiedBy,
                         Double amountPaid, Double dueAmount, String status) {
        this.orderNumber = orderNumber;
        this.uhid = uhid;
        this.sequenceNumber = sequenceNumber;
        this.billNumber = billNumber;
        this.transactionId = transactionId;
        this.orderDate = orderDate;
        this.lastModifiedDate = lastModifiedDate;
        this.createdBy = createdBy;
        this.lastModifiedBy = lastModifiedBy;
        this.amountPaid = amountPaid;
        this.dueAmount = dueAmount;
        this.status = status;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getUhid() {
        return uhid;
    }

    public void setUhid(Integer uhid) {
        this.uhid = uhid;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(Double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PharmaContext{" +
                "orderNumber='" + orderNumber + '\'' +
                ", uhid=" + uhid +
                ", sequenceNumber='" + sequenceNumber + '\'' +
                ", billNumber='" + billNumber + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", orderDate=" + orderDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", createdBy='" + createdBy + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", amountPaid=" + amountPaid +
                ", dueAmount=" + dueAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
