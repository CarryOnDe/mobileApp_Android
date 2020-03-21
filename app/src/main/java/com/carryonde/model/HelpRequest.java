package com.carryonde.model;

import com.google.gson.annotations.SerializedName;

public class HelpRequest {
    /*
        "title" : "Mock Request 1",
      "description" : "Mock Request 1 description",
      "requestDate" : "2020-03-21T19:51:55.722752",
      "location" : "Ort 1",
     */
    @SerializedName("organisationId")
    public String organisationId = "";

    @SerializedName("title")
    public String title = "";

    @SerializedName("description")
    public String description ="";

    @SerializedName("requestDate")
    public String requestDate = "";

    @SerializedName("location")
    public String location = null;

    @SerializedName("distance")
    public String distance = "";

    @SerializedName("when")
    public String when = "";

    @SerializedName("duration")
    public String duration ="";

    public  HelpRequest(String organisationId, String title , String description, String when, String duration, String location){
        this.organisationId = organisationId;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.location = location;
    }

}
