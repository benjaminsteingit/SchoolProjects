import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*Test class for Spherocylinder.
*/

public class SpherocylinderTest {

   /** Fixture initialization (common initialization for all tests). **/
   @Before public void setUp() {
   }
   
   ///////////////////////////////////////////
   
    /**
   *Getter method for returning the label of a Spherocylinder.
   */
   
   @Test public void testGetLabel() {
      Spherocylinder example = new Spherocylinder("exampleTest", 3.0, 4.4);
      Assert.assertEquals(example.getLabel(), "exampleTest");
      
   }
   
      /**
   *Setter method for the label of a cylinder.
   */
   
   @Test public void testSetLabel() {
      Spherocylinder example = new Spherocylinder("exampleTest", 3.0, 4.4);
      example.setLabel("exampleTest2  ");
      Assert.assertEquals(example.getLabel(), "exampleTest2");
      Assert.assertFalse(example.setLabel(null));
   }
   
///////////////////////////////////////////////////

    /**
   *Getter method for returning the radius of a Spherocylinder.
   */
   
   @Test public void testGetRadius() {
      Spherocylinder example = new Spherocylinder("exampleTest", 3.0, 4.4);
      Assert.assertEquals(example.getRadius(), 3.0, 0);
      
   }
   
      /**
   *Setter method for the label of a cylinder.
   */
   
   @Test public void testSetRadius() {
      Spherocylinder example = new Spherocylinder("exampleTest", 3.0, 4.4);
      example.setRadius(3.5);
      Assert.assertEquals(example.getRadius(), 3.5, 0);
      Assert.assertFalse(example.setRadius(-2));
   }

////////////////////////////////////////////////

    /**
   *Getter method for returning the radius of a Spherocylinder.
   */
   
   @Test public void testCylinderHeight() {
      Spherocylinder example = new Spherocylinder("exampleTest", 3.0, 4.4);
      Assert.assertEquals(example.getCylinderHeight(), 4.4, 0);
      
   }
   
      /**
   *Setter method for the label of a cylinder.
   */
   
   @Test public void testSetCylinderHeight() {
      Spherocylinder example = new Spherocylinder("exampleTest", 3.0, 4.4);
      example.setCylinderHeight(3.5);
      Assert.assertEquals(example.getCylinderHeight(), 3.5, 0);
      Assert.assertFalse(example.setCylinderHeight(-1));
   }

/////////////////////////////////////

/**
*Method to test the toString method and check formatting.
*/

   @Test public void testToString() {
      Spherocylinder example = new Spherocylinder("exampleTest", 0.5, 0.25);
      System.out.println(example.toString());
      Spherocylinder example2 = new Spherocylinder("exampleTest2 ", 10.8, 10.1);
      System.out.println(example2.toString());
      Spherocylinder example3 = new Spherocylinder("exampleTest3", 98.32, 99.0);
      System.out.println(example3.toString());
      Spherocylinder example4 = new Spherocylinder(null, -1.5, -4.25);
      System.out.println(example4.toString());
   }

///////////////////////////////////////////

//circumference

   /**
   *Calculates the circumference of a cylinder.
   */
   
   @Test public void testCircumference() {
      Spherocylinder example = new Spherocylinder("exampleTest", 0.5, 0.25);
      Assert.assertEquals(example.circumference(), 2 * Math.PI * 0.5, 0);
   }

/////////////////////////////////

//surface area 

   /**
   *Calculates the surface area of a cylinder.
   *Also tests the getCount() method.
   */
   
   @Test public void testSurfaceArea() {
      Spherocylinder example = new Spherocylinder("exampleTest", 0.5, 0.25);
      
      Assert.assertEquals(example.surfaceArea(), 2 * Math.PI * 0.5 
         * (2 * 0.5 + 0.25), 0);   
   }

////////////////////////////////////
   
//get count & reset count

/**
*Method to test the getCount and resetCount methods.
*/

   @Test public void testRestCountAndGetCount() {
      Spherocylinder.resetCount();
      Spherocylinder example = new Spherocylinder("exampleTest", 0.5, 0.25);
      Assert.assertEquals(Spherocylinder.getCount(), 1);
      
   }

//////////////////////////

//equals

/**
*Test for the equals method.
*/

   @Test public void testEquals() {
      Spherocylinder example = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example3 = new Spherocylinder("exampleTest", 1.5, 4.25);
      Spherocylinder example4 = new Spherocylinder(null, -1.5, -4.25);
      Spherocylinder example5 = new Spherocylinder(null, 1.5, -4.25);
      Spherocylinder example6 = new Spherocylinder("exampleTest", 0.5, 0.1);
      Assert.assertEquals(equals(example2), equals(example));
      Assert.assertTrue(example.equals(example2));
      Assert.assertTrue(example4.equals(example5));
      Assert.assertFalse(example.equals(example3));
      Assert.assertFalse(example.equals(example4));
      Assert.assertFalse(example3.equals(example5));
      Assert.assertFalse(example.equals(example6));
      Assert.assertFalse(equals(example4));
      Assert.assertEquals(equals(example4), equals(example5));
      Assert.assertFalse(equals(example5));
      Assert.assertFalse(example.equals(example.getRadius()));
      
      
     
   }
   
   ////////////////
   
   /**
   *Test for the hashCode method.
   */
   
   @Test public void testHashCode() {
      Spherocylinder example = new Spherocylinder("exampleTest", 0.5, 0.25);
      Assert.assertEquals(hashCode(), hashCode());
      Assert.assertTrue(example.hashCode() == 0);
   }

   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
            //+ "this test once you have added your own.", 0, 1);
   //}
   
   /**
*Test method for compareTo.  Testing equals or 0 return.
*/  

   @Test public void compareToTest1() {
      Spherocylinder example1 = new Spherocylinder("exampleTest", 0.5, 0.25);
            
      Spherocylinder example2 = new Spherocylinder("exampleTest", 0.5, 0.25);
            
      Assert.assertTrue(example1.compareTo(example2) == 0);
   }

/**
*Test method for compareTo.  Testing the negative result.
*/  
 
   @Test public void compareToTest2() {
      Spherocylinder example1 = new Spherocylinder("exampleTest", 0.5, 0.25);
            
      Spherocylinder example2 = new Spherocylinder("exampleTest", 1.5, 4.25);
            
      Assert.assertTrue(example1.compareTo(example2) < 0);
   }


/**
*Test method for compareTo.  Testing for positive result.
*/  
   
   @Test public void compareToTest3() {
      Spherocylinder example1 = new Spherocylinder("exampleTest", 2.5, 4.25);
            
      Spherocylinder example2 = new Spherocylinder("exampleTest", 0.5, 0.25);
            
      Assert.assertTrue(example1.compareTo(example2) > 0);
   }
   
   
}
