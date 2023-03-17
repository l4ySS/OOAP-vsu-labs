package com.slivkin.project2;

/**
 *
 * @author Slivkin Sergey
 */
public class Context {
    private ITraveller sol;
    
    public void setTravel(ITraveller _sol){
        sol = _sol;
    }
    
    public void show(){
        sol.travel();
    }
    
}
