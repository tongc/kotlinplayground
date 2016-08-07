package com.goda5.kotlin.playground;

val KotlinHelloString: String = "Hello from Kotlin!"

fun getHelloStringFromJava(): String {
    return KotlinHelloString
}

fun main(args: Array<String>) {
    print(getHelloStringFromJava())
}
