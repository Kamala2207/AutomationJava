package classwork;

import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    @Test
    public void uservalidpasswordinvalid(){
        System.out.println("Open Browser");
        Assert.assertTrue(false);

    }

    @Test
    public void close(){
        System.out.println("close Browser");
        Assert.assertTrue(true);
        Assert.assertFalse(true);


    }

    @Test
    public void add(){
        int result=10;
        int a=4,b=6;
        Assert.assertEquals(result,a+b);
    }
}
