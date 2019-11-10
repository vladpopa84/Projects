package MyProgram;

import java.util.Arrays;

public class Program {

    public void printMenuItems() {
        System.out.println(
                "Hello !\n" +
                        "Choose an option from the menu: \n" +
                        "0. Exit\n" +
                        "1. Sum\n" +
                        "2. Substract\n" +
                        "3. Multiply\n" +
                        "4. Divide\n" +
                        "5. Print numbers 1 to 100\n" +
                        "6. Print pattern\n" +
                        "7. Average is "
        );
    }


    Calculator calc = new Calculator();
    Read read = new Read();

    public boolean runProgramOptions() {
        printMenuItems();

        int numberFromUser = read.getInt();

        switch (numberFromUser) {
            case 1:
                sum();
                return true;
            case 2:
                substract();
                return true;
            case 3:
                multiply();
                return true;
            case 4:
                divide();
                return true;
            case 5:
                printNumbers();
                return true;
            case 6:
                calc.pattern();
                return  true;
            case 7:
                sumAndAverage();
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
    public void sum(){
        int result = calc.sum(read.getInt(), read.getInt());
        System.out.println("The sum is: " + result);
    }
//2
    public void substract(){
        int result = calc.substract(read.getInt(), read.getInt());
        System.out.println("Substraction is: " + result);
    }
//3
    public void multiply() {
        int result = calc.multiply(read.getInt(), read.getInt());
        System.out.println("Multiply is: " + result);
    }
//4
    public void divide() {
        float result = calc.divide(read.getInt(), read.getInt());
        System.out.println("Divide is: " + result);
    }
//5
    public void printNumbers() {
        int[] myArray = calc.oneToHundred();
        System.out.print(Arrays.toString(myArray));
    }

    public void sumAndAverage() {
        float x = calc.sumAndAverage(read.getInt(), read.getInt());
        System.out.println("Average is " + x);

    }







}
