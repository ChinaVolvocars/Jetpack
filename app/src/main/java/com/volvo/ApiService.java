package com.volvo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface ApiService {

  @GET("users")
  Call<List<User>> getUser(@Query("since") Long since, @Query("per_page") int perPage);

  @GET("https://dncapi.feixiaohao.com/api/exchange/volrank?page=1&pagesize=50&webp=1")
  Call<List<User>> getUser();


}
