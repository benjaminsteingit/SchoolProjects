
/**
 *Object class for Public Cloud objects. 
 */
public class PublicCloud extends SharedCloud {
	/**
   *Static variable for the Cost Factor.
   */
	public static final double COST_FACTOR = 2.0;
	
	/**
	 * Constructor method for Public Cloud objects.
	 * @param nameIn input name of the object
	 * @param storageCostIn input cost of the object
	 * @param dataStoredIn input data of the object
	 * @param dataLimitIn input data limit of the object
	 */
	public PublicCloud(String nameIn, double storageCostIn,
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
         * PublicCloud.COST_FACTOR;
		return cost;
	}

}
