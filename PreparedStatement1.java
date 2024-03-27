
import java.util.*;
import java.sql.*;
public class PreparedStatement1 {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
    String url="jdbc:mysql//localhost:3306/ncit";
    String uname="root";
    String psd="admin";
    Class.forName("com.mysql.jdbc.Driver");
    Connection cn=DriverManager.getConnection(url, uname, psd);
    PreparedStatement st=cn.prepareStatement("Insert into Student values(?,?,?)");
    int count =0;
    while(true){
     System.out.println("Enter Roll ");
     int roll=scan.nextInt();
     System.out.println("Enter Name ");
     String name=scan.next();
     System.out.println("Enter faculty");
     String faculty=scan.next();
     st.setString(2, name);
     st.setInt(1,roll);
     st.setString(3,faculty);
     count++;
     System.out.println("Do you want to continue inserting type y for yes and n for no");
     String choice=scan.next();
     if(choice.equalsIgnoreCase("y")){
        break;

     }


    }
    System.out.println("Total Data inserted="+count);
    scan.close();
    cn.close();

        
    }
    
}
