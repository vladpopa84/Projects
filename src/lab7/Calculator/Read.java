package lab7.Calculator;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {

//    public int getInt() {
//        int x = 0;
//
//        boolean repeat = false;
//        do {
//            try {
//                Scanner scan = new Scanner(System.in);
//                System.out.print("enter a number: ");
//                x = scan.nextInt();
//                repeat = false;
//            } catch (InputMismatchException e) {
//                System.out.println("Incorrect value, please enter a number");
//                repeat = true;
//            }
//        } while (repeat == true);
//
//        return x;
//
//
//    }
//
//
//    public float getFloat() {
//        float x = 0;
//
//        boolean repeat = false;
//        do {
//            try {
//                Scanner scan = new Scanner(System.in);
//                System.out.print("enter a number: ");
//                x = scan.nextFloat();
//                repeat = false;
//            } catch (InputMismatchException e) {
//                System.out.println("Incorrect value, please enter a number");
//                repeat = true;
//            }
//        } while (repeat == true);
//
//        return x;
//
//    }

    //1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.


    public int returnInt() {
        int x = 0;
        boolean repeat = false;

        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a number: ");
                x = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return x;

    }

    //2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
    // care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)


    public float returnFloat() {
        float x = 0;
        boolean repeat = false;

        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a number: ");
                x = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return x;
    }

    public double returnDouble() {
        double x = 0;
        boolean repeat = false;

        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a number: ");
                x = scan.nextDouble();
                repeat = false;

            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return x;

    }

    public long returnLong() {
        long x = 0;
        boolean repeat = false;

        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a number: ");
                x = scan.nextLong();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return x;
    }

    //3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
    // Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public int[] returnArray(int x) {
        int[] myArray = new int[x];
        int i;
        int y;

        try {
            for (i = 0; i < myArray.length; i++) {

                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a number: ");
                y = scan.nextInt();
                myArray[i] = y;
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("error");

        }
        return myArray;

    }

    //4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura. Metoda nu v-a primii parametru lungimea.
    // In rezolvarea ei trebuie folosit try-catch. (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar,
    // sa se intrerupa citirea)

    public void returnList(List<Integer> myList) {
        int x;
        boolean repeat = true;

        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a number: ");
                x = scan.nextInt();
                myList.add(x);
                repeat = true;

            } catch (InputMismatchException e) {
                System.out.println("Last number");
                repeat = false;
            }


        } while (repeat == true);

        System.out.println(myList);

    }


}