package com.talkspace.exercises


// Write a function that takes as its arguments a sorted array of unique integers, `intArray`, and an integer, `int`, and returns 3 integers from `intArray` that sum up to `int`.
fun main(args: Array<String>) {
    println(threeSum(listOf(-1, 2, 3, 4, 5, 7, 8, 12), 6)) // [4, 3, -1]

    println(twoSum(listOf(-1, 2, 3, 4, 5, 7, 8, 12), 6)) // [4, 2]
    println(twoSum(listOf(-1, 2, 3, 4, 5, 7, 8, 12), 20)) // [12, 8]

}

fun threeSum(ints: List<Int>, total: Int): List<Int> {
    for (integer in ints) {
        val mutableTemp = ints.toMutableList()
        mutableTemp.remove(integer)

        val res = twoSum(mutableTemp, total - integer)

        if (res.isNotEmpty()) {
            val mutableRes = res.toMutableList()
            mutableRes.add(integer)
            return mutableRes
        }
    }

    return listOf()
}


fun twoSum(ints: List<Int>, total: Int): List<Int> {
    val hash = mutableMapOf<Int, Int>()

    for (integer in ints) {
        val matchingSolution = total - integer

        if (hash.containsKey(matchingSolution)) {
            return listOf(integer, matchingSolution)
        } else {
            hash[integer] = matchingSolution
        }
    }

    return listOf()
}


