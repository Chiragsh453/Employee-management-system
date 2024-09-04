
package employee.management.system;
import java.sql.*;


public class Conn {
       Statement s;
    Connection c;
    public Conn()
    {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c= DriverManager.getConnection("jdbc:mysql:///employeemanagemnet","root","chirag8755");
        s=c.createStatement();
    }catch(Exception e)
      {
      
      }
    }
    
}
