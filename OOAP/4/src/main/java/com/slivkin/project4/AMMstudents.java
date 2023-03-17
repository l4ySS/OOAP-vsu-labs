package com.slivkin.project4;
import com.slivkin.project4.AMM.*;
public class AMMstudents implements Students{

    @Override
    public ISinger createSinger() {
        return new AMMSinger(); }

    @Override
    public IDancer createDancer() {
         return new AMMDancer();  }

    @Override
    public IDirector createDirector() {
         return new AMMDirector();  }
    
}
