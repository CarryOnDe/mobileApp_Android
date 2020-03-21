package com.carryonde.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CarryOnInstance {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://carryon-backend.pierrewilken.de/";

    public static Retrofit getRetrofitInstance() {



        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
