
package com.slivkin.project3;
import java.util.Stack;
/**
 *
 * @author Slivkin Sergey
 */
public class Controller {
    /*
     TODO: Еще две кнопки
     1. Отмена. Отменяет все действия
     2. Возвращает в прошлое положение
    */
    private final ICommand [] commands;
    private final Stack <ICommand> back;
    private final Stack <ICommand> forward;
    
    public Controller(){
        commands = new ICommand[5];
        ICommand noCom = new NoCommand();
        for (int i = 0; i<5; i++) commands[i] = noCom;
        back = new Stack<>();
        forward = new Stack<>();
    }
    
    public void setCommand(int slot, ICommand command){
        commands[slot] = command;
    }
    
    public void pressButton(int slot){
        if (commands[slot] != null){
        commands[slot].execute();
        back.add(commands[slot]);
        }
    }
    
    public void pressUndoButton(){
        if (back.isEmpty()) return;
              
        forward.push(back.pop());
        
        if (back.isEmpty()) return;
        back.peek().execute();
        
    }
    
    public void pressRedoButton(){
        if (forward.isEmpty()) return;
        back.push(forward.pop());
        back.peek().execute();
    }
    
}
