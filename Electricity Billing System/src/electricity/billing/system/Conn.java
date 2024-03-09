package electricity.billing.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electric_bill", "root","123456789b");
            s = c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
