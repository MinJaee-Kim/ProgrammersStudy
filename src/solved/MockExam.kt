import java.util.*
import kotlin.collections.ArrayList

class Solution12 {
    fun solution(answers: IntArray): IntArray {
        var answer = ArrayList<Int>()

        var max = 0

        val firstStudent = intArrayOf(1, 2, 3, 4, 5)
        val secondStudent = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val thirdStudent = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        var firstStack = 0
        var secondStack = 0
        var thirdStack = 0

        var firstIter = firstStudent.iterator()
        var secondIter = secondStudent.iterator()
        var thirdIter = thirdStudent.iterator()

        for (i in answers.indices) {
            if (answers[i] == firstIter.next()) {
                firstStack += 1
            }
            if (!firstIter.hasNext()) {
                firstIter = firstStudent.iterator()
            }
            if (answers[i] == secondIter.next()) {
                secondStack += 1
            }
            if (!secondIter.hasNext()) {
                secondIter = secondStudent.iterator()
            }
            if (answers[i] == thirdIter.next()) {
                thirdStack += 1
            }
            if (!thirdIter.hasNext()) {
                thirdIter = thirdStudent.iterator()
            }
        }

        max = firstStack

        if (max < secondStack)
            max = secondStack

        if (max < thirdStack)
            max = thirdStack

        if (max == firstStack)
            answer.add(1)

        if (max == secondStack)
            answer.add(2)

        if (max == thirdStack)
            answer.add(3)

        return answer.toIntArray()
    }
}