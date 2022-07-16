
package learnAttributes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestAttributes {
  @Test(priority=1 ,invocationCount =2)
  public void f() {
	  System.out.println("Saffron");
  }
  
  @Test(priority=2 ,invocationCount=2, threadPoolSize=2)
  public void flag1() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("White");
  }
  
  @Test(priority=3)
  public void flag2() {
	  System.out.println("Green");
  }
  
  @Test(enabled=false)
  public void f1() {
	  System.out.println("Pride");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
