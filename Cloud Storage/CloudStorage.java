import java.text.DecimalFormat;
/**
 *Abstract object class for Cloud Storage objects.
 */
public abstract class CloudStorage {

	//instance variables
	protected String name;
	protected double storageCost;
	
	//class variables
	protected static int count;
	
	/**
	 * Constructor for CloudStorage objects.
	 * @param nameIn name of cloud storage object.
	 * @param storageCostIn storage cost of cloud object
	 */
	public CloudStorage(String nameIn, double storageCostIn) {
		name = nameIn;
		storageCost = storageCostIn;
		count++;
	}
	
	/**
	 *Method for returning the name of an object.
	 * @return is the name of the object
	 */
	public String getName() {
		return name;
	}
	
	/**
	 *Setter method of the name of the object.
	 * @param nameIn is the name you wish to set.
	 */
	public void setName(String nameIn) {
		name = nameIn;
	}
	
	/**
	 * Getter method for the storage cost of an object.
	 * @return is the storage cost of the object.
	 */
	public double getBaseStorageCost() {
		return storageCost;
	}
	
	/**
	 * Setter method for the Base Storage Cost.
	 * @param costIn the cost you wish to set.
	 */
	public void setBaseStorageCost(double costIn) {
		storageCost = costIn;
	}
	
	/**
	 * Getter method for the count of an object.
	 * @return the the current count of the object.
	 */
	public static int getCount() {
		return count;
	}
	
	/**
	 * Method used to reset the count of an object.
	 */
	public static void resetCount() {
		count = 0;
	}
	
	/**
	 *Method used to return summary informatino about the object.
    *@return is the output of the string
	 */
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,##0.00");
		String output = "";
		output += getName() + " (" + this.getClass() + ") ";
		output += "Monthly Cost: $" + format.format(monthlyCost());
		output += "\nBase Storage Cost: $" + format.format(
         getBaseStorageCost());
		
		return output;
	}
	
	/**
	 * abstract method for the monthly cost of the object.
    *@return is different for every object.
	 */
	public abstract double monthlyCost();
	
	
	 
	
	
}