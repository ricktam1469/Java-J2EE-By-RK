package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/header.html");
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
      out.write("    <style type=\"text/css\">\n");
      out.write("#my\n");
      out.write("{\n");
      out.write("width:400px;\n");
      out.write("height:500px;\n");
      out.write("background-image:url(\"images/i14.jpg\");\n");
      out.write("-webkit-animation:tom 5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes tom\n");
      out.write("{\n");
      out.write("from {background-image:url(\"images/i3.jpg\");}\n");
      out.write("to {background-image:url(\"images/i4.jpg\");}}\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    \n");

int total=0;
int price=0;
      try {

       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:mydata");
       Statement st=con.createStatement();
      String s2="select * from orderdetail";
      ResultSet rs=st.executeQuery(s2);
     while(rs.next())
            {// rs.getInt(1);
             price=rs.getInt(6);
             total+=price;

    }
           }
catch (Exception e)
{
    System.out.println(e);
}

      out.write('\n');
      out.write(' ');

         String name="";
     String s=(String)application.getAttribute("name");
        // String s=(String)session.getAttribute("name");
      // out.println(s);
      try {

       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:mydata");
       Statement st=con.createStatement();
      String s2="select * from REGISTER where UNAME='"+s+"'";
      ResultSet rs=st.executeQuery(s2);
    //  out.println("<table border=1><center>");

      while(rs.next())
            {// rs.getInt(1);
             name=rs.getString(5);
      }

           }
catch (Exception e)
{
    System.out.println(e);
}

      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("</html>\n");
      out.write("    <body background=\"images/i16.jpg\">\n");
      out.write("         ");
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
      out.write("  <body background=\"images/i8.jpg\">\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    @import url(master.css);\n");
      out.write("#s\n");
      out.write("{\n");
      out.write("border:2px ;\n");
      out.write("padding:10px 10px;\n");
      out.write("background-image:url(\"images/i1.jpg\");\n");
      out.write("-webkit-border-radius:20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*----------------------------------------------------*/\n");
      out.write("#x\n");
      out.write("{\n");
      out.write("height:280px;\n");
      out.write("background-image:url(\"images/i8.jpg\");\n");
      out.write("-webkit-animation:myfirst 50s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes myfirst /* Safari and Chrome */\n");
      out.write("{\n");
      out.write("0%   {background-image:url(\"images/i8.jpg\");}\n");
      out.write("10% {background-image:url(\"images/i1.jpg\");}\n");
      out.write("20%  {background-image:url(\"images/i9.jpg\");}\n");
      out.write("30%  {background-image:url(\"images/i3.jpg\");}\n");
      out.write("40% {background-image:url(\"images/i2.jpg\");}\n");
      out.write("50% {background-image:url(\"images/i5.jpg\");}\n");
      out.write("60% {background-image:url(\"images/i10.jpg\");}\n");
      out.write("70% {background-image:url(\"images/i11.jpg\");}\n");
      out.write("80% {background-image:url(\"images/i12.jpg\");}\n");
      out.write("90% {background-image:url(\"images/i13.jpg\");}\n");
      out.write("100% {background-image:url(\"images/i14.jpg\");}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*----------------------------------------------------*/\n");
      out.write("\n");
      out.write("#y\n");
      out.write("{\n");
      out.write("    width:225px;\n");
      out.write("height:115px;\n");
      out.write("background-image:url(\"images/logo0.jpg\");\n");
      out.write("position:relative;\n");
      out.write("-webkit-animation:mysecond 15s;\n");
      out.write("}\n");
      out.write("@-webkit-keyframes mysecond\n");
      out.write("{\n");
      out.write("0%   {background-image:url(\"images/logo0.jpg\"); left:0px; top:0px;}\n");
      out.write("25%  {background-image:url(\"images/logo1.jpg\"); left:425px; top:0px;}\n");
      out.write("50%  {background-image:url(\"images/logo2.jpg\");left:425px; top:130px;}\n");
      out.write("75%  {background-image:url(\"images/logo4.jpg\"); left:0px; top:130px;}\n");
      out.write("100% {background-image:url(\"images/logo0.jpg\"); left:0px; top:0px;}\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*/\n");
      out.write("\n");
      out.write("\n");
      out.write("@-webkit-keyframes pulse {\n");
      out.write("\tfrom {\n");
      out.write("\t\tbackground: #000;\n");
      out.write("\t}\n");
      out.write("\t25% {\n");
      out.write("\t\tbackground-color: #003;\n");
      out.write("\t}\n");
      out.write("\t50% {\n");
      out.write("\t\tbackground-color: #030;\n");
      out.write("\t}\n");
      out.write("\tto {\n");
      out.write("\t\tbackground: #000;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("z {\n");
      out.write("\tz-index: 0;\n");
      out.write("\tcolor: rgba(0, 0, 0, 0);\n");
      out.write("}\n");
      out.write("\n");
      out.write("#fog,\n");
      out.write("#fog-2 {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\twidth: 350px;\n");
      out.write("\theight: 300px;\n");
      out.write("\tmargin-top: -200px;\n");
      out.write("\tmargin-left: -205px;\n");
      out.write("\topacity: 5;\n");
      out.write("\tbackground: url(images/mypic.jpg) repeat-x 0 center;\n");
      out.write("\t-webkit-animation-name: fogAnimation;\n");
      out.write("\t-webkit-animation-duration: 30s;\n");
      out.write("\t-webkit-animation-iteration-count: infinite;\n");
      out.write("\t-webkit-animation-timing-function: linear;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#fog-2 {\n");
      out.write("\topacity: .65;\n");
      out.write("\t-webkit-animation-duration: 60s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes fogAnimation {\n");
      out.write("\tfrom {\n");
      out.write("\t\t-webkit-transform: rotate(0deg);\n");
      out.write("\t\tbackground-position: 0 center;\n");
      out.write("\t}\n");
      out.write("\tto {\n");
      out.write("\t\t-webkit-transform: rotate(360deg);\n");
      out.write("\t\tbackground-position: 1000px center;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("#glow {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\twidth: 800px;\n");
      out.write("\theight: 800px;\n");
      out.write("\tmargin: -400px 0 0 -400px;\n");
      out.write("\tbackground: url(s2.jpg) repeat-x 0 0;\n");
      out.write("\t-webkit-animation-name: glowAnimation;\n");
      out.write("\t-webkit-animation-duration: 5s;\n");
      out.write("\t-webkit-animation-iteration-count: infinite;\n");
      out.write("\t-webkit-animation-timing-function: linear;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes glowAnimation {\n");
      out.write("\tfrom {\n");
      out.write("\t\topacity: 1;\n");
      out.write("\t}\n");
      out.write("\t50% {\n");
      out.write("\t\topacity: .75;\n");
      out.write("\t}\n");
      out.write("\tto {\n");
      out.write("\t\topacity: 1;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("#light {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\twidth: 450px;\n");
      out.write("\theight: 350px;\n");
      out.write("\tmargin: -200px 0 0 -200px;\n");
      out.write("\tbackground: url(images/i20.jpg) no-repeat center center;\n");
      out.write("\t-webkit-animation-name: lightAnimation;\n");
      out.write("\t-webkit-animation-duration: 1s;\n");
      out.write("\t-webkit-animation-iteration-count: infinite;\n");
      out.write("\t-webkit-animation-timing-function: linear;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes lightAnimation {\n");
      out.write("\tfrom {\n");
      out.write("\t\topacity: .35;\n");
      out.write("\t}\n");
      out.write("\t50% {\n");
      out.write("\t\topacity: .7;\n");
      out.write("\t}\n");
      out.write("\tto {\n");
      out.write("\t\topacity: .35;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("#stars,\n");
      out.write("#stars-2,\n");
      out.write("#small-stars,\n");
      out.write("#small-stars-2 {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\twidth: 600px;\n");
      out.write("\theight: 600px;\n");
      out.write("\tmargin: -300px 0 0 -300px;\n");
      out.write("\tbackground: url(s4.jpg) no-repeat center center;\n");
      out.write("\t-webkit-animation-name: starsLarge;\n");
      out.write("\t-webkit-animation-duration: 60s;\n");
      out.write("\t-webkit-animation-iteration-count: infinite;\n");
      out.write("\t-webkit-animation-timing-function: linear;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes starsLarge {\n");
      out.write("\tfrom {\n");
      out.write("\t\t-webkit-transform: rotate(0deg) scale(3);\n");
      out.write("\t\topacity: .1;\n");
      out.write("\t}\n");
      out.write("\tto {\n");
      out.write("\t\t-webkit-transform: rotate(360deg) scale(.5);\n");
      out.write("\t\topacity: 0;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("#stars-2 {\n");
      out.write("\t-webkit-animation-name: starsLargeAlt;\n");
      out.write("\t-webkit-animation-duration: 45s;\n");
      out.write("\t-webkit-animation-iteration-count: infinite;\n");
      out.write("\t-webkit-animation-timing-function: linear;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes starsLargeAlt {\n");
      out.write("\tfrom {\n");
      out.write("\t\t-webkit-transform: rotate(180deg) scale(3);\n");
      out.write("\t\topacity: .25;\n");
      out.write("\t}\n");
      out.write("\tto {\n");
      out.write("\t\t-webkit-transform: rotate(360deg) scale(.5);\n");
      out.write("\t\topacity: 0;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("#small-stars,\n");
      out.write("#small-stars-2 {\n");
      out.write("\tbackground: url(i13.jpg) no-repeat center center;\n");
      out.write("\t-webkit-animation-duration: 15s;\n");
      out.write("\t-webkit-animation-name: starsSmall;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#small-stars-2 {\n");
      out.write("\t-webkit-animation-name: starsSmallAlt;\n");
      out.write("\t-webkit-animation-duration: 30s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes starsSmall {\n");
      out.write("\tfrom {\n");
      out.write("\t\t-webkit-transform: rotate(360deg) scale(3);\n");
      out.write("\t\topacity: .25;\n");
      out.write("\t}\n");
      out.write("\tto {\n");
      out.write("\t\t-webkit-transform: rotate(0deg) scale(.5);\n");
      out.write("\t\topacity: 0;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes starsSmallAlt {\n");
      out.write("\tfrom {\n");
      out.write("\t\t-webkit-transform: rotate(0deg) scale(3);\n");
      out.write("\t\topacity: .1;\n");
      out.write("\t}\n");
      out.write("\tto {\n");
      out.write("\t\t-webkit-transform: rotate(360deg) scale(.5);\n");
      out.write("\t\topacity: 0;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*/\n");
      out.write("</style>\n");
      out.write("  \n");
      out.write("  <div id=\"x\"><center>\n");
      out.write("  <table border=\"0\" bordercolor=\"white\" width=\"500\" background=\"images/bgcolor.jpg\" >\n");
      out.write("<tr><th><a href=\"about_us.jsp\"><img src=\"images/abt.jpg\" height=\"20\" width=\"20\">ABOUT</a></th>\n");
      out.write("    <th><a href=\"\"><img src=\"images/exctng.jpg\" height=\"20\" width=\"20\">EXCITING OFFERS</a></th>\n");
      out.write("    <th><a href=\"career.jsp\"><img src=\"images/ratng.jpg\" height=\"20\" width=\"20\">CAREERS</a></th>\n");
      out.write("    <th><a href=\"contact_us.jsp\"><img src=\"images/cntct.jpg\" height=\"20\" width=\"20\">CONTACT US</a></th>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write(" <br>\n");
      out.write("<table border=\"0\" height=\"100\" width=\"1330\"  bordercolor=\"white\" bordercolorlight=\"white\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("    <tr><th><img alt=\"tom\"  src=\"images/logo.jpg\" height=\"120\" width=\"200\" ></th>\n");
      out.write("      <th><img alt=\"tom\"  src=\"name.jpg\"height=\"170\" width=\"900\"></th>\n");
      out.write("    <th><img alt=\"tom\"  src=\"images/logo.jpg\" height=\"120\" width=\"200\" ></th></tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<br><table height=\"3\"width=\"1330\">\n");
      out.write("    <tr><td align=\"center\">\n");
      out.write("            <div id=\"y\"><div id=\"fog-2\"><div id=\"light\"></div></div></div></td>\n");
      out.write("<td align=\"right\">\n");
      out.write("<form method=post action=\"\">\n");
      out.write("<table border=\"0\" cellspacing=\"0\" cellpadding=\"2\" height=\"50\">\n");
      out.write("    <tr><td>\n");
      out.write("   <div id=\"s\">  <img src=\"images/searchtxt.jpg\"width=\"115\"height=\"45\">&nbsp;<TEXTAREA NAME=\"SEARCH\" ROWS=3 COLS=75></TEXTAREA></b></font>\n");
      out.write("    <input type=\"image\" name=\"submit\" src=\"images/s6.jpg\"width=\"65\"height=\"40\"></td></tr></div>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</td></tr></table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("         \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("         <table width=\"1330\">\n");
      out.write("             <tr>\n");
      out.write("                 <td>\n");
      out.write("                     \n");
      out.write("                     <blockquote><blockquote></blockquote> &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<blockquote>\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<blockquote>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        &nbsp;&nbsp;&nbsp;\n");
      out.write("                    </blockquote></blockquote></blockquote></td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function mouseOver()\n");
      out.write("{\n");
      out.write("document.b1.src =\"images/min.jpg\";\n");
      out.write("}\n");
      out.write("function mouseOut()\n");
      out.write("{\n");
      out.write("document.b1.src =\"images/mout.jpg\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                      <div id=\"my\">\n");
      out.write("                         \n");
      out.write("        <center><h1><font face=\"comic sans ms\" color=\"white\" size=\"6\"><b><u>CHECKOUT PAGE</u></b></font></h1>\n");
      out.write("\n");
      out.write("         <form action=\"\">\n");
      out.write("          <font face=\"comic sans ms\" color=\"white\" size=\"5\">\n");
      out.write("              <b><u>Delivery Detail</u></b></font></center><br>\n");
      out.write(" <font face=\"comic sans ms\" color=\"white\" size=\"4\">\n");
      out.write("<i><u>Customer Detail</u></i>\n");
      out.write(" </font>\n");
      out.write("<br><br>\n");
      out.write("<font face=\"comic sans ms\" color=\"white\">\n");
      out.write("Customer Address:   <input type=\"text\" name=\"address\" value=\"");
out.println(name);
      out.write("\"><br><br>\n");
      out.write("Customer Mobile No:   <input type=\"text\" name=\"mob\"><br><br>\n");
      out.write("<font face=\"comic sans ms\" color=\"white\" size=\"4\">\n");
      out.write("<i><u>Credit Card Detail</u></i>\n");
      out.write("</font>\n");
      out.write("<br><br>\n");
      out.write("<font face=\"comic sans ms\" color=\"white\">\n");
      out.write("Bank Name :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<select name=\"bank\">\n");
      out.write("\n");
      out.write("<option>SBI <option>ICICI <option>AXIS <option>PNB <option>HDFC<option>UBI <option>YES <option>RBI <option>SWISS\n");
      out.write("</select><br><br>\n");
      out.write("Credit Card No. :<input type=\"text\" name=\"Cardno\"><br><br><p>&nbsp;</p>\n");
      out.write("<br><br>\n");
      out.write("<a href=\"\" >\n");
      out.write("<img src=\"images/mout.jpg\" name=\"b1\" alt=\"tom\" width=\"400\" height=\"200\" onmouseOver=\"mouseOver()\" onmouseOut=\"mouseOut()\" />\n");
      out.write("</a>\n");
      out.write("<br><br>\n");
      out.write("<center><input type=\"image\" name=\"submit\" src=\"images/creditcard.jpg\" width=\"100\" height=\"50\">\n");
      out.write("        </center>\n");
      out.write("         </font>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</td></tr></table>\n");
      out.write("         </body>\n");
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
