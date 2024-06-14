package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;

public class FileReader {

    public Profile getDataFromFile(File file) {
        FileInputStream profileInputStream = new FileInputStream("src/main/java/com/epam/mjc/resourcesс/Profile.txt");
        return new Profile();
    }
}
