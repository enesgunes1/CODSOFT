package Task1;

import java.util.*;

public class Task1a {

    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        boolean playAgain=true;
        
        int min=1;
        int max=100;
       int r_no=(int)(min*Math.random()*max);
       int i=0;
       int correct=0;
       int wrong=0;
       while(playAgain==true){
       for ( i=0;i<=6;i++){
        System.out.print("Guess the number:");
        int no=inp.nextInt();
        if (no==r_no){
            
            correct++;
            
        }
        else{
            wrong++;
        }
       }
       
           System.out.println(("Do you want to play again? (Press 1 for yes and 9 for No..."));
           int playChoice=inp.nextInt();
           if (playChoice!=1){
               playAgain=false;
           }
       }
               
           
                
        
    
       System.out.println("The no was:"+r_no);
           System.out.println("Correct attempts="+correct);
           System.out.println("Wrong attempts="+wrong);
           
    }

}
