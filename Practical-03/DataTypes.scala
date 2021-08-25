/*
Name: AYTIJHA CHAKRABORTY
BTech (CSE-AI/ML)   Sem: 5
Class Roll: 17      Sec: K
University Roll: 1914009

Problem Statement:
Write a Scala program in which you are supposed to use or print 
all these data types (Byte, Short, Int, Long, Float, Double, Char, 
String, Boolean, Unit, null, Null, Nothing, Any, AnyRef) and their 
values inside main method using Scala?
*/

object DataTypes{
    def unitFunct(): Unit = {
        println("Inside UnitFunct() function.")
    }

    /* def logException(e: Exception): Nothing = {
        println("Logging Exception: "+e.getMessage)
        throw new Exception("My new exception")
    } */

    def ar(inp: AnyRef) = println(inp) //accepts any type of object (List, MyClass, etc)
    def av(inp: AnyVal) = println(inp) //accepts any type of value (int, float, etc)
    def an(inp: Any) = println(inp) //accepts anything (Superclass of AnyRef and AnyVal)

    /* val nv: String = null
    println(nv.length) */

    /* val nv: Null = null
    println(nv.length) */

    def main(args: Array[String]){
        var b: Byte = 10
        println ("Byte Value: "+b)

        var s: Short = 196
        println ("Short Value: "+s)

        var i: Int = 69000
        println ("Integer Value: "+i)

        var l: Long = 969000
        println ("Long Value: "+l)

        var f: Float = 2
        println ("Floating Point Value: "+f)

        var d: Double = 96.69
        println ("Double Value: "+d)

        var c: Char = 'A'
        println ("Character Value: "+c)

        val str: String = "Aytijha"
        println ("String Value: "+str)

        var bl: Boolean = (1==2)
        println ("Boolean Value: "+bl)

        val u = unitFunct()
        println ("Return Value: "+u)

        //ar(nv)

        //av(1)
        //av("One")
        
        //an(1)
        //an("One")
        //an(nv)
    }
}