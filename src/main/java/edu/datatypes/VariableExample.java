package edu.datatypes;

public class VariableExample {
    //primitive types and also instance variables:
    byte age;
    short peakHeight;
    int egn;
    long hours;
    float foreignExchangeRate;
    double mathPi = 3.14;
    char letter = 'Ю';

    //referent data types also instance variables:
    String someName = "Spoko";
    Dog morti = new Dog();

    public static void main(String[] args) {
        //local variables
        Dog sharo = new Dog();
        Dog belka = new Dog();

        sharo.printDogData();
        sharo.isFemale = true;
        sharo.name = "Sharo";
        sharo.age = 5;

        System.out.println("---------------------------");
        sharo.printDogData();

        VariableExample ve = new VariableExample();
        ve.printVariableData();

        System.out.println("---------------------------");

        System.out.println("Sharo breed is: " + sharo.breed);
        System.out.println("Belka breed is: " + belka.breed);

        Dog.breed = "German Shepard";
        System.out.println("Sharo breed is: " + sharo.breed);
        System.out.println("Belka breed is: " + belka.breed);


    }

   public void printVariableData(){
        //accessing instance variable
       System.out.println(someName);
    }
}
