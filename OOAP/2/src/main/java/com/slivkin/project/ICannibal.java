
package com.slivkin.project;

/**
 *
 * @author Slivkin Sergey
 */
public abstract class ICannibal {
    public final void dayTime(){
        wakeUp();
        catchVictim();
        if (isPhilosopher()) philosophize();
        cook();
        eat();
        sleep();
    };
 
    public void wakeUp(){
        System.out.println("Проснулся");
    }

    public void catchVictim(){
        System.out.println("Поймал жертву");
    }

    abstract void cook();

    public void eat(){
        System.out.println("Поел");
    }

    public void sleep(){
        System.out.println("Лег спать");
    }
    
    public boolean isPhilosopher(){
        return false;
    }
    
    public void philosophize(){};
    
}
