package pl.kasieksoft.fibonacci;

public class FibonacciIterative {

    public static void main(String[] args) {
        System.out.println(fibonacci(11));
        fibonacci(-1);
    }

    static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder < 0 || fibonacciNumberInOrder > 86) {
            throw new IllegalArgumentException("Please input a value between 1 and 86 (long maximum)");
        }

        long previousNumber = 0;
        long currentNumber = 1;

        for (int i = 0; i < fibonacciNumberInOrder; i++) {
            long sum = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = sum;
        }
        return currentNumber;
    }
}


