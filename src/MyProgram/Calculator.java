package MyProgram;

import java.util.Arrays;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public int substract(int firstNumber, int secondNumber) {
        int sub = firstNumber - secondNumber;
        return sub;
    }

    public int multiply(int firstNumber, int secondNumber) {
        int multy = firstNumber * secondNumber;
        return multy;
    }

    public float divide(int firstNumber, int secondNumber) {
        float div = (float) firstNumber / secondNumber;
        return div;
    }

    public int[] oneToHundred() {
        int[] myArray = new int[100];
        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;
        }
        return myArray;
    }

    public void pattern() {
        String myArray = "-";

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

                System.out.print(myArray);
            }
            System.out.println();
        }

    }

    public float sumAndAverage(int x, int y) {

        float xxx;
        int sum = 0;
        float count = 0;
        if (x < y) {
            for (int i = x; i <= y; i++) {
                sum = sum + i;
                count++;
            }
        } else {
            for (int i = y; i <= x; i++) {
                sum = sum + i;
                count++;
            }

        } xxx = sum / count;
          return xxx;

    }

}
