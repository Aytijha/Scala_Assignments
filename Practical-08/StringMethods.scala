/*
Name: AYTIJHA CHAKRABORTY
BTech (CSE-AI/ML)   Sem: 5
Class Roll: 17      Sec: K
University Roll: 1914009

Problem Statement:
Write a Scala program, which would include different user-defined functions for the given tasks:
Q1: Compare two Strings
Q2: Convert a upper case string to lower case string
Q3: Find the index of a char in a string
Q4: Find the index of a sub string in a string
Q5: Create a char array and store it into a string
*/

object StringMethods{
    def compareStrings(str: String, str1: String){
        println("Normal Comparison: "+str.compareTo(str1))
        println("Comparison by turning both strings uppercase: "+str.toUpperCase.compareTo(str1.toUpperCase))
    }

    def upperToLower(str: String){
        println("Original String: "+str)
        println("Lower Case String: "+str.toLowerCase)
    }

    def indexOfChar(str: String, c: Char){
        println("Index of '"+c+"' in the string: "+str.indexOf(c))
    }

    def indexOfSubstring(str: String, substr: String){
        println("Index of '"+substr+"' in the string: "+str.indexOf(substr))
    }

    def charArrayToString(letters: Array[Char]){
        println("Array into String: "+letters.mkString)
    }

    def main(args: Array[String]){
        var str = "Aytijha"
        val str1 = "aytijha"
        println("String1: "+str)
        println("String2: "+str1)
        print("\n")

        compareStrings(str, str1)
        print("\n")

        upperToLower(str.toUpperCase)
        print("\n")

        indexOfChar(str, 'i')
        indexOfChar(str, 'I')
        print("\n")

        indexOfSubstring(str1, "tij")
        indexOfSubstring(str1, "tim")
        print("\n")

        val letters = Array('a','b','c','d','e')
        println("Char Array elements:")
        for(c <- letters){
            print(c+" ")
        }
        print("\n")
        charArrayToString(letters)
    }
}