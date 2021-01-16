fun main() {
    // var character = 'A'
    // println(character++)
    // println(character++)

    // val kotlin = "kotlin"

    // for(char in kotlin) {
    //     println(char)
    // }

//     val text =
// """
// line 1
// line 2
// line 3
// """.trimIndet()

//     println(text)

    // var array = arrayOf(1,2,3,4)

    // println(array[1])

//    fun sayHi(name:String) = "hi $name :v"

//    print(sayHi("firman"))

    // val status = true

    // if (status) {
    //     print("hello")
    // } else {
    //     print("fuck you")
    // }

    // print(Int.MAX_VALUE)
    // print(Double.MAX_VALUE)

    // val namaBuah:String? = null

    // val kudamon = namaBuah?.length ?: 6

    // val status = false
    // val umur = 18
    // val name = "firman"
    // val sapaan = "hello $name , umur kamu ${if (status) "maaf bung" else " $umur"}"
    // print(sapaan)

    // val color: Color = Color.valueOf("RED")

    // print(color)

//     val value = 8

//     val stringOfValue = when(value) {
//         6 -> {
//             println("angka nya adalah $value")
//             "enam"
//             }
//         7 -> {
//             println("angka nya adalah $value")
//             "tujuh"
//             }
//         8 -> {
//             println("angka nya adalah $value")
//             "delapan"
//         }
//         9 -> {
//             println("angka nya adalah $value")
//             "sembilan"
//         }
//         else -> {
//             println("angka mu melebihi batas")
//             "angka melebihi batas"
//         }
//     }

//     println(stringOfValue)


    // val name: Any= "firman"
    // val ranges = 10..50
    // val angka = 2109 

    // when(name) {
    //     is Long -> println("$name adalah Long")
    //     is String -> println("$name adalah String")
    //     else -> println("undefined")
    // }

    // when(angka) {

    //     in ranges -> println("angka adalah $angka")
    //     else -> println("bukan di range $ranges")
    // }

    // val registerNumber = when(val regis= getRegisterNumber()) {
    //     in 1..50 -> 50 * regis
    //     in 51..100 -> 100 * regis
    //     else -> regis
    // }
    // var counter = 0
    // // while(counter <= 5) {
    // //     print("hello from kotlin")
    // //     counter++;
    // // }
    
    // do {
    //     print("hello world")
    //     counter++
    // } while(counter <= 5)


    // var ranges = 1..10 step 2
    // var arrays = arrayOf(1,2,3,456,74,12)
    // arrays.forEach{
    //     println("$it")
    // }

//  var chars = 'A'.rangeTo('F')

//  chars.forEach{
//      println("$it")
//  }

    // var ranges = 1..5
    // for((i,e) in ranges.withIndex()) {
    //     println("ranges $e index ke-$i")
    // }

    // ranges.forEachIndexed{ index, value ->
    //     println("$value ke - $index")
    // }

    loop@ for (i in 1..10) {
        println("outside looping")
        for (j in 1..10) {
            if (j > 5) break@loop
            println("looping ke - $j")
        }

        
    }
}


// fun getRegisterNumber() = Random.nextInt(100)

// enum class Color(val value: Int) {
//         RED(1234) {
//             override fun printValue() {
//                 println("value of red is $value")
//             }
//         };

//         abstract fun printValue()
//     }
