package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;

public class FileReader {

    public Profile getDataFromFile(File file) {
        File profile = new File("Profile.txt");
        return new Profile(profile.toString(), 0,  profile.toString(), new Long());
    }
}
