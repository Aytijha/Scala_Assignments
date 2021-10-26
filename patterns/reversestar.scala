import Array.ofDim
object HelloWorld {
	def main(args: Array[String]): Unit = {
	  var n = scala.io.StdIn.readInt()
	  var arr = ofDim[String](4,4)
  	for(i<-0 until n){
  	  for(j<- 0 until n){
  	    if(i<=j){
  	      arr(i)(j) = "*"
  	    }
  	    else arr(i)(j) = " "
  	  }
  	}
  	for(i<-0 until n){
  	  for(j<- 0 until n){
  	    print(arr(i)(j))
  	  }
  	  print('\n')
  	}
	}
}
