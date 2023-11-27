package edu.access2;

import edu.access.Product;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();

        //only the public stuff can be accessed in an outside class
        System.out.println(product.publicName);
        product.publicMethod();

        //cannot be done:
        //product.finalName = "Other name";

    }
}
