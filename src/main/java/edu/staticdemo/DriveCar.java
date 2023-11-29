package edu.staticdemo;

public abstract class DriveCar {
    public void DriveForward(){
        System.out.println("Moving forward...");
    }

    public void DriveBackwards(){
        System.out.println("Moving backwards...");
    }

    public abstract void flyForward();
}
