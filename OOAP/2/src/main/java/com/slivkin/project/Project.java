package com.slivkin.project;

/**
 * @author Slivkin Sergey
 */
public class Project {

    public static void main(String[] args) {
        System.out.println("Людоед Обычный");
        ICannibal Ogre1 = new Cannibal();
        Ogre1.dayTime();
        
        System.out.println("\nЛюдоед Философ");
        ICannibal Ogre2 = new CannibalPhilosopher();
        Ogre2.dayTime();
        Ogre1.philosophize();
        
    }
}
