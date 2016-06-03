package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class stiga_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int i1,i2,d1,d2,d3;
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
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "afterloginheader.jsp", out, false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "afterloginheader3.jsp", out, false);
      out.write("\r\n");
      out.write("    <br><br><br><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>\r\n");
      out.write("        \r\n");
      out.write("        <table width=\"1099\" height=\"378\" align=\"right\"   ><tr><td>   \r\n");
      out.write("<img src=\"New Folder (3)/stiga.jpg\" width=\"250\" height=\"300\" align=\"left\">\r\n");
      out.write("<b><font size=\"+3\">&nbsp;&nbsp;Stiga® Sandy Table Tennis Racket</font>\r\n");
      out.write("\r\n");
      out.write("<ul><font size=\"+2\"color=\"white\">\r\n");
      out.write("<li>Brand: Stiga</li>\r\n");
      out.write("<li>Sport: Table Tennis </li>\r\n");
      out.write("<li>Warranty:  Manufacturer repair/replacement warranty against rubber detachmen</li>\r\n");
      out.write("<li>Speed: 7</li>\r\n");
      out.write("<li>Weight: 200 grams </li></font>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("&nbsp;&nbsp;\r\n");
      out.write("<font color=\"red\" size=\"+3\">Rs 1199</font>\r\n");
      out.write("<br>\r\n");
      out.write("&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("</b>\r\n");
      out.write("\r\n");
      out.write("  ");
      out.write("    \r\n");

   try{
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection con=DriverManager.getConnection("jdbc:odbc:mydata");		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from TT_RACKET where FBAT_NAME='Stiga® Sandy Table Tennis Racket' ");
		while(rs.next())
              {
                  i1=rs.getInt(1); 
                  s=rs.getString(3);
                  i2=rs.getInt(6);   
                      
                }
                session.setAttribute("stiga",i1);
                 d1=(Integer)session.getAttribute("sport");
                 d2=(Integer)session.getAttribute("tennis");
                 d3=(Integer)session.getAttribute("racket");
                               }
   catch(Exception ex){}

      out.write(" <form action=\"Cart\">\r\n");
      out.write("    <input type=\"hidden\" name=\"id1\" value=\"");
out.println(d1);
      out.write("\"/>\r\n");
      out.write("    <input type=\"hidden\" name=\"id2\" value=\"");
out.println(d2);
      out.write("\"/>\r\n");
      out.write("    <input type=\"hidden\" name=\"id3\" value=\"");
out.println(d3);
      out.write("\"/>\r\n");
      out.write("    <input type=\"hidden\" name=\"id4\" value=\"");
out.println(i1);
      out.write("\"/>\r\n");
      out.write("    <input type=\"hidden\" name=\"id5\" value=\"");
out.println(s);
      out.write("\"/>\r\n");
      out.write("    <input type=\"hidden\" name=\"id6\" value=\"");
out.println(i2);
      out.write("\"/>\r\n");
      out.write("    \r\n");
      out.write("    <input type=\"Submit\" value=\"Add more item(s) to cart\"/>      \r\n");
      out.write("</form>\r\n");
      out.write("    <blockquote><blockquote><blockquote><blockquote><blockquote><blockquote>\r\n");
      out.write("    <a href=dwnldtbat.jsp?link=");
out.println(i1);
      out.write("><button>Download Image</button></a>\r\n");
      out.write("</blockquote></blockquote></blockquote></blockquote></blockquote></blockquote>\r\n");
      out.write("</td></tr></table>\r\n");
      out.write("<br><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
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
