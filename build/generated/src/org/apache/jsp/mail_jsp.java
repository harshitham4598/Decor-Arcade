package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class mail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int flag = 0;
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image:linear-gradient(rgba(0,0,0,2),rgba(0,0,0,0)),url(\"img/dark.jpg\");\n");
      out.write("                  background-size:cover;\n");
      out.write("                height:110vh;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                color: whitesmoke;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Email</title>     \n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        ");


            try {
                String host = "smtp.gmail.com";
                String user = "decorarcade6@gmail.com";
                String pass = "decorarcade@1998";
                String to ="harshiharshitham@gmail.com";

                String from = user;
                String subject = "Decor Arcade Booking";
                String mesg = request.getParameter("mar");
                Properties prop = System.getProperties();
                prop.put("mail.smtp.host", host);
                prop.put("mail.smtp.port", "587");
                prop.put("mail.smtp.auth", "true");
                prop.put("mail.smtp.starttls.enable", "true");

                Session ses1 = Session.getDefaultInstance(prop, null);
                MimeMessage msg = new MimeMessage(ses1);
                msg.setFrom(new InternetAddress(from));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                msg.setSubject(subject);
                msg.setText(mesg);

                Transport transport = ses1.getTransport("smtp");
                transport.connect(host, user, pass);
                transport.sendMessage(msg, msg.getAllRecipients());
                System.out.println("Message sent Successfully");
                transport.close();

                flag = 1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");

        response.setHeader("Cache-Control" , "no-cache, no-store, must-revalidate");
        if(session.getAttribute("em")== null){
         response.sendRedirect("main.jsp");
        }

      out.write("     <br><br>   \n");
      out.write("<center> <h1>You have successfully booked your package.<br> We will be sending you a confirmation mail.</h1> <br><br>\n");
      out.write("     <h1>press OK to logout </h1><br>\n");
      out.write("        <a href=\"logout.jsp\"><input type=\"button\" value=\"Ok\"></a></center> \n");
      out.write("    </body>\n");
      out.write("\n");
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
