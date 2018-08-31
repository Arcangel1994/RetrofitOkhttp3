package aplicacionmovil.isavanzados.com.mx.http

import com.google.gson.annotations.SerializedName

open class City() {

    var id: Int? = null

    var name: String? = null

    var country: String? = null

    //Pasar informacion de un array a un nuevo objeto
//    @SerializedName("main")
//    var temperature: Temperature? = null

//    constructor(id: Int?, name: String?, temperature: Temperature?) : this() {
//        this.id = id
//        this.name = name
//        this.temperature = temperature
//    }

    constructor(id: Int?, name: String?, country: String?) : this() {
        this.id = id
        this.name = name
        this.country = country
    }

    override fun toString(): String {
        return "City(id=$id, name=$name, country=$country)"
    }

//    override fun toString(): String {
//        return "City(id=$id, name=$name, temperature=$temperature)"
//    }




}