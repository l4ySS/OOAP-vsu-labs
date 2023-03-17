package com.slivkin.project4;

import com.slivkin.project4.CS.*;
public class CSstudents implements Students {
      @Override
    public ISinger createSinger() {
        return new CSSinger(); }

    @Override
    public IDancer createDancer() {
         return new CSDancer();  }

    @Override
    public IDirector createDirector() {
         return new CSDirector();  }
}
