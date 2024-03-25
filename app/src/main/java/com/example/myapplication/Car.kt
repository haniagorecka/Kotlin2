package com.example.myapplication

open class Car(override val brand: String, override val model: String, override val year: Int,
               override val capacity: Double,
               override val power: Double, override val engineType: EngineType,
               private var owner: String = "Unknown", private var accidents: Int = 0
): Vehicle (brand, model, year, capacity, power, engineType) {

    override fun addAccident()
    {
        this.accidents++
    }

    open fun addAccident(newNumber: Int)
    {
        this.accidents=newNumber
    }

    override fun changeOwner(newName: String)
    {
        this.owner=newName
    }

    override fun printParam()
    {
        super.printParam()
        print( "Owner name: ${this.owner}, number of accidents: ${this.accidents}")
    }

    open fun insuranceCount() :Double
    {
        val basicInsurance = 430*this.capacity
            val powerInsurance = 10*this.power
        val accidentsInsurance =basicInsurance*1.5*this.accidents
        val ageInsurance: Double
        if(super.getAge() < 30)
        {
            ageInsurance = super.getAge()*5.8
        }
        else { ageInsurance = 0.0}


        return basicInsurance+powerInsurance+accidentsInsurance+ageInsurance
    }
}