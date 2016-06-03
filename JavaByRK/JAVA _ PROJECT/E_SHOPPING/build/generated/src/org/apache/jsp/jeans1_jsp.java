package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class jeans1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int i1,i2,d1,d2;
     String s; 
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
      out.write("<body>\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "afterloginheader.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "afterloginheader3.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <br><br><br><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>\n");
      out.write("\n");
      out.write("        <table width=\"1099\" height=\"378\" align=\"right\"><tr><td>\n");
      out.write("<img src=\"images/14.PNG\" width=\"300\" height=\"400\" align=\"left\"><b><font size=\"+3\" color=\"white\">&nbsp;&nbsp;DETAILS</font>\n");
      out.write("\n");
      out.write("    <ul ><font size=\"+2\" color=\"white\">\n");
      out.write("\n");
      out.write("<li>BRAND: WRANGLER </li>\n");
      out.write("<li>Size: 32,34,36</li>\n");
      out.write("<li>Color: Dark blue,black</li>\n");
      out.write("</font>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write(" <p>&nbsp;</p>&nbsp;&nbsp;\n");
      out.write("<font color=\"red\" size=\"+3\">Rs 1679</font>\n");
      out.write("<br>\n");
      out.write(" \n");
      out.write(" ");
      out.write('\n');


   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection con=DriverManager.getConnection("jdbc:odbc:mydata");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from JEANS where JEAN_ID=1 ");
		while(rs.next())
              {
                  i1=rs.getInt(1);
                  s=rs.getString(3);
                  i2=rs.getInt(6);
                }
                session.setAttribute("jean2",i1);
                d1=(Integer)session.getAttribute("garment");
                d2=(Integer)session.getAttribute("jean");


      out.write("\n");
      out.write("<form action=\"Cart.jsp\">\n");
      out.write("    <input type=\"hidden\" name=\"id1\" value=\"");
out.println(d1);
      out.write("\"/>\n");
      out.write("    <input type=\"hidden\" name=\"id2\" value=\"");
out.println(d2);
      out.write("\"/>\n");
      out.write("      <input type=\"hidden\" name=\"id3\" value=\"");
out.println(i1);
      out.write("\"/>\n");
      out.write("    <input type=\"hidden\" name=\"id4\" value=\"");
out.println(s);
      out.write("\"/>\n");
      out.write("    <input type=\"hidden\" name=\"id5\" value=\"");
out.println(i2);
      out.write("\"/>\n");
      out.write("\n");
      out.write("      <input type=\"Submit\" value=\"Add more item(s) to cart\"/>\n");
      out.write("</form>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <a href=dwnld.jsp?link=");
out.println(i1);
      out.write("><button>Download Image</button></a>\n");
      out.write("\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<p>&nbsp;</p>\n");
      out.write("\n");
      out.write("<p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>\n");
      out.write("<p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>\n");
      out.write("<p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\n");
      out.write("</body>\n");
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
