package com.example.firstapplication
import kotlin.random.Random

var joinedlist = mutableListOf<String>()

fun listbase() : String {

    var maleNames = listOf("Luke", "Enrico", "Ali", "Hamza")
    var femaleNames = listOf("Lucy", "Jennifer", "Sumaya", "Mai")

    joinedlist.addAll(maleNames)
    joinedlist.addAll(femaleNames)

    val random = Random
    var r2 = (1..joinedlist.size).random()
    var r = random.nextInt(joinedlist.count())

    return joinedlist[r]

}
