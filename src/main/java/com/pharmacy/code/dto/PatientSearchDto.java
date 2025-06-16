package com.pharmacy.code.dto;

import java.util.Date;

public class PatientSearchDto {
    private Integer patientId;
    private String firstName;
    private String lastName;
    private Integer uhid;
    private String gender;
    private String phoneNumber;
    private String orderNumber;
    private String sequenceNumber;
    private String billNumber;
    private Date orderDate;
    private Float amountPaid;
    private Float dueAmount;
    private String status;

    public PatientSearchDto(Integer patientId, String firstName, String lastName, Integer uhid,
                            String gender, String phoneNumber, String orderNumber, String sequenceNumber,
                            String billNumber, Date orderDate, Float amountPaid, Float dueAmount, String status
    ) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.uhid = uhid;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.orderNumber = orderNumber;
        this.sequenceNumber = sequenceNumber;
        this.billNumber = billNumber;
        this.orderDate = orderDate;
        this.amountPaid = amountPaid;
        this.dueAmount = dueAmount;
        this.status = status;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getUhid() {
        return uhid;
    }

    public void setUhid(Integer uhid) {
        this.uhid = uhid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Float getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(Float dueAmount) {
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
        return "PatientSearchDto{" +
                "patientId=" + patientId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", uhid=" + uhid +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", sequenceNumber='" + sequenceNumber + '\'' +
                ", billNumber='" + billNumber + '\'' +
                ", orderDate=" + orderDate +
                ", amountPaid=" + amountPaid +
                ", dueAmount=" + dueAmount +
                ", status='" + status + '\'' +
                '}';
    }
}