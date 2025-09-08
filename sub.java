// This is a simple Java program

public class Main {
    // Function to print "Hello, World!"
    public static void helloWorld() {
        System.out.println("Hello, Amoolya World!");
    }

    // Function to subtract two numbers
    public static int subtractNumbers(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        // Calling the helloWorld method
        helloWorld();

        // Defining two numbers
        int num1 = 15;
        int num2 = 7;

        // Calling the subtractNumbers method
        int result = subtractNumbers(num1, num2);

        // Printing the result
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + result);
    }
}
