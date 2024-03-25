package com.example.myapplication
import java.util.Calendar

abstract class Vehicle(brand: String, model: String, year: Int, capacity: Double, power: Double, engineType: EngineType): VehicleInterface {
    abstract val model: String?
    abstract val brand: String?
    abstract val year: Int?
    abstract val capacity: Double?
    abstract val power: Double?

    abstract val engineType: EngineType?

    override fun getAge (): Int{
        val calendar=Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        return year - this.year!!
}
     override fun printParam (){
        println(" Vehicle brand: ${this.brand}, vehicle model: ${this.model}, year of production: ${this.year}, engine capacity: ${this.capacity}, engine power: ${this.power}, engine type: ${this.engineType}")
    }
}