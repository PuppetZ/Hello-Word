package com.example.helloworld

/**
 * Created by zz on 2020/6/20 .
 *
 */
fun String.lettersCount(): Int {
    var count = 0
    for(char in this){
        if (char.isLetter()){
            count++
        }
    }
    return count
}