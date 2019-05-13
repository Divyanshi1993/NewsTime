package com.nytimes.news.data.remote;


/**
 * Keep all the service related constants here.
 */
public class ApiConstants {
    public static final String BASE_URL = "http://api.nytimes.com/";
    public static final long CONNECT_TIMEOUT = 30000;
    public static final long READ_TIMEOUT = 30000;
    public static final long WRITE_TIMEOUT = 30000;
    public static final String API_KEY = "your-Api-key-here";

    private ApiConstants(){
        // Private constructor to hide the implicit one
    }

}
