
package all_package;
import java.sql.*;
import javax.swing.JOptionPane;

public class java_Connection {
        
        Connection conn;
        
        public static Connection ConnecrDb(){
        
            try{
        
          Class.forName("org.sqlite.JDBC");
                
                Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\oSikaNi iSraeL\\Documents\\NetBeansProjects\\Final_Poultry_Management\\poultry_management_System.sqlite");
                            return conn;
                        
        }
            catch(Exception e){
            
                 JOptionPane.showMessageDialog(null, e);
                
            }
            return null;
        
        }
    
}
