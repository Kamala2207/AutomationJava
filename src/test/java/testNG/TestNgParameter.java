package testNG;


import org.junit.Test;
import org.testng.annotations.Parameters;

public class TestNgParameter {
    @Test
   @Parameters
    ({"id","name"})
    public void getIdName(int id, String name)
    {
        System.out.println("Getting values from .xml file" + id+ " "+ name);
    }
}
