package testNG;

import org.testng.annotations.*;

public class TestNG {
    @BeforeMethod

    public void beforeTest(){System.out.println("BeforeTest"); }

    @Test
    public void test1(){System.out.println("test1");}

    @Test
    public void test2(){System.out.println("test2");}

    @AfterTest
    public void AfterTest(){System.out.println("AfterTest");}

    @BeforeMethod
    public void beforeMethod(){System.out.println("BeforeMethod");}

    @AfterMethod
    public void AfterMethod(){System.out.println("AfterMethod");}


}
