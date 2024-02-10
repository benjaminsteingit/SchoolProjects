import org.junit.Assert;
import org.junit.Test;

/**
*Test class for the person cloud object.
*/

public class PersonalCloudTest {

/**
*Test method for the personal cloud getters.
*/

	@Test public void getterTest() {
		PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 
         21.0, 20.0);
		Assert.assertEquals(c5.getCostFactor(), 3.0, 0);		
	}
   
/**
*Test method for the monthly cost method.
*/
   
   @Test public void monthlyCostTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 
         21.0, 20.0);
      System.out.print(c5.getBaseStorageCost());
      System.out.println(c5.dataOverage());
      System.out.println(c5.getCostFactor());
         
      Assert.assertEquals(12, c5.monthlyCost(), 0);
   }

}
