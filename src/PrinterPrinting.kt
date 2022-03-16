import java.util.*

class Solution17 {
    fun solution(priorities: IntArray, location: Int): Int {
        var value = 0
        var number = 0
        val queuePriorites : Queue<Int> = LinkedList(priorities.asList())
        var queIter = queuePriorites.iterator()

        while (queIter.hasNext()){
            value = queIter.next()
            if (queuePriorites.maxOrNull() == value){
                queIter.remove()
                number++
                if (priorities[location] === value) {
                    println("확인")
                    return number
                }
            }
            if (!queIter.hasNext()){
                queIter = queuePriorites.iterator()
            }
        }

        return number
    }
}

fun main() {
    var priorities: IntArray
    priorities = intArrayOf(2, 1, 3, 2)
    println(Solution17().solution(priorities, 0))
}