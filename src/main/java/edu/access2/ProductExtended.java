package edu.access2;

import edu.access.Product;

public class ProductExtended extends Product {

    //cannot be done
//    public void finalMethod(){
//
//    }
    public static void main(String[] args) {
        ProductExtended productExtended = new ProductExtended();
        //public and protected stuff can be accessed in a subclass from different package
        productExtended.publicMethod();
        productExtended.protectedMethod();
        System.out.println(productExtended.publicName);
        System.out.println(productExtended.protectedName);
    }
}
