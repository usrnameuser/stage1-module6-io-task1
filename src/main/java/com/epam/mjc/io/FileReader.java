package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException; 
import java.io.IOException;
    
public class FileReader {

    public Profile getDataFromFile(File file) {
        File profile = new File("src/main/resources/Profile.txt");
        FileInputStream profileInputStrea;
        try(profileInputStream = new FileInputStream(profile)) {
        }
        catch(FileNotFoundException e) {
        }
        catch(IOException e) {
        }
        return new Profile(profileInputStream.toString(), 0, "", new Long(0));
    }
}
