//top bottom left right
//to be edited
import Array.ofDim
object HelloWorld {
	def main(args: Array[String]): Unit = {
	  var n = scala.io.StdIn.readInt()
	  var arr = ofDim[Int](4,4)
	  var counter = 1
  	for(i<-0 until n){
  	  for(j<- 0 until n){
  	    arr(i)(j) = counter
  	    counter+=1
  	  }
  	}
  	println("Array:")
  	for(i<-0 until n){
  	  for(j<- 0 until n){
  	    print(arr(i)(j),'\t')
  	  }
  	  print('\n')
  	}
  	var top
	}
}
