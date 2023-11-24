package edu.encapsulation;

import java.util.LinkedList;

public class Person {
    private String name;
    private int money;
    private LinkedList<Product> bagOfProducts = new LinkedList<Product>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: Invalid entry for name!");
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money >= 0){
            this.money = money;
        }else {
            System.out.println("Error: Invalid entry for money!");
        }
    }

    public Person(String name, int money){
        setName(name);
        setMoney(money);
    }

    public void buyProduct(Product product){
        if (this.getMoney() >= product.getCost()){
            bagOfProducts.add(product);
            this.setMoney(this.getMoney() - product.getCost());
            System.out.printf("%s bought %s\n", this.name, product.getName());
        }else {
            System.out.printf("%s can't afford %s\n", this.name, product.getName());
        }
    }

    public void printItemsFromTheBag(){
        if(bagOfProducts.size() == 0){
            System.out.printf("%s - Nothing bought\n", this.name);
            return;
        }

        String itemNames = "";
        for (Product product : bagOfProducts){
            if (bagOfProducts.size() > 1){
                itemNames += product.getName() + ", ";
            }else {
                itemNames += product.getName();
            }
        }

        if (bagOfProducts.size() > 1){
            itemNames = trimResult(itemNames);
        }
        System.out.printf("%s - %s\n",this.name, itemNames);
    }

    //internal method
    private String trimResult(String result){
        result = result.trim();// remove the space at the end
        result = result.substring(0, result.length() - 1);//removes the , at the end
        return result;
    }
}
