package academy.learnprogramming;

public class Main {


    public static void main(String[] args) {
        //toMilesPerHour(75.114);
        printConversion(75.114);

    }

    public static long toMilesPerHour(double kmph){
        if(kmph < 0 ) {
            return -1;
        }

        return Math.round(kmph / 1.609);
    }

    public static void printConversion(double kmph){
        if(kmph < 0)
            System.out.println("invalid value");
        else {
            long mph = toMilesPerHour(kmph);
            System.out.println(kmph + "KM/H is equal to " + mph + "M/H");
        }
    }
}
