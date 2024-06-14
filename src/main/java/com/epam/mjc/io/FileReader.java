package com.epam.mjc.io;

import java.io.File;


public class FileReader {

    public Profile getDataFromFile(File file) {
        FileInputStream profileInputStream = new FileInputStream ("Profile.txt");
        return new Profile();
    }
}
