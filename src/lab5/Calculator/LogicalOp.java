package lab5.Calculator;

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
        float div = firstNumber / secondNumber;
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
}