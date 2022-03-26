import java.util.*
import kotlin.collections.ArrayList

//품
class Solution16 {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = ArrayList<Int>()
        var num = 1
        val proQueue : Queue<Int> = LinkedList<Int>()
        val speedQueue : Queue<Int> = LinkedList<Int>()

        for (i in progresses.indices){
            proQueue.add(progresses[i])
            speedQueue.add(speeds[i])
        }


        var isStart = false
        var count = 0
        while (true){
            if (proQueue.peek()+(speedQueue.peek()*num) < 100 && !isStart){
                num++
            } else if (proQueue.peek()+(speedQueue.peek()*num) >= 100){
                count++
                isStart = true
                proQueue.poll()
                speedQueue.poll()
            } else if (proQueue.peek()+(speedQueue.peek()*num) < 100 && isStart) {
                answer.add(count)
                count = 0
                isStart = false
            }

            if (proQueue.isEmpty()){
                answer.add(count)
                break
            }
        }

        return answer.toIntArray()
    }

    fun main(args:Array<String>) {
        val prograssAry = intArrayOf(93, 30, 55)
        val speedAry = intArrayOf(1, 30, 5)

        println(solution(prograssAry, speedAry))
    }
}