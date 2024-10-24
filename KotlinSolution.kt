import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'designerPdfViewer' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY h
 *  2. STRING word
 */

fun designerPdfViewer(h: Array<Int>, word: String): Int {
    // Write your code here
    
    var alphabets : HashMap<String, Int> = hashMapOf(
        "a" to 0,
        "b" to 1,
        "c" to 2,
        "d" to 3,
        "e" to 4,
        "f" to 5,
        "g" to 6,
        "h" to 7,
        "i" to 8,
        "j" to 9,
        "k" to 10,
        "l" to 11,
        "m" to 12,
        "n" to 13,
        "o" to 14,
        "p" to 15,
        "q" to 16,
        "r" to 17,
        "s" to 18,
        "t" to 19,
        "u" to 20,
        "v" to 21,
        "w" to 22,
        "x" to 23,
        "y" to 24,
        "z" to 25
    )
    
    val listOfWords = word.toCharArray().asList()
    var max = 0
    
    for(item in listOfWords){
        
        if(h[alphabets[item.toString()]?:0] > max)
        {
            max = h[alphabets[item.toString()]?:0]
        }  
        
    }
    
    
    return max * word.length

}

fun main(args: Array<String>) {

    val h = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val word = readLine()!!

    val result = designerPdfViewer(h, word)

    println(result)
}
