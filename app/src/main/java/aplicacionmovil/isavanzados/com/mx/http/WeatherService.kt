package aplicacionmovil.isavanzados.com.mx.http

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("weather")
    fun getCity(@Query("q") city: String, @Query("appid") key: String): Call<City>

    @GET("weather")
    fun getCityCelsius(@Query("q") city: String, @Query("appid") key: String, @Query("units") value: String): Call<City>

}