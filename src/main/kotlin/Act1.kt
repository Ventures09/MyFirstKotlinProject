fun main() {

    for ( i in 1..4) {
        print("Enter firstname: ")
        var fName= readLine()

        print("Enter middlename: ")
        var mName= readLine()

        print("Enter lastName: ")
        var lName = readLine()

        print("Enter your age: ")
        val age = readLine()?.toInt()?: 0

        println("Your name is $fName $mName. $lName")
        println("Your age is $age")

    }
}