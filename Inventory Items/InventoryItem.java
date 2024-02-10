/**
*Object class for inventory items.
*/

public class InventoryItem {

//instance variables
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
   *Constructor for InventoryItem class.
   @param nameIn is the input name for the object.
   @param priceIn is the input price for the object.
   */
   
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
        
   }
   
   /**
   *Getter method for the name of the object.
   @return is the name of the object.
   */
   
   public String getName() {
      return name;
   } 
   
   /**
   *This method returns the total cost of the item.
   @return is the price plus the tax rate.
   */
 
   public double calculateCost() {
      return price * (1 + taxRate);
   } 
   
   /**
   *Setter method for the tax rate.
   @param taxRateIn is the desired tax rate of the item.
   */
 
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   } 
   
   /**
   *To string method for this object.
   @return returns the name and cost of the item.
   */

   public String toString() {
      return name + ": $" + calculateCost(); 
   }




}