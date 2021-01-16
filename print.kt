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


    val name: Any= "firman"

    when(name) {
        is Long -> println("$name adalah Long")
        is String -> println("$name adalah String")
        else -> println("undefined")
    }
}


// enum class Color(val value: Int) {
//         RED(1234) {
//             override fun printValue() {
//                 println("value of red is $value")
//             }
//         };

//         abstract fun printValue()
//     }
