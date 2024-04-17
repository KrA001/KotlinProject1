fun main(args: Array<String>) {
    var selimInfi: String
    val NUM: Int = 123
    var word: String = "selim"

    selimInfi = NUM.toString() + word
    println("$selimInfi, $NUM, $word")
    if (NUM < 0){
        println("Вы сохранили отрицательный число")
    } else if (NUM > 0) {
        println("Вы сохранили положительный число")
    } else {
        println("Вы сохранили ноль")
    }

    println("-----------------------------------------")

    fun getAgeAndTemperature(age: Int, temperature: Int): String?{
        return if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            "Можна идти гулять"
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            "Можна идти гулять"
        } else if (age < 45 && temperature >= -10 && temperature <= 25) {
            "Можна идти гулять"
        } else {
            "Оставайтесь дома"
        }
    }

    println(getAgeAndTemperature(23,-100))
    println(getAgeAndTemperature(19,10))
    println(getAgeAndTemperature(40,-1))
    println(getAgeAndTemperature(23,11))
    println(getAgeAndTemperature(50,-16))

    println("----------------------------------------------")


    val fractionalNums = doubleArrayOf(1.5, 2.4, 5.3, 6.1, 7.1, -1.8, 8.1, 7.4, -5.9, 7.5, 6.2, 4.6, 9.9, 1.1, 1.2, 1.6)

    var average: Double = 0.0

    var check: Boolean = false

    var count: Int = 0
    for (i in fractionalNums.indices) {
        if (fractionalNums[i] <= 0) {
            check = true
        } else if (check && fractionalNums[i] >= 0) {
            average += fractionalNums[i]
            count = count + 1
        }
    }
    println("Количество $count")
    println("Среднее Арифметической" + average / count)
}