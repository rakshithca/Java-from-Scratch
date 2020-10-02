package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }


    public static void printMegaBytesAndKiloBytes(int KiloBytes) {
        int MegaBytes;
        int Buff1 = KiloBytes / 1024;
        int Buff2 = KiloBytes % 1024;
        System.out.println(KiloBytes+ "KB = " +Buff1+ "MB and " +Buff2+ "KB");
//        System.out.println(Buff2);
    }
}