package aplicacionmovil.isavanzados.com.mx.http

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class API {

    var BASE_URL = "http://api.openweathermap.org/data/2.5/"
    var retrofit: Retrofit? = null
    var okHttpClient: OkHttpClient? = null

    val APPKEY = "880945cc627d308e4f65c6c9ff997cd7"

    fun getApi() : Retrofit{

        if(retrofit == null){

            okHttpClient = OkHttpClient().newBuilder()
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .build();

            //desaser un json para obtener solo lo necesario del json sin tener que clonarlo
            var builder: GsonBuilder = GsonBuilder()
            builder.registerTypeAdapter(City::class.java, MyDeserializer())

            retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(builder.create()))
                    .build()

              //Forma para traer las partes del json similar a un objeto
//            retrofit = Retrofit.Builder()
//                    .baseUrl(BASE_URL)
//                    .client(okHttpClient)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build()


        }

        return retrofit!!

    }

}