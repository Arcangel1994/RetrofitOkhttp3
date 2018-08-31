package aplicacionmovil.isavanzados.com.mx.http

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    var service: WeatherService? = null
    var cityCall: Call<City>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        service = API().getApi().create(WeatherService::class.java)

        cityCall = service!!.getCityCelsius("London,uk", API().APPKEY, "metric")

        cityCall!!.enqueue(object : Callback<City>{
            override fun onFailure(call: Call<City>?, t: Throwable?) {
                Toast.makeText(this@MainActivity, "Error", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<City>?, response: Response<City>?) {

                var city : City? = response?.body()

                Toast.makeText(this@MainActivity, "${city}", Toast.LENGTH_LONG).show()

            }

        })

        /*
        Convertir un string json a un objecto
        var json: String? = null
        var gson: Gson? = null
            //Excluir todos los datos que no tienen la decoracion o anotaciones con la palabra Expose
            gson: Gson? = GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
        var city1: City = gson!!.fromJson(json, City::class.java)
        */

    }
}
