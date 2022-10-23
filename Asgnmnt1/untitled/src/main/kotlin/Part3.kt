import java.util.*

fun lastAndFirstDigit(){
    println("Enter a number:")
    val input = Scanner(System.`in`)
    val number = input.nextInt()

    var firstDigit = number
    while(firstDigit>=10){
        firstDigit = firstDigit /10;
    }
    var lastDigit = number % 10
    println("First digit is : $firstDigit,    Last Digit is: $lastDigit")
}

fun sumOfOddSquaredValues(arr:Array<Int>)  {
    var sum = 0;
    for(num in arr){
        if(num % 2!= 0)
            sum += num * num
    }
    println("Sum of squared of odd numbers in array: $sum");
}


fun findWeight() {
    println("Enter a weight:");
    val input = Scanner(System.`in`);
    val weight = input.nextInt();

    println("""
        Please press:
        1 for Venus
        2 for Mars
        3 for Jupiter
        4 for Saturn
        5 for Uranus
        6 for Neptune
    """.trimIndent())
    var sc = Scanner(System.`in`)
    var planet = sc.next()

    when(planet){
        "1"->  println("Weight on Venus with given $weight weight equals to " + weight * 0.78)
        "2"->  println("Weight on Mars with given $weight weight equals to  " + weight * 0.39)
        "3"->  println("Weight on Jupiter with given $weight weight equals to " + weight * 2.65)
        "4"->  println("Weight on Saturn with given $weight weight equals to " + weight * 1.17)
        "5"->  println("Weight on Uranus with given $weight weight equals to  " + weight * 1.05)
        "6"->  println("Weight on Neptune with given $weight weight equals to  " + weight * 1.23)
        else->  println("Not a valid input!")
    }
}

fun main(){
    lastAndFirstDigit();
    sumOfOddSquaredValues(arrayOf(1,2,3,4,5));
    findWeight();
}