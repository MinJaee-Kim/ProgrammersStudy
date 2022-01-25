class Solution13 {
    fun solution(numbers: String): Int {
        var answer = 0

        var numAry = numbers.chunked(1)

        for (i in 2..numbers.toInt()) {
            if (numbers.toInt() % i == 0) {
                answer++
                break
            }
        }

        return answer
    }
}