package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int highscore = 100; // highscore = 50 is an expression, int - keyword, entire thing is the statement
        if (highscore > 100)
            System.out.println("New high score ");

        int myVar = 50;
        myVar++;
        System.out.println("this is " +
            " not the" +
            " best" +
            " code in the world");


        int score = 10000;
        int bonus = 200;
        int levelCompleted = 5;
        boolean gameover = true;

        if(gameover){
            int finalscore = score + (bonus * levelCompleted);
            System.out.println("final score was "+ finalscore);
        }

    }
}
