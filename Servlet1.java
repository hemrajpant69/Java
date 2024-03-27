// index.html
<html>
<head> Registration</head>
<body> 
<form action="save" method="GET">
Roll: <inputtype="text" name ="roll">
<br>
Name : <inputtype ="text" name="name">
<br>
<inputtype="submit" value ="Register">
</form>
</body>
</html>



// Student.java


class Student{
    int roll;
    String name;
    public void setName(String name){
        this.name=name;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public String getName(){
        return name;

    }
    public int getRoll(){
        return roll;
    }
}




//Dbase.java

import java.sql.*;

class Dbase{
 public Connection connection() throws Exception{
Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection("jdbc:myql//localhost:3306/ncit","hemraj","root");


return cn;

 }
 public int insert(Student s){
    int i=0;
    Connection cn=connection();
 PreparedStatement st=cn.prepareStatement("Insert Into student values(?,?)");
 st.setString(2, s.getName());
 st.setInt(1, s.getRoll());

 i=st.executeUpdate();
 return i;



 }



}


//SaveServlet.java

import java.servlet.*;
import java.servlet.annotation.*;
import java.servlet.http.*;
import java.io.*;
@WebServlet("/save")

class SaveServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletExecption{

int roll=Integer.parseInt(req.getParameter("roll"));
String name=req.getParameter("name");
PrintWriter out=res.getWriter();
Student st;
st.setName(name);
st.setRoll(roll);
Dbase d;
int a=d.insert(st);
RequestDispatcher rd=req.requestDispatcher("/index.html");
if(a>0){
 out.println("<p>Success </p>");
 rd.include(req,res);


}else{
    ut.println("<p>failed </p>");
 rd.include(req,res);



}



}


}