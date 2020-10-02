package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hasTeen(16,11,12);
    }
    public static boolean hasTeen(int one, int two, int three){
        if(( one >= 13 && one <= 19) || (two >=13 && two <= 19) || (three >= 13 && three <= 19)){
            System.out.println("one of em is in range 13 -19");
            return true;

            }
            else{

                System.out.println("none of em is in range");
            return false;
        }
    }
}
