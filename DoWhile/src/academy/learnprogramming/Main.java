package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 4;
        int endnumber = 20;
        int count = 0;
        while (number <= endnumber){
            number ++;
            if(!isEvennumber(number)){
                continue;
            }

            System.out.println("even " + number);
            count ++;
            if(count >= 6)
                break;
        }
        System.out.println("even numbers found is " + count);
    }

    public static boolean isEvennumber(int number) {
        if (number % 2 == 0) {
            return true;

        } else
            return false;
    }

}
