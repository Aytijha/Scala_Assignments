object HelloWorld {
	def main(args: Array[String]): Unit = {
  	var a:List[String] = List("Aytijha", "Naruto", "Jiraiya", "Itachi", "Pain")
  	var b:List[Int] = 1::(2::(3::(4::Nil)))
  	//var c = a:::b
  	//var d = List.concat(b,a)
  	var e = (a:::(b)) //a concatenated with b
  	var f = (a.:::(b)) //. reverses the order, i.e. b concatenated with a
  	//println(c)
  	//println(d)
  	println(e)
  	println(f)
	}
}
