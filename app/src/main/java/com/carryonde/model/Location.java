package com.carryonde.model;

import com.google.gson.annotations.SerializedName;

public class Location {
    @SerializedName("country")
    String zip = "";

    @SerializedName("zip")
    String street = "";

    @SerializedName("street")
    int number = 0;


    @SerializedName("add")
    String add= "";
}
