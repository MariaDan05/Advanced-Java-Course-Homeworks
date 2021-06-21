package com.picsart.model;

import com.picsart.service.getFolderSizeService;

import java.io.File;

public class MyRunnable implements Runnable{
    private File folder;

    public MyRunnable(File folder) {
        this.folder = folder;
    }

    @Override
    public void run() {
        System.out.println(getFolderSizeService.getFolderSize(folder)/1024 + "Kb");
    }
}
