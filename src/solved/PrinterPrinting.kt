package solved

import java.util.*

class Solution17 {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        var count = 0
        val priQueue = PriorityQueue<Int>(Collections.reverseOrder())

        for(i in priorities.indices){
            priQueue.add(priorities[i])
        }

        while (!priQueue.isEmpty()){
            for (i in priorities.indices){
                if (priorities[i]==priQueue.peek()){
                    count++
                    if (i == location){
                        answer = count
                    }
                    priQueue.poll()
                }
            }
        }

        return answer
    }
}

fun main() {
    var priorities: IntArray
    priorities = intArrayOf(1, 1, 9, 1, 1, 1)
    println(Solution17().solution(priorities, 0))
}