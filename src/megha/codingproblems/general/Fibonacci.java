package megha.codingproblems.general;


public class Fibonacci {


    public int fibonacciIterative(int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public int fibonacciRecursive(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();

        System.out.println("Wersja iteracyjna:");
        System.out.println(fib.fibonacciIterative(10));
        System.out.println("Wersja rekurencyjna:");
        System.out.println(fib.fibonacciRecursive(10));

    }
}