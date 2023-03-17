package com.slivkin.project3;
/**
 *
 * @author Slivkin Sergey
 */
public class Window {
    public final int OPEN = 2;
    public final int SEMIOPEN = 1;
    public final int CLOSE = 0;
    
    private final String location;
    private int status;
    
    public Window(String location){
        this.location = location;
    }
    
    public int getStatus(){
        return status;
    }
    
    public void open(){
        status = OPEN;
        System.out.println(location + ": Окно открыто");
    }
    
    public void close(){
        status = CLOSE;
        System.out.println(location + ": Окно закрыто");
    }
    public void semiOpen(){
        status = SEMIOPEN;
        System.out.println(location + ": Окно открыто на проветривание");
    }
    
}
