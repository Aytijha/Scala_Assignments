object HelloWorld {
	def main(args: Array[String]): Unit = {
  	var a = List.fill(5)("ABC")
  	var b = List.fill(5)(2)
  	var c:List[String] = List("DEF", "GHI")
  	var d = a:::(b:::c)
  	println(d)
  	println(d.last)
	}
}
