object HelloWorld {
	def main(args: Array[String]): Unit = {
  	var a:List[String] = List("Aytijha", "Naruto", "Jiraiya", "Itachi", "Pain")
  	var b:List[Int] = 1::(2::(3::(4::Nil)))
  	println(a.head)
  	println(a.tail)
  	println(a.isEmpty)
  	
  	println(b.head)
  	println(b.tail)
  	println(b.isEmpty)
	}
}
