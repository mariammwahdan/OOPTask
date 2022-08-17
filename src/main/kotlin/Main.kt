import java.util.Scanner

fun main() {
  val input=Scanner(System.`in`)
   val car1=BMW(input.nextLine(),input.nextLine(),input.nextDouble())
    println("fuel type is ${car1.getFuelType()}")
    val car2=Tesla(input.nextLine(),input.nextLine(),input.nextDouble())
    println("fuel type is ${car2.getFuelType()}")


}
