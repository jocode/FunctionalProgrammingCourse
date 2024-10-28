package org.example.functional_interface;

public class Diner {
    String name;
    double orderAmount;
    int table;

    public Diner(String name, double orderAmount, int table) {
        this.name = name;
        this.orderAmount = orderAmount;
        this.table = table;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }
}
