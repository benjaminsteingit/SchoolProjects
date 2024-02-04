import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*Test class for SpherocylinderList.
*/

public class SpherocylinderListTest {


   /** Fixture initialization (common initialization for all tests). **/
   @Before public void setUp() {
   }

   /**
   *Test method for the getName method.
   */
   
   @Test public void getNameTest() {
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = new Spherocylinder[2];
      int myExampleNumber = myExampleArray.length;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber); 
      
      Assert.assertEquals(myExampleList.getName(), myExampleName);
   
   }
   
   /**
   *Test method for the numberOfSpherocylinders method.
   */
   
   @Test public void numberOfSpherocylindersTest() {
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = new Spherocylinder[2];
      int myExampleNumber = myExampleArray.length;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber); 
      
      Assert.assertEquals(myExampleList.numberOfSpherocylinders(), 
         myExampleArray.length);
   
   }
   
   /**
   *Test method for the totalSurfaceArea method.
   */
   
   @Test public void totalSurfaceAreaTest() {
      Spherocylinder example = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example3 = new Spherocylinder("exampleTest", 1.5, 4.25);
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = {example, example2, example3};
      int myExampleNumber = myExampleArray.length;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber);
         
      Assert.assertEquals(myExampleList.totalSurfaceArea(), 
         myExampleList.totalSurfaceArea(), .00001);  
   
   }
   
   /**
   *Test method for the totalVolume method.
   */
   
   @Test public void totalVolumeTest() {
      Spherocylinder example = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example3 = new Spherocylinder("exampleTest", 1.5, 4.25);
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = {example, example2, example3};
      int myExampleNumber = myExampleArray.length;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber);
         
      Assert.assertEquals(myExampleList.totalVolume(), 
         myExampleList.totalVolume(), .00001);  
   
   }
   
   /**
   *Test method for the averageSurfaceArea method.
   */
   
   @Test public void averageSurfaceAreaTest() {
      Spherocylinder example = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example3 = new Spherocylinder("exampleTest", 1.5, 4.25);
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = {example, example2, example3};
      int myExampleNumber = myExampleArray.length;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber);
         
      Assert.assertEquals(myExampleList.averageSurfaceArea(), 
         myExampleList.averageSurfaceArea(), .00001);  
   
   }
   
   /**
   *Test method for the averageVolume method.
   */
   
   @Test public void averageVolumeTest() {
      Spherocylinder example = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example3 = new Spherocylinder("exampleTest", 1.5, 4.25);
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = {example, example2, example3};
      int myExampleNumber = myExampleArray.length;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber);
         
      Assert.assertEquals(myExampleList.averageVolume(), 
         myExampleList.averageVolume(), .00001);  
   
   }
   
/////////////////

   /**
   *Test method for the toString method.
   */

   @Test public void toStringTest()  {
      Spherocylinder example = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example3 = new Spherocylinder("exampleTest", 1.5, 4.25);
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = {example, example2, example3};
      int myExampleNumber = myExampleArray.length;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber);
         
      System.out.print(myExampleList.toString());

   }

////////////////   

   /**
   *Test method for the getList method.
   */ 

   @Test public void getListTest() {
      Spherocylinder example = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("exampleTest", 0.5, 0.25);
      Spherocylinder example3 = new Spherocylinder("exampleTest", 1.5, 4.25);
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = {example, example2, example3};
      int myExampleNumber = myExampleArray.length;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber);
         
      Assert.assertArrayEquals(myExampleList.getList(), 
         myExampleList.getList());
   
   
   }

/**
*Test method for the addSpherocylinder method.
*/ 

   @Test public void addSpherocylinder()  {
      
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = new Spherocylinder[5];
      int myExampleNumber = 4;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber);
         
      myExampleList.addSpherocylinder("exampleTest", 1.5, 5.25);
      
      Assert.assertArrayEquals(myExampleList.getList(), 
         myExampleList.getList());         
   }
    
/**
*Test method for the findSpherocylinder method.
*/ 

   @Test public void findSpherocylinder() {
      Spherocylinder example = new Spherocylinder("exampleTest1", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("exampleTest2", 0.5, 0.25);
      Spherocylinder example3 = new Spherocylinder("exampleTest3", 1.5, 4.25);
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = {example, example2, example3};
      int myExampleNumber = myExampleArray.length;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber);
         
      Assert.assertEquals(myExampleList.findSpherocylinder(
         "exampleTest1"), example);
      Assert.assertEquals(myExampleList.findSpherocylinder(
         "exAmpletest3"), example3);   
      Assert.assertEquals(myExampleList.findSpherocylinder("exampleTe1"), null);
        
   }
/**
*Test method for deleteSpherocylinder.
*/

   @Test public void deleteSpherocylinder() {
      Spherocylinder example = new Spherocylinder("exampleTest1", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("exampleTest2", 0.5, 0.25);
      Spherocylinder example3 = new Spherocylinder("exampleTest3", 1.5, 4.25);
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = {example, example2, example3};
      int myExampleNumber = myExampleArray.length;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber);
      
            
      Assert.assertEquals(myExampleList.deleteSpherocylinder(
         "exampleTe"), null);
         
      Assert.assertEquals(myExampleList.deleteSpherocylinder(
         "exampleTest3"), example3);
         
      Assert.assertEquals(myExampleList.numberOfSpherocylinders(), 2);
      
      Assert.assertEquals(myExampleList.deleteSpherocylinder(
         "exampleTest1"), example);
   
   
   }

/**
*Test method for the editSpherocylinder method.
*/

   @Test public void editSpherocylinderTest() {
   
      Spherocylinder example = new Spherocylinder("exampleTest1", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("exampleTest2", 0.5, 0.25);
      Spherocylinder example3 = new Spherocylinder("exampleTest3", 1.5, 4.25);
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = {example, example2, example3};
      int myExampleNumber = myExampleArray.length;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber);
         
      Assert.assertEquals(myExampleList.editSpherocylinder(
         "exampleTest3", 0.5, 0.25), true);
      Assert.assertEquals(myExampleList.editSpherocylinder(
         "exampleTest4", 0.5, 0.25), false);
   
   
   
   }

/**
*Test method for the findSpherocylinderWithLargestVolume method.
*/

   @Test public void largestVolumeTest() {
   
      Spherocylinder example = new Spherocylinder("exampleTest1", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("exampleTest2", 4.5, 5.25);
      Spherocylinder example3 = new Spherocylinder("exampleTest3", 1.5, 4.25);
      
      String myExampleName = "My Example Name";
      Spherocylinder[] myExampleArray = {example, example2, example3};
      int myExampleNumber = myExampleArray.length;
      SpherocylinderList myExampleList = new SpherocylinderList(
         myExampleName, myExampleArray, myExampleNumber);
      
      String myExampleName2 = "My Example Name2";
      Spherocylinder[] myExampleArray2 = new Spherocylinder[3];
      int myExampleNumber2 = myExampleArray2.length;
      SpherocylinderList myExampleList2 = new SpherocylinderList(
         myExampleName2, myExampleArray2, myExampleNumber2);
         
      Assert.assertEquals(myExampleList.findSpherocylinderWithLargestVolume(),
          example2);
      Assert.assertEquals(myExampleList2.findSpherocylinderWithLargestVolume(),
          null);
      
                          
   
   }

}
