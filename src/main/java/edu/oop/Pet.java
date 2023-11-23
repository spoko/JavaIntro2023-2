package edu.oop;

public class Pet {
    //fields or instance variable
    private Breed breed;//composition
    private String sex;
    private byte age;
    private String color;
    private float weight;
    private String name;
    private Address address;//aggregation

    //properties (special methods - setters and getters)
    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        }else {
            System.out.println("Error: Invalid entry for breed");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (!sex.isEmpty()){
            this.sex = sex;
        }else {
            System.out.println("Error: Invalid entry for sex");
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age >= 0){
            this.age = age;
        }else {
            System.out.println("Error: Invalid entry for age");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.isEmpty()){
            this.color = color;
        }else {
            System.out.println("Error: Invalid entry for color");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight >= 0.05f){
            this.weight = weight;
        }else {
            System.out.println("Error: Invalid entry for weight");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: Invalid entry for name");
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if (!address.equals(null)){
            this.address = address;
        }else {
            System.out.println("Error: invalid entry for address");
        }
    }

    //constructors
    public Pet(Breed breed, String sex, byte age, String color, float weight, String name,
               Address address){
       setBreed(breed);
        setSex(sex);
        setAge(age);
        setColor(color);
        setWeight(weight);
        setName(name);
        setAddress(address);
    }

    //default constructor
    public Pet(){

    }

    //methods i.e. actions
    public void eat(){
        System.out.printf("%s is eating...\n", name);
    }

    public void makeSomeNoise(){
        System.out.printf("%s is making noise");
    }

    public void printData(){
        System.out.printf("%s is %d years old and weights %f kg. It is from %s sex, the color is %s" +
                ", the breed is %s.\n", name, age, weight, sex, color, breed);
    }
}
