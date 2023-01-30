fun main(){
    //задание 1
    /*try{
    println("Введите 2 числа")
    var a:Double
    a=readLine()!!.toDouble()
    var b= readLine()!!.toDouble();
    if(a==b){
        a=Math.pow(a,3.0)
    }
    else if (a>b){
        a=a+1
    }
    else b=b+1
    println("Первое число: $a \n Второе число:$b")
    }catch (ex:Exception){
        println(ex.message)
    }*/

        //задание 2
    /*try {
        println("Введите число от 0 до 9")
        var num: Int
        num = readLine()!!.toInt()
        when (num) {
            0 -> println("Ноль")
            1 -> println("Один")
            2 -> println("Два")
            3 -> println("Три")
            4 -> println("Четыре")
            5 -> println("Пять")
            6 -> println("Шесть")
            7 -> println("Семь")
            8 -> println("Восемь")
            9 -> println("Девять")
            else -> println("Неправильное число")
        }
    }catch (ex:Exception){
         println(ex.message)
    }*/

    //задание 3
    /*try {
        println("Введите свой возрост")
        var age: Int
        age = readLine()!!.toInt()
        when(age){
           in 0..2-> println("Младенец")
            in 3..13-> println("Ребенок")
            in 14..18-> println("Подросток")
            in 19..29-> println("Взрослый")
            in 40..64-> println("Пожилой")
            in 65..120-> println("Пенсионер")
            else->println("Вы уже умерли")
        }
    }catch (ex:Exception){
        println(ex.message)
    }*/

        //задание 4 Вариант - 5
    try {
        println("Введите число Х")
        var x: Double
        x = readLine()!!.toDouble()
        if(x<=7){
            x=3*x+9
            println("F(x)= $x")
        }
        else if(x>7){
            x=1/(Math.pow(x,2.0)-4)
            println("F(x)= $x")
        }
        else println("нет рещения")
    }
    catch (ex:Exception){
        println(ex.message)
    }






}