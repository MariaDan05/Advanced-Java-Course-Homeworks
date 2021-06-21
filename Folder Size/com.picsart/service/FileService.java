package com.picsart.service;

import com.picsart.model.MyRunnable;

import java.io.File;

public class FileService {
    public static void create(){
        File folder = new File("C:\\Users\\mariy\\OneDrive\\Desktop\\java__");
        Thread t = new Thread(new MyRunnable(folder));
        t.start();
    }
}
