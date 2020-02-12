package academy.learnprogramming;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        int number = 10000;
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Integer Min = " + minInt);
        System.out.println("Integer Max = " + maxInt);
        System.out.println("Busted Value of Max Test = " + (maxInt + 1));
        System.out.println("Busted Value of Min Test = " + (minInt - 1));

        //int myMaxValue = 2147483648;        // uncomment to see the error
        byte minVal = Byte.MIN_VALUE;
        byte maxVal = Byte.MAX_VALUE;
        System.out.println("Byte Min = " + minVal);
        System.out.println("Byte Max = " + maxVal);


        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Short Min = " + minShort);
        System.out.println("Short Max = " + maxShort);

        long longVal = 21474836423L;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Long Min = " + minLong);
        System.out.println("Long Max = " + maxLong);
        System.out.println(longVal);


        // Byte - 8 bits, Short - 16, Int - 32, Long - 64d
        byte B_valid = 33;
        short S_valid = 77;
        int V_int = 122;
        int summ = B_valid + S_valid + V_int;
        long L_int = 5000L + (10 * summ);
        System.out.println(L_int);
        short summ1 = (short) (B_valid + S_valid + V_int);
        System.out.println(summ1);

        float myMin = Float.MIN_VALUE;
        float myMax = Float.MAX_VALUE;
        System.out.print("Float Min Value" + myMin);

        int intval = 5 / 2;
        float floatval = (float) 5 / 2; // casting , otherwise its 5.5f
        double doublefloat = 6.66;
        System.out.println("intval" + intval);
        System.out.println("floatval" + floatval);
        System.out.println("doubleval" + doublefloat);


     double lb = 10 ;
     double kg = lb *  0.456;
    // ;kg * 2.2046;
        System.out.println("final kg " +kg);

    char mychar = 'D';
    char unicodechar = '\u0044';
        System.out.println(unicodechar);
        System.out.println(mychar);

    boolean truebool = true;
    boolean falsebool = false;
    boolean is_customer_age21 = true;

    String mystring = "this is a sting";
        System.out.println("mys string is equal to" + mystring);
        mystring = mystring + ",this is more";
        System.out.println("mys string is equal to" + mystring);

    String numberstring = "423.12";
    numberstring = numberstring + "454";
        System.out.println(numberstring);

        String last = "10";
        last = last + intval;
        System.out.println(last);

        int result = 1 + 2;
        System.out.println(result);
        int result2 = result;
        System.out.println(result2);
        result = result -1;
        System.out.println(result);
        System.out.println(result2);

        result = result * 2;
        System.out.println(result);

        result = result / 2;
        System.out.println(result);

        result = result % 2;
        System.out.println(result);
        result++;
        System.out.println(result);
        result++; // result = 2
        result--;
        System.out.println(result);
        result += 3;
        System.out.println(result);

        int score = 100;
        if(score >100){
            System.out.println("high score");
        }

    double one = 20.00d;
    double two = 80.00d;
    double add_result = (one + two) * 100.00;
    double remainder = add_result % 40.00;
        System.out.println(remainder);
        boolean b1 = (remainder == 0) ? true : false;
       // if(remainder == 0){
            //boolean b1 = true;
        //}
        if (!b1)
            System.out.println("got some remainder");





    }
}
