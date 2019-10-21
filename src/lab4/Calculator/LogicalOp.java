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
//3
    public void countBW(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //8
    public float sumAndAverage(int x, int y) {

        int sum = 0;
        float count = 0;
        for (int i = x; i <= y; i++) {
            sum = sum + i;
            count++;


        }
        float xxx = sum / count;
        return xxx;
    }

    //1
    public void countTo100(int x) {

        for (int i = x; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    //2
    public void countToMinus(int x) {
        for (int i = x; i >= -100; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    //4
    public void countBTW(int x, int y) {
        int i;
        if (x < y) {
            for (i = x; i <= y; i++) {
                System.out.print(i + " ");
            }
        } else for (i = y; i <= x; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

    }

    //5
    public void numerePare() {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();

    }

    //6
    public void numereImpare() {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    //7
    public void adunaPare(int x) {
        int i;
        int sum = 0;
        for (i = x; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
//9


    //WHILE

    //1
    public void countTo1000(int x) {
        while (x <= 100) {
            System.out.print(x + " ");
            x = x + 1;
        }
        System.out.println();
    }

    public void countToMin100(int x) {
        while (x >= -100) {
            System.out.print(x + " ");
            x = x - 1;
        }
        System.out.println();
    }

    public void countXToY(int x, int y) {
        while (x <= y) {
            System.out.print(x + " ");
            x = x + 1;
        }
        System.out.println();
    }

    public void countAToB(int a, int b) {
        if (a <= b) {
            while (a <= b) {
                System.out.print(a + " ");
                a = a + 1;
            }
        } else while (b <= a) {
            System.out.print(b + " ");
            b = b + 1;
        }
        System.out.println();

    }

    public void countEven() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i = i + 1;
        }
        System.out.println();
    }

    public void countUnEven() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i = i + 1;
        }
        System.out.println();
    }

    public void sumBig() {
        int x = 111;
        int y = 8899;
        int sum = 0;
        int count = 0;
        while (x <= y) {
            sum = sum + x;
            x = x + 1;
            count = count + 1;
        }
        System.out.println(sum);
        System.out.println(sum / count);


    }

    public void div7(float x, int y) {
        float sum = 0;
        float med;
        int count = 0;
        while (x <= y) {
            if (x % 7 == 0) {
                sum = sum + x;
                count = count + 1;
                x = x + 1;
            } else x = x + 1;

        }

        med = sum / count;
        System.out.println(med);
    }

    public void Fibonacci() {
        int n0 = 0;
        int n1 = 1;
        int n2;

        System.out.print(n0 + " " + n1);

        for (int i = 2; i <= 19; i++) {
            n2 = n1 + n0;
            System.out.print(" " + n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }

    public void CozaLozaWoza(int n) {


        for (n = 1; n <= 110; n++) {
            if (n % 11 == 0) {
                System.out.println();
            } else if (n % 3 == 0) {
                System.out.print("Coza" +" ");
            } else if (n % 5 == 0) {
                System.out.print("Loza" + " ");
            } else if (n % 7 == 0) {
                System.out.print("Woza"+ " ");
            } else if (n % 3 == 0 && n % 5 == 0) {
                System.out.print("CozaLoza" + " ");
            } else if (n % 3 == 0 && n % 7== 0) {
                System.out.print("CozaWoza" + " ");
            } else if (n % 5 == 0 && n % 7== 0) {
                System.out.print("LozaWoza" + " ");
            } else if (n%3==0 && n%5==0 && n % 7 == 0) {
                System.out.print("CozaLozaWoza" + " ");
            } else System.out.print(n + " ");
        }


    }





}










