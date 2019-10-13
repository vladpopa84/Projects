package lab3.Calculator;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        String result = op.verifyText("hkfgl");
        System.out.println(result);

        int rez = op.compNr(3);
        System.out.println(rez);

        Calculator cal = new Calculator();
        int sum = cal.sum(3,5);
        System.out.println(sum);
        int sub = cal.sub(3,5);
        System.out.println(sub);
        int multy = cal.multy(3,5);
        System.out.println(multy);
        float div = cal.div(3,5);
        System.out.println(div);




        int biggest = op.checkBiggerNumber(6,7);
        System.out.println(biggest);


        String txtNr = op.aoleu("FastTrackIT", 11);
        System.out.println(txtNr);

        String weather = op.aoleu2(5);
        System.out.println(weather);

        String three = op.aoleu3(4);
        System.out.println(three);

        String number = op.oneToFive(5);
        System.out.println(number);

        boolean response = op.isNumberEven(3);
        System.out.println(response);

        boolean vote = op.isEligibleToVot(17);
        System.out.println(vote);

        int theBiggest = op.biggestOfThree(4,5,3);
        System.out.println(theBiggest);




    }









}
