package edu.oop;

public class Test {
    public static void main(String[] args) {
        Dog huski = new Dog();
        System.out.println(huski);

        Dog balkan = new Dog("German Shepard", "male", (byte) 3, "black",
                45.53f, "Balkan", true);
        System.out.println(balkan);
        
        //calling the methods i.e. doing some actions with the object(s)
        huski.breed = "Huski";
        huski.name = "Alis";
        huski.weight = 45.34f;
        huski.sex = "female";
        huski.color = "brown";
        huski.age = 5;

        huski.printData();
        balkan.printData();

        huski.makeSomeNoise();
        balkan.makeSomeNoise();

        huski.eat();
        balkan.eat();
    }
}
