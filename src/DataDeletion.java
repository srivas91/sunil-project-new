import java.sql.*;

public class DataDeletion {
    public static void main(String[] args) throws Exception{
            
        //Step-1: Loading Driver Class
            Class.forName("com.mysql.jdbc.Driver");
        
          //Step-2: Create database connection
          String URL="jdbc:mysql://localhost:3306/ajay_project";
          String USER="root";
          String PASS="root";
          Connection con=DriverManager.getConnection(URL,USER,PASS);
          
          //Step-3: Create Statement for execute SQL Query
          PreparedStatement ps=con.prepareStatement("delete from carsales where num=?");
          ps.setInt(1, 2);
          int result=ps.executeUpdate();
          if(result>0)
          {
              System.out.println("data deleted successfully");
          }
          else
          {
              System.out.println("deletion failed");
          }
          
          
       
       
    }
    
}
