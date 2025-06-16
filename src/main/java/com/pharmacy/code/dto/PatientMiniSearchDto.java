package com.pharmacy.code.dto;

public class PatientMiniSearchDto {
     private String firstName;
    private String lastName;
    private String phoneNumber;
    private Integer uhid;

    public PatientMiniSearchDto(String firstName, String lastName, String phoneNumber, Integer uhid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.uhid = uhid;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getUhid() {
        return uhid;
    }

    public void setUhid(Integer uhid) {
        this.uhid = uhid;
    }

    @Override
    public String toString() {
        return "PatientMiniSearchDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", uhid=" + uhid +
                '}';
    }
}
