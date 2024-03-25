package com.example.myapplication

import kotlin.math.sqrt
import kotlin.math.tan
/**
*function which returns the area of the triangle
* @param l1 double type number - first side of the triangle, bigger than 0
 * @param l2 double type number - second side of the triangle, bigger than 0
 * @param l3 double type number - third side of the triangle, bigger than 0
 * @return the area of triangle
 */
fun heron (l1: Double, l2: Double, l3: Double): Double
{
    check (l1>0&&l2>0&&l3>0) {"Sides cannot be negative numbers"}
    check (l1+l2>l3&&l1+l3>l2&&l2+l3>l1) {"These sides cannot build triangle"}
        return (l1+l2+l3)/2

}

fun main()
{

    println(heron(3.0,2.0,3.0))

}