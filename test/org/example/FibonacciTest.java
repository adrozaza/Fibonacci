package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        assertEquals(0, ejemplo.Fibonacci.fibonacci(0));
        assertEquals(1, ejemplo.Fibonacci.fibonacci(1));
        assertEquals(1, ejemplo.Fibonacci.fibonacci(2));
        assertEquals(2, ejemplo.Fibonacci.fibonacci(3));
        assertEquals(3, ejemplo.Fibonacci.fibonacci(4));
        assertEquals(5, ejemplo.Fibonacci.fibonacci(5));
        assertEquals(8, ejemplo.Fibonacci.fibonacci(6));
        assertEquals(13, ejemplo.Fibonacci.fibonacci(7));
        assertEquals(21, ejemplo.Fibonacci.fibonacci(8));
        assertEquals(34, ejemplo.Fibonacci.fibonacci(9));
        assertEquals(55, ejemplo.Fibonacci.fibonacci(10));
        // Puedes añadir más casos de prueba según sea necesario
    }
}
