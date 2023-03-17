package com.slivkin.project3.Commands;
import com.slivkin.project3.Window;
import com.slivkin.project3.ICommand;
/**
 *
 * @author Slivkin Sergey
 */
public class OpenWindow implements ICommand {
   
    private final Window window;
    public OpenWindow(Window _window){
        this.window = _window;
    }
    @Override
    public void execute(){
        window.open();
    }
   
    
}

