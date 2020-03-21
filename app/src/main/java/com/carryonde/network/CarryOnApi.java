package com.carryonde.network;

import com.carryonde.model.HelpRequest;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CarryOnApi {

    @GET("organisation/helprequest/{zip}/{rad}")
    List<HelpRequest> getHelpRequestsByRadius(@Path("zip") String zip, @Path("rad") int rad);
}
