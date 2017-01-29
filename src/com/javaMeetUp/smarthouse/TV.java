package com.javaMeetUp.smarthouse;

/**
 * Created by rw on 29.01.2017.
 */
public class TV implements Command{


    //Характеристики телевизора
    //вк
    public int diagonal;

    //включение телевизара

    //статус (вкоючен выключен)
    protected boolean isTurnOnOff;

    public void TurnOn(){
        isTurnOnOff = true;
    }

    @Override
    public void execute() {
        System.out.println("Телевизор существует");
    }


    //Громкость уровень

    //
}
