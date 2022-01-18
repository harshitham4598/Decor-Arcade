package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.jms.Session;
import java.sql.*;

public final class adminconfirm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<style>\n");
      out.write("    #navbar a{\n");
      out.write("        font-family: cursive;\n");
      out.write("        font-weight: 400;\n");
      out.write("        color: whitesmoke;\n");
      out.write("        text-transform: uppercase;\n");
      out.write("        text-decoration: none;\n");
      out.write("    }\n");
      out.write("    #navbar{\n");
      out.write("        width: 100%;\n");
      out.write("        height: 65px;\n");
      out.write("        position: fixed;\n");
      out.write("        top: 0;\n");
      out.write("        left: 0;\n");
      out.write("        background: black;\n");
      out.write("        box-shadow: 10px;\n");
      out.write("        z-index: 1;\n");
      out.write("        background-image:url(\"images/texture.jpg\");\n");
      out.write("    }\n");
      out.write("    #logo{\n");
      out.write("        width: 100px;\n");
      out.write("        float:left;\n");
      out.write("        margin:10px 0px 0 0;\n");
      out.write("    }\n");
      out.write("    #logo img{\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("    #logo:hover{opacity: 0.5;}\n");
      out.write("\n");
      out.write("    header nav{\n");
      out.write("        float:right;\n");
      out.write("        margin: 10px 50px 0 0;\n");
      out.write("    }\n");
      out.write("    #navbar nav ul li{\n");
      out.write("        float: left;\n");
      out.write("        margin-right: 25px;\n");
      out.write("    }\n");
      out.write("    #navbar nav ul li a{\n");
      out.write("        font-size: 13px;\n");
      out.write("    }\n");
      out.write("    #navbar nav ul li:hover{\n");
      out.write("        padding-top: 5px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #photo{\n");
      out.write("        font-family: \"Trebuchet Ms\",Arial,Helvetica,sans-serif;\n");
      out.write("        border-collapse: collapse;\n");
      out.write("        width: 90%;\n");
      out.write("    }\n");
      out.write("    #photo td,#photo th{\n");
      out.write("        color: #398B93;\n");
      out.write("        padding: 0px;\n");
      out.write("        text-align: center;\n");
      out.write("        border-radius: 5px;\n");
      out.write("    }\n");
      out.write("    #photo tr:nth-child(even){\n");
      out.write("        background-color: #f2f2f2;\n");
      out.write("    }\n");
      out.write("    #photo tr:hover{\n");
      out.write("        background-color: #ddd;\n");
      out.write("    }\n");
      out.write("    #photo th{\n");
      out.write("        padding-top: 12px;\n");
      out.write("        padding-bottom: 12px;\n");
      out.write("        text-align: center;\n");
      out.write("        background-color: #4CAF50;\n");
      out.write("        color: white;\n");
      out.write("        border-radius: 10px;\n");
      out.write("    }\n");
      out.write("    .but  {\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 40px;\n");
      out.write("        background: #292b2e;\n");
      out.write("        color: #f9f9f9;\n");
      out.write("        padding: 15px 37px;\n");
      out.write("        margin: 10px 0 20px 60px;\n");
      out.write("        margin-left: auto;\n");
      out.write("        margin-right: auto;\n");
      out.write("    }\n");
      out.write("    .scale {\n");
      out.write("        transform: scale(1.2);\n");
      out.write("        box-shadow: 0 0 4px 1px rgba(20, 20, 20, 0.8);\n");
      out.write("    }\n");
      out.write("    .but {\n");
      out.write("        background: #64AAA4;\n");
      out.write("    }\n");
      out.write("    .but:hover\n");
      out.write("    {\n");
      out.write("        cursor: pointer;\n");
      out.write("        background-color: #1F6B75;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");

    Connection con = null;
    Statement st = null;

    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
    Statement stmt = con.createStatement();

    ResultSet rs;

    rs = stmt.executeQuery("select * from booking where 1");


      out.write("\n");
      out.write("<body background=\"\"></body>\n");
      out.write("\n");
      out.write("<!----------------------header------------------------------------>\n");
      out.write("\n");
      out.write("<header id=\"navbar\">\n");
      out.write("    <div id=\"logo\">\n");
      out.write("        <a href=\"#\">\n");
      out.write("            <img src=\"images/logo.png\" alt=\"logo\">\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <nav id=\"main-nav\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"logout.jsp\">logout</a></li>    \n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("</header><br><br><br><br>\n");
      out.write("<!----------------------------table------------------------------------------>\n");
      out.write("<table id=\"photo\" align=\"center\">\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("\n");
      out.write("        <th>\n");
      out.write("            Name\n");
      out.write("        </th>\n");
      out.write("                        \n");
      out.write("        <th>\n");
      out.write("            Phone\n");
      out.write("        </th>\n");
      out.write("        <th>\n");
      out.write("            Email             \n");
      out.write("        </th>\n");
      out.write("        \n");
      out.write("        <th>\n");
      out.write("            date               \n");
      out.write("        </th>\n");
      out.write("        <th>Package</th>\n");
      out.write("        <th>Design</th>\n");
      out.write("        <th>confirm</th>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("</tr>\n");

                                  while (rs.next()) {
      out.write("      \n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>                  \n");
      out.write("        ");
      out.print(rs.getString("fname"));
      out.write("\n");
      out.write("    </td>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <td>\n");
      out.write("        ");
      out.print(rs.getString("phone"));
      out.write("                          \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      out.print(rs.getString("email"));
      out.write("\n");
      out.write("    </td>\n");
      out.write("     \n");
      out.write("<td>\n");
      out.write("        ");
      out.print(rs.getString("date"));
      out.write("                          \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      out.print(rs.getString("package"));
      out.write("                          \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      out.print(rs.getString("vocher"));
      out.write("                          \n");
      out.write("    </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <td><input type=\"submit\" class=\"but\"  value=\"mail\"  onclick=\"javascript:window.location = 'adminlast.jsp?user_id=");
      out.print(rs.getInt("id"));
      out.write("'\">\n");
      out.write("\n");
      out.write("    </td>\n");
      out.write("\n");
      out.write("        ");

            }
        
      out.write("        \n");
      out.write("</table>\n");
      out.write("        </body>\n");
      out.write("        </html>\n");
      out.write("\n");
      out.write("\n");
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
