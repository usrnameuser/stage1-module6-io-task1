package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {

    public Profile getDataFromFile(File file) {
        File profile = new File("src/main/resources/Profile");
        try {
            FileInputStream profileInputStream = new FileInputStream(profile);
        }
        catch () {
        }
        
        return new Profile("", 0,  profile.getAbsolutePath(), new Long(0));
    }
}
