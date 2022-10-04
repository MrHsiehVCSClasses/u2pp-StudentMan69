package src.game;
import java.util.*;
import java.util.Scanner;
import Resource;
import Water;
import Food;
import Material;
// Java program to generate a random integer
// within this specific range

import java.util.concurrent.ThreadLocalRandom;

class GFG {

	public static int getRandomValue(int Min, int Max)
	{

		// Get and return the random integer
		// within Min and Max
		return ThreadLocalRandom
			.current()
			.nextInt(Min, Max + 1);
	}

}
public class Main{
    public static boolean shouldIncrease(){
        int randomInt = GFG.getRandomValue(0,1);
  return randomInt == 1;        
      }
    static void raid(Water myWater, Food myFood, Material myMaterial) {
        System.out.println("Inventory before the raid: " );
        System.out.println("Water amount: " + myWater.amount);     
        System.out.println("Food amount: " + myFood.amount); 
        System.out.println("Material amount: " + myMaterial.amount);        
            
            
       // We do below actions 10x 
       for (int i = 0; i < 10; i++){
           if (shouldIncrease()){
               myWater.Increase();
               System.out.println("Water +1");
               }
    
           if (shouldIncrease()){
               myFood.Increase(2);
               System.out.println("Food +2");
                    }
           
           if (shouldIncrease()){
               myMaterial.Increase(3);
               System.out.println("Material +3");
                   }        
                   
       
   }
   


   }
   public static void main(String[] args) {
    System.out.println("Game on");
    
    Water myWater = new Water();
    myWater.setAmount(5);

    Food myFood = new Food();
    myFood.setAmount(5);
    
    Material myMaterial = new Material();
    myMaterial.setAmount(5);
    
    int days = 0;
    
    
    // Think of it as main game loop 
    while (true) {
        days += 1;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Day " + days + " | Enter Raid? Y/N");
        
        String userInput = myObj.next(); 
        Boolean enterRaid = userInput.equals("Y") || userInput.equals("y");
        
        if (enterRaid){
            System.out.println("Commencing Raid"); 
            raid(myWater, myFood, myMaterial);
        } 
        else {
            System.out.println("Sitting at home");
            continue;
        }            
        
    }
}
}
