
   /**
   *Object class for Electronics items.
   */


public class ElectronicsItem extends InventoryItem {

   //instance variables
   protected double weight;
   
   /**
   *Static variable for shipping cost.
   */
   
   public static final double SHIPPING_COST = 1.5;
   
   /**
   *Constructor method for the Electronics Items class.
   @param nameIn is the name of the object
   @param priceIn is the price of the object
   @param weightIn is the weight of the object
   */
   
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
   *This method calculates the total cost of the object.
   @return is the cost plus shipping calculations.
   */
   
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   
   }
   
}
   