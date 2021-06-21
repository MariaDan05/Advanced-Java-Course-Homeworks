package com.picsart.service;

import java.io.File;

public class FolderSizeService {
    public static long getFolderSize(File folder) {
        long length = 0;

        File[] files = folder.listFiles();

        int count = files.length;

        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                length += files[i].length();
            }
            else {
                length += getFolderSize(files[i]);
            }
            if(i != count - 1)
                System.out.println(length/1024 + "Kb");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return length;
    }
}
