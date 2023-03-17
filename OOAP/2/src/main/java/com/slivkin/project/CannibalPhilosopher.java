package com.slivkin.project;

/**
 *
 * @author Slivkin Sergey
 */
public class CannibalPhilosopher extends ICannibal{
    @Override
     public boolean isPhilosopher(){
        return true;
    }
    @Override
    public void cook(){
        System.out.println("Сварил");
    }
    @Override
    public void philosophize(){
    System.out.println("Побеседовал на философские темы.");
    }
    
}
