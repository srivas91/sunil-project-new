import java.sql.*;

public class DataInsertion {
    public static void main(String[] args) throws Exception{
            
        //Step-1: Loading Driver Class
            Class.forName("com.mysql.jdbc.Driver");
        
          //Step-2: Create database connection
          String URL="jdbc:mysql://localhost:3306/ajay_project";
          String USER="root";
          String PASS="root";
          Connection con=DriverManager.getConnection(URL,USER,PASS);
          
          //Step-3: Create Statement for execute SQL Query
          PreparedStatement ps=con.prepareStatement(" insert into workshop(id,name,title,qualification,mobnum,email)values(?,?,?,?,?,?)");
          ps.setInt(1,5);
          ps.setString(2,"dhana");
          ps.setString(3,"phython");
          ps.setString(4,"BE");
          ps.setString(5,"2345627899");
          ps.setString(6,"dhana@gmail.com");
    
          
         int  result=ps.executeUpdate();
          if(result>0)
          {
              System.out.println("data inserted successfully");
          }
          else
          {
              System.out.println("insertion failed");
          }
          
          
       
       
    }
    
}