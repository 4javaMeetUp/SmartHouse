package com.javaMeetUp.smarthouse;

/**
 * @author Denis Tantsev (dtantsev@gmail.com)
 */
public class HallLights implements Command {
    boolean state;
    private void changeState() {
        state = !state;
    }

    @Override
    public void execute() {
        changeState();
        System.out.println("Light state in hall changed");
    }
}
