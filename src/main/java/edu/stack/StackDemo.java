package edu.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> kitchenDrawer = new Stack<>();

        kitchenDrawer.push("Pan");
        kitchenDrawer.push("Dish");
        kitchenDrawer.push("Fork");

        System.out.println(kitchenDrawer);
        System.out.println(kitchenDrawer.pop());//fork
        System.out.println(kitchenDrawer);//pan and dish

        kitchenDrawer.add(0, "Knife");//not a standard function of the stack but can be used due to its origin

        System.out.println(kitchenDrawer);
    }
}
