import java.sql.*;
public class DataStore implements MyInterface{
    static Connection con=null;
   public static Connection getConnection()
   {
       try
       {
       //Step-1: Loading Driver Class
            Class.forName("com.mysql.jdbc.Driver");
        
          //Step-2: Create database connection
          String URL="jdbc:mysql://localhost:3306/ajay_project";
          String USER="root";
          String PASS="root";
          con=DriverManager.getConnection(URL,USER,PASS);
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
          }
                  return con;
   }
   
   public int saveWorkshop(Workshop obj)
   {
      int  result=0;
       con=getConnection();
       try
       {
        PreparedStatement ps=con.prepareStatement("insert into workshop(id,name)values(?,?)");
          ps.setInt(1, obj.getId());
          ps.setString(2,obj.getName());
          
          result=ps.executeUpdate();
          
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
       return result;
   }

    @Override
    public int deleteWorkshop(int id) {
        int  result=0;
       con=getConnection();
       try
       {
        PreparedStatement ps=con.prepareStatement("delete from workshop where id=?");
          ps.setInt(1, 106);
          result=ps.executeUpdate();
          if(result>0)
          {
              System.out.println("data deleted successfully");
          }
          else
          {
              System.out.println("deletion failed");
          }
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
       return result;
    }

    @Override
    public int updateWorkshop(int id) {
         int  result=0;
       con=getConnection();
       try
       {
        PreparedStatement ps=con.prepareStatement("update workshop set name=? where id=?");
          ps.setString(1,"krishna");
          ps.setInt(2,id);
          result=ps.executeUpdate();
          if(result>0)
          {
              System.out.println("data updated successfully");
          }
          else
          {
              System.out.println("updation failed");
          }
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
       return result;
        
    }

    @Override
    public void viewAllWorkshop() {
        
    }
}
