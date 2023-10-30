package quizapplicationwithtimer;

import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplicationWithTimer {
    private static int score = 0;

    public static void main(String[] args) {
        Question1 q = new Question1();
        q.q1();
        DisplayQuestion1OptionsAndResults d = new DisplayQuestion1OptionsAndResults();
        d.dq1();
        d.displayScore(score);

        Question2 qq = new Question2();
        qq.q2();
        DisplayQuestion2OptionsAndResults dq2 = new DisplayQuestion2OptionsAndResults();
        dq2.dq2();
        dq2.displayScore(score);
    }

    static class Question1 {
        void q1() {
            System.out.println("What is the capital of Pakistan??");
        }
    }

    static class DisplayQuestion1OptionsAndResults {
        void dq1() {
            Scanner inp = new Scanner(System.in);
            String ans;
            String[] options = { "a. Paris", "b. Islamabad", "c. London" };
            System.out.println("Enter the letter of the correct option: ");
            for (String option : options) {
                System.out.println(option);
            }
           Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    inp.close();
                }
            }, 10000);
            char ch = inp.next().charAt(0);
            if (ch == 'b') {
                ans = "Correct";
                score++;
            } else {
                ans = "Wrong";
                
            }
            timer.cancel();
        }


        void displayScore(int score) {
            System.out.println("Your score is: " + score);
        }
    }

    static class Question2 {
        void q2() {
            System.out.println("What is the national game of Pakistan?");
        }
    }

    static class DisplayQuestion2OptionsAndResults {
        void dq2() {
            Scanner inp = new Scanner(System.in);
            String ans;
            String[] options = { "a. Hockey", "b. Cricket", "c. Badminton" };
            System.out.println("Enter the letter of the correct option: ");
            for (String option : options) {
                System.out.println(option);
            }
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    inp.close();
                }
            }, 10000);
             System.out.println("Waiting for your answer... You have 10 seconds.");
              
            char ch = inp.next().charAt(0);
            if (ch == 'a') {
                ans = "Correct";
                score++;
            } else {
                ans = "Wrong";
            }
             timer.cancel();
        }
        void displayScore(int score) {
            System.out.println("Your score is: " + score+"/2");
        }
    }
}