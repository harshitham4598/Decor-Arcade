package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class scratchcard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("  padding: 20px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    background:  url( \"img/scratch.jpg\");\n");
      out.write("                              background-size: cover;\n");
      out.write("    border: 3px solid yellow;\n");
      out.write("  position: relative;\n");
      out.write("  width: 300px;\n");
      out.write("  height: 300px;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  -webkit-user-select: none;\n");
      out.write("  -moz-user-select: none;\n");
      out.write("  -ms-user-select: none; \n");
      out.write("  -o-user-select: none;\n");
      out.write("  user-select: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".canvas {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form {\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"container\" id=\"js-container\">\n");
      out.write("  <canvas class=\"canvas\" id=\"js-canvas\" width=\"300\" height=\"300\"></canvas>\n");
      out.write("  <form class=\"form\" style=\"visibility: hidden;\">\n");
      out.write("    <h2>'Allo, 'Allo!</h2>\n");
      out.write("    <h3>The secret code is:</h3>\n");
      out.write("    <h1><code>HlkafSYc</code></h1>\n");
      out.write("    <div>\n");
      out.write("      <input type=\"text\" name=\"code\" placeholder=\"Secret Code\">\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <div>\n");
      out.write("      <input type=\"submit\" value=\"Submit\">\n");
      out.write("    </div>\n");
      out.write("  </form>  \n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
