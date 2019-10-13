package lab3.Calculator;

public class Calculator {
    //Adunare
    public  int sum(int firstNumber, int secondNumber){
        int sum= firstNumber + secondNumber;
        return  sum;
    }
    //Scadere
    public int sub(int firstNumber, int secondNumber){
        int sub= firstNumber - secondNumber;
        return sub;
    }
    //Inmultire
    public int multy(int firstNumber, int secondNumber){
        int multy= firstNumber * secondNumber;
        return multy;
    }
    //Impartire
    public float div(float firstNUmber, float secondNumber){
        float div= firstNUmber / secondNumber;
        return div;
    }
}

