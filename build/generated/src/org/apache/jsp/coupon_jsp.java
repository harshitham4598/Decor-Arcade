package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class coupon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("body {\n");
      out.write("  font-family: Arial;\n");
      out.write("}\n");
      out.write(".wrap{\n");
      out.write("            width :1170px;\n");
      out.write("            margin:auto;\n");
      out.write("            }\n");
      out.write("             .logo img\n");
      out.write("            {\n");
      out.write("                padding:1px 0px;\n");
      out.write("                width: 90px ;\n");
      out.write("                float:left;\n");
      out.write("                height: 70px;\n");
      out.write("                background: gray;\n");
      out.write("            }\n");
      out.write("            .logo h2{\n");
      out.write("                font-size: 40px;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                padding:5px 145px;\n");
      out.write("                color: #000033\n");
      out.write("            }\n");
      out.write(".coupon {\n");
      out.write("  border: 4px double #bbb;\n");
      out.write("  width: 80%;\n");
      out.write("  border-radius: 15px;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  max-width: 400px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  padding: 2px 16px;\n");
      out.write("  \n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  font-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".promo {\n");
      out.write("  background: #ccc;\n");
      out.write("  padding: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".expire {\n");
      out.write("  color: red;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"coupon\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("      <div class=\"wrap\">\n");
      out.write("                         <div class=\"logo\" >              \n");
      out.write("                        <img src=\"img/logo.png\" alt=\"\">  \n");
      out.write("                        <h2><u>Gift Collection:</u></h2>\n");
      out.write("                         </div>\n");
      out.write("       </div>\n");
      out.write("  <img src=\"img/home2.jpg\" alt=\"Avatar\" style=\"width:100%;\" >\n");
      out.write("  <div class=\"container\" style=\"background-color:transparent\">\n");
      out.write("    <h3><b>20% OFF YOUR BOOKING</b></h3> \n");
      out.write("    <p>On booking of platinum package you will be getting 20% off on your booking package with exciting gifts and offers.\n");
      out.write("        we will give you better result on renovating your sweet home.\n");
      out.write("    ENJOY!!!!!!</p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <p>Use Promo Code: <span class=\"promo\">BOH232</span></p>\n");
      out.write("    <p class=\"expire\">Expires: Jan 03, 2017</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
