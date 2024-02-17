package org.example

fun main() {
    print("Enter the number of students: ")
    val numberOfStudents = readLine()!!.toInt()

    var totalMarks: Int
    var averageGrade: Double

    for (i in 1..numberOfStudents) {
        print("\nEnter the name of student $i: ")
        val name = readLine()!!

        print("Enter the grade in English: ")
        val englishGrade = readLine()!!.toInt()

        print("Enter the grade in Math: ")
        val mathGrade = readLine()!!.toInt()

        print("Enter the grade in Science: ")
        val scienceGrade = readLine()!!.toInt()

        print("Enter the grade in Filipino: ")
        val filipinoGrade = readLine()!!.toInt()

        totalMarks = englishGrade + mathGrade + scienceGrade + filipinoGrade
        averageGrade = totalMarks / 4.0

        print("The average grade for $name is $averageGrade")
    }
}