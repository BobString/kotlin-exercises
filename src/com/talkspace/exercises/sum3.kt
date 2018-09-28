package com.talkspace.exercises


// Write a function that takes as its arguments a sorted array of unique integers, `intArray`, and an integer, `int`, and returns 3 integers from `intArray` that sum up to `int`.
fun main(args: Array<String>) {
    println(threeSum(listOf(-1, 2, 3, 4, 5, 7, 8, 12), 6)) // [-1, 8, -1]

    println(twoSum(listOf(-1, 2, 3, 4, 5, 7, 8, 12), 6)) // [-1, 7]
    println(twoSum(listOf(-1, 2, 3, 4, 5, 7, 8, 12), 20)) // [8, 12]

}

fun threeSum(ints: List<Int>, total: Int): List<Int> {
    for (integer in ints) {
        val res = twoSum(ints, total - integer)
        if (res.isNotEmpty()) {
            val mutableRes = res.toMutableList()
            mutableRes.add(integer)
            return mutableRes;

        }
    }

    return listOf()
}


fun twoSum(ints: List<Int>, total: Int): List<Int> {
    for (integer in ints) {
        val matchingSolution = total - integer

        if (ints.contains(matchingSolution)) {
            return listOf(integer, matchingSolution)
        }
    }

    return listOf()
}


