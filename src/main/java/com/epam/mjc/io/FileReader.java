package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {

    public Profile getDataFromFile(File file) {
        //File profile = new File("src/main/resources/Profile.txt");
        File profile = new File("src/main/resources");
        /*try {
            FileInputStream profileInputStream = new FileInputStream(profile.listFiles()[0]);
        }
        catch (FileNotFoundException e) {
        }*/
        return new Profile(new Boolean(profile.listFiles()[0].isFile()).toString(), 0, new Boolean(profile.isDirectory()[0].isFile()).toString(), new Long(0));
    }
}
