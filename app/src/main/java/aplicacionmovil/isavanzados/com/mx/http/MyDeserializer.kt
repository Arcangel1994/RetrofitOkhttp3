package aplicacionmovil.isavanzados.com.mx.http

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class MyDeserializer : JsonDeserializer<City> {


    //Desacer un json solo para optener datos especificons sin obtener informacion sin clonar en json de la api
    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): City {

        var id: Int = json!!.asJsonObject.get("id").asInt
        var name: String = json!!.asJsonObject.get("name").asString
        var country: String = json.asJsonObject.get("sys").asJsonObject.get("country").asString

        var city: City = City(id, name, country)

        return city

    }

}