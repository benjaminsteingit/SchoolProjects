   /**
   *Object class for online books.
   */


public class OnlineBook extends OnlineTextItem { 

   //instance variable
   protected String author; 
   
   /**
   *Constructor method for online books.
   @param nameIn is the name of the book.
   @param priceIn is the price of the book.
   */
   
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
   *Method for creating a string of information for the book.
   @return is the name of the book, author, and the cost.
   */
   
   public String toString() {
      return name + " - " + author + ": $" + calculateCost(); 
   }
   
   /**
   *Method for setting the Author's name.
   @param authorIn is the name of the author.
   */
   
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
   
   
}