fun main(args: Array<String>) {
    // задание 1: задача 2
    /*try {
        println("Введите номера членов арифметической прогрессии")
        var m: Int
        var n: Int
        m = readln().toInt()
        n = readln().toInt()
        if (m>n){
            var temp:Int
            temp=m
            m=n
            n=temp
        }
        if(m==n) {
            println("Одинаковые номера")
        } else{
            println("Введите первый член арифметической прогрессии")
            var a1: Int
            a1 = readln().toInt()
            println("введите шаг(разность) арифметической прогрессии")
            var d: Int
            d = readln().toInt()
            var am: Int
            var an: Int
            am = a1 + (m - 1) * d
            an = a1 + (n - 1) * d
            var sum: Int
            sum = ((am + an) / 2) * (n - m)
            println("Сумма членов от M до N $sum")
            println("$am $an")
        }
    }catch (ex:Exception){
        println(ex.message)
    }*/

    //задание 1: задача 6(5)
    /*try{
        println("Введите х")
        var x:Double
        x= readln().toDouble()
        println("Введите у")
        var y:Double
        y= readln().toDouble()
        var rez:Double
        rez=Math.sqrt(x+Math.sqrt(Math.pow(x,2.0)+4*Math.pow(y,2.0)))
        println(rez)
    }catch (ex:Exception){
        println(ex.message)
    }*/

    //задание 1: задача 9
    /*try{
        println("Введите три числа")
        var a:Double
        var b:Double
        var c:Double
        var ave:Double
        var gave:Double
        a= readln().toDouble()
        b=readln().toDouble()
        c= readln().toDouble()
        ave=(a+b+c)/3
        gave=(Math.pow(a*b*c,1.0/3.0))
        println("Среднее арифметическое: $ave \n Среднее геометрическое: $gave")
    }catch (e:Exception){
        println(e.message)
    }*/

    //задание 2: задача 5
    try{
        println("Введите 2 целых числа")
        var per:Int
        var vtor:Int
        per= readln().toInt()
        vtor= readln().toInt()
        if(per%2==0 && vtor%2==0){
            println("оба числа четные")
        }
        else if(per%2!=0 && vtor%2!=0){
            println("Оба числа нечетные")
        }
        else println("одно четное другое нечетное")
    }catch (ex:Exception){
        println(ex.message)
    }

        //задание 2:задача 15
    try {
        println("Введите трехзначное число")
        var num: Int
        num = readln().toInt()
        var des: Int
        var ed: Int
        var sot: Int
        if (num > 99 && num < 1000) {
            sot = num / 100
            des = (num / 10) % 10
            ed = num % 10
            if (ed < des && des < sot) {
                println("Цифры в числе имеют убывающую последовательность")
            } else if (ed > des && des > sot) {
                println("Цифры в числе Возростающую последовательность")
            } else println("Цифры не имеют упорядоченной последовательности")
        }
    }catch (ex:Exception){
        println(ex.message)
    }

    // задание 2: задача 25
    try{
        
    }catch (ex:Exception){
        println(ex.message)
    }



}


