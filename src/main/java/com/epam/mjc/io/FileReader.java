package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;

public class FileReader {

    public Profile getDataFromFile(File file) {
        File profile = new File("Profile.txt");
        return new Profile(profile.getAbsolutePath(), 0,  profile.getAbsolutePath(), new Long(0));
    }
}
