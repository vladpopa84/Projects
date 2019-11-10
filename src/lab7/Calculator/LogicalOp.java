package lab7.Calculator;


import java.util.Collections;
import java.util.List;


public class LogicalOp {

    //5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
    // Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
    // iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul: "Inside catch, number too large".

    public void positionValue(int x) {
        int myArray[] = {1, 2, 3, 4, 5};
        try {
            int y = myArray[x];
            System.out.println(y);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside catch, number too large");
        }
    }

    //6. In clasa LogicalOp, creati o metoda  'wait()'. Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int.
    // In interiorul ei, tratati metoda Thread.sleep(), astfel incat metoda noastra sa primeasca valoarea in secunde,
    // cat sa astepte. Ex: wait(5) -> asteapta 5 secunde

    public void Wait(int x) {
        int y = x * 1000;
        try {
            Thread.sleep(y);
        } catch (InterruptedException e) {
            System.out.println(e);
        }


    }



}