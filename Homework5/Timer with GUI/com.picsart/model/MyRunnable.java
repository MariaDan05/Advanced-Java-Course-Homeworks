package com.picsart.model;

import com.picsart.service.InvalidInputException;
import com.picsart.service.OutputValidator;

import javax.swing.*;

public class MyRunnable implements Runnable{
    private int currentMin;
    private int currentSec;
    private JTextArea output;

    public MyRunnable(int currentMin, int currentSec, JTextArea output) {
        if(currentMin >= 0 && currentMin <= 59) {
            this.currentMin = currentMin;
        } else {
            throw new InvalidInputException("Invalid Minutes, try again");
        }
        if(currentSec >= 0 && currentSec <= 59) {
            this.currentSec = currentSec;
        } else {
            throw new InvalidInputException("Invalid Seconds, try again");
        }
        this.output = output;
    }

    @Override
    public void run() {
        while (currentMin >= 0 && currentMin <= 59 && currentSec >= 0 && currentSec <= 59) {
            String str1 = OutputValidator.minutesStyle(currentMin);
            String str2 = OutputValidator.secondsStyle(currentSec);
            if(currentSec-- == 0){
                currentSec = 59;
                currentMin--;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            output.setText(str1 + str2);
            output.setEditable(false);
        }
    }

}
