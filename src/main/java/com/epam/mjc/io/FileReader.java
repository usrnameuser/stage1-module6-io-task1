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
        FileInputStream profileInputStream = new FileInputStream(profile.listFiles()[0]);
        Boolean b1 = profile.listFiles()[0].canRead();
        Boolean b3 = profile.listFiles()[0].canWrite();
        return new Profile(profileInputStream.toString(), 0, profileInputStream.toString(), new Long(0));
    }
}
