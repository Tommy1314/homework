package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)  /* System.in = input */
    print("Please enter number of tickets: ")
    var run1 = scanner.nextInt()
    print("How many round-trip tickets: ")
    var run2 = scanner.nextInt()
    var t = Tickets (run1, run2)
    println("Total tickets: $run1")
    println("Round-trip: $run2")
    println("Total Cost: " + t.cal())
//    println("Total Cost: " + t.cal().toInt())
}

class Tickets(var run1:Int, var run2:Int){
    fun cal():Int {
        var cal:Int = ((run1-run2)*1000 + (run2*2000)*0.9).toInt()
        return cal
    }

/*    class Tickets(var run1:Int, var run2:Int){
        fun cal():Double {
            var cal:Double = (run1 - run2) * 1000 + (run2 * 2000) * 0.9
            return cal
        }*/
}