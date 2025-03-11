package com.fsk

import kotlinx.coroutines.delay
import org.springframework.stereotype.Component
import kotlin.system.measureTimeMillis

@Component
class ClassComponent {

    fun callSomethingUseful(): Int {
        var result = 0
        val time = measureTimeMillis {
            val one = doSomethingUsefulOne()
            val two = doSomethingUsefulTwo()
            result = one + two
        }
        println("Completed in $time ms")
        return result
    }

    private fun doSomethingUsefulOne(): Int {
        return 13
    }

    private fun doSomethingUsefulTwo(): Int {
        return 29
    }
}