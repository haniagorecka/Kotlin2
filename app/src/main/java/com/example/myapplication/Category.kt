package com.example.myapplication

enum class Category(limit: Double) {
    Pierwsza(3.5), Druga(12.0), Trzecia(Double.MAX_VALUE);

    fun price (category: Category): Double //zwraca cenę za
    {
        when (category){
         Category.Pierwsza -> return 10.0
         Category.Druga -> return 20.0
         Category.Trzecia -> return 30.0
        }

    }




}