package lab1;

public class Main {

    public static void main(String[] args) {
        printMyName();
        sum();
        divide();
        all();

        //2.
        System.out.println("Rezultatul adunarii este" + " " + SUM(8,7));
        System.out.println("Rezultatul scaderii este" + " " + SUB(8,7));
        System.out.println("Rezultatul inmultirii este" + " " + MULTY(8,7));
        System.out.println("Rezultatul impartirii este" + " " + DIV(8,7));

        //3
        String Model1=  "   J   a  v     v  a  \n" +
                        "   J  a a  v   v  a a \n" +
                        "J  J aaaaa  v v  aaaaa\n" +
                        " JJ a     a  v  a     a";



        System.out.println(Model1);

        //4
        System.out.println(media(1,2,4));

        //5
        System.out.println(" +\"\"\"\"\"+\n" +
                "[| o o |]\n" +
                " |  ^  |\n" +
                " | '_' |\n" +
                " +_____+");
        //6

        System.out.println(remainder(10,3));

        //7

        System.out.println(temp(100));

        //8
        System.out.println(lungime(20));

        //9
        speed();







    }

public static void printMyName() {

        // Exercitiul 1
        System.out.println("Hello!");
        System.out.println("Numele meu este"+" "+"Vlad Popa"+".");
    }

    public  static void sum(){

        // Exercitiul 2
        int x= 3;
        float y= 2.56f;
        System.out.println(x+y);
    }

    public  static void divide(){
        // Exercitiul 3

        int a= 10;
        int b= 3;
        float c= (float)a / (float)b;
        System.out.println(c);
    }
    public  static void all(){

        // Exercitiul 4

        // a. -5 + 8 * 6
        byte z= -5 + (8*6);
        System.out.println(z);

        // b. (55+9) % 9
        byte w= (55+9)%9;
        System.out.println(w);

        // c. 20 + -3*5 / 8
        float v= 20 + -3*5/8f;
        System.out.println(v);

        // d. 5 + 15 / 3 * 2 - 8 % 3
        int s= 5 + 15 / 3*2 - 8%3;
        System.out.println(s);
    }

    //2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.

    //Adunare
    public  static int SUM(int firstNumber, int secondNumber){
        int SUM= firstNumber + secondNumber;
        return  SUM;
    }
    //Scadere
    public static int SUB(int firstNumber, int secondNumber){
        int SUB= firstNumber - secondNumber;
        return SUB;
    }
    //Inmultire
    public static int MULTY(int firstNumber, int secondNumber){
        int MULTY= firstNumber * secondNumber;
        return MULTY;
    }
    //Impartire
    public static float DIV(float firstNUmber, float secondNumber){
        float DIV= firstNUmber / secondNumber;
        return DIV;
    }
    //4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
    public static float media(int a, int b, int c){
        float media =  (a +  b +  c)/3f;
        return  media;
    }
    //6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere

    public static int remainder(int a, int b){
        int remainder = a%b;
        return remainder;

    }

    //7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)

    public  static float temp(float F){
        float C = (F - 32)*5/9;
        return C;
    }
    //8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii

    public  static float lungime(float x){
        float metri = (float) (x / 39.37);
        return  metri;
    }

    //9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde), si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora.

    public static void speed() {
        int d = 6000;
        int o = 2;
        int m = 0;
        int s = 0;

        int t = (o * 3600) + (m * 60) + s;
        float v = (float) d / t;
        float vkmh = v * 3.6f;
        float vmph = vkmh / 1.609f;

        System.out.println(v);
        System.out.println(vkmh);
        System.out.println(vmph);


    }
    }

