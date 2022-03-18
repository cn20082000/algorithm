fun main(args: Array<String>) {
    val t = readln().toInt()
    repeat(t) {
        readln().toCharArray().let {
            for (i in it.indices.reversed()) {
                if (it[i] == '0') {
                    it[i] = '1'
                    break
                } else {
                    it[i] = '0'
                }
            }
            println(it)
        }
    }
}