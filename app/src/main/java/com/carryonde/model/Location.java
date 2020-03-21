package com.carryonde.model;

import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("short")
    public String shortName = "";

    @SerializedName("country")
    public String zip = "";

    @SerializedName("zip")
    public String street = "";

    @SerializedName("street")
    public int number = 0;


    @SerializedName("add")
    public String add= "";

    public Location(String shortName, String zip, String street, int number, String add) {
        this.shortName = shortName;
        this.zip = zip;
        this.street = street;
        this.number = number;
        this.add = add;
    }
}
