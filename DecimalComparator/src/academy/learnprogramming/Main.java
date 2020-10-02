package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        areEqualByThreeDecimalPlaces(3.17765,3.17788);
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        one = one * 1000;
        two = two * 1000;
        System.out.println(one);
        System.out.println(two);
        int one1 = (int) one;
        int two2 = (int) two;

        if(one1 ==  two2){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }

    }
}
