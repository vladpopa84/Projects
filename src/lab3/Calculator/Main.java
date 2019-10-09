package lab3.Calculator;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        String result = op.verifyText("hkfgl");
        System.out.println(result);

        int rez = op.compNr(3);
        System.out.println(rez);
    }


}
