
package all_package;

import java.sql.*;
import java.sql.Connection;
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
        con=DriverManager.getConnection("jdbc:sqlite:poultry_Management_System.db");
        
        initialise();
    
    }
    public void initialise() throws SQLException{
    
    if(!hasData){
        
        hasData=true;
        Statement state = con.createStatement();
        ResultSet res = state.executeQuery("");
        
        if(!res.next()){
        
           Statement state2 = con.createStatement();
           state2.execute("CREATE TABALE new_user(user_id integer,"
                   + "fName varchar(60),"
                   + "lName varchar (60),"
                   + "pass_word varchar (60),"
                   + "DoB date,"
                   + "gender varchar(10),"
                   + "phone varchar (20),"
                   + "sec_Ques varchar (60),"
                   + "ansa varchar (60),"
                   + "user_type varchar (10)"
                   + "primary key integer auto_increament;");
        }
    }
    }
}
