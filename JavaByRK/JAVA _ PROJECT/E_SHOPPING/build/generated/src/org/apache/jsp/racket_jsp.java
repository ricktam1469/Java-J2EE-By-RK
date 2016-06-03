package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class racket_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html >\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
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
      out.write("<p>&nbsp;</p>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<strong><font color=\"red\" size=\"+5\"><center>T.T Rackets</center></strong></font>\r\n");
      out.write("<br><br><br><p>&nbsp;</p><p>&nbsp;</p>\r\n");
      out.write("<table width=\"1099\" height=\"378\" align=\"right\"  cellspacing=\"20\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("     <td>&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"butterfly.jsp\"><img src=\"New Folder (3)/Butterfly.jpg\"width=\"151\" height=\"200\" align=\"left\"></a>&nbsp;&nbsp;<b>&nbsp;&nbsp;Butterfly ACM-1000 <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Table Tennis Blade\r\n");
      out.write("<br><br><br><br><br><br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"butterfly.jsp\"><button>View Details >></button></b></a></td>\r\n");
      out.write("\t\r\n");
      out.write("\t<td >&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"racket2.jsp\"><img src=\"New Folder (3)/racket2.jpg\"width=\"151\" height=\"200\"  align=\"left\"></a>&nbsp;&nbsp;<b>Joola Smash Recreational <br>&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;Table Tennis Racket\r\n");
      out.write("\t<br><br><br><br><br><br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t<a href=\"racket2.jsp\"><button>View Details >></button></b></a></td>  \r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td ><a href=\"stiga.jsp\"><img src=\"New Folder (3)/stiga.jpg\"  width=\"151\" height=\"200\" align=\"left\"></a><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Stiga® Sandy <br>&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;Table Tennis Racket<br><br><br><br><br><br><br><br>\r\n");
      out.write("\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"stiga.jsp\"><button>View Details >></button></b></a></td>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("<td><b>&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"racket3.jsp\"><img src=\"New Folder (3)/racket3.jpg\"width=\"151\" height=\"200\"  align=\"left\"></a>&nbsp;&nbsp;JOOLA USA Python  <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Table Tennis Paddle\r\n");
      out.write("<br><br><br><br><br><br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"racket3.jsp\"><button>View Details >></button></a></td>\r\n");
      out.write("  </b></tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br><br><p>&nbsp;</p><p>&nbsp;</p><br><br><p>&nbsp;</p><p>&nbsp;</p><br><br><p>&nbsp;</p><p>&nbsp;</p><br><br><p>&nbsp;</p><p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;</p><p><p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;</p><p><p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;</p><p><p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;</p><p><p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;</p><p>&nbsp;\r\n");
      out.write("<br><br><br>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      out.write("    \r\n");

   
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection con=DriverManager.getConnection("jdbc:odbc:mydata");		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from TABLE_TENNIS where FITEM_NAME='T.T Racket' ");
		while(rs.next())
              {
                  i1=rs.getInt(1);   
                }
                session.setAttribute("racket",i1);
                


      out.write(' ');
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
