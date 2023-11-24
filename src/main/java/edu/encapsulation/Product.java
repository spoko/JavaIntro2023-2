package edu.encapsulation;

public class Product {
    private String name;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: Invalid entry for name!");
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost > 0){
            this.cost = cost;
        }else {
            System.out.println("Error: Invalid entry for cost!");
        }
    }

    public Product(String name, int cost){
        setName(name);
        setCost(cost);
    }
}
