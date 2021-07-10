
/**
* The class takes in 4 int values, 3 for snap, crackle, and pop, and one for rounds and checks for multiples of snap, crackle, and pop within
* the number of rounds. If there are multiples, for that round result, will print the corresponding factor instead of the round number.
* @author Victor Lam
* @version 1.0
*/


public class SnapCracklePop {
 
   
   /**
   * Variables to be used in code to store values
   */
   
   
   private int Snap;
   private int Crackle;
   private int Pop;
   
   
   
   
   /**
   * Initializes instance variables upon creation of class with given values of the parameters 
   * @param snap User entered value for snap
   * @param crackle User entered value for crackle
   * @param pop User entered value for pop
   */
    
     
   
   public SnapCracklePop(int snap, int crackle, int pop) {
      Snap = snap;
      Crackle = crackle;
      Pop = pop;
      
   }
   
   
  
   /**
   * Determines if any of the rounds are multiples of snap, crackle, and pop. If they are, it outputs the variables that have a multiple in that round. 
   * If there are no multiples, outputs round number.
   * @param round The round number being considered
   * @return The result of the round
   */ 
     
   
   
   
   public String playRound(int round) {
      String resultStr = "";
   
      if (round%Snap == 0) {
         resultStr += "snap";
      }
      if (round%Crackle == 0) {
         resultStr += "crackle";
      }
      if (round%Pop == 0) {
         resultStr += "pop";
      }
      if (resultStr.equals("")) {
         resultStr += round;
      }
      return resultStr;
      
   }
   
   
   /**
   * Runs playRound for number of rounds chosen by user and prints result statement for each round
   * @param rounds Number of rounds selected by user
   * @return Output of every round
   */ 
   
   
  
   
   
   public String playGame(int rounds) {
      String resultStr = "";
      for (int i = 1; i <= rounds; i++) {
         System.out.println("Round " + i + ": " + playRound(i));
         
      }
      return resultStr;
   }
      
   
   
   /**
   * Gets user entered value for Snap
   * @return Snap number
   */ 
   
   
   public int getSnap() {
      return Snap;
   }
   
   /**
   * Gets user entered value for Crackle
   * @return Crackle number
   */ 
   
     
   public int getCrackle() {
      return Crackle;
   }
  
   /**
   * Gets user entered value for Pop
   * @return Pop number
   */ 
     
   
   public int getPop() {
      return Pop;
   }
   
 
   
   

}