package chapter2

fun swap(array: IntArray, min: Int, current: Int) {
    val temp = array[min]
    array[min] = array[current]
    array[current] = temp
}

fun selectionSort(array: IntArray): IntArray {
    var smallestNumberIndex: Int

    array.forEachIndexed { i, _ ->
        smallestNumberIndex = i

        for (j in (i + 1) until array.size) {
            if (array[j] < array[smallestNumberIndex]) {
                smallestNumberIndex = j
            }
        }

        swap(array, smallestNumberIndex, i)
    }
    return array
}

fun main() {
    val array = intArrayOf(5, 3, 6, 2, 10)
    println(selectionSort(array).joinToString())
}