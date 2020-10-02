package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hasEqualSum(1,2,5);
    }

    public static boolean hasEqualSum(int one, int two, int three){
        int sum = one + two;
        if(sum == three){

            System.out.println("true");
            return true;

        }
        else
            System.out.println("false");
            return false;

    }
}
