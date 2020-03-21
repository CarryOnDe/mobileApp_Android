package com.carryonde.model;

import com.google.gson.annotations.SerializedName;

public class HelpRequest {

    @SerializedName("organisationId")
    public String organisationId = "";

    @SerializedName("title")
    public String title = "";

    @SerializedName("description")
    public String description ="";

    @SerializedName("requestDate")
    public String requestDate = "";

    @SerializedName("location")
    public Location location = null;

    public  HelpRequest(String organisationId, String title , String description){
        this.organisationId = organisationId;
        this.title = title;
        this.description = description;
    }

}
