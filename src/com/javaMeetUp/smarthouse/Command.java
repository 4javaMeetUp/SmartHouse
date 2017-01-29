package com.javaMeetUp.smarthouse;


public interface Command {
    boolean SwitchedOn = false;
    public void execute();
    public boolean getSwitchedOn();
}
