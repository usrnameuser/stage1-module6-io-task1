package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {

    public Profile getDataFromFile(File file) {
        //File profile = new File("src/main/resources/Profile.txt");
        File profile = new File("src/main/resources/Profile");
        /*try {
            FileInputStream profileInputStream = new FileInputStream(profile);
        }
        catch (FileNotFoundException e) {
        }*/
        return new Profile(profile.listFiles()[0], 0, new String(), new Long(0));
    }
}
