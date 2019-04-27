package com.addtrycatch;

public class Config {

    private static Config mInstance = new Config();
    public AddTryCatchExtension extension;

    private Config() {

    }

    public static Config getInstance() {
        return mInstance;
    }

}
