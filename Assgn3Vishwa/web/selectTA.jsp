<%-- 
    Document   : selectTA
    Created on : Jun 3, 2016, 11:27:23 PM
    Author     : computer
--%><%@page import="java.sql.*"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <form action="select">
       Select Subject:  <input type="text" name="sub" placeholder="sub" />
 <input type="Select TA" name="Submit"/><br>
 </form>
       <%!String s;%>
    <%
  
 try{ 
    
          
    
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection con=DriverManager.getConnection("jdbc:odbc:vishwaDSN");
		Statement st=con.createStatement();
		 ResultSet rs=st.executeQuery("select * from TA");
      while(rs.next())
{

if(rs.getString(3).equals("PhD"))
{
    
}
else if(rs.getString(3).equals("PG")){
    
}
else{
    
}
}
  }
catch(Exception e){}

%>
    </body>
</html>
