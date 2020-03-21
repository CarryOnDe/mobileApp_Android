package com.carryonde.network;

import com.carryonde.model.HelpRequest;
import com.carryonde.model.HelpRequests;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CarryOnApi {

    //@GET("organisation/helprequest/{zip}/{rad}")
    @GET("/helpRequests/search/findByZipAndDistance")
    Call<HelpRequests> getHelpRequestsByRadius(@Query("zip") String zip, @Query("rad") int rad);
}
