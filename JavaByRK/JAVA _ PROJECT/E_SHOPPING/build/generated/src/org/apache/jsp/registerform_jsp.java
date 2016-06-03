package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("First name:    <input type=\"text\"value=\"\"maxlength=\"20\"size=\"30\" name=\"f\"><p>\n");
      out.write("Last name:    <input type=\"text\"value=\"\"maxlength=\"20\"size=\"30\" name=\"l\" ><p>\n");
      out.write("\n");
      out.write("Desired Login name:    <input type=\"text\"value=\"\"maxlength=\"10\"size=30\">&nbsp;&nbsp;&nbsp;<font color=\"white\">@teemkart.com</font><p><p>\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\"value=\"check availability\"size=20\"><p><p>\n");
      out.write("\n");
      out.write("Enter password:    <input type=\"password\"maxlength=\"10\"size=30\">&nbsp;<font color=\"white\">min of 10 character</font><p>\n");
      out.write("Confirm Password:    <input type=\"password\"maxlength=\"10\"size=30\"><p><p>\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"checkbox\">Stay signed in<p><p>\n");
      out.write("\n");
      out.write("Sex: <input type=\"radio\">Male&nbsp;&nbsp;<input type=\"radio\">Female\n");
      out.write("\n");
      out.write("<p><p>\n");
      out.write("\n");
      out.write("\n");
      out.write("Security question: <select name=\"choose a Question\">\n");
      out.write("\n");
      out.write("<option>Choose a Question <option>Mother's name? <option>Father's name? <option>Mobile number? <option>Best friend?  <option>Vehical number?\n");
      out.write("\n");
      out.write("<option>Pet name? <option>Enter your question.\n");
      out.write("\n");
      out.write("</select><p><p>\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;<input type=\"text\"value=\"Enter your own Question\"maxlength=\"50\"size=50\"><p>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("</select><p><p>\n");
      out.write("\n");
      out.write("Location:\n");
      out.write("<select name=\"country\">\n");
      out.write("\n");
      out.write("<option>Australia <option>Japan <option>Germany <option>France  <option>India <option>Pakisthan <option>Canada <option>London\n");
      out.write("\n");
      out.write("<option>South Africa  <option>Indonasia <option>Boston <option>Russia\n");
      out.write("\n");
      out.write("</select><p><p><p><p>\n");
      out.write("\n");
      out.write("Terms of Services: My circle Terms of Service<p>\n");
      out.write("\n");
      out.write("Welcome to My circle\n");
      out.write("\n");
      out.write("<br><br>1. Your relationship with my circle\n");
      out.write("\n");
      out.write("    <br><br>1.1 Your use of My circle products, software, services and web sites (referred to collectively as the “Services” in this\n");
      out.write("\t<br>document and excluding any services provided to you by My circle under a separate written agreement) is subject <br>\n");
      out.write("\tto the terms of a legal agreement between you and my circle. “my circle” means my circle Inc.\n");
      out.write("\n");
      out.write("   <br><br> 1.2 Unless otherwise agreed in writing with My circle, your agreement with my circle will always include, at a minimum,\n");
      out.write("<br> the terms and conditions set out in this document. These are referred to below as the “Universal Terms”.\n");
      out.write("\n");
      out.write("    <br><br>1.3 Your agreement with my circle will also include the terms of any Legal Notices applicable to the Services,\n");
      out.write("<br>in addition to the Universal Terms. All of these are referred to below as the “Additional Terms”.\n");
      out.write("\n");
      out.write("   <br><br> 1.4 The Universal Terms, together with the Additional Terms, form a legally binding agreement between you and\n");
      out.write("<br> my circle in relation to your use of the Services. It is important that you take the time to read them carefully.\n");
      out.write("\n");
      out.write("    <br><br>1.5 If there is any contradiction between what the Additional Terms say and what the Universal Terms say, then\n");
      out.write("<br>the Additional Terms shall take precedence in relation to that Service.\n");
      out.write("\n");
      out.write("<br><br>2. Accepting the Terms\n");
      out.write("\n");
      out.write("    <br><br>2.1 In order to use the Services, you must first agree to the Terms. You may not use the Services if you do\n");
      out.write("<br>not accept the Terms.\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<p><p>\n");
      out.write("<input type=\"checkbox\">'I accept the all Terms of Service<p><p><p><p><p><p><br><br>\n");
      out.write("\n");
      out.write("<center><a href=\"registercomplete.html\">\n");
      out.write("<input type=\"submit\"value=\"I accept. Create my Account\"size=20\"></a></center>\n");
      out.write("\n");
      out.write("\n");
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
