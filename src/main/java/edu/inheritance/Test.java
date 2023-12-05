package edu.inheritance;

public class Test {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Ivan", "2010/01/01", 2000.00,
                "JAVA");

        Developer dev2 = new Developer("Pepi", "2019/01/01", 1000.00,
                "JAVA");

        QualityAssurance qa1 = new QualityAssurance("Misho", "2019/12/01", 1350.56,
                true);

        QualityAssurance qa2 = new QualityAssurance("Misho", "2019/12/01", 1050.56,
                false);

        dev1.receivePositiveFeedback();
        dev2.receiveNegativeFeedback();

        dev1.calculateAnnualBonus(true);
        dev2.calculateAnnualBonus(false);

        qa1.receivePositiveFeedback();
        qa2.receiveNegativeFeedback();

        qa1.calculateAnnualBonus(true);
        qa2.calculateAnnualBonus(false);

        dev1.giveFeedback();
        dev2.giveHelp();
    }
}
