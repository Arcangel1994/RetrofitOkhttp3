package aplicacionmovil.isavanzados.com.mx.http

open class Temperature() {

    var temp: Float? = null
    var pressure: Float? = null
    var humidity: Float? = null
    var temp_min: Float? = null
    var temp_max: Float? = null

    constructor(temp: Float?, pressure: Float?, humidity: Float?, temp_min: Float?, temp_max: Float?) : this() {
        this.temp = temp
        this.pressure = pressure
        this.humidity = humidity
        this.temp_min = temp_min
        this.temp_max = temp_max
    }

    override fun toString(): String {
        return "Temperature(temp=$temp, pressure=$pressure, humidity=$humidity, temp_min=$temp_min, temp_max=$temp_max)"
    }


}