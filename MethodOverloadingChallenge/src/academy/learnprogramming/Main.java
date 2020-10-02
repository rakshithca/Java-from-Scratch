package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        calcFeetAndInchesTocentimeters(0, 1);
        calcFeetAndInchesTocentimeters(335.28);
        getDurationString(123, 30);
        getDurationString(300);
    }

    public static double calcFeetAndInchesTocentimeters(double feet, double inches) {
        if (!((feet >= 0) || (inches >= 0 && inches <= 12))) {
            return -1;
        } else {
            double feet2 = inches / 12;
            double total = (feet + feet2) * 30.48;
            System.out.println("cms " + total);
            return total;
        }
    }

    public static double calcFeetAndInchesTocentimeters(double inches) {
        if (!(inches >= 0)) {
            return -1;
        } else {
            double newfeet = inches / 12;
//            Math.round(newfeet);
            System.out.println("second method feet = " + newfeet);
//            double feet2 = inches /  12;
//            double total = (feet + feet2) * 30.48;
//            System.out.println("cms " + total );
//
            return newfeet;
        }
    }

    public static int getDurationString(int minutes, int seconds) {
        if (!((minutes >= 0) || (seconds >= 0 && seconds <= 59))) {
            System.out.println("Invalid Value");
            return -1;

        } else {
            int total_seconds = (minutes * 60) + seconds;
            int final_hours = total_seconds / 3600;
            int rem_mins = minutes % 60;
            System.out.println("total hours are " + final_hours);
            System.out.println("total mins are " + rem_mins);
            System.out.println("total secs are " + seconds);
            return 1;
        }
    }

    public static int getDurationString(int seconds) {
        if (seconds < 0)
            return -1;
        else {
            int mins = seconds / 60;
            int rem_Secs = seconds % 60;
            getDurationString(mins, rem_Secs);
            return 1;
        }
    }
}

