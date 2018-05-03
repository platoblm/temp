package io.deloop.protobuf

fun main(args : Array<String>) {
    if (args.size == 1){
        val first = args[0]
        println("Hello! len: ${first.length}, $first")
        return
    }
    println("Hello, world! size ${args.size}")
}