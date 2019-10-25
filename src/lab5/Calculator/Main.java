package lab5.Calculator;


import lab5.Calculator.LogicalOp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        int sum = op.sum(1, 3, 5, 5);
        System.out.println(sum);

        int sub = op.sub(1, 3, 5, 5);
        System.out.println(sub);

        int multy = op.multy(1, 3, 5, 5);
        System.out.println(multy);

        float div = op.div(8, 2, 2, 3);
        System.out.println(div);


        int[] myArray = op.oneToHundred();
        System.out.println(Arrays.toString(myArray));


        int[] even = op.evenNumbers(myArray);
        System.out.println(Arrays.toString(even));

    }


}
