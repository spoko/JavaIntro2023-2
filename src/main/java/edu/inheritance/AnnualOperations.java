package edu.inheritance;

public abstract class AnnualOperations {

    public abstract void calculateAnnualBonus(boolean isTargetAchieved);

    public void receivePositiveFeedback(){
        System.out.println("You did a great job! But there is not enough budget for salary rise!");
    }

    public void receiveNegativeFeedback(){
        System.out.println("You shall perform better this year!");
    }
}
