package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class designer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("         box-sizing: border-box;\n");
      out.write("             }\n");
      out.write("            .wrap{\n");
      out.write("                 width :1170px;\n");
      out.write("                margin:auto;\n");
      out.write("            }\n");
      out.write("            .nav-area{\n");
      out.write("                float:right;\n");
      out.write("                list-style:none;\n");
      out.write("                margin-top: 30px;\n");
      out.write("            }\n");
      out.write("            .nav-area li{\n");
      out.write("                display:inline-block;\n");
      out.write("            }\n");
      out.write("            .nav-area li a{\n");
      out.write("                color:#fff;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding:5px 20px;\n");
      out.write("                font-family:poppins;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("            .nav-area li a:hover{\n");
      out.write("                background: #fff;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("            .logo img{\n");
      out.write("                background-color:  transparent;\n");
      out.write("                padding:15px 15px;\n");
      out.write("                width: 150px ;\n");
      out.write("                float:left;\n");
      out.write("                height: 130px;\n");
      out.write("            }\n");
      out.write("            ");
      out.write("\n");
      out.write("            form{\n");
      out.write("                background-color: rgba(128,128,128,0.6);\n");
      out.write("                width:500px;\n");
      out.write("                margin-left:35%; \n");
      out.write("                color:white;\n");
      out.write("                margin-top:-5%;\n");
      out.write("            }\n");
      out.write("     input[type=text], select, textarea {\n");
      out.write("     width: 100%;\n");
      out.write("     padding: 10px 12px;\n");
      out.write("     border: 2px solid #ccc;\n");
      out.write("     border-radius: 6px;\n");
      out.write("     resize: vertical;\n");
      out.write("     margin-left:20px;\n");
      out.write("}\n");
      out.write("     label {\n");
      out.write("       padding: 12px 12px 12px 21px;\n");
      out.write("       display: inline-block;\n");
      out.write("       font-size:120%;\n");
      out.write("    }\n");
      out.write("    input[type=submit] {\n");
      out.write("      background-color: #4CAF50;\n");
      out.write("      color: white;\n");
      out.write("      padding: 12px 30px;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 6px;\n");
      out.write("      cursor: pointer;\n");
      out.write("      \n");
      out.write("     }\n");
      out.write("    input[type=submit]:hover {\n");
      out.write("       background-color: #45a049;\n");
      out.write("    }\n");
      out.write("    .container {\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background: linear-gradient(rgba(0,0,0,3),rgba(0,0,0,0)), url( \"img/design.jpg\");\n");
      out.write("    height:110vh;\n");
      out.write("    background-size:cover;\n");
      out.write("    padding: 130px 20px;\n");
      out.write("     }\n");
      out.write("    .col-25 {\n");
      out.write("      float: left;\n");
      out.write("      width: 25%;\n");
      out.write("      margin-top: 6px;\n");
      out.write("      }\n");
      out.write("    .col-75 {\n");
      out.write("      float: left;\n");
      out.write("      width: 65%;\n");
      out.write("      margin-top: 6px;\n");
      out.write("     }\n");
      out.write("   .row:after {\n");
      out.write("     content: \"\";\n");
      out.write("     display: table;\n");
      out.write("     clear: both;\n");
      out.write("     }\n");
      out.write("    @media screen and (max-width: 600px) {\n");
      out.write("     .col-25, .col-75, input[type=submit] {\n");
      out.write("      width: 100%;\n");
      out.write("       margin-top: 0;\n");
      out.write("    }\n");
      out.write("   }\n");
      out.write("   .contain{\n");
      out.write("       width:20px;\n");
      out.write("       height:20px;\n");
      out.write("      margin-left:100px;\n");
      out.write("   }\n");
      out.write("    .checkmark{\n");
      out.write("        width:200px;\n");
      out.write("        height:20px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("        </style>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Design</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"#\">             \n");
      out.write("        <link\n");
      out.write("         href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("            rel=\"stylesheet\">   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("                <div class=\"logo\" >              \n");
      out.write("                    <img src=\"img/logo.png\" alt=\"\">          \n");
      out.write("                </div> \n");
      out.write("                    <ul class=\"nav-area\">\n");
      out.write("                    <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"\">logout</a></li>                    \n");
      out.write("                    </ul>\n");
      out.write("                </div> \n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("  <form action=\"\"><br>\n");
      out.write("      <center><h1><u>BOOKING</u></h1></center>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"fname\">First Name:</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Your name..\">\n");
      out.write("      </div>\n");
      out.write("    </div>      \n");
      out.write("       <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"fname\">Phone number:</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"pno\" name=\"phonenumber\" placeholder=\"Your number..\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"fname\">Email ID:</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"email\" name=\"emailid\" placeholder=\" email..\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"country\">Package:</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <select id=\"country\" name=\"Package\">\n");
      out.write("           <option value=\"australia\">India</option>\n");
      out.write("          <option value=\"australia\">Australia</option>\n");
      out.write("          <option value=\"canada\">Canada</option>\n");
      out.write("          <option value=\"usa\">USA</option>\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"subject\">Address:</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <textarea id=\"subject\" name=\"subject\" placeholder=\"Write something..\" style=\"height:100px\"></textarea>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <br>\n");
      out.write("        <center><input type=\"submit\" value=\"book\"></center>\n");
      out.write("        <br>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("    </body>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
