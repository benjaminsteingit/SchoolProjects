   /**
   *Abstract class for OnlineTextItems books and articles.
   */


public abstract class OnlineTextItem extends InventoryItem {

   /**
   *Constructor method for online text object.
   @param nameIn is the desired name of the object.
   @param priceIn is the desired price of the object.
   */

   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /**
   *This method calculates the total cost of the object.
   @return is the price of the object.
   */
   
   public double calulateCost() {
      return price;
   }


}