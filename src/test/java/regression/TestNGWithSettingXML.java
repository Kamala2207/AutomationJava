package regression;


import org.testng.annotations.Test;

public class TestNGWithSettingXML {
    @Test
    public void t1() {System.out.println("Running normal t1");}
    @Test
    public void t2() {System.out.println("Running normal t2");}

    @Test(groups = {"Regression"})
    public void r1() {System.out.println("Running Regression r1");}

    @Test(groups = {"Regression"})
    public void r2() {System.out.println("Running Regression r2");}

    @Test(groups = {"Smoke"})
    public void s1() {System.out.println("Running Smoke s1");}

    @Test(groups = {"Smoke"})
    public void s2() {System.out.println("Running Smoke s2");}

    @Test(groups = {"Sanity"})
    public void S1() {System.out.println("Running Sanity S1");}

    @Test(groups = {"Sanity"})
    public void S2() {System.out.println("Running Sanity S2");}




    }

