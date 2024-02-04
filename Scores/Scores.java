
/**
*Scores class.  Used for creating Scores objects.
*/

public class Scores {

   //instance variables
   private int[] numbers;
   
   /**
   *Constructor method for Scores class.
   @param numbersIn is the numbers used to create an array.
   */
   
   public Scores(int[] numbersIn)  {
      numbers = numbersIn;
   
   }
   
   /**
   *Method for finding even numbers in the array.
   @return null is a placeholder for an array objects.
   */
   
   public int[] findEvens() {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }  
      int[] evens = new int[numberEvens];
      
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++)  {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
            
      return evens;
   }
   
   /**
   *Method for finding odd numebrs in the array.
   @return null is a placeholder for an array object.
   */
   
   public int[] findOdds()  {
      int numberOdd = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdd++;
         }
      }  
      int[] odds = new int[numberOdd];
      
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++)  {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
            
      return odds;
         
   }
   
   /**
   *Method that calculates the average of all scores.
   @return the average of all scores.
   */
   
   
   public double calculateAverage()  {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++)  {
         sum += numbers[i];
      }
      
      return (double) sum / (double) numbers.length;
   }
   
   /**
   *Method that returns a String with all scores.
   @return is the String containing all scores
   */
   
   
   public String toString() {
      String allScores = " ";
      for (int i = 0; i < numbers.length; i++) {
         allScores += numbers[i] + "\t";
      }
      return allScores;
   }
   
   /**
   *Method that returns all scores in reverse order.
   @return is the String containing all scores in reverse order.   
   */
   
   
   public String toStringInReverse() {
      String allScoresReversed = " ";
      for (int i = numbers.length - 1; i > -1; i--) {
         allScoresReversed += numbers[i] + "\t";
      }
      return allScoresReversed;
   } 


}