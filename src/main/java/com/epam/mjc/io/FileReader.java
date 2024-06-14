package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;

public class FileReader {

    public Profile getDataFromFile(File file) {
        FileInputStream profileInputStream = new FileInputStream("stage1-module6-io-task1/src/main/java/com/epam/mjc/io/resourcesс/Profile.txt");
        return new Profile();
    }
}
