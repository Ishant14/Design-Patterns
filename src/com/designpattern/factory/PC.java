package com.designpattern.factory;

/**
 * Created by igaurav on 6/24/2017.
 */
public class PC implements Computer {

    private String ram;
    private String cpu;
    private String hdd;

    PC() {
        ram="4GB";
        cpu="Intel Core i5";
        hdd="512GB";
    }


    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    @Override
    public String getHDD() {
        return hdd;
    }
}
