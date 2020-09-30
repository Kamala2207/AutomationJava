package classwork;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class _ReadMySQL {


        @Test

        public void verify_select_firstNam_lastname(){


        int id =1;
        String fname = "Kamala";
        String lname = "Lama";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "kamala","kamala");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employees where id =" + id);
            rs.next();
            String actualFName = rs.getString("first_name"); //column first_name
            String actualLName = rs.getString("last_name"); //column last_name
            Assert.assertEquals(fname, actualFName);
            Assert.assertEquals(lname, actualLName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
