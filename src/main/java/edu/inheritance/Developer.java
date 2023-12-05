package edu.inheritance;

public class Developer extends Employee {
    private String programingLanguage;

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        if (!programingLanguage.isEmpty()){
            this.programingLanguage = programingLanguage;
        }else {
            System.out.println("Invalid entry for programing language!");
        }
    }

    public Developer(String name, String startDate, double salary, String programingLanguage) {
        super(name, startDate, salary);//mandatory!!! calling parent constructor first!!!
        setProgramingLanguage(programingLanguage);
    }

    @Override
    public void calculateAnnualBonus(boolean isTargetAchieved) {
        if (isTargetAchieved){
            System.out.println("You have a bonus of 1000");
        }else {
            System.out.println("The shall be achieved first");
        }
    }


}
