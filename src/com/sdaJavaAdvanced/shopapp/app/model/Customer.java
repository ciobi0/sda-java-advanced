package com.sdaJavaAdvanced.shopapp.app.model;

public class Customer {
    private String id;
    private String address;
    private String phoneNumber;
    private String email;
    private Account account;
    private CustomerState customerState;

    public Customer(String id, String address, String phoneNumber, String email, Account account, CustomerState customerState) {
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.account = account;
        this.customerState=customerState;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public CustomerState getCustomerState() {
        return customerState;
    }

    public void setCustomerState(CustomerState customerState) {
        this.customerState = customerState;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", account=" + account +
                '}';
    }
}
