
package task2a;

import java.util.Scanner;


public class Task2a {

    
        




    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        boolean choice = true;
        while (choice) {

            int sum = 0;
            int totalSub = 5;
            int per = 0;  // Corrected: initialize per to 0
            String grade="";  // Corrected: changed Grade to grade

            System.out.println("Enter the marks of 5 subjects::");
            for (int i = 0; i < totalSub; i++) {
                System.out.print("Enter the marks of Subject " + (i + 1) + ": ");  // Corrected: added a space and incremented i by 1
                int marks = inp.nextInt();
                sum += marks;
            }

            // Calculate percentage
            per = (sum * 100) / (totalSub * 100);  // Corrected: calculate the percentage properly

            if ((per >= 50) && (per <= 59)) {
                grade = "C";
            } else if ((per >= 60) && (per <= 69)) {
                grade = "B";
            } else if ((per >= 70) && (per <= 79)) {
                grade = "A";
            } else if ((per >= 80) && (per <= 89)) {
                grade = "A+";
            }
            else{
                grade="Your are fail!";
            }

            System.out.println("The Grade is: " + grade);
            System.out.println("Percentage="+per);

            System.out.println("Do you want to check another status? (1 for Yes, 0 for No)");
            int yourChoice = inp.nextInt();
            if (yourChoice == 1) {
                choice = true;
            } else {
                choice = false;
            }
        }
    }
}
    
    

