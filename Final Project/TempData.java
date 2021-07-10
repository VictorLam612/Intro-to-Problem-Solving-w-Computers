/* 
 * This class encapsulates the data recorded for a time series of high and low 
 * temperature readings.
 * The interval unit and two related data points are modeled by this object and 
 * are represented as a String and two integers.
 * For example, if the time interval is monthly: "January", 33, 13.
*/
public class TempData {

  /* 
   * Declare three instance variables: timeUnit, tempOne and tempTwo.
   */ 
   String timeUnit;
   int tempOne;
   int tempTwo;

   /* 
   * Initialize the three values.
   */ 
   public TempData(String time, int t1, int t2){
      timeUnit = time;
      tempOne = t1;
      tempTwo = t2;
   }

   /* Returns the name of this unit of time.
   */     
   public String getTime(){
      return timeUnit;
   }

   /* Returns the first observation.
   */     
   public int getTempOne(){
      return tempOne;
   }

   /* Returns the second observation.
   */    
   public int getTempTwo(){
      return tempTwo;
   }
   
   /* Returns a String representation of this object.
    * Used for debug/testing.
   */
   public String toString(){
      return timeUnit+", "+tempOne+", "+tempTwo;
   }
}