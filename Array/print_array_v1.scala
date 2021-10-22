object HelloWorld {
	def main(args: Array[String]): Unit = {
	  var arr = new Array[String](3)
	  arr(0) = "Tatakae"
	  arr(1) = "Aytijha"
	  arr(2) = "Amit"
	  for(i <- 0 until 3){
	    println(arr(i))
	  }
	}
}
