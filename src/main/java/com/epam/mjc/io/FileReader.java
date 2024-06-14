package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;

public class FileReader {

    public Profile getDataFromFile(File file) {
        FileInputStream profileInputStream = new FileInputStream("/autocode/b090bcfb-388f-4c80-909a-9986845f3219/repository/src/main/resources/Profile.txt");
        return new Profile();
    }
}
