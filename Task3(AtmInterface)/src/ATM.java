import java.util.*;
public class ATM {
    
    //Instane variables
    int CheckBalance,Deposit,Withdrawl;
   
    
    //default constructor
    ATM(){
        CheckBalance=1000;
        Deposit=0000;
        Withdrawl=0000;
        
    }
    //Parameterized contructor;
    public ATM(int Balance, int Deposit, int Withdrawl) {
        this.CheckBalance = CheckBalance;
        this.Deposit = Deposit;
        this.Withdrawl = Withdrawl;
      
        
    }

   

    public double getCheckBalance() {
        return CheckBalance;
    }
     
    //Mehod For choosing options;
    public void DisplayMenu(){
        
        System.out.println("Welcome to the ATM Machine::");
        System.out.println("Choose your method:");
        System.out.println("1.Check the balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        
        
    }
    public int Process(){
        Scanner inp=new Scanner (System.in);
        System.out.println("Enter your choice::");
        int a=inp.nextInt();
        int withdraw;
        int de=CheckBalance;
        switch (a){
            case 1:
                
                System.out.println("Your Balance is::"+getCheckBalance());
                
        
        case 2:
            System.out.println("How much balance You wanna deposit?");
            int d=inp.nextInt();
            System.out.println("Succesfully deposited Rs."+d);
            de+=d;
            System.out.println("Now your balance is::"+de);
            
        case 3:
            System.out.println("How much balance you wanna withdraw?");
            int w=inp.nextInt();
            if (w>de){
                System.out.println("Insufficient amount to withdraw");
            }
            else{
                System.out.println("Successfully withdrew Rs."+w);
            withdraw=de-w;
            System.out.println("The remaining balance is:"+withdraw);
            }
            
            break;
            
        case 4:
            System.out.println("Thank you for your precious time!!");
            break;
            
        default:    
            System.out.println("Invalid choice. Please try again.");
        
        }    
        return 1;
            
    }

    }
    
    
    
    
    
    
    
    
    
   
