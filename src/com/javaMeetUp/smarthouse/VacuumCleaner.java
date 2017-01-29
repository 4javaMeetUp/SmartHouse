package com.javaMeetUp.smarthouse;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Viva on 29.01.2017.
 */
public class VacuumCleaner implements Command {


    @Override
    public void execute() {
        System.out.println("Vacuum Cleaner is On");
    }


}
