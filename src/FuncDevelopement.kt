import java.util.*
import kotlin.collections.ArrayList

class Solution16 {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = ArrayList<Int>()
        val queueProgress : Queue<Int> = LinkedList(progresses.asList())
        val queueSpeed : Queue<Int> = LinkedList(speeds.asList())

        var i = 0
        var count = 0

        while (true) {
            if (queueProgress.peek() + queueSpeed.peek()*i >= 100){
                queueSpeed.poll()
                queueProgress.poll()
                count++
                if (queueProgress.peek() == null){
                    answer.add(count)
                    break
                }
                if (queueProgress.peek() + queueSpeed.peek()*i < 100){
                    answer.add(count)
                    count = 0
                }
                continue
            }
            i++

            if (queueProgress.peek() == null){
                break
            }
        }

        return answer.toIntArray()
    }
}