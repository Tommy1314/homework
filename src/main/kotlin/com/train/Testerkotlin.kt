package com.train

fun main() {
    var run1:Int
    var run2:Int
    do {
        print("Please enter number of tickets: ")
        run1 = readLine()!!.toInt()
        if (run1 != -1) {
            print("How many round-trip tickets: ")
            run2 = readLine()!!.toInt()
            var t = Tickets(run1, run2)
            t.print()
        }
    }
        while (run1 != -1)
    println("Stop and Finish")
}

class Tickets(var run1:Int, var run2:Int){
    fun print(){
        println("Total tickets: $run1")
        println("Round-trip: $run2")
        println("Total Cost: ${cal()}")
        println(" ")
    }
    fun cal():Int = ((run1 - run2) * 1000 + (run2 * 2000) * 0.9).toInt()



}