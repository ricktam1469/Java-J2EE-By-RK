package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class cricket_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int i1;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<html >\r\n");
      out.write("<body>\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "afterloginheader.jsp", out, false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "afterloginheader3.jsp", out, false);
      out.write("\r\n");
      out.write("    <br><br>\r\n");
      out.write("<br><p>&nbsp;</p>\r\n");
      out.write("<br><p>&nbsp;</p><br><br><p>&nbsp;</p><br><p>&nbsp;</p><br><p>&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("<table cellspacing=\"30\">\r\n");
      out.write(" \r\n");
      out.write("  <tr>\r\n");
      out.write("    <th width=\"100\" ></th>\r\n");
      out.write("    <td><font face=\"arial\"color=\"red\" size=\"6\"><b>Cricket</b></font></td>\r\n");
      out.write("  </tr><br>\r\n");
      out.write("  <tr>\r\n");
      out.write("  <th>   </th>\r\n");
      out.write("    <td><ul>\r\n");
      out.write("      <li><a href=\"bat.jsp\"><h2><b>Bats</b></h2></a></li>\r\n");
      out.write("    </ul></td>\r\n");
      out.write(" \r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>   </th>");
      out.write("\r\n");
      out.write("    <td><ul>\r\n");
      out.write("      <li><a href=\"ball.jsp\"><h2><b>Balls</b></h2></a></li>\r\n");
      out.write("    </ul></td>\r\n");
      out.write(" \r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br><p>&nbsp;</p><br><p>&nbsp;</p><br><p>&nbsp;</p><br><p>&nbsp;</p><br><p>&nbsp;</p><br><p>&nbsp;</p>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<br><p>&nbsp;</p>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("    \r\n");

   
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection con=DriverManager.getConnection("jdbc:odbc:mydata");		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from SPORTS_TABLE where SPRODUCT_NAME='Cricket' ");
		while(rs.next())
              {
                  i1=rs.getInt(1);   
                }
                session.setAttribute("cricket",i1);

      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write(" ");
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
