
object MyClass {
    def main(args: Array[String]): Unit = {
	  val arr = Array('a', 'b', 'c')
	  arr(1) = 256
	  for(i <- 0 until arr.size){
	    println(arr(i))
	  }
	}
}
