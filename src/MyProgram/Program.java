package MyProgram;

import java.util.Arrays;

public class Program {

    public void printMenuItems() {
        System.out.println(
                "Hello !\n" +
                        "Choose an option from the menu: \n" +
                        "0. Exit\n" +
                        "1. SumInt\n" +
                        "2. SumFloat\n" +
                        "3. Substract\n" +
                        "4. Multiply\n" +
                        "5. Divide\n" +
                        "6. Print numbers 1 to 100\n" +
                        "7. Print pattern\n" +
                        "8. Average is\n" +
                        "9. Input is:\n" +
                        "10. The bigger number is: "
        );
    }


    Calculator calc = new Calculator();
    Read read = new Read();

    public boolean runProgramOptions() {
        printMenuItems();

        int numberFromUser = read.getInt();

        switch (numberFromUser) {
            case 1:
                sumInt();
                return true;
            case 2:
                sumFloat();
                return true;
            case 3:
                substract();
                return true;
            case 4:
                multiply();
                return true;
            case 5:
                divide();
                return true;
            case 6:
                printNumbers();
                return true;
            case 7:
                calc.pattern();
                return  true;
            case 8:
                sumAndAverage();
                return true;
            case 9:
                verifyInput();
                return true;
            case 10:
                checkBiggerNumber();
                return true;


            case 0:
                System.out.println("Bye!");
                break;

            default:
                System.out.println("The option does not exist, try again!");
                return true;
        }
        return false;


    }

    public void runProgram() {
        boolean repeat;
        do {
            repeat = runProgramOptions();

        } while (repeat == true);
    }
//1
    public void sumInt() {
        int result = calc.sum(read.getInt(), read.getInt());
        System.out.println("The sum is: " + result);
    }
//2
    public void sumFloat() {
        float result = calc.sum(read.getFloat(), read.getFloat());
        System.out.println("The sum is: " + result);
    }

//3
    public void substract(){
        int result = calc.substract(read.getInt(), read.getInt());
        System.out.println("Substraction is: " + result);
    }
//4
    public void multiply() {
        int result = calc.multiply(read.getInt(), read.getInt());
        System.out.println("Multiply is: " + result);
    }
//5
    public void divide() {
        float result = calc.divide(read.getInt(), read.getInt());
        System.out.println("Divide is: " + result);
    }
//6
    public void printNumbers() {
        int[] myArray = calc.oneToHundred();
        System.out.print(Arrays.toString(myArray));
    }
//8
    public void sumAndAverage() {
        float x = calc.sumAndAverage(read.getInt(), read.getInt());
        System.out.println("Average is " + x);
    }
//9
    public void verifyInput() {
        String myTxt = calc.verify(read.getString(), read.getInt());
        System.out.println(myTxt);
    }
//10
    public void checkBiggerNumber() {
        int x = calc.checkBiggerNumber(read.getInt(), read.getInt());
        System.out.println(x);
    }







}
