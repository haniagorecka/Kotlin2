package com.example.myapplication




fun main()
{

    val nowy: Car=Car("Fiat", "punto", 2006, 2.0, 1.6, EngineType.Diesel, "Jan Kowalski", 1)
    nowy.printParam()
    println()
    nowy.addAccident(2)
    println(nowy.insuranceCount())
    val nowy1: Truck=Truck("Volvo", "D3444", 2010, 2.6, 4.6, EngineType.Hybrid, "Janina Kowalska", 3, 44.5)
    nowy1.printParam()
    println(nowy1.category)
    println(nowy1.insuranceCount())
}



