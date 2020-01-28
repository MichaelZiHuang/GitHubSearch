package com.example.android.githubsearch.utils;



import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NetworkUtils {
    private static final OkHttpClient mHTTPCLient  = new OkHttpClient();

    public static String doHttpGet(String url){
        Request request = new Request.Builder().url(url).build();
        Response response = mHTTPCLient.newCall(request).execute();
        try {
            return response.body().toString();
        } finally {
            response.close();
        }

    }
}
