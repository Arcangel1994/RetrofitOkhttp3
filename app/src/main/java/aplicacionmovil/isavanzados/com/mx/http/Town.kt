package aplicacionmovil.isavanzados.com.mx.http

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName


open class Town() {

    var id: Int? = null

    @SerializedName("ciudades")
    var citys: List<City>? = null

    constructor(id: Int?, citys: List<City>?) : this() {
        this.id = id
        this.citys = citys
    }

    fun parseJson(response: String): City{
        var gson: Gson = GsonBuilder().create()
        var city: City = gson.fromJson(response, City::class.java)
        return city
    }

}