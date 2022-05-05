package solved

class Solution13 {
    var arraList = ArrayList<String>()
    fun solution(numbers: String): Int {
        var answer = 0
        var i = 0
        var arr: MutableList<Int>
        arr = numbers.chunked(1) as MutableList<Int>
        var visited = MutableList<Boolean>(arr.size, { i -> false });
        var hashSet = hashSetOf<String>()

        for (i in 0..arr.size) {
            var save = MutableList<Int>(i, {i})
            perm(arr, visited, save,0, arr.size, i)
        }

        while (true) {
            if (arraList.get(i).startsWith("0")){
                arraList[i] = arraList[i].substring(1)
               i--
            }
            i++
            if (i == arraList.size) {
                break
            }
        }

        for (i in arraList.indices) {
            hashSet.add(arraList.get(i))
        }

        println(hashSet)

        var iterator = hashSet.iterator()

        while (iterator.hasNext()) {
            var value = iterator.next()
            if (!value.equals("")){
                if (isPrime(value.toInt())){
                    answer++
                }
            }
        }

        return answer
    }

    fun perm(arr: MutableList<Int>, visited: MutableList<Boolean>, save: MutableList<Int>, depth: Int, n: Int, r: Int) {
        var num = ""
        if (depth == r) {
            for (i in 0 until save.size) {
                num += save[i]
            }
            arraList.add(num)
            return
        }

        for (i in 0 until n) {
            if (!visited[i]) {
                visited[i] = true
                save[depth] = arr[i]
                perm(arr, visited, save, depth+1, n, r)
                visited[i] = false
            }
        }
    }

    fun isPrime(num:Int):Boolean {
        if (num == 1) {
            return false
        }
        for (i in num-1 downTo  2) {
            if (num % i == 0) {
                return false
            }
        }

        return true
    }
}

fun main() {
    var s = Solution13()
    println(s.solution("002"))
}