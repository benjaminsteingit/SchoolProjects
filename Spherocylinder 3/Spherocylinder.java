import java.text.DecimalFormat;

/**
*Spherocylinder class.  Used for creating new cylinder objects.
*/

public class Spherocylinder implements Comparable<Spherocylinder> {

   //class variables

   private static int cylinderCount = 0;

   //instance variables

   private String label = " ";
   private double radius = 0;
   private double height = 0;

   /**
   *Constructor method for creating new spheroclyinder objects.
   @param newLabel is the label for the clyinder
   @param newRadius is the radius for the cylinder
   @param newHeight is the height for the cylinder
   */
   public Spherocylinder(String newLabel, double newRadius, double newHeight) {
      if (!setLabel(newLabel)) {
         return;
      }
      setRadius(newRadius);
      setCylinderHeight(newHeight);
      cylinderCount++;
      
         
   } 
   
   /**
   *Getter method for returning the label of a Spherocylinder.
   @return is the label.
   */
   
   public String getLabel() {
      return label;
   }
   
   /**
   *Setter method for the label of a cylinder.
   @return false if the label is invalid.
   @param labelIn is the new label being set in this method.
   */
   
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         this.label = labelIn.trim();
         return true;
      }
      return false;
   }

   /**
   *Getter method of returning the radius of a Spherocylinder.
   @return is the radius.
   */

   public double getRadius() {
      return radius;
   }
   
   /**
   *Setter method for the radius of a cylinder.
   @param radiusIn is the radius being set in this method.
   @return show if the new radius was set.
   */
   
   public boolean setRadius(double radiusIn) {
      if (radiusIn >= 0) {
         this.radius = radiusIn;
         return true;
      }
      return false;
   }
   
   /**
   *Getter method for returning the height of a cylinder.
   @return is the height.
   */
   
   public double getCylinderHeight() {
      return height;
   }
   
   /**
   *Setter method for new cylinder height.
   @param heightIn is the new height to be set.
   @return tells whether of not the new height was set.
   */
   
   public boolean setCylinderHeight(double heightIn) {
      if (heightIn >= 0) {
         this.height = heightIn;
         return true;
      }
      return false;
   }
   
   /**
   *Calculates the circumference of a cylinder.
   @return is the current circumference
   */
   
   public double circumference() {
      double currentCircumference = 2 * Math.PI * radius;
      return currentCircumference;
   }
   
   /**
   *Calculates the surface area of a cylinder.
   @return is the current surface area
   */
   
   public double surfaceArea() {
      double currentSurfaceArea = 2 * Math.PI * radius * (2 * radius + height);
      return currentSurfaceArea;
   
   }
   
   /**
   *Calculates the volume of a cylinder.
   @return is the current volume
   */
   
   public double volume() {
      double currentVolume = 
            (Math.PI * Math.pow(radius, 2)) * (4.0 / 3.0 * radius + height);
      return currentVolume;
   
   }
   
   /**
   *Prints all of the available information for a specific
   *cylinder. 
   @return is the output of the string
   */
   
   public String toString() {
      DecimalFormat format = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder \"" + label +  "\" with radius " + radius 
         + " and cylinder height " + height + " has:\n\t"  
         + "circumference = " + format.format(circumference()) 
         + " units\n\t"
         + "surface area = " + format.format(surfaceArea()) 
         + " square units \n\t" 
         + "volume = " + format.format(volume()) 
         + " cubic units \r\n";
      return output;
   }
   
   /**
   *Returns the current count of created cylinders.
   @return is the current count
   */
   
   public static int getCount() {
      return cylinderCount;
   }
   
   /**
   *Sets the cylinder count back to zero.
   */
   
   public static void resetCount() {
      cylinderCount = 0;
   }
   
   /**
   *Checks to see if a given object is a Spherocylinder.
   @param obj is the oject being checked
   @return is the check to see if the object is a Spherocylinder
   */
   
   public boolean equals(Object obj) { 
    
      if (!(obj instanceof Spherocylinder)) { 
         return false; 
      } 
      else {  
         Spherocylinder d = (Spherocylinder) obj;        
         return (label.equalsIgnoreCase(d.getLabel()) 
                  && Math.abs(radius - d.getRadius()) < .000001    
                  && Math.abs(height - d.getCylinderHeight()) 
                        < .000001); 
      }  
   }
   
   /**
   *Required method for Checkstyle.
   @return required for Checkstyle.
   */
   
   public int hashCode() {
      return 0;
   }
   
/**
*Method for organizing objects by a givien parameter.
@return 0 for equal, -1 for negative, 1 for postiive
@param obj is the input object.
*/

   public int compareTo(Spherocylinder obj)  {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001)  {
         return 0;
      }
      
      else if (this.volume() < obj.volume()) {
         return -1;
      }
   
      else {
         return 1;
      }
   
   
   } 




}