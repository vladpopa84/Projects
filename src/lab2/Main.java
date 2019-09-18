package lab2;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int result = sub(x, y);
        System.out.println(result);
        result = multiply(x, y);
        System.out.println(result);
        result = divide(x, y);
        System.out.println(result);

    }


    public static int sub(int first, int second) {

        int rez = first - second;
        return rez;
    }

    public static int multiply(int first, int second) {
        int rez = first * second;
        return rez;
    }

    public static int divide(int first, int second) {
        int rez =  first /  second;
        return rez;
    }


}