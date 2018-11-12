package pl.kasieksoft.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciIterativeTest {

    @Test
    void shouldCalculateCorrectFinbonacciNumber() {
        //given
        int fibonacciNumberInOrder = 12;
        //when
        long result = FibonacciIterative.fibonacci(fibonacciNumberInOrder);
        //then
        assertEquals(233, result);
    }

    @Test
    void shouldReturnOneForZero() {
        //given
        int fibonacciNumberInOrder = 0;
        //when
        long result = FibonacciIterative.fibonacci(fibonacciNumberInOrder);
        //then
        assertEquals(1, result);
    }

    @Test
    void shouldThrowExceptionForArgumentSmallerThanZero() {
        //given
        int fibonacciNumberInOrder = -1;
        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> FibonacciIterative.fibonacci(fibonacciNumberInOrder));
    }

    @Test
    void shouldThrowExceptionForANumberTooBigForLong() {
        //given
        int fibonacciNumberInOrder = 88;
        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> FibonacciIterative.fibonacci(fibonacciNumberInOrder));
    }

}