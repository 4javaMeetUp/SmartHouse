package com.javaMeetUp.smarthouse;

/**
 * Created by Andrew on 29.01.2017.
 */
public class DishWasher implements Command {

    boolean switchedOn;

    public void execute() {
        switchedOn = !switchedOn;
        System.out.println("Current state ="+switchedOn);
    }

    public boolean getSwitchedOn() {
        return switchedOn;
    }
}
