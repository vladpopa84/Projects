package lab6.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void  main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(5);

        List<String>myListOfStrings = new ArrayList<>();

        myListOfStrings.add("masina");
        myListOfStrings.add("telefon");
        myListOfStrings.add("laptop");
        myListOfStrings.add("televizor");
        myListOfStrings.add("frigider");


       LogicalOp op = new LogicalOp();

       op.printList(myList);

       op.addNumber(myList, 9);

       op.printFrom(myList, 2);

       op.printReverse(myList);

       op.addExactly(myListOfStrings, 2, "fixAcolo");

       op.firstPosition(myList, 20);

       op.readNumbers(myList);

       op.biggestNumber(myList);

       op.reversePosition(myList, 3);

       op.evenNUmbers(myList);

       op.sortList(myList);

    }
}