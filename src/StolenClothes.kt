class Solution2 {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        var takingNum : Int = 0
        val lostList = lost.toCollection(ArrayList<Int>())
        val reserveList = reserve.toCollection(ArrayList<Int>())
        val reserveListIterator = reserveList.iterator()

        while (reserveListIterator.hasNext()) {
            takingNum = reserveListIterator.next()
            if (lostList.contains(takingNum)) {
                lostList.remove(takingNum)
                println(takingNum)
                reserveListIterator.remove()
            }
        }

        lostList.sort()
        reserveList.sort()

        for (i in reserveList.indices) {
            if (lostList.contains(reserveList[i]-1))
                lostList.remove(reserveList[i]-1)
            else if(lostList.contains(reserveList[i]+1))
                lostList.remove(reserveList[i] + 1)
        }

        answer = n - lostList.size

        return answer
    }
}