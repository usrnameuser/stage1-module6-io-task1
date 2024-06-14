package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {

    public Profile getDataFromFile(File file) {
        File profile = new File("src/main/resources/Profile.txt");
        /*try {
            FileInputStream profileInputStream = new FileInputStream(profile);
        }
        catch (FileNotFoundException e) {
        }*/
        FileInputStream profileInputStream = new FileInputStream(profile);
        return new Profile(profile.getAbsolutePath(), 0,  profile.getAbsolutePath(), new Long(0));
    }
}
