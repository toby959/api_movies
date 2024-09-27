package com.toby.screentoby.calculations;

import com.toby.screentoby.model.Title;


public class TimeCalculator {

    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }


    public void include(Title title) {
         this.totalTime += title.getDurationInMinutes();
    }


}
