/**
*Class for creating customer objects.
*/

public class Customer implements Comparable<Customer> {

//instance variables

   private String custName;
   private String custLocation;
   private double custBalance;

/**
*Constructor for customer objects. **finish!**
@param nameIn is the input for the customer's name.
*/

   public Customer(String nameIn) {
      custName = nameIn;
      custLocation = " ";
      custBalance = 0;
   }

/**
*Setter method for customer's location.
@param locationIn is the location to be set by the method.
*/

   public void setLocation(String locationIn) {
      this.custLocation = locationIn;
   } 
   
/**
*Setter method for customer's location.
@param city is the city to be set by the method.
@param state is the state to be set by the method.
*/
   
   public void setLocation(String city, String state) {
      this.custLocation = city + ", " + state;
   }  

/**
*Getter method for customer's location.
@return is the customer's current location
*/

   public String getLocation() {
      return custLocation;
   }

/**
*Method for adding to the customer's balance.
@param amount to be set by the method.
*/

   public void changeBalance(double amount) {
      this.custBalance = this.custBalance + amount;
   }

/**
*Getter method for the cutomer's balance.
@return is the customer's current balance.
*/

   public double getBalance() {
      return custBalance;
   } 
   
/**
*Method for printing customer's information to the screen.
@return is the string output from the method.
*/

   public String toString() {
      String output = custName + "\n" + custLocation + "\n" + "$" 
         + custBalance;
      return output;
   }
   
/**
*Method for organizing objects by a givien parameter.
@return 0 for equal, -1 for negative, 1 for postiive
@param obj is the input object.
*/

   public int compareTo(Customer obj)  {
      if (Math.abs(this.custBalance - obj.getBalance()) < 0.000001)  {
         return 0;
      }
      
      else if (this.custBalance < obj.getBalance()) {
         return -1;
      }
   
      else {
         return 1;
      }
   
   
   }

   
   
}