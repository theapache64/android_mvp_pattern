package com.google.mvpexample.api.responses;

import com.google.gson.annotations.SerializedName;


/**
 * Generated using MockAPI (https://github.com/theapache64/Mock-API) : Fri Sep 28 06:04:12 UTC 2018
 */
public class GetGreetingsResponse {

    @SerializedName("data")
    private final Data data;

    @SerializedName("error")
    private final boolean error;

    @SerializedName("message")
    private final String message;


    public GetGreetingsResponse(Data data, boolean error, String message) {
        this.data = data;
        this.error = error;
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public boolean isError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public static class Data {

        @SerializedName("greeting")
        private final String greeting;


        public Data(String greeting) {
            this.greeting = greeting;
        }

        public String getGreeting() {
            return greeting;
        }

    }


}