class Solution2 {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = intArrayOf()
        var successArray = arrayOf<Int>()
        var failArray = arrayOf<Int>()
        var rateArray = arrayOf<Int>()
        var rate = mutableMapOf<Int, Double>()
            for (i in 0..stages.size){
                for (j in 0 until stages[i]){
                    successArray[i] += 1
                }
                failArray[stages[i]] += 1
        }

        for (i in 0 until N){
            rate.put(i to successArray[i].toDouble()/failArray[i].toDouble())
        }

        for (i in 0 .. rate.size){

        }

        return answer
    }
}

private fun <K, V> Map<K, V>.put(key: Pair<K, V>) {

}
