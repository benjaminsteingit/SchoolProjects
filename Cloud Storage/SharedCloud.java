import java.text.DecimalFormat;

/**
 * Object class for shared cloud objects.
 */
public class SharedCloud extends CloudStorage {
	//instance variables
	protected double dataStored;
	protected double dataLimit;
   
   /**
   *Static variable for the Cost Factor.
   */
	public static final double COST_FACTOR = 1.0;
	
	/**
	 * Constructor method for Shared Cloud objects.
	 * @param nameIn input name of the object
	 * @param storageCostIn input storage cost of the object
	 * @param dataStoredIn input data store of the object
	 * @param dataLimitIn input data limit of the object
	 */
	public SharedCloud(String nameIn, double storageCostIn, 
      double dataStoredIn, double dataLimitIn) {
		super(nameIn, storageCostIn);
		dataStored = dataStoredIn;
		dataLimit = dataLimitIn;
	}
	
	/**
	 * Getter method for Data Stored.
	 * @return returns data stored.
	 */
	public double getDataStored() {
		return dataStored;
	}
	
	/**
	 * Setter method for Data Stored.
	 * @param dataStoredIn input data store
	 */
	public void setDataStored(double dataStoredIn) {
		dataStored = dataStoredIn;
	}
	
	/**
	 * Getter method for data limit.
	 * @return is the data limit
	 */
	public double getDataLimit() {
		return dataLimit;
	}
	
	/**
	 * Setter method for data Limit.
	 * @param dataLimitIn input data limit
	 */
	public void setDataLimit(double dataLimitIn) {
		dataLimit = dataLimitIn;
	}
	
	/**
	 * Getter method for the Cost Factor variable.
	 * @return is the Cost Factor
	 */
	public double getCostFactor() {
		return COST_FACTOR;
	}
	
	/**
	 * Calculates the data overage and returns zero 
    * is there is none.
	 * @return returns 0 if there is no overage 
	 */
	public double dataOverage() {
		if ((dataStored - dataLimit) < 0) {
			return 0;
		}
		return dataStored - dataLimit;
	}
	
	/**
	 *Method for calculating monthly cost.
	 *@return is the total monthly cost for this object.
	 */
	public double monthlyCost() {
		double totalCost;
		totalCost = getBaseStorageCost() + dataOverage() 
         * SharedCloud.COST_FACTOR;
		return totalCost;
		
	}
	
	/**
	 *String method for this object.
	 *@return is the string output.
	 */
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,##0.000");
		String output = super.toString() + "\nData Stored: " 
         + format.format(getDataStored()) + " GB";
		output += "\nData Limit: " 
         + format.format(getDataLimit()) + " GB";
		output += "\nOverage: " + format.format(dataOverage()) + " GB";
		output += "\nCost Factor: " + getCostFactor();
		
		return output;
	}
	
	
	
	

}
