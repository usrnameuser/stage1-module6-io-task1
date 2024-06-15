package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 

public class FileReader {

    public Profile getDataFromFile(File file) {
        File profile = new File("src/main/resources/Profile.txt");

        /*try {
            FileInputStream profileInputStream = new FileInputStream(profile.listFiles()[0]);
        }
        catch (FileNotFoundException e) {
        }*/

        FileOutputStream profileOutputStream = new FileOutputStream(profile);
        
        Boolean b1 = profile.canRead();
        Boolean b3 = profile.canWrite();
        
        return new Profile(b1.toString(), 0, b3.toString(), new Long(0));
    }
}
