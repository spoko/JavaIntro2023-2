package edu.encapsulation;

class Test {
    public static void main(String[] args) {
        Person elena = new Person("Elena", 11);
        Person alex = new Person("Alex", 4 );

        Product coffee = new Product("Coffee", 10);
        Product tea = new Product("Tea", 2);

        elena.buyProduct(coffee);
        alex.buyProduct(tea);
        alex.buyProduct(tea);
        elena.buyProduct(tea);

        elena.printItemsFromTheBag();
        alex.printItemsFromTheBag();

        System.out.println("------------------");

        Person mimi = new Person("Mimi", 0);
        Product juice = new Product("Juice", 2);

        mimi.buyProduct(juice);
        mimi.printItemsFromTheBag();

        System.out.println("------------------");

        Person petar = new Person("Petar", -3);
        Product bread = new Product("Bread", 1);

        petar.buyProduct(bread);

    }
}
