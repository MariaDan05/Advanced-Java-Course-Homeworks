package com.picsart.service;

public class OutputValidator {
    public static String minutesStyle(int currentMin) {
        String s = "";
        if (currentMin < 10 && currentMin >= 0) {
            s += "0" + currentMin + ":";
        } else {
            s += currentMin + ":";
        }
        return s;
    }

    public static String secondsStyle(int currentSec) {
        String s = "";
        if(currentSec < 10 && currentSec >= 0) {
            s+= "0" + currentSec;
        } else {
            s+=currentSec;
        }
        return s;
    }
}
