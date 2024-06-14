package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;

public class FileReader {

    public Profile getDataFromFile(File file) {
        FileInputStream profileInputStream = new FileInputStream("java/com/epam/mjc/ioresourcesс/Profile.txt");
        return new Profile();
    }
}
