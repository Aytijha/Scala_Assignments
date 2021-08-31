/*
Name: AYTIJHA CHAKRABORTY
BTech (CSE-AI/ML)   Sem: 5
Class Roll: 17      Sec: K
University Roll: 1914009

Problem Statement:
Write a Scala program for the given tasks:
Q1. Demonstrate read line function using Scala.
    Hint: val result = scala.io.StdIn.readLine() // // Reads the line from the Console
Q2. Write a function to add two numbers using mutable and immutable values
Q3. Write a program which would demonstrate the use of these Access Modifiers:
    - Private
    - Public
    - Protected
*/

class test{
    var a:Int = 69 //public

    private var a1:Int = 123
    def display1(){
        a1 = 6
        println("Private val from test class: "+a)
    }

    protected var a2:Int = 123
    def display2(){
        a2 = 9
        println("Protected val from test class: "+a)
    }
}

class extended extends test{
    /* def display1_1(){
        a1 = 60
        println("Private val from extended class: "+a)
    } */
    def display2_1(){
        a2 = 60
        println("Protected val from extended class: "+a)
    }
}

object AccessModifiers{
    def add(a: Int, b: Int): Unit = {
        var sum: Int = a+b
        println ("Sum of "+a+" and "+b+" is: "+sum)
        return
    }

    def main(args: Array[String]){
        println("1. Add 2 numbers \n2. See how Access Modifiers function")
        val choice: Int = scala.io.StdIn.readLine("Enter your choice: ").toInt
        if (choice == 1){
            var a: Int = scala.io.StdIn.readLine("Enter 1st value: ").toInt
            var b: Int = scala.io.StdIn.readLine("Enter 2nd value: ").toInt
            /* val a: Int = scala.io.StdIn.readLine("Enter 1st value: ").toInt
            val b: Int = scala.io.StdIn.readLine("Enter 2nd value: ").toInt */
            a = 60
            add(a,b)
        }
        else if (choice == 2){
            var x = new test()
            var y = new extended()
            println("Public val from main method: "+x.a) //works

            //println("Private val from main method: "+x.a1) //doesn't work
            x.display1() //works
            //y.display1_1() //doesn't work

            //println("Protected val from main method: "+x.a2) //doesn't work
            x.display2() //works
            y.display2_1() //works
        }
        else println("Wrong input for choice!")
    }
}