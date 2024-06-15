package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException; 

public class FileReader {

    public Profile getDataFromFile(File file) {        
        profileMethod();
        return new Profile("", 0, "", new Long(0));
    }

    private void profileMethod() {
        File profile = new File("src/main/resources/Profile.txt");
        FileInputStream profileInputStream = new FileInputStream(profile);
    }
}
