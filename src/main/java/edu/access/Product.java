package edu.access;

public class Product {
    //can be accessed from anywhere
    public String publicName;

    //can be accessed form the current class, outside class form the same package and subclass (child class) from the different package
    protected String protectedName;

    //current class or subclass in the same package
    String defaultName;

    //only from the current class
    private String privateName;

    public final String finalName = "some final name";

    //only from the current class
    private void privateMethod(){
        System.out.println("Calling a private method");
    }

    //current class or subclass in the same package
    void defaultMethod(){
        System.out.println("Calling default method");
    }

    //can be accessed form the current class, outside class form the same package and subclass (child class) from the different package
    protected void protectedMethod(){
        System.out.println("Calling protected method");
    }

    //can be accessed from anywhere
    public void publicMethod(){
        System.out.println("Calling public method");
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.privateName = "Some random name";
        System.out.println(product.privateName);

        product.privateMethod();
    }

    public final void finalMethod(){
        System.out.println("I cannot be changed");
    }
}
