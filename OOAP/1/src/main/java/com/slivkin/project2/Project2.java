package com.slivkin.project2;

/**
 *
 * @author Slivkin Sergey
 */
public class Project2 {

    public static void main(String[] args) {
        Context Vasya = new Context();
        ITraveller car = new TravelOnCar();
        ITraveller foot = new TravelOnFoot();
        
        Vasya.setTravel(car);
        Vasya.show();
        
        Vasya.setTravel(foot);
        Vasya.show();
    }
}
