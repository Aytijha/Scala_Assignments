
object MyClass {
    def main(args: Array[String]): Unit = {
	  val arr = Array(21, 69, 36)
	  arr(1) = "Aytijha"
	  for(i <- 0 until arr.size){
	    println(arr(i))
	  }
	}
}
// Error: type mismatch
