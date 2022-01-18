package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("           @import\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\";\n");
      out.write("            body{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                font-family: serif;\n");
      out.write("                background:linear-gradient(rgba(0,0,0,0),rgba(0,0,0,2)), url(\"img/admin1.jpg\");\n");
      out.write("                height:110vh;\n");
      out.write("                background-size:cover;\n");
      out.write("            }\n");
      out.write("            .wrap{\n");
      out.write("            width :1170px;\n");
      out.write("            margin:auto;\n");
      out.write("            }\n");
      out.write("            .nav-area{\n");
      out.write("                float:right;\n");
      out.write("                list-style:none;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .nav-area li{\n");
      out.write("                display:inline-block;\n");
      out.write("            }\n");
      out.write("            .nav-area li a{\n");
      out.write("                color:#fff;\n");
      out.write("                text-decoration: snow;\n");
      out.write("                padding:5px 10px;\n");
      out.write("                font-family: poppins;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("            .nav-area li a:hover{\n");
      out.write("                background: #fff;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("            .logo img\n");
      out.write("            {\n");
      out.write("                padding:10px 5px;\n");
      out.write("                width: 140px ;\n");
      out.write("                float:left;\n");
      out.write("                height: 100px;\n");
      out.write("            }\n");
      out.write("            .Login-page{\n");
      out.write("                width: 360px;\n");
      out.write("                padding: 10% 0 0;\n");
      out.write("                margin: auto;\n");
      out.write("            }            \n");
      out.write("            .register-form{\n");
      out.write("                width: 280px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50% ,-50%);\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .register-form h1{\n");
      out.write("                float: left;\n");
      out.write("                font-size: 40px;\n");
      out.write("                border-bottom: 6px solid #fff;\n");
      out.write("                margin-bottom: 50px;\n");
      out.write("                padding: 3px;\n");
      out.write("            }\n");
      out.write("             .login-form{\n");
      out.write("                width: 280px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50% ,-50%);\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .login-form h1{\n");
      out.write("                float: left;\n");
      out.write("                font-size: 40px;\n");
      out.write("                border-bottom: 6px solid #fff;\n");
      out.write("                margin-bottom: 50px;\n");
      out.write("                padding: 3px;\n");
      out.write("            }\n");
      out.write("            .textbox{\n");
      out.write("                width: 100%;\n");
      out.write("                overflow: hidden;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding: 8px 0;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border-bottom: 1px solid activecaption;\n");
      out.write("            }\n");
      out.write("            .textbox i{\n");
      out.write("                width: 26px;\n");
      out.write("                float: left;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .textbox input{\n");
      out.write("                border: none;\n");
      out.write("                outline: none;\n");
      out.write("                background: none;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 18px;\n");
      out.write("                width: 80%;\n");
      out.write("                float: left;\n");
      out.write("              margin: 0 10px;  \n");
      out.write("            }\n");
      out.write("            .btn{\n");
      out.write("                width:  100%;\n");
      out.write("                background: none;\n");
      out.write("                border: 2px solid #fff;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 5px 5px;\n");
      out.write("                font-size: 18px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin: 12px;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #fff;\n");
      out.write("                cursor: pointer;\n");
      out.write("            padding: 15px 50px;\n");
      out.write("                width:  100%;\n");
      out.write("                    margin: 12px 0;\n");
      out.write("                background: none;\n");
      out.write("\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .form .message{\n");
      out.write("                margin: 15px 0 0;\n");
      out.write("                color: aliceblue;\n");
      out.write("                font-size: 18px;\n");
      out.write("                padding: 0 20px;\n");
      out.write(" \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .form .message a{\n");
      out.write("                color: #ccccff;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding: 18px 15px;\n");
      out.write("            }\n");
      out.write("            .form .register-form{\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            .form button:hover,.form button:active\n");
      out.write("            {\n");
      out.write("                background: #ccccff;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("                <meta charset=\"UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"#\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <header>\n");
      out.write("            <div class=\"wrap\">\n");
      out.write("                         <div class=\"logo\" >              \n");
      out.write("                        <img src=\"img/logo.png\" alt=\"\">          \n");
      out.write("                         </div>\n");
      out.write("                <div id=\"navbar\">\n");
      out.write("                <ul class=\"nav-area\">\n");
      out.write("                    <li><a href=\"main.jsp\">Home</a></li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("             </div>\n");
      out.write("             <div class=\"Login-page\">\n");
      out.write("             <div class=\"form\">\n");
      out.write("                             \n");
      out.write("                 <form class=\"login-form\" action=\"\" method=\"post\" >\n");
      out.write("                             <h1>LOGIN</h1>\n");
      out.write("                               \n");
      out.write("                             <div class=\"textbox\" >\n");
      out.write("<i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>\n");
      out.write("\n");
      out.write("                <input type=\"text\" placeholder=\"Email\" name=\"email\"  >\n");
      out.write("            </div>\n");
      out.write("             <div class=\"textbox\" >\n");
      out.write("<i class=\"fa fa-unlock-alt\" aria-hidden=\"true\"></i>\n");
      out.write("\n");
      out.write("                <input type=\"password\" placeholder=\"password\" name=\"pass\"  >\n");
      out.write("            </div>\n");
      out.write("          <input class=\"btn\" type=\"submit\"  value=\"LOGIN\" > \n");
      out.write("    \n");
      out.write("            </p>\n");
      out.write("                         </form>             \n");
      out.write("</div>\n");
      out.write("             </div>        \n");
      out.write("        <script src='https://code.jquery.com/jquery-3.3.1.min.js'>\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("         $('.message a').click(function(){\n");
      out.write("        $('form').animate({height:\"toggle\",opacity:\"toggle\"},\"slow\");\n");
      out.write("    });\n");
      out.write("        </script>        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
