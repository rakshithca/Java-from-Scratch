package academy.learnprogramming;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        area(2, 2);
        area(2);
        printYearsAndDays(525600);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("area of the circle is  " + area);
            return area;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0)
            return -1;
        else {
            double rect_area = x * y;
            System.out.println("rectangle's area is " + rect_area);
            return rect_area;
        }
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            // Number of minutes in a year
            long year = minutes / 525600;
            long day = minutes / 1440;
            long remainingMinutes = day % 525600;
            // System.out.println(minutes + " minutes is " + year + " years and " + remainingMinutes + " days ");
        }

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45)
                return true;
            System.out.println("play");
            else {
                if (temperature >= 25 && temperature <= 35)
                    return true;
                
            }
        } else {
            return false;
        }return true;
    }
}
