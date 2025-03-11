package com.fsk

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SuspendClassTest {

    @Test
    fun `test something useful`() = runBlocking {
        val suspendClass = SuspendClass()
        val result = suspendClass.callSomethingUseful()
        assertEquals(result, 42)
    }

    @Test
    fun `test something useful 2`() = runBlocking {
        val suspendClass = SuspendClassComponent()
        val result = suspendClass.callSomethingUseful()
        assertEquals(result, 42)
    }

    @Test
    fun `test something useful 3`() = runBlocking {
        val suspendClass = ClassComponent()
        val result = suspendClass.callSomethingUseful()
        assertEquals(result, 42)
    }
}