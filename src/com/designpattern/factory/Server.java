package com.designpattern.factory;

/**
 * Created by igaurav on 6/24/2017.
 */
public class Server implements Computer {

    private String ram;
    private String cpu;
    private String hdd;

    Server(){
        ram="256GB";
        cpu="CPU intel core i7";
        hdd="10TB";
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
