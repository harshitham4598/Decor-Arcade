package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .multiselect {\n");
      out.write("  width: 200px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".selectBox {\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".selectBox select {\n");
      out.write("  width: 100%;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overSelect {\n");
      out.write("  position: absolute;\n");
      out.write("  left: 0;\n");
      out.write("  right: 0;\n");
      out.write("  top: 0;\n");
      out.write("  bottom: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#checkboxes {\n");
      out.write("  display: none;\n");
      out.write("  border: 1px #dadada solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#checkboxes label {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#checkboxes label:hover {\n");
      out.write("  background-color:#1e90ff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<form>\n");
      out.write("  <div class=\"multiselect\">\n");
      out.write("    <div class=\"selectBox\" onclick=\"showCheckboxes()\">\n");
      out.write("      <select>\n");
      out.write("        <option>Select an option</option>\n");
      out.write("      </select>\n");
      out.write("      <div class=\"overSelect\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"checkboxes\">\n");
      out.write("      <label for=\"one\">\n");
      out.write("        <input type=\"checkbox\" id=\"one\" />First checkbox</label>\n");
      out.write("      <label for=\"two\">\n");
      out.write("        <input type=\"checkbox\" id=\"two\" />Second checkbox</label>\n");
      out.write("      <label for=\"three\">\n");
      out.write("        <input type=\"checkbox\" id=\"three\" />Third checkbox</label>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("        var expanded = false;\n");
      out.write("\n");
      out.write("function showCheckboxes() {\n");
      out.write("  var checkboxes = document.getElementById(\"checkboxes\");\n");
      out.write("  if (!expanded) {\n");
      out.write("    checkboxes.style.display = \"block\";\n");
      out.write("    expanded = true;\n");
      out.write("  } else {\n");
      out.write("    checkboxes.style.display = \"none\";\n");
      out.write("    expanded = false;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("    </body>\n");
      out.write("</html>");
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
