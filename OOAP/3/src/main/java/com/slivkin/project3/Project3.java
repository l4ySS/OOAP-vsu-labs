/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.slivkin.project3;
import com.slivkin.project3.Commands.*;
import java.util.Scanner;
/**
 *
 * @author Slivkin Sergey
 */
public class Project3 {

    public static void main(String[] args) {

        Controller cont = new Controller();
        Window wind = new Window("Cпальня");
        cont.setCommand(0, new OpenWindow(wind));
        cont.setCommand(1, new SemiOpen(wind));
        cont.setCommand(2, new CloseWindow(wind));
        cont.pressButton(2);
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n != 0) {
        switch(n){
            case 1 -> cont.pressButton(0);
            case 2 -> cont.pressButton(1);
            case 3 -> cont.pressButton(2);
            case 4 -> cont.pressUndoButton();
            case 5 -> cont.pressRedoButton();
        }
        n = scanner.nextInt();
        }
       
    }
}
