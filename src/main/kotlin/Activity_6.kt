fun main(args: Array<String>) {
    println("Activity6: Individual - Unique Characters")
    println("")
    print("1st Word: ")
    val Str1 = readLine()!!
    print("2nd Word: ")
    val Str2 = readLine()!!

    println("Unique characters found:")
    val uniqueChars = HashSet<Char>()
    val longerLength = maxOf(Str1.length, Str2.length)
    for (i in 0 until longerLength) {
        if (i < Str1.length && i < Str2.length) {
            val c = Str1[i]
            if (Str2.contains(c) && !uniqueChars.contains(c)) {
                uniqueChars.add(c)
            }
        } else if (i < Str1.length) {
            val c = Str1[i]
            if (uniqueChars.contains(c)) {
                uniqueChars.add(c)
            }
        } else if (i < Str2.length) {
            val c = Str2[i]
            if (uniqueChars.contains(c)) {
                uniqueChars.add(c)
            }
        }
    }
    println(uniqueChars)
}
//Ventures Code