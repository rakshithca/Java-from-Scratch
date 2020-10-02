package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        sumOdd(100, 1000);
//        int count = 0;
//        int sum = 0;
//        for (int i = 1; i <= 1000; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                count++;
//                sum += i;
//                System.out.println("divisible both by 3 and 5 - " + i);
//            }
////            int bythree = i % 3;
////            int byfive = i % 5;                                                             // uncomment for Sum 3 and 5
////            if(bythree  == 0) {
//////                System.out.println("divisible by 3 - " + i);
////                if(byfive == 0){
//////                    System.out.println("divisible by 5 - " + i);
////
////                }
////
//            if (count == 5)
//                break;
//        }
//        System.out.println("sum = " + sum);
//        // write your code here
    }

    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        }
            return false;
    }


    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end < start) || (end < 0) || (start < 0)) {
            System.out.println("-1");
            return -1;
        }

        for (int i = start; i <= end; i++)
            if (isOdd(i)) {
                sum = sum + i;
            }
        System.out.println("sum is " + sum);
    return 1;}
}


