package edu.access;

//a class can either be default or public
class Test {
    public static void main(String[] args) {
        Product product = new Product();
        product.protectedMethod();
        product.defaultMethod();
        product.protectedMethod();

        System.out.println(product.defaultName);
        System.out.println(product.protectedName);
        System.out.println(product.publicName);
    }
}
