package edu.oop;

public class Test {
    public static void main(String[] args) {
        //Dog huski = new Dog();
        //System.out.println(huski);
        Address sofiaAddress = new Address("Bulgaria", "Sofia", "Not Set");

        Address levskiGAddress = new Address(sofiaAddress);
        levskiGAddress.setLocation("Levski G");

        Address liulinAddress = new Address(sofiaAddress);
        liulinAddress.setLocation("Liulin 5");

        Breed huskiBreed = new Breed("Huski", "Big dog, furry",
                "Heat stroke");
        Breed germanShepardBreed = new Breed("German Shepard", "Big dog, long hair",
                "lower back issues");

        Dog balkan = new Dog(germanShepardBreed, "male", (byte) 3, "black",
                45.53f, "Balkan", levskiGAddress, true);

        Dog huski = new Dog(huskiBreed, "male", (byte) 5, "white",
                45.53f, "Alis", levskiGAddress, true);
        System.out.println(balkan);
        
        //calling the methods i.e. doing some actions with the object(s)
        huski.setBreed(huskiBreed);//breed = "Huski";
        huski.setName("Alis"); //name = "Alis";
        huski.setWeight(45.34f);//weight = 45.34f;
        huski.setSex("female");//sex = "female";
        huski.setColor("brown");//color = "brown";
        huski.setAge((byte) 5);//age = 5;

        huski.printData();
        balkan.printData();

        huski.makeSomeNoise();
        balkan.makeSomeNoise();

        huski.eat();
        balkan.eat();
    }
}
