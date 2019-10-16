package lab4.Calculator;

public class LogicalOp {
    public String verifyText(String text) {
        if (text.equals("FastTrack")) {
            return ("Learning text comparision");
        } else {
            return ("Got to try some more");
        }
    }

    public int compNr(int x) {

        if (x >= 2 && x <= 8) {
            return x;
        } else {
            return 0;
        }
    }

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String aoleu(String txt, int w) {
        if (txt.equals("FastTrackIT") && w <= 3) {
            return (txt + w);
        } else if (!txt.equals("FastTrackIT") && w >= 4) {
            return (w + txt);
        } else return ("error");
    }

    public String aoleu2(int x) {
        if (x > 8) {
            return ("The amount of snow this winter was(cm):" + " " + x);
        } else if (x == 6) {
            return ("The amount of snow this winter was(cm):" + " " + x);
        } else {
            return ("The forecast snow is(cm)" + " " + x);
        }
    }

    public String aoleu3(int x) {
        if (x > 3 && x != 4) {
            return ("The number is greater then 3 and not equal to 4");
        } else if (x == 4) {
            return ("The number is equal to 4");
        } else {
            return ("The number is lower than 3");
        }

    }

    public String oneToFive(int x) {

        switch (x) {
            case 1:
                return ("The number is 1");

            case 2:
                return ("The number is 2");

            case 3:
                return ("The number is 3");

            case 4:
                return ("The number is 4");

            case 5:
                return ("The number is 5");

            default:
                return ("error");
        }
    }

    public boolean isNumberEven(int x) {
        if ((x % 2) == 0) {
            return true;
        } else return false;
    }

    public boolean isEligibleToVot(int x) {
        if (x >= 18) {
            return true;
        } else return false;
    }

    public int biggestOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else return c;
    }

    //FOR

    public void countBW(int x, int y) {
        for (int i = x; i >= y; i--) {

            System.out.println(i);
        }

    }

    public float sumAndAverage(int x, int y) {

        int sum = 0;
        float count = 0;
        for (int i = x; i <= y; i++){
            sum =sum + i;
           count++;


        } float xxx = sum/count;
        return xxx;
    }

}

