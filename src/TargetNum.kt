class Solution14 {
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0
        answer = dfs(numbers, target, 0, 0)

        return answer
    }

    fun dfs(numbers: IntArray, target: Int, depth: Int, sum: Int): Int {
        var targetNum = 0
        if (numbers.size == depth) {
            if (target == sum) {
                return 1
            }
            return 0
        }

        targetNum += dfs(numbers, target, depth+1, sum+numbers[depth])
        targetNum += dfs(numbers, target, depth+1, sum-numbers[depth])

        return targetNum
    }
}

fun main() {
    val numbers = IntArray(5, { 1;1;1;1;1 })

    println(Solution14().solution(numbers, 3))
}