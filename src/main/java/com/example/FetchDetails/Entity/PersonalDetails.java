package com.example.FetchDetails.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class PersonalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pd_id;
    private String fullname;
    private String dateofbirth;
    private String mobile;
    private String email;
    private String city;
    private String maritalstatus;

    @OneToOne(mappedBy = "personalDetails", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private EmploymentDetails employmentDetails;


    @OneToOne(mappedBy = "personalDetails", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private BankDetails bankDetails;

    public Integer getPd_id() {
        return pd_id;
    }

    public void setPd_id(Integer pd_id) {
        this.pd_id = pd_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public EmploymentDetails getEmploymentDetails() {
        return employmentDetails;
    }

    public void setEmploymentDetails(EmploymentDetails employmentDetails) {
        this.employmentDetails = employmentDetails;
    }

    public BankDetails getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    @Override
    public String toString() {
        return "PersonalDetails{" +
                "id=" + pd_id +
                ", fullname='" + fullname + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", maritalstatus='" + maritalstatus + '\'' +
                ", employmentDetails=" + employmentDetails +
                ", bankDetails=" + bankDetails +
                '}';
    }
}
