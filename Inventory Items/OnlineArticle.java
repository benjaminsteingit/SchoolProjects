   /**
   *Object class for Online Articles.
   */


public class OnlineArticle extends OnlineTextItem { 

   //instance variable
   private int wordCount = 0;
   
   /**
   *Constructor method of online articles.
   @param nameIn is the name of the article
   @param priceIn is the price of the article
   */
   
   
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**
   *Method for setting the word count of an article.
   @param wordCountIn is the word count of the article to be set.
   */
   
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
   
   
   
}