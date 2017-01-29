package com.javaMeetUp.smarthouse;


public interface Command {
    boolean switchedOn = false;
    public void execute();
    public boolean getSwitchedOn();
}
