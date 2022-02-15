package chapter1

fun binarySearch(sortedList: List<Int>, item: Int): Int? {
    var low = 0
    var high = sortedList.size - 1
    var steps = 0

    while (low <= high) {
        steps++
        val mid = (high + low) / 2
        val guess = sortedList[mid]

        println("step $steps ${sortedList.subList(mid, high + 1)}")

        if (guess == item) {
            println("Number of steps to find the item is $steps")
            return mid
        } else if (guess > item) {
            high = mid - 1
        } else {
            low = mid + 1
        }

    }
    return null
}

fun main() {
    // // O(log n)
    val list = List(8) { it + 1 }
    val item = 8
    println("index of element $item is ${binarySearch(list, item)}")


}



