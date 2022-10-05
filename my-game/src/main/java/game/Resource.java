package game;
import java.util.*;
public class Resource
{
    int amount = 0;
    String type;
    
    // public Resource(int initialAmount) {
    //     amount = initialAmount;
    // }
    
    public int getAmount() {
        String myType = this.getType();
        System.out.println("GET: You have: " + amount + " " + myType);
        return amount;
    }
    
    public String getType() {
        return type;
    }

    public void setAmount(int newAmount) {
        if (newAmount < 0) {
            // Invalid, must be >= 0
            return;
        }
      amount = newAmount;
      String myType = this.getType();
      System.out.println("You have: " + amount + " " + myType);
    }
    
   

    

    
    public void Increase(){ 
    amount += 1;
    }
    
    public void Increase(int x){
    amount += x;
        
    }
    
    

}


//copy paste into individual subclass






