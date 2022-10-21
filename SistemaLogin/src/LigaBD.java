
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LigaBD {
    
    public static Connection ligacao(){
        
        String url = "jdbc:mysql://localhost:3306/rhcencal";
        String user = "root";
        String password = "";
        Connection liga = null;
        try {
            liga = DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Erro na tentativa de ligação à base de dados");
        }
        return liga; 
    }
    public static void registaUtilizador(){
        
        
    }
    
    
    
    
}
