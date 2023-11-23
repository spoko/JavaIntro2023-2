package edu.oop;

public class Address {
    private String country;
    private String city;
    private String location;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (!country.isEmpty()){
            this.country = country;
        }else {
            System.out.println("Error: Invalid entry for country");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (!city.isEmpty()){
            this.city = city;
        }else {
            System.out.println("Error: Invalid entry for city");
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (!location.isEmpty()){
            this.location = location;
        }else {
            System.out.println("Error: Invalid entry for location");
        }
    }

    //constructor type I (no parameters:
    public Address(){
        setCountry("Not set");
        setCity("Not set");
        setLocation("Not Set");
    }

    //constructors type II - with parameters
    public Address(String country){
        setCity(country);
    }

    public Address(String country, String city){
        setCountry(country);
        setCity(city);
    }

    public Address(String country, String city, String location){
        setCountry(country);
        setCity(city);
        setLocation(location);
    }

    //copy constructor
    public Address(Address address){
        setCountry(address.country);
        setCity(address.city);
        setLocation(address.location);
    }
}
