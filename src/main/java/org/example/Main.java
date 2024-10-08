package org.example;

public class Main {
    public static void main(String[] args) {
        Function f = (int number) -> System.out.println("The number is: " + number);
        FunctionTest ft = () -> System.out.println("Hello, World!");

        Operations sum = (int a, int b) -> System.out.println("The sum is: " + (a + b));
        Operations subtraction = (int a, int b) -> System.out.println("The subtraction is: " + (a - b));
        Operations multiplication = (int a, int b) -> System.out.println("The multiplication is: " + (a * b));
        Operations division = (int a, int b) -> System.out.println("The division is: " + (a / b));

        division.printOperation(5, 3);
    }

    public void myMethod(FunctionTest ft) {
        ft.greeting();
    }
}