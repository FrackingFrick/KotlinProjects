fun getAve(list: List<Int>): Double {
    var sum: Long=0
    
   for(i in list){
       sum+=i.toLong()
   }
   return sum.toDouble()
}
fun main(){
    val list= listOf(8,2,4,7,5,9,6,5,12,4)
    val avg=getAve(list)
    print(list + ". The average is " +avg / 10)
}