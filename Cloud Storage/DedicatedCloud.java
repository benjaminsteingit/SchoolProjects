import java.text.DecimalFormat;

/**
 *Object class for dedicated cloud storage. 
 */
public class DedicatedCloud extends CloudStorage {
	//instance variables
	private double serverCost;
	
	/**
	 * Constructor method for Dedicated Cloud objects.
	 * @param nameIn is the name of the object
	 * @param storageCostIn is the storage cost of the object
	 * @param serverCostIn is the server cost of the object
	 */
	public DedicatedCloud(String nameIn, double storageCostIn, 
      double serverCostIn) {
		super(nameIn, storageCostIn);
		serverCost = serverCostIn;
	}
	
	/**
	 * Getter method for server costs.
	 * @return returns the server cost
	 */
	public double getServerCost() {
		return serverCost;
	}
	
	/**
	 * Setter method for server costs.
	 * @param serverCostIn is the input cost of the server
	 */
	public void setServerCost(double serverCostIn) {
		serverCost = serverCostIn;
	}
	
	/**
	 *Method for calculating monthly cost.
	 *@return is the monthly cost
	 */
	public double monthlyCost() {
		double cost = storageCost + serverCost;
		return cost;
	}
	
	/**
	 *Method for providing summary output for this object.
	 *@return is the string output.
	 */
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,##0.00");
		String output = super.toString() 
         + "\nServer Cost: $" + format.format(getServerCost());
		return output;
		
	}

}
