package com.google.mvpexample.api;

import android.support.annotation.NonNull;

import com.google.mvpexample.api.responses.GetGreetingsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {
    /**
     * @param name <p></p>
     * @return GetGreetingsResponse
     */

    @GET("get_greetings")
    Call<GetGreetingsResponse> getGreetings(
            @Query("name") @NonNull String name);

}
