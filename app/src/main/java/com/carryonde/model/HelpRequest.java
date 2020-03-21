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

    @SerializedName("distance")
    public String distance = "";

    @SerializedName("when")
    public String when = "";

    @SerializedName("duration")
    public String duration ="";

    public  HelpRequest(String organisationId, String title , String description, String when, String duration, Location location){
        this.organisationId = organisationId;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.location = location;
    }

}
