package org.example.ambiguity;

public class Principal {
    public static void main(String[] args) {
        CalculatorInt calInt = (x, y) -> x + y;
        CalculatorLong calLong = (x, y) -> x + y;

        engine(calInt);
        engine(calLong);
        System.out.println(sum().calculate(5, 3));
    }

    public static void engine(CalculatorInt cal) {}

    public static void engine(CalculatorLong cal) {}

    public static CalculatorInt sum() {
        return (x, y) -> x + y;
    }
}
