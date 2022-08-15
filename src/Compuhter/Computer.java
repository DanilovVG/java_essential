package Compuhter;

import jdk.dynalink.beans.StaticClass;

public class Computer {

    static Computers[] comp = new Computers [5];
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            comp[i] = new Computers("intel" + (i + 1));
        }
        for (int i = 0; i < 5; i++){
            System.out.println((i+1)+": models of compuhter - "+ comp[i].models);
        }
    }


}
