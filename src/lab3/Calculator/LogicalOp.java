package lab3.Calculator;

public class LogicalOp {
    public String verifyText(String text) {
        if (text.equals("FastTrack")) {
            return ("Learning text comparision");
        } else {
            return ("Got to try some more");
        }


    }

    public int compNr(int x) {

        if (x >= 2 && x <= 8)
            return x;
        else return 0;


    }

}
