package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("           ");
      out.write("\n");
      out.write("            body{\n");
      out.write("                height:100vh;\n");
      out.write("                margin:0px;\n");
      out.write("                border: 0px;\n");
      out.write("                background-color:#fff ;\n");
      out.write("                      text-decoration:none;\n");
      out.write("            }\n");
      out.write("             header{\n");
      out.write("                background: linear-gradient(rgba(0,0,0,3),rgba(0,0,0,0)), url( \"img/main.jpg\");\n");
      out.write("                height:95vh;\n");
      out.write("                -webkit-background-size:cover;\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position:center bottom;\n");
      out.write("                position:relative;\n");
      out.write("            }\n");
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
      out.write("                width: 190px ;\n");
      out.write("                float:left;\n");
      out.write("                height: 155px;\n");
      out.write("            }\n");
      out.write("            .welcome-text{\n");
      out.write("                position: absolute;\n");
      out.write("                width:530px;\n");
      out.write("                margin: 18% 30%;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .welcome-text h1{\n");
      out.write("                text-align: center;\n");
      out.write("                color: #fff;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                font-size: 45px;\n");
      out.write("                font-family: initial;\n");
      out.write("            }\n");
      out.write("            .welcome-text h2{\n");
      out.write("                color: #fff; \n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .welcome-text p{\n");
      out.write("                color: #fff;\n");
      out.write("               font-size: 15px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .welcome-text a{\n");
      out.write("                border: 1px solid #fff;\n");
      out.write("                padding:10px 15px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                font-size: 13px;\n");
      out.write("                margin-top: 18px;\n");
      out.write("                display: inline-block;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .welcome-text a:hover{\n");
      out.write("                background: #fff;\n");
      out.write("                color: #b99;\n");
      out.write("            }\n");
      out.write("            .welcome-text a{\n");
      out.write("                background: #fff;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("          ");
      out.write("         \n");
      out.write("          .wrap1 {\n");
      out.write("                text-align: center;\n");
      out.write("                font-family: lato;\n");
      out.write("                font-size: 150%;\n");
      out.write("                color: #333;\n");
      out.write("                background: transparent;\n");
      out.write("                text-decoration: deepskyblue;\n");
      out.write("                padding: 20px 90px;\n");
      out.write("            }\n");
      out.write("            .wrap1 h2{\n");
      out.write("                font-family: lato;\n");
      out.write("                font-size: 45px;\n");
      out.write("                color: #333;\n");
      out.write("            }           \n");
      out.write("            .wrap1 h2{\n");
      out.write("\n");
      out.write("                font-family:inherit;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color:#000;\n");
      out.write("                text-align: center;\n");
      out.write("                margin-bottom: 45px;\n");
      out.write("                font-size: 35px;\n");
      out.write("            }\n");
      out.write("              .wrap1 p{\n");
      out.write("                font-size: 25px;\n");
      out.write("                text-align: center;\n");
      out.write("                font-family: initial;\n");
      out.write("                width: 1110px;\n");
      out.write("                margin: 2% auto;\n");
      out.write("                color: #000;\n");
      out.write("\n");
      out.write("              }\n");
      out.write("               *{\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("                transition:ease all .4s ;\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("               background: linear-gradient(rgba(0,0,0,50),rgba(0,0,0,50));\n");
      out.write("               background-size: cover;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 90vh;\n");
      out.write("                overflow: hidden;\n");
      out.write("                display: flex;\n");
      out.write("            }\n");
      out.write("            .one , .two{\n");
      out.write("                flex: 1;\n");
      out.write("                background-position: center;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .content{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100vh;\n");
      out.write("            }\n");
      out.write("            .one .content{\n");
      out.write("        background: linear-gradient(to right,rgba(0,0,0,0),rgba(0,0,0,0));\n");
      out.write("      font-size: 30px;\n");
      out.write("        text-align: center;\n");
      out.write("        font-family: serif;\n");
      out.write("        padding: 190px 2px;\n");
      out.write("        color: #fff;\n");
      out.write("            }\n");
      out.write("            .two .content{\n");
      out.write("        background: linear-gradient(to right,rgba(0,0,0,0),rgba(0,0,0,0));\n");
      out.write("            }\n");
      out.write("            @media(max-width:768px)\n");
      out.write("            {\n");
      out.write("                .container{\n");
      out.write("                    flex-direction: column;\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            .xop-section{\n");
      out.write("               width: 700px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px 1px;\n");
      out.write("                height: 30vh;\n");
      out.write("                margin-top: 1px;\n");
      out.write("                -webkit-background-size:cover;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            .xop-section h2{\n");
      out.write("            color: aliceblue; \n");
      out.write("            padding: 17px 220px;\n");
      out.write("            float: left;\n");
      out.write("            font-size: 35px;  \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .xop-grid{\n");
      out.write("                padding: 1px 10px;\n");
      out.write("                list-style: image;\n");
      out.write("                display: inline-block;\n");
      out.write("                text-align: left;\n");
      out.write("                width: 90%;\n");
      out.write("          \n");
      out.write("            }            \n");
      out.write("            .xop-grid li{\n");
      out.write("                width: 175px;\n");
      out.write("                height: 200px;\n");
      out.write("                display:inline-block ;\n");
      out.write("                float:left;          \n");
      out.write("                padding: 10px 1px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .xop-box{\n");
      out.write("                width:  160px;\n");
      out.write("                height: 160px;\n");
      out.write("                position: relative;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                border: 2px solid #fff;\n");
      out.write("              transition: 0.3s ;\n");
      out.write("              background-size: cover;\n");
      out.write("            }\n");
      out.write("            .xop-img-1:hover , .xop-img-2:hover , .xop-img-3:hover , .xop-img-4:hover , .xop-img-5:hover , .xop-img-6:hover {\n");
      out.write("                transform: scale(1.40);\n");
      out.write("            }\n");
      out.write("            .xop-img-1{\n");
      out.write("                background: linear-gradient(rgba(0,0,0,0.0),rgba(0,0,0,0.90)),url(\"img/home10.jpg\");\n");
      out.write("                              background-size: cover;\n");
      out.write("                }\n");
      out.write("            .xop-img-2{\n");
      out.write("                background: linear-gradient(rgba(0,0,0,0.0),rgba(0,0,0,1.10)),url(\"img/home6.jpg\");\n");
      out.write("                              background-size: cover;\n");
      out.write("            }\n");
      out.write("            .xop-img-3{\n");
      out.write("                background: linear-gradient(rgba(0,0,0,0.0),rgba(0,0,0,1.10)),url(\"img/home7.jpg\");\n");
      out.write("                              background-size: cover;\n");
      out.write("            }\n");
      out.write("            .xop-img-4{\n");
      out.write("                background: linear-gradient(rgba(0,0,0,0.0),rgba(0,0,0,1.10)),url(\"img/home8.jpg\");\n");
      out.write("                              background-size: cover;\n");
      out.write("            }\n");
      out.write("            .xop-img-5{\n");
      out.write("                background: linear-gradient(rgba(0,0,0,0.0),rgba(0,0,0,1.10)),url(\"img/home9.jpg\");\n");
      out.write("                              background-size: cover;\n");
      out.write("            }\n");
      out.write("            .xop-img-6{\n");
      out.write("                background: linear-gradient(rgba(0,0,0,0.0),rgba(0,0,0,1.10)),url(\"img/home11.jpg\");\n");
      out.write("                              background-size: cover;\n");
      out.write("                 }\n");
      out.write("            \n");
      out.write("            .xop-info{\n");
      out.write("                position: absolute;\n");
      out.write("                width: inherit;\n");
      out.write("                height: inherit;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration:none;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .xop-info h3{\n");
      out.write("                font-family:fantasy;\n");
      out.write("                font-weight: 900;\n");
      out.write("                color: #000;\n");
      out.write("                font-size: 25px;\n");
      out.write("                padding: 20px 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration:none;\n");
      out.write("            }           \n");
      out.write(" ");
      out.write("\n");
      out.write(" .ab img{\n");
      out.write("     width:  80px;\n");
      out.write("                height:80px;\n");
      out.write("                position: relative;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                border: 2px solid #fff;\n");
      out.write("               margin-left:380px;\n");
      out.write(" }\n");
      out.write(" .ab img:hover{\n");
      out.write("    opacity: 0.5;\n");
      out.write("                cursor: pointer;\n");
      out.write(" }\n");
      out.write(" .bc img{\n");
      out.write("  width:  90px;\n");
      out.write("                height:90px;\n");
      out.write("                position: relative;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                border: 2px solid #fff;\n");
      out.write("               margin-left:380px;   \n");
      out.write(" }\n");
      out.write(" ");
      out.write("\n");
      out.write(" * {\n");
      out.write("     box-sizing: border-box;\n");
      out.write(" }\n");
      out.write("body {\n");
      out.write("    font-family: Verdana, sans-serif;\n");
      out.write("}\n");
      out.write(".mySlides {\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write("img {\n");
      out.write("    vertical-align: middle;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".slideshow-container {\n");
      out.write("  max-width: 750px;\n");
      out.write("  position: relative;\n");
      out.write("  margin: auto;\n");
      out.write("}\n");
      out.write(".slideshow-container h1{\n");
      out.write("    text-align:center;\n");
      out.write("    padding:30px 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dot {\n");
      out.write("  height: 15px;\n");
      out.write("  width: 15px;\n");
      out.write("  margin: 0 2px;\n");
      out.write("  background-color: #bbb;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  display: inline-blocks;\n");
      out.write("  transition: background-color 0.6s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("  background-color: #717171;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fade {\n");
      out.write("  -webkit-animation-name: fade;\n");
      out.write("  -webkit-animation-duration: 0.6s;\n");
      out.write("  animation-name: fade;\n");
      out.write("  animation-duration: 2.6s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes fade {\n");
      out.write("  from {opacity: .1} \n");
      out.write("  to {opacity: 1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes fade {\n");
      out.write("  from {opacity: .1} \n");
      out.write("  to {opacity: 1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media only screen and (max-width: 300px) {\n");
      out.write("  .text {font-size: 11px}\n");
      out.write("}\n");
      out.write("\n");
      out.write(" footer {\n");
      out.write("   background: linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0)), url( \"img/foot.jpg\");\n");
      out.write("  margin-top: auto;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("      \n");
      out.write("     ul {\n");
      out.write("        list-style: none;\n");
      out.write("        float: right;\n");
      out.write("        }\n");
      out.write("            .flex-rw {\n");
      out.write("         display: flex;\n");
      out.write("         flex-flow: row wrap;\n");
      out.write("}\n");
      out.write("    a {\n");
      out.write("      text-decoration: none;\n");
      out.write("     }\n");
      out.write("     .footer-list-top {\n");
      out.write("    width: 33.333%;\n");
      out.write("     }\n");
      out.write("     .footer-list-top > li {\n");
      out.write("      text-align: center;\n");
      out.write("      padding-bottom: 10px;\n");
      out.write("}\n");
      out.write("       .footer-list-header {\n");
      out.write("     padding: 10px 0 15px 0;\n");
      out.write("     color: #fff;\n");
      out.write("     font: 2.3vw \"Oswald\", sans-serif;\n");
      out.write("       }\n");
      out.write("    .footer-list-anchor {\n");
      out.write("       font: 1.3em \"Open Sans\", sans-serif;\n");
      out.write("     }\n");
      out.write("     .footer-social-section {\n");
      out.write("  width: 100%;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: space-around;\n");
      out.write("  position: relative;\n");
      out.write("  margin-top: 5px;\n");
      out.write("}\n");
      out.write(".footer-social-section flex-rw{\n");
      out.write("    align-content: center;\n");
      out.write("}\n");
      out.write(".footer-social-section::after {\n");
      out.write("  content: \"\";\n");
      out.write("  position: absolute;\n");
      out.write("  z-index: 1;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 10px;\n");
      out.write("  border-top: 1px solid #B99;\n");
      out.write("  width: calc(100% - 20px);\n");
      out.write("}\n");
      out.write(".footer-social-overlap {\n");
      out.write("  position: relative;\n");
      out.write("  z-index: 2;\n");
      out.write("  background: rgb(55,55,55);\n");
      out.write("  padding: 0 20px;\n");
      out.write("}\n");
      out.write(".footer-social-icons-wrapper {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10PX 20PX;\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("  .footer-social-overlap > a:not(:first-child) {\n");
      out.write("    margin-left: 20px;\n");
      out.write("  }\n");
      out.write("  .footer-bottom-section {\n");
      out.write("    padding: 0 5px 10px 5px;\n");
      out.write("  }\n");
      out.write("  .footer-bottom-wrapper {\n");
      out.write("    text-align: center;\n");
      out.write("    width: 100%;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    background-color: white;\n");
      out.write("  }\n");
      out.write("  .foot{\n");
      out.write("       text-align: center;\n");
      out.write("    width: 100%;\n");
      out.write("    margin-top: 10px;\n");
      out.write("  color: #B99;\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  .footer-bottom-rights{\n");
      out.write("      background-color: white;\n");
      out.write("      font-size: 12px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("@media only screen and (max-width: 480px) {\n");
      out.write("  .footer-social-overlap > a {\n");
      out.write("    margin: auto;\n");
      out.write("  }\n");
      out.write("  .footer-social-overlap > a:not(:first-child) {\n");
      out.write("    margin-left: 0;\n");
      out.write("  }\n");
      out.write("  .footer-bottom-rights {\n");
      out.write("    display: block;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("@media only screen and (max-width: 320px) {\n");
      out.write("  .footer-list-header {\n");
      out.write("    font-size: 2.2em;\n");
      out.write("  }\n");
      out.write("  .footer-list-anchor {\n");
      out.write("    font-size: 1.2em;\n");
      out.write("  }\n");
      out.write("  .footer-social-connect {\n");
      out.write("    font-size: 2.4em;\n");
      out.write("  }\n");
      out.write("  .footer-social-overlap > a {\n");
      out.write("    font-size: 2.24em;\n");
      out.write("  }\n");
      out.write("  .footer-bottom-wrapper {\n");
      out.write("    font-size: 1.3em;\n");
      out.write("    background-color: white;\n");
      out.write("    color: #B99;\n");
      out.write("\n");
      out.write("  }\n");
      out.write("}\n");
      out.write(".footer-address{\n");
      out.write("    background-color: white;\n");
      out.write("    font-size: 15px;\n");
      out.write("}\n");
      out.write(".footer-icons{\n");
      out.write("align-content: center;\n");
      out.write("color: #B99;\n");
      out.write("margin-left:  350px;\n");
      out.write("margin-top:  10px;\n");
      out.write("margin-top: 50px;\n");
      out.write("font-size: 40px;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".footer-connect a{\n");
      out.write("    \n");
      out.write("     border: 1px solid #fff;\n");
      out.write("                padding:5px 15px;\n");
      out.write("                text-decoration:none;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                font-size: 13px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                display: inline-block;\n");
      out.write("                color: #bff;\n");
      out.write("                margin-left: 560px;\n");
      out.write("             \n");
      out.write("}\n");
      out.write(".footer-connect a:hover{\n");
      out.write("                background: #fff;\n");
      out.write("                color: #b99;\n");
      out.write("            }\n");
      out.write("            .footer-connect  a{\n");
      out.write("                background: #fff;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("       .generic-anchor {\n");
      out.write("           color: #B99;        \n");
      out.write("\t&:visited {\n");
      out.write("\t\tcolor: #B99;\n");
      out.write("\t}\n");
      out.write("\t&:hover {\n");
      out.write("\t\tcolor: #B99;\n");
      out.write("\t}\n");
      out.write("         }\n");
      out.write("         \n");
      out.write("         #box5  img{\n");
      out.write("                width: 50px;\n");
      out.write("                margin:10px 0px 0 0; \n");
      out.write("            }\n");
      out.write("             ab{\n");
      out.write("                width: 30px;\n");
      out.write("                margin:10px 0px 0 0; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write(" \n");
      out.write("        </style>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>home</title>\n");
      out.write("        <link rel=\"spreadsheet\" href=\"#\">\n");
      out.write("        <link \n");
      out.write("            href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" \n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("        <link\n");
      out.write("         href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                <header>\n");
      out.write("                <div class=\"wrap\">\n");
      out.write("                <div class=\"logo\" >              \n");
      out.write("                    <img src=\"img/logo.png\" alt=\"\">          \n");
      out.write("                </div> \n");
      out.write("                    <ul class=\"nav-area\">\n");
      out.write("                    \n");
      out.write("                    <li><a href=\"login.jsp\">login</a></li>\n");
      out.write("                     <li><a href=\"admin.jsp\">Admin</a></li>                   \n");
      out.write("                    </ul>\n");
      out.write("                </div> \n");
      out.write("                    <div class=\"welcome-text\">\n");
      out.write("                    <h1><b>DECOR ARCADE</b></h1>\n");
      out.write("                    <br>\n");
      out.write("                    <section class=\"w1-container w1-center w2-content\" style=\"max-width:600px\">\n");
      out.write("                        <h2 class=\"w1\">Are you looking for best Home Makeover!</h2>\n");
      out.write("                        <p class=\"w2\"><i>We love your home</i></p>\n");
      out.write("                    </section>\n");
      out.write("                    <a href=\"footer\">Contact us</a>\n");
      out.write("                </div> \n");
      out.write("                </header>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <section class=\"wrap1\">\n");
      out.write("            <h2>Why Decor Arcade?</h2> \n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("                Most of these families are having serious financial problems. They're struggling to pay \n");
      out.write("                their bills for home makeover, including the mortgage.Yes, Decor Arcade is doing great\n");
      out.write("                things to improve their homes and lifestyles.Decor Arcade is not only a home\n");
      out.write("                makeover application with a crunch budget but an effort to bring families together by making\n");
      out.write("                over their mundane living space into their dream homes.  \n");
      out.write("            </p>\n");
      out.write("            <br>\n");
      out.write("        </section>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!--        <section>\n");
      out.write("         \n");
      out.write("            <center>  <b> contact us:</b></center></h3>\n");
      out.write("               <div class=\"ab\"> \n");
      out.write("                   <img src=\"img/email.png\" alt=\"\"/><img src=\"img/at.png\" alt=\"\"/><img  src=\"img/phone.png\" alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("        <h3>Message Us:</h3>9164815372\n");
      out.write("        <h3>Mail Us:</h3>decorarcade6@gmail.com\n");
      out.write("        <h3>Call Us:</h3>9164815372</section>-->\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"slideshow-container\">\n");
      out.write("            <h1> <u>Best Designes</u></h1>\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <img src=\"img/slide1.jpg\" style=\"width:100%\">\n");
      out.write("</div>\n");
      out.write("  <div class=\"mySlides fade\">\n");
      out.write("  <img src=\"img/slide2.jpg\" style=\"width:100%\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"mySlides fade\">\n");
      out.write("  <img src=\"img/slide3.jpg\" style=\"width:100%\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"mySlides fade\">\n");
      out.write("  <img src=\"img/slide4.jpg\" style=\"width:100%\">\n");
      out.write("  </div>  \n");
      out.write("             <div class=\"mySlides fade\">\n");
      out.write("   <img src=\"img/slide5.jpg\" style=\"width:100%\">\n");
      out.write("  </div> \n");
      out.write("             <div class=\"mySlides fade\">\n");
      out.write("  <img src=\"img/slide6.jpg\" style=\"width:100%\">\n");
      out.write("  </div> \n");
      out.write("             <div class=\"mySlides fade\">\n");
      out.write("  <img src=\"img/slide7.jpg\" style=\"width:100%\">\n");
      out.write("</div> \n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<div style=\"text-align: center\">\n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span>\n");
      out.write("  <span class=\"dot\"></span>\n");
      out.write("  <span class=\"dot\"></span>\n");
      out.write("  <span class=\"dot\"></span>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("var slideIndex = 0;\n");
      out.write("showSlides();\n");
      out.write("function showSlides() {\n");
      out.write("  var i;\n");
      out.write("  var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("  var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("  for (i = 0; i < slides.length; i++) {\n");
      out.write("    slides[i].style.display = \"none\";  \n");
      out.write("  }\n");
      out.write("  slideIndex++;\n");
      out.write("  if (slideIndex > slides.length) {slideIndex = 1;}    \n");
      out.write("  for (i = 0; i < dots.length; i++) {\n");
      out.write("    dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("  }\n");
      out.write("  slides[slideIndex-1].style.display = \"block\";  \n");
      out.write("  dots[slideIndex-1].className += \" active\";\n");
      out.write("  setTimeout(showSlides, 3000); \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<br>\n");
      out.write("<!%----------------------------footer section-----------------------------%>\n");
      out.write("<footer class=\"foot-row\" >           \n");
      out.write("            <ul class=\"footer-list-top\">\n");
      out.write("                <li>\n");
      out.write("                    <h4 class=\"footer-list-header\"><u>About Decor Arcade</u></h4></li>\n");
      out.write("        <li>\n");
      out.write("        <a href='/shop/about-mission' class=\"generic-anchor footer-list-anchor\" itemprop=\"significantLink\">GET TO KNOW US</a>\n");
      out.write("        </li>\n");
      out.write("        <li><a href='/promos.html' class=\"generic-anchor footer-list-anchor\" itemprop=\"significantLink\">PROMOS</a></li>\n");
      out.write("        <li>\n");
      out.write("       <a href='/retailers/new-retailers.html' class=\"generic-anchor footer-list-anchor\" itemprop=\"significantLink\">BECOME A DESIGNER</a>\n");
      out.write("        </li>\n");
      out.write("  <li>\n");
      out.write("        <a href='/shop/about-show-schedule' class=\"generic-anchor footer-list-anchor\" itemprop=\"significantLink\">EVENTS</a>\n");
      out.write("    </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"footer-list-top\">\n");
      out.write("    <li>\n");
      out.write("        <h4 class=\"footer-list-header\"><u>Gift collection</u></h4></li>\n");
      out.write("    <li><a href='giftcard.jsp' class=\"generic-anchor footer-list-anchor\">GIFT CARD</a></li>\n");
      out.write("    <li><a href='coupon.jsp' class=\"generic-anchor footer-list-anchor\">20%OFF</a></li>\n");
      out.write("    <li><a href='/scratchcards/cat/id/32' class=\"generic-anchor footer-list-anchor\">SCRATCH CARDS</a></li>\n");
      out.write("    <li><a href='/Ladies-Accessories/cat/id/117' class=\"generic-anchor footer-list-anchor\" target=\"_blank\">HANDBAGS & JEWELRY</a></li>\n");
      out.write("  </ul>\n");
      out.write("    <ul class=\"footer-list-top\">\n");
      out.write("    <li id='help'>\n");
      out.write("        <h4 class=\"footer-list-header\"><u>Please Help Me</u></h4></li>\n");
      out.write("    <li><a href='/shop/about-contact' class=\"generic-anchor footer-list-anchor\" itemprop=\"significantLink\">CONTACT</a></li>\n");
      out.write("    <li><a href='/faq.html' class=\"generic-anchor footer-list-anchor\" itemprop=\"significantLink\">FAQ</a></li>\n");
      out.write("    <li id='find-a-store'><a href='/shop/store-locator' class=\"generic-anchor footer-list-anchor\" itemprop=\"significantLink\">STORE LOCATOR</a></li>\n");
      out.write("    <li id='order-tracking'><a href='/shop/order-status' itemprop=\"significantLink\" class=\"generic-anchor footer-list-anchor\">PACKAGE STATUS</a></li>\n");
      out.write("  </ul>\n");
      out.write("<section>\n");
      out.write("    <div id=\"box5\">\n");
      out.write("        <center> <b> <u> <p>follow us</p></u></b>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                   <td><a href=\"https://instagram.com/decor_arcade\" target=\"null\"> <img src=\"img/instagram.png\"alt=\"avatar\"></a></td><td></td><td></td>\n");
      out.write("                   <td><a href=\"https://www.facebook.com/decor.arcade\" target=\"null\"><img src=\"img/facebook.png\"alt=\"avatar\"></a></td><td></td><td></td>\n");
      out.write("                   <td><img src=\"img/twitter.png\"alt=\"avatar\"></td>\n");
      out.write("                </tr>\n");
      out.write("           </table>\n");
      out.write("        </center>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <section class=\"footer-bottom-section flex-rw\">\n");
      out.write("  <div class=\"footer-bottom-wrapper\">   \n");
      out.write("  <i class=\"fa fa-copyright\" >\n");
      out.write("  </i> 2019 DecorArcade <address class=\"footer-address\" >Mysore, India</address><span class=\"footer-bottom-rights\"> - All Rights Reserved - </span>\n");
      out.write("    </div>\n");
      out.write("       <span class=\"footer-connect\">\n");
      out.write("          <a href=\"#\">CONTACT US</a>\n");
      out.write("        </span>\n");
      out.write("       <div class=\"foot\">\n");
      out.write("   <a href=\"/terms-of-use.html\" class=\"generic-anchor\" rel=\"nofollow\">Terms</a> | <a href=\"/privacy-policy.html\" class=\"generic-anchor\" rel=\"nofollow\">Privacy</a>\n");
      out.write("            </div>\n");
      out.write("          </section>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("  </html>\n");
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
