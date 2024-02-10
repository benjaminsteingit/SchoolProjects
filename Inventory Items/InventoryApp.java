/**
*Class object for the main driver of the app.
*/

public class InventoryApp {

/**
*Main method.
@param args is necessary to compile the program.
*/

   public static void main(String[] args) {

      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      //OnlineArticle item3 = new OnlineArticle("Java News", 8.50, 700);
      OnlineBook ob = new OnlineBook("Book", 5.5);
      OnlineArticle oa = new OnlineArticle("Book", 5.5);

   }   

}