class Solution15 {
    fun solution(citations: IntArray): Int {
        var max = 0

        for (i in 1..citations.size) {
            var count = 0
            for (j in citations.indices){
                if (citations[j] >= i) {
                    count++
                }
                if (i <= count){
                    max = i
                }
            }
        }

        return max
    }
}