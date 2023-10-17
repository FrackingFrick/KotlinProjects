fun main(){
    val invoice1=CreditInvoice("1234", 100.0)
    println(invoice1.toString()) 
    
    
    
}
open class Invoice{
    protected var number: String=""
    protected var amount: Double=0.0
    
    constructor(number:String, amount:Double){
        this.number=number
        this.amount=amount
    }
    fun pay(sum:Double): String{
        this.amount-=sum
        return "Invoice amount is now ${this.amount}"
           
    }
}
class CreditInvoice(number:String, amount:Double):Invoice(number,amount){
    private var time: Int=30
    
    override fun toString():String{
        return "Ivoice number is ${this.number} and the amount is ${this.amount}. There is ${this.time} days to pay it up."
    }
}