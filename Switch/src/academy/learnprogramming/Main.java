package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

	// write your code here
        char one = 'f';

        switch (one){
            case 'a':
                System.out.println("it is an a");
                break;
            case 'b':
                System.out.println("its a b");
                break;
            case 'c': case'd': case 'e':
                System.out.println("it was c, d or e, lemme check again.... Yes it was "+one);
                break;

            default:
                System.out.println("it was nothing john snow");
        }

        String month = "JanuaRy";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("it was january");
                break;
            case "February":
                System.out.println("it was february");
                break;
            case "June":
                System.out.println("it was june");
                break;

            default:
                System.out.println("we are still in stone age");

        }
        printNumberInWord(7);
        Dayoftheweek(5);
    }

    private static void Dayoftheweek(int day){
            switch (day){
                case 0:
                    System.out.println("sunday");
                    break;
                case 1:
                    System.out.println("monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                default:
                    System.out.println("not a week bro");
            }

    }

    private static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            default:
                System.out.println("not a number bro");
        }

    }
}
