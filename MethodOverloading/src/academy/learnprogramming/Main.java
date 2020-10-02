package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newscore = calculateScore("Tim", 100);
        System.out.println("new score is " + newscore);

        calculateScore(600);

        calculateScore();


        // write your code here
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score + " points");
        return 1000 * score;
    }

    public static int calculateScore(int score) {
        System.out.println("player z " + score + " points");
        return 1000 * score;
    }

    public static int calculateScore() {
        System.out.println("player with no score ");
        return 0;
//        return 1000 * score;
    }
//    public static void calculateScore() {
//        System.out.println("player with no score ");   - > Error when changed to void
////        return 0;
////        return 1000 * score;
//    }
}

