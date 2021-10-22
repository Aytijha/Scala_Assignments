object HelloWorld {
	def main(args: Array[String]): Unit = {
	  var arr = new Array[String](3)
	  for(i <- 0 until arr.size){
	    arr(i) = scala.io.StdIn.readLine()
	  }
	  for(i <- 0 until arr.size){
	    println(arr(i))
	  }
	}
}
