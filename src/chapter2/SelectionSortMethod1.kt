package chapter2

private fun findSmallestNumberIndex(arrayList: ArrayList<Int>): Int {

    var smallest = arrayList[0]
    var smallestIndex = 0

    arrayList.forEachIndexed { index, _ ->
        if (arrayList[index] < smallest) {
            smallest = arrayList[index]
            smallestIndex = index
        }
    }
    return smallestIndex
}

private fun selectionSort(arrayList: ArrayList<Int>): ArrayList<Int> {

    val sortedArray = ArrayList<Int>()

    for (index in arrayList.indices) {
        val smallest = findSmallestNumberIndex(arrayList)
        sortedArray.add(arrayList.removeAt(smallest))
    }

    return sortedArray
}

fun main() {
    val arr = arrayListOf(5, 3, 6, 2, 10)
    println(selectionSort(arr).joinToString())
}

