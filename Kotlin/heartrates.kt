fun main() {
   val ratesLow=low(25)
   val ratesHigh=high(25)
   println("Heart rate limits are: "+ratesLow +" - "+ratesHigh) 
}

fun low(a:Int): Double{
    return 	220- a *0.85 
}

fun high(b:Int): Double{
    return 220- b *0.65
}