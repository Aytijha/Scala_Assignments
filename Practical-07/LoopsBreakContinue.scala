/*
Name: AYTIJHA CHAKRABORTY
BTech (CSE-AI/ML)   Sem: 5
Class Roll: 17      Sec: K
University Roll: 1914009

Problem Statement:
Write a Scala program for the given tasks:
Q1. Write a function in Scala that takes two numbers as parameters and returns the Maximum and Minimum of them.
    (Use Single Nested Function).
Q2. Write a function in Scala that takes two numbers as parameters and returns the Maximum and Minimum of them.
    (Use Multi Nested Function).
Q3. Explain Entry control and exit control Loops in Scala.
Q4. Write a Scala Program which would use Break and Continue features to check if an entered number is equal to 3 or not.
Q5. Write a two loop function using nested loops to achieve smallest element in a array in Scala.
*/

import util.control._

object LoopsBreakContinue{
    def singleNestedMinMax(a: Int, b: Int) = {
        def min(): Int = {
            if (a<b){
                return a
            }
            else{
                return b
            }
        }
        def max(): Int = {
            if (a>b){
                return a
            }
            else{
                return b
            }
        }
        var mi = min()
        var ma = max()
        (mi, ma)
    }

    def multiNestedMinMax(a: Int, b: Int) = {
        var mi = 0
        var ma = 0
        def min() = {
            if (a<b){
                mi = a
                def max(): Int = {
                    return b
                }
                ma = max()
            }
            else{
                mi = b
                def max(): Int = {
                    return a
                }
                ma = max()
            }
        }
        min()
        (mi, ma)
    }

    def entryControl(){
        println("\nEntry Controlled Loop:")
        var i = 1
        while (i<1){
            println(i)
            i += 1
        }
    }
    
    def exitControl(){
        println("\nExit Controlled Loop:")
        var i = 1
        do{
            println(i)
            i +=1
        } while (i<1)
    }

    def breakContinue() = {
        var breakObj = new Breaks
        breakObj.breakable{
            println("\nBreak Demonstration:")
            for (i <- 1 to 10){
                if (i == 3){
                    println("Found 3")
                    breakObj.break
                }
                println(i+"is not 3")
            }
        }

        println("\nContinue Demonstration:")
        for (i <- 1 to 10){
            breakObj.breakable{
                if (i == 3){
                    println("Found 3")
                    breakObj.break
                }
                println(i+"is not 3")
            }
        }
    }

    def smallestInArray(a: Array[Array[Int]]): Int = {
        var small = 1000
        for (i <- 0 to 2; j <- 0 to 3){
            if (a(i)(j) < small){
                small = a(i)(j)
            }
        }
        return small
    }

    def main(args: Array[String]){
        var (x, y) = singleNestedMinMax(2,3)
        println("\nSolved using Single Nested Loop: Min = "+x+" Max = "+y)
        var (x1, y1) = multiNestedMinMax(2,3)
        println("Solved using Multi Nested Loop: Min = "+x1+" Max = "+y1)
        entryControl()
        exitControl()
        breakContinue()
        var arr = Array(Array(1,2,3,4), Array(5,6,7,8), Array(9,0,1,2))
        var small = smallestInArray(arr)
        println("\nSmallest = "+small)
    }
}