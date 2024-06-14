package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;

public class FileReader {

    public Profile getDataFromFile(File file) {
        File profile = new File("Profil.txt");
        return new Profile();
    }
}
