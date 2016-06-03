package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ball_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int i1; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/footer.html");
  }

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

      out.write("<html >\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "afterloginheader.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "afterloginheader3.jsp", out, false);
      out.write("\n");
      out.write("    <br><br>\n");
      out.write("<p>&nbsp;</p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<strong><center><u><font face=\"comic sans ms\"color=\"white\" size=\"+5\">Balls</u></strong></font></center>\n");
      out.write("    <br><br><br><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>\n");
      out.write("<table width=\"1099\" height=\"378\" align=\"right\">\n");
      out.write("  <tr>\n");
      out.write("      <td>&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"red.jsp\"></a><a href=\"\"><img src=\"New Folder (3)/SeG_Combo_20_M_1_2x.jpg\"width=\"151\" height=\"200\" align=\"left\"></a><br>&nbsp;&nbsp;<b>&nbsp;&nbsp;<font color=\"white\" face=\"comic sans ms\" >Cosco Cricket Tennis Tuff</font> <br>&nbsp;&nbsp;&nbsp;&nbsp;Balls (pack of 1 dozen)\n");
      out.write("<br><br><br><br><br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"red.jsp\"><button>View Details >></button></b></a></td>\n");
      out.write("\n");
      out.write("\t<td >&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"club.jsp\"><img src=\"New Folder (3)/101925_Hansraj_HRM_M_1_2X.jpg\"width=\"151\" height=\"200\"  align=\"left\"></a>&nbsp;&nbsp;<b>HRM Cricket Ball Club Leather <br>&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;Cricket Ball\n");
      out.write("\t<br><br><br><br><br><br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t<a href=\"club.jsp\"><button>View Details >></button></b></a></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("  <td ><a href=\"green.jsp\"><img src=\"New Folder (3)/SeG_CSY_1_M_1_2x.jpg\"  width=\"151\" height=\"200\" align=\"left\"></a><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Cosco Cricket Tennis Balls (light weight)<br>&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; (Pack of 6)<br><br><br><br><br><br><br><br>\n");
      out.write("\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"green.jsp\"><button>View Details >></button></b></a></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("<td><b>&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"leather.jsp\"><img src=\"New Folder (3)/101926_Hansraj_HRM_M_1_2X.jpg\"width=\"151\" height=\"200\"  align=\"left\"></a>&nbsp;&nbsp;HRM Cricket Ball Practice Soft <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Cricket Ball\n");
      out.write("<br><br><br><br><br><br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"leather.jsp\"><button>View Details >></button></a></td>\n");
      out.write("  </b></tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<p>&nbsp;</p>\n");
      out.write("<p>&nbsp;</p><p><p>&nbsp;</p>\n");
      out.write("<p>&nbsp;</p><p><p>&nbsp;</p>\n");
      out.write("<p>&nbsp;</p><p><p>&nbsp;</p>\n");
      out.write("<p>&nbsp;</p><p><p>&nbsp;</p>\n");
      out.write("<p>&nbsp;</p><p>&nbsp;\n");
      out.write("<br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  ");
      out.write('\n');


   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from CRICKET where CITEM_NAME='Ball' ");
		while(rs.next())
              {
                  i1=rs.getInt(1);
                }
                session.setAttribute("ball",i1);

      out.write('\n');
      out.write('\n');
      out.write("<!--\n");
      out.write("To change this template, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title></title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  </head>\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("#divx\n");
      out.write("{\n");
      out.write("width:1330px;\n");
      out.write("height:150px;\n");
      out.write("background-image:url(\"images/i9.jpg\");\n");
      out.write("/*-moz-box-shadow: 10px 10px 5px #888888;  Firefox 3.6 and earlier */\n");
      out.write("-webkit-box-shadow: 10px 10px 5px #FFFF00;\n");
      out.write("\n");
      out.write("}\n");
      out.write("ul,li {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("ul {\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("li {\n");
      out.write("    display: inline;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:hover, a:focus {\n");
      out.write("    z-index: 200;\n");
      out.write("      /* bring to top when the mouse is over or\n");
      out.write("         when it has the focus (for keyboard navigation) */\n");
      out.write("}\n");
      out.write("a img {\n");
      out.write("    border: none;\n");
      out.write("    -webkit-transition: all .2s;\n");
      out.write("    -webkit-transform-origin: top;\n");
      out.write("}\n");
      out.write("a:hover img, a:focus img {\n");
      out.write("    -webkit-transform: scale(2);\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("  <body>\n");
      out.write("      <br><br><br><br><br><br><br><br><br>\n");
      out.write("      <center><font face=\"comic sans ms\" color=\"white\" size=\"5\">GO BACK TO MAIN WEBSITE PAGE</font><br><br><a href=\"index.jsp\">\n");
      out.write("           <img src=\"images/back.bmp\" width=\"50\" height=\"50\" />\n");
      out.write("</a></center>\n");
      out.write("      <br><br>\n");
      out.write("      <center>\n");
      out.write("      <a href=\"www.facebook.com\"><img src=\"images/icon/fb.jpg\" width=\"50\" height=\"50\" /></a>&nbsp;&nbsp;&nbsp;\n");
      out.write(" <a href=\"www.twitter.com\"><img src=\"images/icon/twtr.jpg\" width=\"50\" height=\"50\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write(" <a href=\"www.apple.com\"><img src=\"images/icon/apple.jpg\" width=\"50\" height=\"50\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"www.google.com\"><img src=\"images/icon/goog.jpg\" width=\"50\" height=\"50\" /></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"www.google+.com\"><img src=\"images/icon/g+.jpg\" width=\"50\" height=\"50\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"www.gmail.com\"><img src=\"images/icon/gmail.jpg\" width=\"50\" height=\"50\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"www.microsoft.com\"><img src=\"images/icon/msl.jpg\" width=\"50\" height=\"50\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"www.opera.com\"><img src=\"images/icon/opera.jpg\" width=\"50\" height=\"50\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"www.youtube.com\"><img src=\"images/icon/yt.jpg\" width=\"50\" height=\"50\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"www.zurb.com\"><img src=\"images/icon/zurb.png\" width=\"50\" height=\"50\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"www.notable.com\"><img src=\"images/icon/nt.png\" width=\"50\" height=\"50\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"www.infinity.com\"><img src=\"images/icon/lfm.png\" width=\"50\" height=\"50\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"www.linkdin.com\"><img src=\"images/icon/ld.png\" width=\"50\" height=\"50\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"www.googlemap.com\"><img src=\"images/icon/gmap.jpg\" width=\"50\" height=\"50\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"www.adobe.com\"><img src=\"images/icon/adb.jpg\" width=\"50\" height=\"50\" /></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("      </center>\n");
      out.write("      \n");
      out.write("<br><br>\n");
      out.write("<font face=\"comic sans ms\" color=\"white\" size=\"4\">\n");
      out.write("All trademarks, logos and names are properties of their respective owners. All rights\n");
      out.write("reserved. Â© Copyright 2012 teemkart.com. Developed and Designed by Ricktam, Devender, Tarun, Arindam, Prakash, Sapna, Deepika and Sweta under the guidance of Divya madam(CMC).\n");
      out.write("            <br><br>\n");
      out.write("  CITIES WE COVER:&nbsp;&nbsp;&nbsp;&nbsp; Mumbai  &nbsp;&nbsp;|&nbsp;&nbsp;\n");
      out.write("  Bangalore &nbsp;&nbsp; | &nbsp;&nbsp;\n");
      out.write("  Delhi&nbsp;&nbsp;  |&nbsp;&nbsp;\n");
      out.write("  Pune &nbsp; | &nbsp;&nbsp;\n");
      out.write("  Hyderabad &nbsp;&nbsp; |&nbsp;&nbsp;\n");
      out.write("  Ahmedabad &nbsp;&nbsp; | &nbsp;&nbsp;\n");
      out.write("  Kolkata &nbsp;&nbsp; |&nbsp;&nbsp;\n");
      out.write("  Goa&nbsp; &nbsp; | &nbsp;&nbsp;\n");
      out.write("  Jaipur&nbsp; &nbsp; |&nbsp;&nbsp;\n");
      out.write("  Chandigarh&nbsp;&nbsp;| &nbsp;&nbsp;Jaipur&nbsp;&nbsp;|&nbsp;&nbsp;Chennai\n");
      out.write("</font>\n");
      out.write("<br><br><br>\n");
      out.write("<div id=\"divx\">\n");
      out.write("    <form action=\"\">\n");
      out.write("    <center><font face=\"comic sans ms\" color=\"white\" size=\"5\">QUERY FORM</font><BR><BR>\n");
      out.write("        <font face=\"comic sans ms\" color=\"white\" size=\"4\">\n");
      out.write("            Name:&nbsp;&nbsp;<input type=\"text\" name=\"name\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        Email_Id:&nbsp;&nbsp;<input type=\"email\" name=\"eid\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        Phn No.:&nbsp;&nbsp;<input type=\"text\" name=\"no\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        Query:&nbsp;&nbsp;<TEXTAREA NAME=\"SEARCH\" ROWS=3 COLS=50></TEXTAREA>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <br><br><input type=\"submit\" value=\"SUBMIT QUERY\">\n");
      out.write("</font>\n");
      out.write("</center></form></div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write(" <!-- <img src=\"images/combine.jpg\" usemap=ricktam>\n");
      out.write("\n");
      out.write("<map name=\"ricktam\">\n");
      out.write("\n");
      out.write("<area shape=\"square\" coords=\"0,0,175,175\" href=\"\">\n");
      out.write("<area shape=\"square\" coords=\"0,175,350,350\" href=\"\">\n");
      out.write("<area shape=\"square\" coords=\"0,350,475,475\" href=\"\">\n");
      out.write("\n");
      out.write("</map>-->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("   ");
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
