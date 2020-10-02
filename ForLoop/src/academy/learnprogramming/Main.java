package academy.learnprogramming;

import javax.swing.*;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        for(int i = 2; i<=8; i++){
//            System.out.println(String.format("%.2f",InterestRate(10000, i)));
//        }
        int count = 0;
        for(int i = 10 ; i <20; i ++){
            if(isPrime(i)) {
                count++;
                System.out.println(" number is a prime number" + i);
                if (count == 3) {
                    System.out.println("exiting for loop");
                    break;
                }
            }
        }
    }



    public static double InterestRate(double amount, double interestRate){
        return (amount*(interestRate/100));
    }



    public static boolean isPrime(int n){

        if(n==1){
            return false;

        }
        for(int i = 2; i<=n/2; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }


}



