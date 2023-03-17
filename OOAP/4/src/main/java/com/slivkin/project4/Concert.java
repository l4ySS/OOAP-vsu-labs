
package com.slivkin.project4;


public class Concert {
    Students team;
    public void start(String type){
        IDancer danc;
        ISinger sing;
        IDirector direc;
        switch(type){
            case "AMM" -> team = new AMMstudents();
            case "CS" -> team = new CSstudents();
        }
        danc = team.createDancer();
        sing = team.createSinger();
        direc = team.createDirector();
        
        danc.dance();
        sing.sing();
        direc.direct();
    }
}
