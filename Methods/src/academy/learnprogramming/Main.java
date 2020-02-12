package academy.learnprogramming;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 100;
        int bonus = 299;
        int level = 7;
        char a = 'A';
        //calculateScore(true, 800, 299,7);
        int highscore = calculateScore(gameOver, score, bonus, level);
        System.out.println(highscore);


        int highscoreposition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highscoreposition);

        highscoreposition = calculateHighScorePosition(600);
        displayHighScorePosition("Rick", highscoreposition);
        highscoreposition = calculateHighScorePosition(200);
        displayHighScorePosition("Liam", highscoreposition);
        highscoreposition = calculateHighScorePosition(11);
        displayHighScorePosition("Tom", highscoreposition);

        highscoreposition = calculateHighScorePosition(1000);
        displayHighScorePosition("Luo", highscoreposition);


    }

    public static int calculateScore(boolean gameOver, int score, int bonus, int level){       //void - dont return anything from this
        /*boolean gameOver = true;
        int score = 100;
        int bonus = 299;
        int level = 7; */

        if (gameOver) {
            int finalScore = level * bonus + score;
            finalScore += 3000;

            return finalScore;
        }
        return -1;          // -1 is indicates an error usually
    }

    public static void displayHighScorePosition(String PlayerName, int highscoreposition){
        System.out.println(PlayerName + " managed to get into position "
        + highscoreposition + " on the highscore table");
    }

    public static int calculateHighScorePosition (int playerscore) {
//        if (playerscore >= 1000)
//            return 1;
//        else if (playerscore >= 500) //  && playerscore < 1000) - redundant code
//            return 2;
//        else if (playerscore >= 100) //&& playerscore < 500) - redundant code
//            return 3;
//        else
//            return 4;

        //another way

        int position = 4;
        if(playerscore >= 1000)
            position = 1;
        else if (playerscore >= 500)
            position = 2;
        else if (playerscore >=100)
            position = 3;

        return position;
    }
}

