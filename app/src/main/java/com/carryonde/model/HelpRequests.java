package com.carryonde.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class HelpRequests {

    @SerializedName("_embedded")
    public HelpRequestsCL helpRequestsCL;


    class HelpRequestsCL{
        @SerializedName("helpRequests")
        List<HelpRequest> helpRequests;
    }

    public List <HelpRequest> getHelpRequests(){
        if ( helpRequestsCL != null ){
            if ( helpRequestsCL.helpRequests != null){
                return helpRequestsCL.helpRequests;
            }
        }
        return new ArrayList<>();
    }
}
