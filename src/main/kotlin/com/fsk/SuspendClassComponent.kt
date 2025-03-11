package com.fsk

import kotlinx.coroutines.delay
import org.springframework.stereotype.Component
import kotlin.system.measureTimeMillis

@Component
class SuspendClassComponent {

    suspend fun callSomethingUseful(): Int {
        var result = 0
        val time = measureTimeMillis {
            val one = doSomethingUsefulOne()
            val two = doSomethingUsefulTwo()
            result = one + two
        }
        println("Completed in $time ms")
        return result
    }

    private suspend fun doSomethingUsefulOne(): Int {
        delay(1000L) // pretend we are doing something useful here
        return 13
    }

    private suspend fun doSomethingUsefulTwo(): Int {
        delay(1000L) // pretend we are doing something useful here, too
        return 29
    }
}