package com.example.FetchDetails.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class BankDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bd_id;
    private String bank;
    private String branch;
    private Integer accountnumber;
    private String accounttype;
    private String ifscCode;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_pd_id")
    @JsonBackReference
    private PersonalDetails personalDetails;

    public Integer getBd_id() {
        return bd_id;
    }

    public void setBd_id(Integer bd_id) {
        this.bd_id = bd_id;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Integer getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(Integer accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }


    @Override
    public String toString() {
        return "BankDetails{" +
                "id=" + bd_id +
                ", bank='" + bank + '\'' +
                ", branch='" + branch + '\'' +
                ", accountnumber=" + accountnumber +
                ", accounttype='" + accounttype + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", personalDetails=" + personalDetails +
                '}';
    }

}
