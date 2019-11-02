package lab6.Calculator;


import javax.crypto.spec.PSource;
import java.util.*;


public class LogicalOp {

    //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.

    public void printList(List<Integer>myList) {
        for (int i=0; i<myList.size(); i++) {
            System.out.println(myList.get(i));
        }

    }

    //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addNumber (List<Integer>myList, int x) {

        myList.add(myList.size(), x);
        System.out.println (myList);
    }

    //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,
    // pornind de la numarul intreg primit ca si parametru.

    public void printFrom (List<Integer>myList, int position) {

        for (int i=position; i<myList.size() && i>=0; i++) {

            System.out.println(myList.get(i));

        }
    }

    //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).

    public void printReverse ( List<Integer>myList) {

        Collections.reverse(myList);
        System.out.println(myList);
    }

    //Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
    // Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void addExactly (List<String>myList, int x, String myString) {
        myList.add(x, myString);
        System.out.println(myList);
    }

    //Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
    // iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public void firstPosition ( List<Integer>myList, int x) {

        myList.add(0, x);
        System.out.println(myList);
    }

    //Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
    // si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).


    public  void readNumbers (List<Integer>myList) {
        for (int i=0; i<myList.size(); i++) {
            System.out.println("Pe pozitia" +" " + i + " " + "valoarea este" + " "+ myList.get(i));
        }
    }

    //Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public void biggestNumber (List<Integer>myList) {
        System.out.println(Collections.max(myList));

    }

    //Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista,

    public void reversePosition (List<Integer>myList, int index) {

        int x;
        x = myList.get(index);
        myList.remove(index);
        myList.add(index+1, x);
        System.out.println(myList);
    }

    //Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista, care sa contina doar numerele pare din lista primita.

    public void evenNUmbers (List<Integer>myList) {

        for (int i=0; i<myList.size(); i++) {
            if (myList.get(i) % 2 ==0) {
                System.out.print(myList.get(i) + " ");
            }
        }
        System.out.println();
    }

    //Scrieti o metoda Java care sa primeasca parametru o Lista nesortata, si sa returneze Lista sortata crescator.
    // Atentie, sortarea sa se faca programatic(adica logica sa fie scrisa de voi), si nu folosit librarie externa, precum Collection.sort().

    public void sortList (List<Integer>myList) {
        int i;
        int j;

        int x;
        int y;


        for (i=0; i<myList.size();i++) {
            for (j=i+1; j<myList.size();j++) {

                x=myList.get(i);
                y=myList.get(j);

                if (x>y) {
                    myList.set(i, y);
                    myList.set(j,x);
                }
            }
        } System.out.println(myList);
    }
}
