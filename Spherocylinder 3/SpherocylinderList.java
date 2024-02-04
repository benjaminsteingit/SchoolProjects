import java.text.DecimalFormat;

/**
*Defines objects for SpherocylinderList.
*/
   
public class SpherocylinderList {
   
   //instance variables
   
   private String myName;
   private Spherocylinder[] myList;
   private int myNumber;
   
   /**
   *Constructor method for Spherocylinder List objects.
   @param nameIn is the name input.
   @param listIn is the list input.
   @param numberIn is the length of the list.
   */
   
   public SpherocylinderList(String nameIn, Spherocylinder[] listIn, 
                                                     int numberIn) {
      myName = nameIn;
      myList = listIn;
      myNumber = numberIn;
      
   }   
   
   /**
   *Returns a String representing the name of the list.
   @return is the name of the list.
   */
      
   public String getName()  {
      return myName;
   
   }
   
   /**
   *Returns an int representing the number of 
    Spherocylinder objects in the SpherocylinderList.
    @return is the number of Spheroclyinders in a SpherocylinderList object.
   */
   
   public int numberOfSpherocylinders() {
      return myNumber;
   
   }
   
   /**
   *Returns a double representing the total surface areas for all 
    Spherocylinder objects in the list.
    @return is the total surface area for all Spherocylinders in the list.
   */
   
   public double totalSurfaceArea()  {
      double total = 0.0;
      
      int index = 0;
      while (index < myNumber) {
         total += myList[index].surfaceArea();
         index++;  
      }   
      
      return total;   
   }
   
   /**
   *Returns a double representing the total volumes for all Spherocylinder 
    objects in the list.
    @return is the totalVolume for all Spherocylinders in the list.
   */
   
   public double totalVolume()  {
      double total = 0.0;
      
      int index = 0;
      while (index < myNumber) {
         total += myList[index].volume();
         index++;  
      }   
      
      return total;   
   }
   
   /**
   *Returns a double representing the average surface area for 
   all Spherocylinder objects in the list.
   @return is the average surface area for the object.
   */
   
   public double averageSurfaceArea()  {
      double total = 0.0;
      
      int index = 0;
      while (index < myNumber) {
         total += myList[index].surfaceArea();
         index++;  
      }    
      
      return total / myNumber; 
   
   }
   
   /**
   *Returns a double representing the average volume for all 
    Spherocylinder objects in the list.
    @return is the average volume for the list object.
   */
   
   public double averageVolume()  {
      double total = 0.0;
      
      int index = 0;
      while (index < myNumber) {
         total += myList[index].volume();
         index++;  
      }   
      
      return total / myNumber;
   }
   
   /**
   *Returns a String containing the name of the list followed
    by various summary items.
    @return is the String output for this method.
   */
   
   public String toString()  {
   
      DecimalFormat format = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "----- Summary for " + getName() + " -----";
      output += "\nNumber of Spherocylinders: " + numberOfSpherocylinders(); 
      output += "\nTotal Surface Area: " + format.format(totalSurfaceArea());
      output += "\nTotal Volume: " + format.format(totalVolume());
      output += "\nAverage Surface Area: "  + format.format(
         averageSurfaceArea());
      output += "\nAverage Volume: "  + format.format(averageVolume());
      
      return output;
   
   }
   
   /**
   *Returns the array of Spherocylinder objects.
   @return is the array from the objects
   */
   
   public Spherocylinder[] getList()  {
      return myList;
   
   }
   
   /**
   *Creates a new Spherocylinder object and adds it to the 
    Spherocylinder list object.
    @param label is the label of the Spherocylinder.
    @param radius is the radius of the Spherocylinder.
    @param height is the height of the Spherocylinder.
   */
   
   public void addSpherocylinder(String label, double radius, double height) {
      
      Spherocylinder newSpherocylinder = new Spherocylinder(
         label, radius, height);
      myList[myNumber] = newSpherocylinder;
      myNumber++;
    
   }
   
   /**
   *Finds a Spheroclyinder based on it's label.
   @return Spherocylinder if label matches
   @param labelIn is the label being checked
   */
   
   public Spherocylinder findSpherocylinder(String labelIn)  {
      for (int i = 0; i < myList.length; i++) {
         if (myList[i].getLabel().equalsIgnoreCase(labelIn)) {
            return myList[i];
         }
      }
      return null;   
   }
   
   /**
   *Deletes a Spherocylinder from a list.
   @return null if the Spherocylinder is not found
      returns the label of the Spherocylinder if it is deleted
   @param labelIn is the label of the Spherocylinder to be deleted
   */
   
   public Spherocylinder deleteSpherocylinder(String labelIn)  {
      
      if (findSpherocylinder(labelIn) == null) {
         return null;
      }
      
      Spherocylinder cylinderToDelete = findSpherocylinder(labelIn);
      
      for (int i = 0; i < myNumber; i++) {
         
         if (myList[i] == cylinderToDelete) {
            
            for (int j = i; j < myNumber - 1; j++) {
               
               myList[j] = myList[j + 1];
            }
            myList[myNumber - 1] = null; 
            myNumber--;
            break;
         }
      }
      return cylinderToDelete;
   
   }
   
   /**
   *Edits Spherocylinders from a list.
   @param labelIn label of the Spherocylinder to be edited.
   @param radiusIn radius of the Spherocylinder to be edited 
   @param heightIn height of the Spherocylinder to be edited
   @return false if label is not found or true if edit is made
   */
   
   public boolean editSpherocylinder(String labelIn, double radiusIn, 
      double heightIn) {
      if (findSpherocylinder(labelIn) == null) {
         return false;
      }
      Spherocylinder newSpherocylinder = findSpherocylinder(labelIn);
      newSpherocylinder.setRadius(radiusIn);
      newSpherocylinder.setCylinderHeight(heightIn);
      return true;
      
   
   }
   
   /**
   *Finds the Spherocylinder with the largest volume in a given list.
   @return is the Spherocylinder with the largest volume
   */
   
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      
      if (myList[0] == null) {
         return null;
      }
      Spherocylinder largestVolume = myList[0];
      for (int i = 0; i < myList.length; i++) {
         if (myList[i].volume() > largestVolume.volume()) {
            largestVolume = myList[i];
         }
         
      }
      return largestVolume;   
   }
   
   
}