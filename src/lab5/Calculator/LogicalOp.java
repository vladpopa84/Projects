package lab5.Calculator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LogicalOp {

    //1. In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele conform principiului polimorfismului. Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o aveti in clasa.
    //Spre exemplu, pentru metoda de adunare, faceti ca aceasta sa lucreze o data cu 2 int-uri, o data cu 2 float-uri, cu 3 float-uri, cu 4 int-uri, etc. Atentie ce returnati la final!
    //Apelati metodele in Main pentru a testa daca functioneaza.

    //Adunare
    public int sum(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public float sum(float firstNumber, float secondNumber) {
        float sum = firstNumber + secondNumber;
        return sum;
    }

    public float sum(float firstNumber, float secondNumber, float thirdNumber) {
        float sum = firstNumber + secondNumber + thirdNumber;
        return sum;
    }

    public int sum(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber;
        return sum;
    }

    //Scadere
    public int sub(int firstNumber, int secondNumber) {
        int sub = firstNumber - secondNumber;
        return sub;
    }

    public float sub(float firstNumber, float secondNumber) {
        float sub = firstNumber - secondNumber;
        return sub;
    }

    public float sub(float firstNumber, float secondNumber, float thirdNumber) {
        float sub = firstNumber - secondNumber - thirdNumber;
        return sub;
    }

    public int sub(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int sub = firstNumber - secondNumber - thirdNumber - fourthNumber;
        return sub;
    }

    //Inmultire
    public int multy(int firstNumber, int secondNumber) {
        int multy = firstNumber * secondNumber;
        return multy;
    }

    public float multy(float firstNumber, float secondNumber) {
        float multy = firstNumber * secondNumber;
        return multy;
    }

    public float multy(float firstNumber, float secondNumber, float thirdNumber) {
        float multy = firstNumber * secondNumber * thirdNumber;
        return multy;
    }

    public int multy(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int multy = firstNumber * secondNumber * thirdNumber * fourthNumber;
        return multy;
    }

    //Impartire
    public float div(int firstNumber, int secondNumber) {
        float div = (float) firstNumber / secondNumber;
        return div;
    }

    public float div(float firstNumber, float secondNumber) {
        float div = firstNumber / secondNumber;
        return div;
    }

    public float div(float firstNumber, float secondNumber, float thirdNumber) {
        float div = firstNumber / secondNumber / thirdNumber;
        return div;
    }

    public float div(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        float div = (float) firstNumber / secondNumber / thirdNumber / fourthNumber;
        return div;
    }


//2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul. Apelati metoda in main() pentru a verifica daca functioneaza.

    public int[] oneToHundred() {
        int[] myArray = new int[100];
        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;
        }
        return myArray;

    }


    //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza. Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.

    public int[] evenNumbers(int[] array) {

        int[] myArray = new int[50];
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                myArray[index] = i;
                index++;
            }
        }
        return myArray;
    }


    //4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori. Metoda sa calculeze si sa returneze media numerelor din array. Apelati metoda in main() pentru a verifica daca functioneaza.

    public float averageArray(int[] array) {
        int[] anArray = {1, 2, 3, 4, 5, 6};
        float sum = 0;
        for (int i = 0; i < anArray.length; i++) {
            sum = sum + anArray[i];

        }
        return sum / anArray.length;
    }


    //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.  Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean compTwo(String x) {

        String[] myArray = {"Ana", "are", "mere"};
        for (int index = 0; index < myArray.length; index++)
            if (myArray[index].equals(x)) {
                return true;

            }
        return false;


    }


    //6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.  Apelati metoda in main() pentru a verifica daca functioneaza.

    public String isNumber(int x) {
        int[] myArray = {1, 2, 3, 4, 5};

        for (int index = 0; index < myArray.length; index++) {
            if (x == myArray[index]) {
                return "The index position in array is" + " " + index;
            }

        }
        return "Number is not in array";
    }


    //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:

    public void pattern() {
        String myArray = "-";

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(myArray);
            }
            System.out.println();

        }
    }


    //8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar. Apelati metoda in main() pentru a verifica daca functioneaza.

//    public int[] isNumberThere(int x) {
//        int[] myArray = {1, 2, 3, 4, 5};
//
//        for (int index = 0; index < myArray.length; index++) {
//            if (x == myArray[index]) {
//
//               int[] newArray = myArray[];
//
//                return myArray;
//           }
//
//        }
//        return
//    }


    //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array. Apelati metoda in main() pentru a verifica daca functioneaza.

//    public int secondSmaller(int[] array, int[]) {
//        int[] myArray = {1,2,3,4,5};
//        int x = 0;
//        int y;
//
//        for (int i=0; i<myArray.length; i++) {
//            if (myArray[i] >= x) {
//                myArray[i] = x;
//            } else if (myArray[i] < x) {
//
//
//            }
//        }

        //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol. Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea. Apelati metoda in main() pentru a verifica daca functioneaza.

       public  int[] copy() {
        int[] primul = {1,3,5,7};
        int[] alDoilea = new int [4];

        for (int i=0; i< primul.length; i++) {
            primul[i] = alDoilea[i];
        }
           return (alDoilea);

    }

}