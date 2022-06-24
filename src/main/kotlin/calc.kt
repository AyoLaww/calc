import java.math.BigInteger.valueOf

fun main(args: Array<String>) {
    println("Enter your first number: ")
    var x = Integer.valueOf(readln())
    println("Enter your second number: ")
    var y = Integer.valueOf(readln())
    println("Enter an operator: +(addition), -(subtraction), *(multiplication), /(division)")
    var op = readln()

    if (op == "+"){
        var ans = x + y
        println("$x + $y = "+ ans)
    }

    else if(op == "-"){
        var ans = x - y
        println("$x - $y = "+ ans)
    }

    else if(op == "*"){
        var ans = x * y
        println("$x * $y = "+ ans)
    }

    else if(op == "/"){
        var ans = x / y
        println("$x / $y = "+ ans)
    }

    else{
        println("Invalid operator")
    }
}