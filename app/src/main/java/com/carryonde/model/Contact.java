package com.carryonde.model;

import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("orgId")
    public String orgId = "";

    @SerializedName("orgName")
    public String orgName = "";

    @SerializedName("persName")
    public String persName = "";

    @SerializedName("tel")
    public String tel = "";

    @SerializedName("mail")
    public String mail = "";

    public Contact(String orgName, String persName, String tel, String mail) {
        this.orgName = orgName;
        this.persName = persName;
        this.tel = tel;
        this.mail = mail;
    }
}
