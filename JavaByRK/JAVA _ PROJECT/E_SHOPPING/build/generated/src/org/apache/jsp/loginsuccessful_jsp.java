package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class loginsuccessful_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

String s,s1;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(4);
    _jspx_dependants.add("/afterloginheader.jsp");
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/afterloginheader2.jsp");
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
      out.write("        <title>Loginsuccs Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" ");
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
      out.write("       ");
      out.write("\n");
      out.write("         ");

         s=(String)application.getAttribute("name");
        s1=(String)session.getAttribute("f");
        if(s1==null)
            {}
       else{ if(s1.equals("valid"))
           out.println("<font face=comic sans ms color=yellow size=4><h1>HI..."+s+""
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "<a href=index.jsp><font size=4 color=yellow>SIGN OUT</font></a></h1></font>");
}
    //to move sign out and login name above is done....
       // session.removeAttribute("f");
       // application.removeAttribute(s);

         
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

String txt=request.getParameter("SEARCH");

String s="select id, uname, pass  from result where uname like '%"+txt+"%' or pass like '%"+txt+"%'";



      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    ");
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
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("#div1\n");
      out.write("{\n");
      out.write("width:330px;\n");
      out.write("height:50px;\n");
      out.write("background-image:url(\"images/i9.jpg\");\n");
      out.write("/*-moz-box-shadow: 10px 10px 5px #888888;  Firefox 3.6 and earlier */\n");
      out.write("-webkit-box-shadow: 10px 10px 5px #FFFF00;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1\n");
      out.write("{\n");
      out.write("text-shadow: 5px 5px 5px #FF0000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#c\n");
      out.write("{\n");
      out.write("border:2px solid #a1a1a1;\n");
      out.write("padding:2px 4px;\n");
      out.write("background-image:url(\"images/ir.jpg\");\n");
      out.write("width:1330px;\n");
      out.write("height:48px;\n");
      out.write("-webkit-border-radius:25px;\n");
      out.write("}\n");
      out.write("#r\n");
      out.write("{\n");
      out.write("width:100px;\n");
      out.write("height:100px;\n");
      out.write("background:url(\"images/emotions/6.jpg\");\n");
      out.write("-webkit-transition:width 2s, height 2s, -webkit-transform 1s; /* Safari and Chrome */\n");
      out.write("}\n");
      out.write("\n");
      out.write("#r:hover\n");
      out.write("{\n");
      out.write("width:250px;\n");
      out.write("height:250px;\n");
      out.write("-webkit-transform:rotate(450deg); /* Safari and Chrome */\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    <table width=\"1330\">\n");
      out.write("        <tr><td>  ");
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
      out.write("        \n");
      out.write("<body>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("* { margin:0;\n");
      out.write("\tpadding:2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".navbox {\n");
      out.write("\tposition: relative;\n");
      out.write("\tfloat: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul.nav {\n");
      out.write("\tlist-style: none;\n");
      out.write("\tdisplay: block;\n");
      out.write("\twidth: 200px;\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 100px;\n");
      out.write("\tleft: 100px;\n");
      out.write("\tpadding: 60px 0 60px 0;\n");
      out.write("      /*  background: url(images/i8.jpg) no-repeat;\n");
      out.write("\t-webkit-background-size: 72% 100%;*/\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("\tmargin:    50px 0 0 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul.nav li a {\n");
      out.write("\t-webkit-transition: all 0.3s ease-out;\n");
      out.write("\tbackground: #cbcbcb url(images/i5.jpg) no-repeat;\n");
      out.write("\tcolor: #174867;\n");
      out.write("\tpadding: 7px 15px 7px 15px;\n");
      out.write("\t-webkit-border-top-right-radius: 15px;\n");
      out.write(" \t-webkit-border-bottom-right-radius: 15px;\n");
      out.write("\twidth: 120px;\n");
      out.write("\tdisplay: block;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\t-webkit-box-shadow: 2px 2px 4px #888;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul.nav li a:hover {\n");
      out.write("\tbackground:url(images/i5.jpg) no-repeat;\n");
      out.write("\tcolor: #67a5cd;\n");
      out.write("\tpadding: 7px 15px 7px 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"navbox\">\n");
      out.write("<ul class=\"nav\">\n");
      out.write("<li><a href=\"loginsuccessful.jsp\"><img src=\"images/sm3.ico\" height=\"20\" width=\"20\">HOME</a></li><p>\n");
      out.write("<li><a href=\"\"><img src=\"images/sm1.ico\" height=\"20\" width=\"20\">PROFILE</a></li><p>\n");
      out.write("<li> <a href=\"shoppingcart.jsp\"><img src=\"images/sm4.ico\" height=\"20\" width=\"20\">VIEW CART</a></li><p>\n");
      out.write("<li><a href=\"checkout.jsp\"><img src=\"images/sm2.ico\" height=\"20\" width=\"20\">CHECK OUT</a></li><p>\n");
      out.write("<li><a href=\"loginform.jsp\"><img src=\"images/sm8.ico\" height=\"20\" width=\"20\">LOGIN FORM</a></li><p>\n");
      out.write("<li><a href=\"newregformjss.jsp\"><img src=\"images/sm5.ico\" height=\"20\" width=\"20\">REGISTER FORM</a></li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <div class=\"navbox\">\n");
      out.write("<ul class=\"nav\">\n");
      out.write("<li><a href=\"login.jsp\"><img src=\"images/sm6.ico\" height=\"20\" width=\"20\">LOGIN PAGE</a></li><p>\n");
      out.write("    <li><a href=\"sport.jsp\"><img src=\"images/sm9.ico\" height=\"20\" width=\"20\">SPORTS</a></li><p>\n");
      out.write("<li><a href=\"garments.jsp\"><img src=\"images/sm11.ico\" height=\"20\" width=\"20\">GARMENTS</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"navbox\">\n");
      out.write("<ul class=\"nav\">\n");
      out.write("<li><a href=\"book.jsp\"><img src=\"images/sm12.ico\" height=\"20\" width=\"20\">BOOKS</a></li><p>\n");
      out.write("<li><a href=\"feed.jsp\"><img src=\"images/sm13.ico\" height=\"20\" width=\"20\">FEEDBACK</a></li><p>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                <blockquote><blockquote></blockquote> &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<blockquote>\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<blockquote>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    </blockquote></blockquote></blockquote> </td>\n");
      out.write("<td align=\"left\">\n");
      out.write("   \n");
      out.write("\n");
      out.write("       <blockquote>\n");
      out.write("    <font face=\"Script MT\"color=\"white\" size=\"\"><h1><i><b>WELCOME TO TEEMKART</b></i></h1></font>\n");
      out.write("<p><p><p><p><p><p>\n");
      out.write("<font color=\"white\" size=\"5\">....AN ENJOYMENT OF SHOPPING....</font><br><br>\n");
      out.write("\n");

int n=0;
try{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:mydata");
Statement st=con.createStatement();

ResultSet rs=st.executeQuery("select * from orderdetail");

while(rs.next())
{
   rs.getString(2);
   n=rs.getRow();
    }
if(n==0)
{out.println("<font face=comic sans ms color=white size=5>YOUR CART IS EMPTY</font><br><br>");}
    else
{out.println("<font face=comic sans ms color=white size=5>YOUR CART CONTAINS <b>" +n+ "</b> ITEMS</font><br><br>");}
}
catch(Exception e)
{out.println(e);
}

      out.write("\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<img src=\"images/ECART.jpg\"width=\"100\"height=\"100\"><br><br>\n");
      out.write("<div id=\"r\"><img src=\"images/emotions/6.jpg\"width=\"150\"height=\"150\"></div>\n");
      out.write("    \n");
      out.write("    </blockquote>\n");
      out.write("</td></tr></table>\n");
      out.write("    <br><br><br><br>\n");
      out.write("    <div id=\"c\">\n");
      out.write("        <pre>\n");
      out.write("<h1>   <a href=\"sport.jsp\">SPORT</a>                            <a href=\"garments.jsp\">GARMENTS</a>                            <a href=\"book.jsp\">BOOKS</a>\n");
      out.write("</h1>   </pre> </div>\n");
      out.write("    <br><br>\n");
      out.write("  <center>\n");
      out.write("      <h1><font color=\"white\"face=\"comic sans ms\">...GRID VIEW...</font></h1><br>\n");
      out.write("      <img src=\"images/combine.jpg\" usemap=ricktam height=\"115\"width=\"615\">\n");
      out.write("\n");
      out.write("<map name=\"ricktam\">\n");
      out.write("\n");
      out.write("    <area  shape=\"rect\" coords=\"0,0,205,115\" href=\"sport.jsp\">\n");
      out.write("<area shape=\"rect\" coords=\"205,0,410,115\" href=\"garments.jsp\">\n");
      out.write("<area shape=\"rect\" coords=\"410,0,615,115\" href=\"book.jsp\">\n");
      out.write("\n");
      out.write("</map>\n");
      out.write("  </center>\n");
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
      out.write("background-image:url(\"images/i25.jpg\");\n");
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
      out.write("    <form action=\"query.jsp\">\n");
      out.write("    <center><font face=\"comic sans ms\" color=\"white\" size=\"5\">QUERY FORM</font><BR><BR>\n");
      out.write("        <font face=\"comic sans ms\" color=\"white\" size=\"4\">\n");
      out.write("            Name:&nbsp;&nbsp;<input type=\"text\" maxlength=\"30\"  name=\"name\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        Email_Id:&nbsp;&nbsp;<input type=\"email\"  maxlength=\"30\" name=\"eid\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        Phn No.:&nbsp;&nbsp;<input type=\"text\" maxlength=\"10\" name=\"no\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        Query:<font color=\"red\" size=\"2\">(max. 100 chars.)</font> &nbsp;&nbsp;<TEXTAREA NAME=\"SEARCH\" ROWS=3 COLS=50></TEXTAREA>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
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
