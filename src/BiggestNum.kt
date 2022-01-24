class Solution11 {
    fun solution(numbers: IntArray): String {
        var answer = ""
        var sbAnswer = StringBuilder()
        var newList = listOf<Int>()

        newList = numbers.sortedWith(kotlin.Comparator { o1, o2 ->
            when {
                o1.toString().plus(o2) < o2.toString().plus(o1) -> 1
                o1.toString().plus(o2) > o2.toString().plus(o1) -> -1
                else -> 0
            }
        })

        for (i in newList.indices) {
            sbAnswer.append(newList[i])
        }

        answer = sbAnswer.toString()
        if (newList[0] == 0)
            answer = "0"

        return answer
    }
}