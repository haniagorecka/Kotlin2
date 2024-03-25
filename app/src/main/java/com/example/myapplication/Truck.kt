package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable

class Truck(override val brand: String, override val model: String, override val year: Int,
            override val capacity: Double, override val power: Double,
            override val engineType: EngineType,  var owner: String, var accidents: Int, var load: Double = 0.0) : Car(brand, model, year, capacity, power, engineType, owner, accidents)

{ var category: Category? = null

    init{
                    when(this.load)
                    {
                       in 0.0..3.5 -> this.category=Category.Pierwsza
                       in 3.5..12.0 -> this.category=Category.Druga
                       in 12.0..Double.MAX_VALUE -> this.category=Category.Trzecia
                    }
                    }

                override fun printParam()
                {
                    super.printParam()
                    println(" load capacity: ${this.load}")
                }

    override fun insuranceCount(): Double {
        return super.insuranceCount()+0.2*super.insuranceCount()*this.load
    }

    fun toll(): Double
    {
        var category: Category? = Category.values().firstOrNull ({it.>this.load})
        var price = Category.Pierwsza.price(Category.Pierwsza)
        println("pr")
    return price
    }
}