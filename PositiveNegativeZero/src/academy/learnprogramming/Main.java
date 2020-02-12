package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CheckNumber(0);
    }

    public static void CheckNumber(int number){
        if(number > 0)
            System.out.println("Positive");
        else if (number < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}
