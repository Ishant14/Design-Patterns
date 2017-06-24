package com.designpattern.factory;

/**
 * Created by igaurav on 6/24/2017.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerEnum computerEnum) {

        if (computerEnum.equals(ComputerEnum.PC)) {
            return new PC();
        }
        if (computerEnum.equals(ComputerEnum.Server)) {
            return new Server();
        }

        return null;
    }
}
