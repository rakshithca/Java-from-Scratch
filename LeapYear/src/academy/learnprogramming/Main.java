package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        isLeapYear(0);
    }

    public static void isLeapYear(int year) {
        if (year > 1 && year <= 9999)
        {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
            {
                System.out.println("true");
//                return true;
            }else
                {
//                    return false;
                    System.out.println("Faalsse");
                }

        }else
            {
                System.out.println("false");
//                return false;
        }
//        return
    }
}