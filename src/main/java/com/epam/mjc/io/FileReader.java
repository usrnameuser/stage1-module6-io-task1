package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException; 
import java.io.IOException;
    
public class FileReader {

    public Profile getDataFromFile(File file) {
        File profile = new File("src/main/resources/Profile.txt");
        int ch=-124;
        try(FileInputStream profileInputStream = new FileInputStream(profile)) {
            ch = profileInputStream.read();
        }
        catch(FileNotFoundException e) {
        }
        catch(IOException e) {
        }
        return new Profile("", ch, "", new Long(ch));
    }
}
