package com.carryonde.model;

import com.google.gson.annotations.SerializedName;

public class Contact {
    @SerializedName("name")
    String name = "";

    @SerializedName("tel")
    String tel = "";

    @SerializedName("mail")
    String mail = "";
}
