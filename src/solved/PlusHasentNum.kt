class Solution7 {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1
        for (i in 0..9){
            if(numbers.contains(i)){
                answer += i
                println(i)
            }
        }
        return answer
    }
}