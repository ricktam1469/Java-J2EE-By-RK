package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<body background =\"images/i17.jpg\">\n");
      out.write("<center>\n");
      out.write("<font color=\"red\" face=\"comic sans ms\" size=\"7\"> <b><u>FEEDBACK FORM </u></b>    <br><br>  </font>\n");
      out.write("<font color=\"yellow\" face=\"comic sans ms\" size=\"5\">\n");
      out.write("We value your comments and welcome feature suggestions.\n");
      out.write("Please indicate below the features you would find useful.\n");
      out.write("Describe any features not already listed in &quot;Other features&quot;.\n");
      out.write("Do NOT use this to ask for help. If you want to ask a question about TEEMKART E-SHOP,\n");
      out.write("contact us or open <a href=\"http://localhost:8085/E_SHOPPING/contact_us.jsp\">\n");
      out.write("    <button>CONTACT US</button><a></font></center>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("<br><br><br>\n");
      out.write("<font color=\"#00FF00\" face=\"comic sans ms\" size=\"4\"> Name:\n");
      out.write("                                                <input type=\"text\" >\n");
      out.write("                                         <br><br>    Email:\n");
      out.write("                                                <input type=\"email\" >\n");
      out.write("                                         <br><br>    Feedback to:\n");
      out.write("                                           <select name=\"Select Your Choice\">\n");
      out.write("\t<option value=\"General\">-Feedback to -</option>\n");
      out.write("\t<option value=\"Website Feedback\">Website Feedback</option>\n");
      out.write("\t<option value=\"Services Feedback\">Service Feedback</option>\n");
      out.write("\t<option value=\"Products Feedback\">Product Feedback</option>\n");
      out.write("\t<option value=\"Security Feedback\">Security Feedback</option>\n");
      out.write("<option value=\"Suggestions\">Suggestions</option>\n");
      out.write("<option selected=\"selected\" value=\"Others\">Others</option>\n");
      out.write("\n");
      out.write("\t</select>\n");
      out.write("\n");
      out.write("<br> <br>                                            Resident :\n");
      out.write("                                                <select name=\"Your Country\" >\n");
      out.write("\t\t<option value=\"\">-Select country-</option>\n");
      out.write("\t\t<option value=\" India\">India</option>\n");
      out.write("\t\t<option value=\" Afghanistan\">Afghanistan</option>\n");
      out.write("\t\t<option value=\" Albania\">Albania</option>\n");
      out.write("\t\t<option value=\" Algeria\">Algeria</option>\n");
      out.write("\t\t<option value=\" American Samoa\">American Samoa</option>\n");
      out.write("\t\t<option value=\" Andorra\">Andorra</option>\n");
      out.write("\t\t<option value=\" Angola\">Angola</option>\n");
      out.write("\t\t<option value=\" Anguilla\">Anguilla</option>\n");
      out.write("\t\t<option value=\" Antarctica\">Antarctica</option>\n");
      out.write("\t\t<option value=\" Antigua And Barbuda\">Antigua And Barbuda</option>\n");
      out.write("\t\t<option value=\" Argentina\">Argentina</option>\n");
      out.write("\t\t<option value=\" Armenia\">Armenia</option>\n");
      out.write("\t\t<option value=\" Aruba\">Aruba</option>\n");
      out.write("\t\t<option value=\" Australia\">Australia</option>\n");
      out.write("\t\t<option value=\" Austria\">Austria</option>\n");
      out.write("\t\t<option value=\" Azerbaijan\">Azerbaijan</option>\n");
      out.write("\t\t<option value=\" Bahamas\">Bahamas</option>\n");
      out.write("\t\t<option value=\" Bahrain\">Bahrain</option>\n");
      out.write("\t\t<option value=\" Bangladesh\">Bangladesh</option>\n");
      out.write("\t\t<option value=\" Barbados\">Barbados</option>\n");
      out.write("\t\t<option value=\" Belarus\">Belarus</option>\n");
      out.write("\t\t<option value=\" Belgium\">Belgium</option>\n");
      out.write("\t\t<option value=\" Belize\">Belize</option>\n");
      out.write("\t\t<option value=\" Benin\">Benin</option>\n");
      out.write("\t\t<option value=\" Bermuda\">Bermuda</option>\n");
      out.write("\t\t<option value=\" Bhutan\">Bhutan</option>\n");
      out.write("\t\t<option value=\" Bolivia\">Bolivia</option>\n");
      out.write("\t\t<option value=\" Bosnia and Herzegovina\">Bosnia and Herzegovina</option>\n");
      out.write("\t\t<option value=\" Botswana\">Botswana</option>\n");
      out.write("\t\t<option value=\" Bouvet Island\">Bouvet Island</option>\n");
      out.write("\t\t<option value=\" Brazil\">Brazil</option>\n");
      out.write("\t\t<option value=\" British Indian Ocean Territory\">British Indian Ocean Territory</option>\n");
      out.write("\t\t<option value=\" Brunei\">Brunei</option>\n");
      out.write("\t\t<option value=\" Bulgaria\">Bulgaria</option>\n");
      out.write("\t\t<option value=\" Burkina Faso\">Burkina Faso</option>\n");
      out.write("\t\t<option value=\" Burundi\">Burundi</option>\n");
      out.write("\t\t<option value=\" Cambodia\">Cambodia</option>\n");
      out.write("\t\t<option value=\" Cameroon\">Cameroon</option>\n");
      out.write("\t\t<option value=\" Canada\">Canada</option>\n");
      out.write("\t\t<option value=\" Cape Verde\">Cape Verde</option>\n");
      out.write("\t\t<option value=\" Cayman Islands\">Cayman Islands</option>\n");
      out.write("\t\t<option value=\" Central African Republic\">Central African Republic</option>\n");
      out.write("\t\t<option value=\" Chad\">Chad</option>\n");
      out.write("\t\t<option value=\" Chile\">Chile</option>\n");
      out.write("\t\t<option value=\" China\">China</option>\n");
      out.write("\t\t<option value=\" Christmas Island\">Christmas Island</option>\n");
      out.write("\t\t<option value=\" Cocos (Keeling) Islands\">Cocos (Keeling) Islands</option>\n");
      out.write("\t\t<option value=\" Colombia\">Colombia</option>\n");
      out.write("\t\t<option value=\" Comoros\">Comoros</option>\n");
      out.write("\t\t<option value=\" Congo\">Congo</option>\n");
      out.write("\t\t<option value=\" Cook Islands\">Cook Islands</option>\n");
      out.write("\t\t<option value=\" Costa Rica\">Costa Rica</option>\n");
      out.write("\t\t<option value=\" Croatia\">Croatia</option>\n");
      out.write("\t\t<option value=\" Cuba\">Cuba</option>\n");
      out.write("\t\t<option value=\" Cyprus\">Cyprus</option>\n");
      out.write("\t\t<option value=\" Czech Republic\">Czech Republic</option>\n");
      out.write("\t\t<option value=\" Denmark\">Denmark</option>\n");
      out.write("\t\t<option value=\" Djibouti\">Djibouti</option>\n");
      out.write("\t\t<option value=\" Dominica\">Dominica</option>\n");
      out.write("\t\t<option value=\" Dominican Republic\">Dominican Republic</option>\n");
      out.write("\t\t<option value=\" East Timor\">East Timor</option>\n");
      out.write("\t\t<option value=\" Ecuador\">Ecuador</option>\n");
      out.write("\t\t<option value=\" Egypt\">Egypt</option>\n");
      out.write("\t\t<option value=\" El Salvador\">El Salvador</option>\n");
      out.write("\t\t<option value=\" Equatorial Guinea\">Equatorial Guinea</option>\n");
      out.write("\t\t<option value=\" Eritrea\">Eritrea</option>\n");
      out.write("\t\t<option value=\" Estonia\">Estonia</option>\n");
      out.write("\t\t<option value=\" Ethiopia\">Ethiopia</option>\n");
      out.write("\t\t<option value=\" Faroe Islands\">Faroe Islands</option>\n");
      out.write("\t\t<option value=\" Fiji Islands\">Fiji Islands</option>\n");
      out.write("\t\t<option value=\" Finland\">Finland</option>\n");
      out.write("\t\t<option value=\" France\">France</option>\n");
      out.write("\t\t<option value=\" French Guiana\">French Guiana</option>\n");
      out.write("\t\t<option value=\" French Polynesia\">French Polynesia</option>\n");
      out.write("\t\t<option value=\" French Southern Territories\">French Southern Territories</option>\n");
      out.write("\t\t<option value=\" Gabon\">Gabon</option>\n");
      out.write("\t\t<option value=\" Gambia\">Gambia</option>\n");
      out.write("\t\t<option value=\" Georgia\">Georgia</option>\n");
      out.write("\t\t<option value=\" Germany\">Germany</option>\n");
      out.write("\t\t<option value=\" Ghana\">Ghana</option>\n");
      out.write("\t\t<option value=\" Gibraltar\">Gibraltar</option>\n");
      out.write("\t\t<option value=\" Greece\">Greece</option>\n");
      out.write("\t\t<option value=\" Greenland\">Greenland</option>\n");
      out.write("\t\t<option value=\" Grenada\">Grenada</option>\n");
      out.write("\t\t<option value=\" Guadeloupe\">Guadeloupe</option>\n");
      out.write("\t\t<option value=\" Guam\">Guam</option>\n");
      out.write("\t\t<option value=\" Guatemala\">Guatemala</option>\n");
      out.write("\t\t<option value=\" Guinea\">Guinea</option>\n");
      out.write("\t\t<option value=\" GW\">GW</option>\n");
      out.write("\t\t<option value=\" Guyana\">Guyana</option>\n");
      out.write("\t\t<option value=\" Haiti\">Haiti</option>\n");
      out.write("\t\t<option value=\" Heard and McDonald Islands\">Heard and McDonald Islands</option>\n");
      out.write("\t\t<option value=\" Honduras\">Honduras</option>\n");
      out.write("\t\t<option value=\" Hong Kong\">Hong Kong</option>\n");
      out.write("\t\t<option value=\" Hungary\">Hungary</option>\n");
      out.write("\t\t<option value=\" Iceland\">Iceland</option>\n");
      out.write("\t\t<option value=\" India\">India</option>\n");
      out.write("\t\t<option value=\" Indonesia\">Indonesia</option>\n");
      out.write("\t\t<option value=\" Iran\">Iran</option>\n");
      out.write("\t\t<option value=\" Iraq\">Iraq</option>\n");
      out.write("\t\t<option value=\" Ireland\">Ireland</option>\n");
      out.write("\t\t<option value=\" Israel\">Israel</option>\n");
      out.write("\t\t<option value=\" Italy\">Italy</option>\n");
      out.write("\t\t<option value=\" Ivory Coast\">Ivory Coast</option>\n");
      out.write("\t\t<option value=\" Jamaica\">Jamaica</option>\n");
      out.write("\t\t<option value=\" Japan\">Japan</option>\n");
      out.write("\t\t<option value=\" Jordan\">Jordan</option>\n");
      out.write("\t\t<option value=\" Kazakhstan\">Kazakhstan</option>\n");
      out.write("\t\t<option value=\" Kenya\">Kenya</option>\n");
      out.write("\t\t<option value=\" Kiribati\">Kiribati</option>\n");
      out.write("\t\t<option value=\" Korea\">Korea</option>\n");
      out.write("\t\t<option value=\" Kuwait\">Kuwait</option>\n");
      out.write("\t\t<option value=\" Kyrgyzstan\">Kyrgyzstan</option>\n");
      out.write("\t\t<option value=\" Laos\">Laos</option>\n");
      out.write("\t\t<option value=\" Latvia\">Latvia</option>\n");
      out.write("\t\t<option value=\" Lebanon\">Lebanon</option>\n");
      out.write("\t\t<option value=\" Lesotho\">Lesotho</option>\n");
      out.write("\t\t<option value=\" Liberia\">Liberia</option>\n");
      out.write("\t\t<option value=\" Libya\">Libya</option>\n");
      out.write("\t\t<option value=\" Liechtenstein\">Liechtenstein</option>\n");
      out.write("\t\t<option value=\" Lithuania\">Lithuania</option>\n");
      out.write("\t\t<option value=\" Luxembourg\">Luxembourg</option>\n");
      out.write("\t\t<option value=\" Macao\">Macao</option>\n");
      out.write("\t\t<option value=\" Macedonia\">Macedonia</option>\n");
      out.write("\t\t<option value=\" Madagascar\">Madagascar</option>\n");
      out.write("\t\t<option value=\" Malawi\">Malawi</option>\n");
      out.write("\t\t<option value=\" Malaysia\">Malaysia</option>\n");
      out.write("\t\t<option value=\" Maldives\">Maldives</option>\n");
      out.write("\t\t<option value=\" Mali\">Mali</option>\n");
      out.write("\t\t<option value=\" Malta\">Malta</option>\n");
      out.write("\t\t<option value=\" Marshall Islands\">Marshall Islands</option>\n");
      out.write("\t\t<option value=\" Martinique\">Martinique</option>\n");
      out.write("\t\t<option value=\" Mauritania\">Mauritania</option>\n");
      out.write("\t\t<option value=\" Mauritius\">Mauritius</option>\n");
      out.write("\t\t<option value=\" Mayotte\">Mayotte</option>\n");
      out.write("\t\t<option value=\" Mexico\">Mexico</option>\n");
      out.write("\t\t<option value=\" Micronesia\">Micronesia</option>\n");
      out.write("\t\t<option value=\" Moldova\">Moldova</option>\n");
      out.write("\t\t<option value=\" Monaco\">Monaco</option>\n");
      out.write("\t\t<option value=\" Mongolia\">Mongolia</option>\n");
      out.write("\t\t<option value=\" Montserrat\">Montserrat</option>\n");
      out.write("\t\t<option value=\" Morocco\">Morocco</option>\n");
      out.write("\t\t<option value=\" Mozambique\">Mozambique</option>\n");
      out.write("\t\t<option value=\" Myanmar\">Myanmar</option>\n");
      out.write("\t\t<option value=\" Namibia\">Namibia</option>\n");
      out.write("\t\t<option value=\" Nauru\">Nauru</option>\n");
      out.write("\t\t<option value=\" Nepal\">Nepal</option>\n");
      out.write("\t\t<option value=\" Netherlands Antilles\">Netherlands Antilles</option>\n");
      out.write("\t\t<option value=\" Netherlands\">Netherlands</option>\n");
      out.write("\t\t<option value=\" New Caledonia\">New Caledonia</option>\n");
      out.write("\t\t<option value=\" New Zealand\">New Zealand</option>\n");
      out.write("\t\t<option value=\" Nicaragua\">Nicaragua</option>\n");
      out.write("\t\t<option value=\" Niger\">Niger</option>\n");
      out.write("\t\t<option value=\" Nigeria\">Nigeria</option>\n");
      out.write("\t\t<option value=\" Niue\">Niue</option>\n");
      out.write("\t\t<option value=\" Norfolk Island\">Norfolk Island</option>\n");
      out.write("\t\t<option value=\" Northern Mariana Islands\">Northern Mariana Islands</option>\n");
      out.write("\t\t<option value=\" Norway\">Norway</option>\n");
      out.write("\t\t<option value=\" Oman\">Oman</option>\n");
      out.write("\t\t<option value=\" Pakistan\">Pakistan</option>\n");
      out.write("\t\t<option value=\" Palau\">Palau</option>\n");
      out.write("\t\t<option value=\" Panama\">Panama</option>\n");
      out.write("\t\t<option value=\" Papua new Guinea\">Papua new Guinea</option>\n");
      out.write("\t\t<option value=\" Paraguay\">Paraguay</option>\n");
      out.write("\t\t<option value=\" Peru\">Peru</option>\n");
      out.write("\t\t<option value=\" Philippines\">Philippines</option>\n");
      out.write("\t\t<option value=\" Pitcairn Island\">Pitcairn Island</option>\n");
      out.write("\t\t<option value=\" Poland\">Poland</option>\n");
      out.write("\t\t<option value=\" Portugal\">Portugal</option>\n");
      out.write("\t\t<option value=\" Puerto Rico\">Puerto Rico</option>\n");
      out.write("\t\t<option value=\" Qatar\">Qatar</option>\n");
      out.write("\t\t<option value=\" Reunion\">Reunion</option>\n");
      out.write("\t\t<option value=\" Romania\">Romania</option>\n");
      out.write("\t\t<option value=\" Russia\">Russia</option>\n");
      out.write("\t\t<option value=\" Rwanda\">Rwanda</option>\n");
      out.write("\t\t<option value=\" Saint Helena\">Saint Helena</option>\n");
      out.write("\t\t<option value=\" Samoa\">Samoa</option>\n");
      out.write("\t\t<option value=\" San Marino\">San Marino</option>\n");
      out.write("\t\t<option value=\" Sao Tome and Principe\">Sao Tome and Principe</option>\n");
      out.write("\t\t<option value=\" Saudi Arabia\">Saudi Arabia</option>\n");
      out.write("\t\t<option value=\" Senegal\">Senegal</option>\n");
      out.write("\t\t<option value=\" Seychelles\">Seychelles</option>\n");
      out.write("\t\t<option value=\" Sierra Leone\">Sierra Leone</option>\n");
      out.write("\t\t<option value=\" Singapore\">Singapore</option>\n");
      out.write("\t\t<option value=\" Slovakia\">Slovakia</option>\n");
      out.write("\t\t<option value=\" Slovenia\">Slovenia</option>\n");
      out.write("\t\t<option value=\" Solomon Islands\">Solomon Islands</option>\n");
      out.write("\t\t<option value=\" Somalia\">Somalia</option>\n");
      out.write("\t\t<option value=\" South Africa\">South Africa</option>\n");
      out.write("\t\t<option value=\" Spain\">Spain</option>\n");
      out.write("\t\t<option value=\" Sri Lanka\">Sri Lanka</option>\n");
      out.write("\t\t<option value=\" St Kitts And Nevis\">St Kitts And Nevis</option>\n");
      out.write("\t\t<option value=\" St Lucia\">St Lucia</option>\n");
      out.write("\t\t<option value=\" St Pierre and Miquelon\">St Pierre and Miquelon</option>\n");
      out.write("\t\t<option value=\" St Vincent And The Grenadines\">St Vincent And The Grenadines</option>\n");
      out.write("\t\t<option value=\" Sudan\">Sudan</option>\n");
      out.write("\t\t<option value=\" Suriname\">Suriname</option>\n");
      out.write("\t\t<option value=\" Svalbard And Jan Mayen Islands\">Svalbard And Jan Mayen Islands</option>\n");
      out.write("\t\t<option value=\" Swaziland\">Swaziland</option>\n");
      out.write("\t\t<option value=\" Sweden\">Sweden</option>\n");
      out.write("\t\t<option value=\" Switzerland\">Switzerland</option>\n");
      out.write("\t\t<option value=\" Syria\">Syria</option>\n");
      out.write("\t\t<option value=\" Taiwan\">Taiwan</option>\n");
      out.write("\t\t<option value=\" Tajikistan\">Tajikistan</option>\n");
      out.write("\t\t<option value=\" Tanzania\">Tanzania</option>\n");
      out.write("\t\t<option value=\" Thailand\">Thailand</option>\n");
      out.write("\t\t<option value=\" Togo\">Togo</option>\n");
      out.write("\t\t<option value=\" Tokelau\">Tokelau</option>\n");
      out.write("\t\t<option value=\" Tonga\">Tonga</option>\n");
      out.write("\t\t<option value=\" Trinidad And Tobago\">Trinidad And Tobago</option>\n");
      out.write("\t\t<option value=\" Tunisia\">Tunisia</option>\n");
      out.write("\t\t<option value=\" Turkey\">Turkey</option>\n");
      out.write("\t\t<option value=\" Turkmenistan\">Turkmenistan</option>\n");
      out.write("\t\t<option value=\" Turks And Caicos Islands\">Turks And Caicos Islands</option>\n");
      out.write("\t\t<option value=\" Tuvalu\">Tuvalu</option>\n");
      out.write("\t\t<option value=\" Uganda\">Uganda</option>\n");
      out.write("\t\t<option value=\" Ukraine\">Ukraine</option>\n");
      out.write("\t\t<option value=\" United Arab Emirates\">United Arab Emirates</option>\n");
      out.write("\t\t<option value=\" United Kingdom\">United Kingdom</option>\n");
      out.write("\t\t<option value=\" United States\">United States</option>\n");
      out.write("\t\t<option value=\" United States Minor Outlying Islands\">United States Minor Outlying Islands</option>\n");
      out.write("\t\t<option value=\" Uruguay\">Uruguay</option>\n");
      out.write("\t\t<option value=\" Uzbekistan\">Uzbekistan</option>\n");
      out.write("\t\t<option value=\" Vanuatu\">Vanuatu</option>\n");
      out.write("\t\t<option value=\" Vatican City State\">Vatican City State</option>\n");
      out.write("\t\t<option value=\" Venezuela\">Venezuela</option>\n");
      out.write("\t\t<option value=\" Vietnam\">Vietnam</option>\n");
      out.write("\t\t<option value=\" Virgin Islands (British)\">Virgin Islands (British)</option>\n");
      out.write("\t\t<option value=\" Virgin Islands (US)\">Virgin Islands (US)</option>\n");
      out.write("\t\t<option value=\" Wallis And Futuna Islands\">Wallis And Futuna Islands</option>\n");
      out.write("\t\t<option value=\" Western Sahara\">Western Sahara</option>\n");
      out.write("\t\t<option value=\" Yemen\">Yemen</option>\n");
      out.write("\t\t<option value=\" Yugoslavia\">Yugoslavia</option>\n");
      out.write("\t\t<option value=\" Zambia\">Zambia</option>\n");
      out.write("\t\t<option value=\" Zimbabwe\">Zimbabwe</option>\n");
      out.write("\t</select>\n");
      out.write("\n");
      out.write("                                            <br> <br>   Feedback:\n");
      out.write("                                               <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                              <textarea name=\"fdbck\" rows=\"7\" cols=\"20\"  onkeyup=\"javascript:textKey()\" style=\"width: 400px;\"></textarea>\n");
      out.write("\n");
      out.write("                                                Limit 7000 characters\n");
      out.write("                                            <br><br>Send Us<br><br>\n");
      out.write("                                            &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                            <form action=\"index.jsp\">\n");
      out.write("<input type=\"image\" name=\"submit\" src=\"images/fdbck.jpg\" width=\"80\" height=\"80\" onclick=\"javascript:if( !ValidateComments()){return false;};\"  style=\"cursor: pointer;\" />\n");
      out.write("</form>\n");
      out.write("<br>\n");
      out.write("<br>  <b>Disclaimer:</b> Kindly do not post any defamatory, infringing, obscene, indecent,\n");
      out.write("                                                    discriminatory or unlawful material or information. TEEMKART Convergence Ltd reserves\n");
      out.write("                                                    the right to remove without notice any content received from users.\n");
      out.write("\n");
      out.write("                                                    <br><br><br>\n");
      out.write("                                         <font face=\"comic sans ms\" color=\"white\" size=\"4\">\n");
      out.write("                                        <b>You can also write to us :</b>\n");
      out.write("                                        <br><br>\n");
      out.write("                                         feedback@teemkart.com<br>\n");
      out.write("                                        <br >\n");
      out.write("                                        or\n");
      out.write("                                        <br >\n");
      out.write("                                        <br >\n");
      out.write("                                        TEEMKART Ltd.<br >\n");
      out.write("                                        207, CMC Ltd, Janakpuri<br>\n");
      out.write("                                        New Delhi 110020<br >\n");
      out.write("                                        INDIA.<br >\n");
      out.write("                                        Ph.:+ 91 11 2656789<br >\n");
      out.write("                                 ");
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