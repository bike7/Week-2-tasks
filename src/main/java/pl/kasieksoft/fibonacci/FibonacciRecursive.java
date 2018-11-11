package pl.kasieksoft.fibonacci;

public class FibonacciRecursive {

    public static void main(String[] args) {
        System.out.println(fibonacci(11));
        fibonacci(-1);
    }

    static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder < 0 || fibonacciNumberInOrder > 86) {
            throw new IllegalArgumentException("Please input a value between 1 and 86 (long maximum)");
        }

        if (fibonacciNumberInOrder <= 1) {
            return 1;
        }
        return fibonacci(fibonacciNumberInOrder - 1) + fibonacci(fibonacciNumberInOrder - 2);
    }
}
