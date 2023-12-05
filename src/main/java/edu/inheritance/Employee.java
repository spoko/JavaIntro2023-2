package edu.inheritance;

import edu.inheritance.interfaces.JuniorActions;
import edu.inheritance.interfaces.SeniorActions;

public class Employee extends AnnualOperations implements JuniorActions, SeniorActions {
    private String name;
    private String startDate;
    private double salary;

    private final double MINIMAL_SALARY = 800.00;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else{
            System.out.println("Error invalid entry for name!");
        }
    }

    public String getStartDate() {
        return startDate;
    }

    private void setStartDate(String startDate) {
        if (!startDate.isEmpty()){
            this.startDate = startDate;
        }else{
            System.out.println("Error invalid entry for start date!");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= MINIMAL_SALARY){
            this.salary = salary;
        }else {
            System.out.println("Error invalid entry for start salary!");
        }
    }

    //constructor with parameters
    public Employee(String name, String startDate, double salary){
        setName(name);
        setStartDate(startDate);
        setSalary(salary);
    }


    @Override
    public void calculateAnnualBonus(boolean isTargetAchieved) {
        System.out.println("We cannot calculate bonus!");
    }

    @Override
    public void askQuestions() {
        System.out.printf("%s is asking some questions", name);
    }

    @Override
    public void takeTrainings() {
        System.out.printf("%s is taking a training", name);
    }

    @Override
    public void giveHelp() {
        System.out.printf("%s is giving help", name);
    }

    @Override
    public void planTrainings() {
        System.out.printf("%s is planing trainings", name);
    }

    @Override
    public void giveFeedback() {
        System.out.printf("%s is giving some feedback", name);
    }
}
