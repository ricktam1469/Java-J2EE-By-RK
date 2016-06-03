package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class sendpass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <font color=\"red\" size=\"6.5\"><center><b>YOUR PASSWORD HAS BEEN SEND <br><p>TO EMAIL_ID.....<br><p>CHECK IT FRIEND THEN...<b></center></font>\n");
      out.write("<br><br><br><br><br>\n");
      out.write("\n");
      out.write("<font face=\"arial\"color=\"brown\" size=\"3\"><center>PLEASE LOGIN TO CONTINUE..</center></font>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<center>\n");
      out.write("<a href=\"login.jsp\"><input type=\"submit\"value=\"Login\"size=20\"></a></center>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br><br><br><br><br><br><br><br><br><br>\n");
      out.write("<center>GO BACK TO MAIN WEBSITE PAGE<br><br><a href=\"main page.html\">\n");
      out.write("<input type=\"submit\"value=\"GO BACK\"size=20\"></a></center>\n");
      out.write("\n");
      out.write("\n");
 String uname=request.getParameter("uname");
String eid=request.getParameter("eid");

ServletContext context=getServletConfig().getServletContext();


try{
//Cookie c1=new Cookie("tom","007");
//res.addCookie(c1);
//out.println(uname+pass);

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:tomdsn");
Statement st=con.createStatement();

//String s1="select * from login where uname='"+uname+"' and pass='" +pass+"'";
//out.println(s1);

ResultSet rs=st.executeQuery("select * from login where uname='"+uname+"'");

if(rs.next())
{
out.println(rs.getString(2));
context.setAttribute("my",uname);
//res.sendRedirect("go1");
//res.sendRedirect("gov3");
}
else {
out.println("Going to go2");
//res.sendRedirect("go2");
}
}
catch(Exception e)
{out.println(e);
}

      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
