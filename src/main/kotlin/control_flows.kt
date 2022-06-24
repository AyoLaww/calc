fun main(args: Array<String>) {
    var num = 56
    if(num < 40){
        println("You don't qualify")
    }else{
        println("You qualify")
    }

    //marks thingy
    var marks = 75

    if(marks>=0 && marks<=40){
        println("You have failed")
    }else if(marks>=41 && marks<=70){
        println("You have passed")
    }else if(marks>=71 && marks<=80){
        println("You have earned distinction")
    }else if(marks>=81 && marks<=100){
        println("You have earned credit")
    }else{
        println("Invalid marks")
    }
}