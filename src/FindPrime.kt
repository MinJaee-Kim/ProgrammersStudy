import kotlin.text.StringBuilder

class Solution13 {
    fun solution(numbers: String): Int {
        var answer = ""
        var numAry = numbers.chunked(1)

        var perCheck = mutableListOf<Int>()
        answer = dfs(numAry, perCheck, null, 2, 2)

        return answer.toInt()
    }

    fun isprime(num: Int): Int {
        for (i in 2..num) {
            if (num % i == 0)
                return 1
        }
        return 0
    }

    fun dfs(nums:List<String>, perCheck: MutableList<Int>, result: StringBuilder?, n:Int, r:Int): String{
        if (result?.length == r)
            return result.toString()


        for (i in 0 until n){
            if (perCheck[i] == 0) {
                result?.append(nums[i])
                perCheck[i] = 1
                dfs(nums, perCheck, result, n, r)
                perCheck[i] = 0
                result?.deleteAt(i)
            }
        }


        return ""
    }
}

fun main() {
    var s = Solution13()
    println(s.solution("17"))
}