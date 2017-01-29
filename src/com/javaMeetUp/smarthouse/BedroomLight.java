package com.javaMeetUp.smarthouse;

/**
 * Created by ALEXANDER on 29.01.2017.
 */
public class BedroomLight implements Command {

    private boolean lightState;

    @Override
    public void execute() {
        this.lightState = !this.lightState;
    }

    public BedroomLight(){
        this.lightState = false;
    }

    public boolean isLightState() {
        return lightState;
    }
}
