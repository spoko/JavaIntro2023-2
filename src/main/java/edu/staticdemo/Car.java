package edu.staticdemo;

public abstract class Car extends DriveCar {
    //accessed using the instance/ object i.e. different for each object
    private String model;

    //accessed using the class one for all objects from the class
    private static int counter;

    protected static final boolean FOUR_WHEEL_DRIVE;//constant value

    protected final String FACTORY_NAME;// we shall give value here -  = "VAG"; or in the constructor

    static {
        System.out.println("Executing static initializer...");
        FOUR_WHEEL_DRIVE = true;
    }

    //accessed from an object of the class
    public String getModel() {
        return model;
    }

    //accessed from the class
    public static int getCounter() {
        return counter;
    }

    private void setModel(String model) {
        if (!model.isEmpty()){
            this.model = model;
        }else {
            System.out.println("ERROR: Invalid entry for model!");
        }
    }

    public Car(String model){
        System.out.println("Executing Car constructor...");
        setModel(model);
        counter++;
        FACTORY_NAME = "VAG";
    }

    public final Car makeRR(String model){
        setModel(model);
        counter++;
        //FACTORY_NAME = "sda"; //cannot change it! Only in the constructor can be set
        return this;
    }
}
