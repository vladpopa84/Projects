package lab7.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        final
//
//        Read read = new Read();
//
//        int a = read.getInt();
//
//        System.out.println("Asta e valoarea: " + a);
//
//
//        float aj = read.getFloat();
//
//        System.out.println("Asta e valoarea: " + aj);


        Read read = new Read();

        int a = read.returnInt();
        System.out.println(a);

        float b = read.returnFloat();
        System.out.println(b);

        long c = read.returnLong();
        System.out.println(c);

        double d = read.returnDouble();
        System.out.println(d);

        int[] myArray = read.returnArray(5);
        System.out.println(Arrays.toString(myArray));

        List<Integer>myList = new ArrayList<>();

        read.returnList(myList);

        read.positionValue(2);






    }


}
