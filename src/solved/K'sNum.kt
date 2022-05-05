import java.util.*

class Solution10 {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = IntArray(commands.size)

        for (i in commands.indices){
            val aryCopy = array.copyOfRange(commands[i][0]-1, commands[i][1])
            aryCopy.sort()
            answer[i] = aryCopy[commands[i][2] - 1]
        }

        return answer
    }
}