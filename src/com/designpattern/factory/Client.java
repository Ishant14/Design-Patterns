package com.designpattern.factory;

/**
 * Created by igaurav on 6/24/2017.
 */
public class Client {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer(ComputerEnum.PC);
        System.out.println("Factory returned the PC object");
        System.out.println("PC ram: " + pc.getRAM());
        System.out.println("PC cpu :" + pc.getCPU());
        System.out.println("PC hdd :" + pc.getHDD());

        Computer server = ComputerFactory.getComputer(ComputerEnum.Server);
        System.out.println("Factory returned the Server object");
        System.out.println("server ram: " + server.getRAM());
        System.out.println("server cpu :" + server.getCPU());
        System.out.println("serve hdd :" + server.getHDD());

    }
}
