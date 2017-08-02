
package all_package;

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
public class sqlite_connection {
    
    private static Connection con;
    private static boolean hasData=false;
    
    public ResultSet displayusers() throws ClassNotFoundException, SQLException{
       if(con==null){
       
       getConnection();
               }
       Statement state = con.createStatement();
    
    
       ResultSet res = state.executeQuery("Select");
       return res;
    }
    
    private void getConnection() throws ClassNotFoundException, SQLException{
    
        Class.forName("org.sqlite.JDBC");
        con=DriverManager.getConnection("jdbc:sqlite:poultry_Management_System");
        
        initialise();
    
    }
    public void initialise() throws SQLException{
    
    if(!hasData){
        
        hasData=true;
        Statement state = con.createStatement();
        ResultSet res = state.executeQuery("");
        
        if(!res.next()){
        
            JOptionPane.showMessageDialog(null,"Building the user Table");
        }
    }
    }
}
