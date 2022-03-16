import java.sql.*;

public class DataConnection {
    public static void main(String[] args) throws Exception{
            
        //Step-1: Loading Driver Class
            Class.forName("com.mysql.jdbc.Driver");
        
          //Step-2: Create database connection
          String URL="jdbc:mysql://localhost:3306/ajay_project";
          String USER="root";
          String PASS="root";
          Connection con=DriverManager.getConnection(URL,USER,PASS);
          
          //Step-3: Create Statement for execute SQL Query
          Statement stmt=con.createStatement();
          
          //Step-4: Execute SQL Query
          String query="select * from workshop";
          ResultSet rs=stmt.executeQuery(query);
          while(rs.next())
          {
              System.out.println(" id is"+rs.getInt("id"));
              System.out.println("student name is"+rs.getString("name"));
          }
          
          
       
       
    }
    
}
