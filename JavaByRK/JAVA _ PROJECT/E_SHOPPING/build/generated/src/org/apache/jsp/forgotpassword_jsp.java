package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

String s;
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("#my1\n");
      out.write("{\n");
      out.write("width:350px;\n");
      out.write("height:265px;\n");
      out.write("background-image:url(\"images/i20.jpg\");\n");
      out.write("-webkit-animation:tom 5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes tom\n");
      out.write("{\n");
      out.write("from {background-image:url(\"images/i18.jpg\");}\n");
      out.write("to {background-image:url(\"images/i17.jpg\");}}\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body background=\"images/i16.jpg\">\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("         ");

        // Cookie c[] = request.getCookies();
//if (c[0].getName().equals("uname"))
 //out.println(c[0].getValue());
   //      out.println("hi");
    s=(String)application.getAttribute("name");
        //application context=getServletConfig().getServletContext();
         //String s=session.getAttribute("name");
      // String uname=request.getParameter("uname");
         //out.println("<input type=hidden name=unm value="+uname+">");
//out.println("<input type=hidden name=uname value="+s+">");
//out.println(s);

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
      out.write("  <body background=\"images/i8.jpg\">\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("div\n");
      out.write("{\n");
      out.write("border:2px ;\n");
      out.write("padding:10px 10px;\n");
      out.write("background-image:url(\"images/i1.jpg\");\n");
      out.write("border-radius:20px;\n");
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
      out.write("25%  {background-image:url(\"images/logo1.jpg\"); left:465px; top:0px;}\n");
      out.write("50%  {background-image:url(\"images/logo2.jpg\");left:465px; top:140px;}\n");
      out.write("75%  {background-image:url(\"images/logo4.jpg\"); left:0px; top:140px;}\n");
      out.write("100% {background-image:url(\"images/logo0.jpg\"); left:0px; top:0px;}\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("  <div id=\"x\"><center>\n");
      out.write("  <table border=\"0\" bordercolor=\"white\" width=\"500\" background=\"images/bgcolor.jpg\" >\n");
      out.write("<tr><th><a href=\"\"><img src=\"abt.jpg\" height=\"20\" width=\"20\">ABOUT</a></th>\n");
      out.write("    <th><a href=\"\"><img src=\"exctng.jpg\" height=\"20\" width=\"20\">EXCITING OFFERS</a></th>\n");
      out.write("    <th><a href=\"\"><img src=\"ratng.jpg\" height=\"20\" width=\"20\">RATINGS & REVIEWS</a></th>\n");
      out.write("    <th><a href=\"\"><img src=\"cntct.jpg\" height=\"20\" width=\"20\">CONTACT US</a></th>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write(" <br>\n");
      out.write("<table border=\"0\" height=\"100\" width=\"1330\"  bordercolor=\"white\" bordercolorlight=\"white\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("    <tr><th><img alt=\"tom\"  src=\"logo.jpg\" height=\"120\" width=\"200\" ></th>\n");
      out.write("      <th><img alt=\"tom\"  src=\"name.jpg\"height=\"170\" width=\"900\"></th>\n");
      out.write("    <th><img alt=\"tom\"  src=\"logo.jpg\" height=\"120\" width=\"200\" ></th></tr></table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<br><table height=\"3\"width=\"1330\">\n");
      out.write("<tr><td><div id=\"y\"></div></td>\n");
      out.write("<td align=\"right\">\n");
      out.write("<form method=post action=\"\">\n");
      out.write("<table border=\"0\" cellspacing=\"0\" cellpadding=\"2\" height=\"50\">\n");
      out.write("    <tr><td>\n");
      out.write("   <div>  <img src=\"images/searchtxt.jpg\"width=\"115\"height=\"45\">&nbsp;<TEXTAREA NAME=\"SEARCH\" ROWS=3 COLS=75></TEXTAREA></b></font>\n");
      out.write("    <input type=\"image\" name=\"submit\" src=\"images/s6.jpg\"width=\"65\"height=\"40\"></td></tr></div>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</td></tr></table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("         <table width=\"1330\">\n");
      out.write("             <tr>\n");
      out.write("                 <td><blockquote><blockquote></blockquote> &nbsp;&nbsp;&nbsp;&nbsp;\n");
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
      out.write("                      <div id=\"my1\">\n");
      out.write("         <h1><font face=\"comic sans ms\" color=\"white\"><b></b></h1>\n");
      out.write("\n");
      out.write("         <form action=\"sendpass.jsp\">\n");
      out.write("             <font face=\"comic sans ms\" color=\"white\" size=\"4\">\n");
      out.write("                 <center><u>FORGOT PASSWORD</u></center><br><br>\n");
      out.write("                 ");
out.println("HI <font face=comic sans ms color=yellow size=4>"+s+"</font> Plz Fill your Details");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("                 Enter the Answer of your Security Question:  <br>\n");
      out.write("<input type=\"text\" maxlength=\"30\" size=\"30\" name=\"frgt_answer\" ><p>\n");
      out.write("Email_id:    <input type=\"email\" maxlength=\"20\"size=\"30\"name=\"eid\"><p>\n");
      out.write("Birthday:\n");
      out.write("<select name=\"day\">\n");
      out.write("<option>1 <option>2 <option>3 <option>4 <option>5 <option>6 <option>7 <option>8 <option>9 <option>10\n");
      out.write("\n");
      out.write("<option>11 <option>12 <option>13 <option>14 <option>15 <option>16 <option>17 <option>18 <option>19 <option>20\n");
      out.write("\n");
      out.write("<option>21 <option>22 <option>23 <option>24 <option>25 <option>26 <option>27 <option>28 <option>29 <option>30\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("<select name=\"month\">\n");
      out.write("\n");
      out.write("<option>january <option>february <option>march <option>april  <option>may <option>june <option>july <option>august <option>september\n");
      out.write("\n");
      out.write("<option>october <option>november <option>december\n");
      out.write("\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("<select name=\"year\">\n");
      out.write("    <option value=\"2012\">2012</option>\n");
      out.write("<option value=\"2011\">2011</option>\n");
      out.write("<option value=\"2010\">2010</option>\n");
      out.write("<option value=\"2009\">2009</option>\n");
      out.write("<option value=\"2008\">2008</option>\n");
      out.write("<option value=\"2007\">2007</option>\n");
      out.write("<option value=\"2006\">2006</option>\n");
      out.write("<option value=\"2005\">2005</option>\n");
      out.write("<option value=\"2004\">2004</option>\n");
      out.write("<option value=\"2003\">2003</option>\n");
      out.write("<option value=\"2002\">2002</option>\n");
      out.write("<option value=\"2001\">2001</option>\n");
      out.write("<option value=\"2000\">2000</option>\n");
      out.write("<option value=\"1999\">1999</option>\n");
      out.write("<option value=\"1998\">1998</option>\n");
      out.write("<option value=\"1997\">1997</option>\n");
      out.write("<option value=\"1996\">1996</option>\n");
      out.write("<option value=\"1995\">1995</option>\n");
      out.write("<option value=\"1994\">1994</option>\n");
      out.write("<option value=\"1993\">1993</option>\n");
      out.write("<option value=\"1992\">1992</option>\n");
      out.write("<option value=\"1991\">1991</option>\n");
      out.write("<option value=\"1990\">1990</option>\n");
      out.write("<option value=\"1989\">1989</option>\n");
      out.write("<option value=\"1988\">1988</option>\n");
      out.write("<option value=\"1987\">1987</option>\n");
      out.write("<option value=\"1986\">1986</option>\n");
      out.write("<option value=\"1985\">1985</option>\n");
      out.write("<option value=\"1984\">1984</option>\n");
      out.write("<option value=\"1983\">1983</option>\n");
      out.write("<option value=\"1982\">1982</option>\n");
      out.write("<option value=\"1981\">1981</option>\n");
      out.write("<option value=\"1980\">1980</option>\n");
      out.write("<option value=\"1979\">1979</option>\n");
      out.write("<option value=\"1978\">1978</option>\n");
      out.write("<option value=\"1977\">1977</option>\n");
      out.write("<option value=\"1976\">1976</option>\n");
      out.write("<option value=\"1975\">1975</option>\n");
      out.write("<option value=\"1974\">1974</option>\n");
      out.write("<option value=\"1973\">1973</option>\n");
      out.write("<option value=\"1972\">1972</option>\n");
      out.write("<option value=\"1971\">1971</option>\n");
      out.write("<option value=\"1970\">1970</option>\n");
      out.write("<option value=\"1969\">1969</option>\n");
      out.write("<option value=\"1968\">1968</option>\n");
      out.write("<option value=\"1967\">1967</option>\n");
      out.write("<option value=\"1966\">1966</option>\n");
      out.write("<option value=\"1965\">1965</option>\n");
      out.write("<option value=\"1964\">1964</option>\n");
      out.write("<option value=\"1963\">1963</option>\n");
      out.write("<option value=\"1962\">1962</option>\n");
      out.write("<option value=\"1961\">1961</option>\n");
      out.write("<option value=\"1960\">1960</option>\n");
      out.write("<option value=\"1959\">1959</option>\n");
      out.write("<option value=\"1958\">1958</option>\n");
      out.write("<option value=\"1957\">1957</option>\n");
      out.write("<option value=\"1956\">1956</option>\n");
      out.write("<option value=\"1955\">1955</option>\n");
      out.write("<option value=\"1954\">1954</option>\n");
      out.write("<option value=\"1953\">1953</option>\n");
      out.write("<option value=\"1952\">1952</option>\n");
      out.write("<option value=\"1951\">1951</option>\n");
      out.write("<option value=\"1950\">1950</option>\n");
      out.write("\n");
      out.write("</select>\n");
      out.write("<p><p><p>\n");
      out.write("<br>\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("<input type=\"submit\"value=\"SUBMIT\"size=20\">\n");
      out.write(" </form>\n");
      out.write("   ");
 session.removeAttribute("flag"); 
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
