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

    //Scadere
    public int sub(int firstNumber, int secondNumber) {
        int sub = firstNumber - secondNumber;
        return sub;
    }

    //Inmultire
    public int multy(int firstNumber, int secondNumber) {
        int multy = firstNumber * secondNumber;
        return multy;
    }

    //Impartire
    public float div(float firstNUmber, float secondNumber) {
        float div = firstNUmber / secondNumber;
        return div;
    }
}










