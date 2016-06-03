package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class shoppingcart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"images/i12.jpg\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div align=\"center\">\n");
      out.write("  <pre>&nbsp;\n");
      out.write("</pre>\n");
      out.write("</div>\n");
      out.write("<pre><div align=\"center\">\n");
      out.write("<table width=\"515\" border=\"0\" align=\"center\" background=\"images/i19.jpg\" bgcolor=\"#0066FF\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <th width=\"509\" height=\"\"  scope=\"col\"><div><div align=\"left\"><p align=\"center\">Shopping Cart</p><p>Username:               <input type=\"text\" name=\"textfield\" id=\"textfield\" /></p></div><form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n");
      out.write("          </div><div align=\"left\">List Of Items: </div>\n");
      out.write("          </th></tr>\n");
      out.write("  \n");
 int rw=0;
int total=0;
int price=0;
   String name; int id;
      try {

       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:mydata");
       Statement st=con.createStatement();
      String s2="select * from orderdetail";
      ResultSet rs=st.executeQuery(s2);
    //  out.println("<table border=1><center>");

      while(rs.next())
            {// rs.getInt(1);
              name=rs.getString(5);
             price=rs.getInt(6);
             total+=price;
          out.println("<tr >");

          System.out.println("Hello");
                out.println("<td >"+name+"</td>");
                out.println("<td>"+price+"</td>");

             out.println("<td><a href=delete.jsp?id="+price+">delete</a></td>");
              rw=rs.getRow();

       out.println("</tr>");
      }

 //out.println("</table>");

 /*

while(rs.next())
{
    String name=rs.getString(5);
    out.print("<td>rs.getString(5)</td>");

         rw=rs.getRow();
          //out.println(rw);
         out.print("&nbsp;&nbsp;<a href=delete.jsp?name="+name+">Remove Item</a>");
         out.println("");


    }*/
           }
catch (Exception e)
{
    System.out.println(e);
}

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td> <div align=\"left\">Total Item on our cart: ");
 out.println(rw);
      out.write("\n");
      out.write("        <div align=\"left\">Total price:");
 out.println(total);
      out.write("\n");
      out.write("<input type=\"submit\" name=\"button\" id=\"button\" value=\"Add more item\" />    <input type=\"submit\" name=\"button2\" id=\"button2\" value=\"Check Out\" />\n");
      out.write("        </td>            <br /></p>\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</pre>\n");
      out.write("</body>\n");
      out.write("</html>");
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
