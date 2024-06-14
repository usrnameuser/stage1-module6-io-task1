package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {

    public Profile getDataFromFile(File file) {
        //File profile = new File("src/main/resources/Profile.txt");
        File profile = new File("src/main/resources");
        try {
            FileInputStream profileInputStream = new FileInputStream(profile.listFiles()[0]);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new Profile(profile.listFiles()[0].toString(), 0, new String(), new Long(0));
    }
}
