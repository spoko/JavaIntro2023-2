package edu.inheritance;

public class QualityAssurance extends Employee{
    private boolean isAutomation;

    public boolean isAutomation() {
        return isAutomation;
    }

    public void setAutomation(boolean automation) {
        isAutomation = automation;
    }

    public QualityAssurance(String name, String startDate, double salary, boolean isAutomation) {
        super(name, startDate, salary);
        setAutomation(isAutomation);
    }

    @Override
    public void calculateAnnualBonus(boolean isTargetAchieved) {
        if (isTargetAchieved){
            System.out.println("You have a bonus of 2000");
        }else {
            System.out.println("The shall be achieved first");
        }
    }
}
