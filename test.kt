/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    println("Hello, world!")
    
    //定数の宣言,valは定数の宣言に使う
    val a: Int = 1
    
    println(a)
    
    //定数の宣言だけ，代入
    val b: Double
    b = 1.1
    
    println(b)
    
    //型の変換
	val str: String = "64"
    val intVal: Int = str.toInt()
    println(intVal)
    
    val num: Int = 64
    val stringVal: String = str.toString()
    println(stringVal)

    //nullを代入できない型と，できる型
    //null非許容型，null許容型
    //定数，変数宣言時に型が指定されたらnullを，通常では代入することはできない
    //?をつけると許容型になる
    var text: String? = null

    
}