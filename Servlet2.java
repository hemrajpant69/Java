//index.html

<html>
<body>
<form action="square" method="GET">
Enter a Number <inputtype="text" name="num">
<br>
<inputtype="submit" value="Click">
</form>
</body>
</html>



//Square.java

import java.servlet.*;
import java.servlet.annotation.*;
import java.servlet.http.*;
import java.io.*;
@WebServlet("/square")


public class Servlet2 extends HttpServlet{
    public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletExecption{
        int a=Integer.parseInt(req.getParameter("num"));
        int ans=a*a;
        PrintWriter out=res.getWriter();
        out.println("<p> Square =</p>"+ans);
    }
    
}
