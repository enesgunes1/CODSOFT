
public class TestInterface {

    /*public static int withdraw;*/
    public static void main(String[] args) {
        ATM atm=new ATM();
        atm.DisplayMenu();
        atm.Process();
       
        if(atm.Process()>0){
            
            atm.DisplayMenu();
            atm.Process();
        }
        else{
            System.out.println("Thankyou for coming!");
        }
       
           
        
    
    
    
}
}