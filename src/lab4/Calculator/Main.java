package lab4.Calculator;



public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();

op.countBW(2,5);


float sumAndAverage = op.sumAndAverage(4,5);
        System.out.println(sumAndAverage);

op.countTo100(96);

op.countToMinus(-96);

op.countBTW(4,8);

op.numerePare();
op.numereImpare();

op.adunaPare(98);

op.Pyramid(7);


//WHILE

        //1
        op.countTo1000(98);

        //2
        op.countToMin100(-97);

        //3
        op.countXToY(3,7);

        //4
        op.countAToB(6,2);

        //5
        op.countEven();

        //6
        op.countUnEven();

        //7
        op.sumBig();

        //8
       op.div7(7,14);

       //9
        op.Fibonacci();

        //10

        op.CozaLozaWoza(1);



    }





}
