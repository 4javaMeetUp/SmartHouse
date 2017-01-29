package com.javaMeetUp.smarthouse;

public class Kitchen implements Command {

    private boolean lightIsOn;


    public Kitchen() {
        this.lightIsOn = false;
    }

    public void turnTheLight() {
        this.lightIsOn = !lightIsOn;
    }

    @Override
    public void execute() {
        turnTheLight();
        System.out.println("Light in the kitchen is " + (lightIsOn ? "on" : "off") + ".");
    }

}
