package com.richard.abigayle.hotelfinder.Helpers;

import com.richard.abigayle.hotelfinder.POJO.MainResponse;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by LENOVO on 3/28/2018.
 */

public interface HotelNetworkClient {

    @GET("maps/api/place/nearbysearch/json")
   Call<MainResponse> hotelList(
           @QueryMap Map<String,String> params
           );

}
