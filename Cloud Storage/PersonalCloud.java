
/**
 * Object Class for personal Cloud objects.
 */
public class PersonalCloud extends SharedCloud {
	
   /**
   *Static variable for the Cost Factor.
   */
	public static final double COST_FACTOR = 3.0;
	
	/**
	 * Constructor method for personal cloud objects.
	 * @param nameIn is the desired bame of the object
	 * @param storageCostIn is the input cost of the object
	 * @param dataStoredIn in the input stored data of the object
	 * @param dataLimitIn is the input data limit of the object
	 */
	public PersonalCloud(String nameIn, double storageCostIn, 
      double dataStoredIn, double dataLimitIn) {
		super(nameIn, storageCostIn, dataStoredIn, dataLimitIn);
	}
	
	/**
	 *Method for returning the Cost Factor of this object.
	 *@return is the COST_FACTOR variable of this object.
	 */
	public double getCostFactor() {
		return COST_FACTOR;
	}
	
	/**
	 *Method for calculating the Monthly cost of this object.
	 *@return is the Monthly cost of this object.
	 */
	public double monthlyCost() {
		double cost;
		cost = getBaseStorageCost() + dataOverage() 
         * PersonalCloud.COST_FACTOR;
		return cost;
	}

}
