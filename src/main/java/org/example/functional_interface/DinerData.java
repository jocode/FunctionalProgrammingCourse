package org.example.functional_interface;

import java.util.function.Function;

public class DinerData {

    public static void main(String[] args) {
        Diner diner = new Diner("Alice", 25, 3);
        String dinerName1 = (String) getDinerData(diner, x -> x.getName());
        String dinerName2 = (String) getDinerData(diner, Diner::getName);

        System.out.println("Diner name: " + dinerName1 + " " + dinerName2);
    }

    public static Object getDinerData(Diner diner, Function<Diner, Object> func) {
        return func.apply(diner);
    }

}
