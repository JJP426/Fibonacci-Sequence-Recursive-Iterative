// CSCI 1933 Lab 03
import java.util.Scanner;

public class Fib {
    
    // Returns the n'th Fibonacci number using recursion
    public static int fibonacciRecursive(int n) {
            if (n == 0) {
                return 0; // Case: Bad input
            }
            if (n == 1) { // Case: Base Case
                return 1;
            }
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // Case: Recursive Case    }            
    }

// Change ___________________________________________________________
    
    // Returns the n'th Fibonacci number using iteration
    public static int fibonacciIterative(int n) {
        int prev = 0;
        int curr  = 1;
        int newvalue = 0;
        if (n < 0) {
            return -1; // Case: Bad input
        }
        for (int i = 1; i < n; i++) { // Loop until correct factorial created.
            newvalue = prev + curr;
            prev = curr;
            curr = newvalue;
        }
    return newvalue;    
}

// ___________________________________________________________________

    public static void main(String[] args) {
    // Instantiate Scanner
        Scanner s = new Scanner(System.in);
        // Prompt user
        System.out.println("Enter an int n to get the nth Fibonacci number: ");
        // Gets integer from the command line
        int n = s.nextInt();
        // Print the results
        System.out.println("The " + n + "'th Fibonacci number using fibonacciRecursive is " + fibonacciRecursive(n));
        System.out.println("The " + n + "'th Fibonacci number using fibonacciIterative is " + fibonacciIterative(n));    }
}
