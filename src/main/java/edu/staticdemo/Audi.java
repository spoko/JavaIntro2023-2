package edu.staticdemo;

public class Audi extends Car{
    public Audi(String model) {
        super(model);
    }

    @Override
    public void flyForward() {
        System.out.println("Flying Audi...");
    }
}
