package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class other_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>pre-wedding Page</title>\n");
      out.write("        <style>\n");
      out.write("            html,body{  \n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                height: 90%;\n");
      out.write("                text-align: center;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            section{\n");
      out.write("                min-height: 80%;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*-------------------------navbar-----------------------------*/\n");
      out.write("\n");
      out.write("            #navbar a{\n");
      out.write("                font-family: cursive;\n");
      out.write("                font-weight: 400;\n");
      out.write("                color: whitesmoke;\n");
      out.write("                text-transform: uppercase;    \n");
      out.write("            }\n");
      out.write("            #navbar{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 65px;\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                background: #494949;\n");
      out.write("                box-shadow: 10px;\n");
      out.write("                z-index: 1;\n");
      out.write("                background-image:url(\"images/texture.jpg\");\n");
      out.write("            }\n");
      out.write("            #navbar li{\n");
      out.write("                display:inline-block;\n");
      out.write("            }\n");
      out.write("            #logo{\n");
      out.write("                width: 120px;\n");
      out.write("                float:left;\n");
      out.write("                margin:1px 10px 0 0;\n");
      out.write("            }\n");
      out.write("            #logo img{\n");
      out.write("                padding: 0px 10px;\n");
      out.write("                width: 90%;\n");
      out.write("            }\n");
      out.write("            #logo:hover{opacity: 0.5;}\n");
      out.write("\n");
      out.write("            header nav{\n");
      out.write("                float:right;\n");
      out.write("                margin: 10px 50px 0 0;\n");
      out.write("            }\n");
      out.write("            #navbar nav ul li{\n");
      out.write("                float: left;\n");
      out.write("                margin-right: 25px;\n");
      out.write("            }\n");
      out.write("            #navbar nav ul li a{\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            #navbar nav ul li:hover{\n");
      out.write("                padding-top: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("                       /*-----------------------------------selection----------------------------------*/\n");
      out.write("            @media (max-width:960px)\n");
      out.write("            {\n");
      out.write("                #select{\n");
      out.write("                    width: auto;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            #select{\n");
      out.write("                background-color: #F8F8F8;\n");
      out.write("                height:25%;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            #select img{\n");
      out.write("                width: 40px;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            #projects img :hover{\n");
      out.write("                transform: scale(1.1);\n");
      out.write("                -webkit-transform: scale(1.1);\n");
      out.write("                -moz-transform: scale(1.1);\n");
      out.write("            }\n");
      out.write("            #select h3{\n");
      out.write("                color:black;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #project td {\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #project a{\n");
      out.write("                color:black;\n");
      out.write("                display: inline-block;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            #comp{\n");
      out.write("                padding: 10px;\n");
      out.write("                border:2px solid #FFFFFF;\n");
      out.write("                height: 100px;\n");
      out.write("                width: 70px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #comp:hover\n");
      out.write("            {\n");
      out.write("                cursor: pointer;\n");
      out.write("                background-color: #D3D3D3;\n");
      out.write("            }\n");
      out.write("            #select .wed{\n");
      out.write("                background-color: pink;\n");
      out.write("            }\n");
      out.write("            /*----------------------------------booking---------------------------------*/\n");
      out.write("            @media (max-width:1000px)\n");
      out.write("            {\n");
      out.write("                #booking{\n");
      out.write("                    width: auto;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            #booking h3{\n");
      out.write("                font-size: 30px;\n");
      out.write("                color:#FF3366;\n");
      out.write("            }\n");
      out.write("            .promos {\n");
      out.write("                width: 900px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                margin-top: 50px;\n");
      out.write("            }\n");
      out.write("            #booking .promo {\n");
      out.write("                width: 300px;\n");
      out.write("                height: 70vh;\n");
      out.write("                background: #2F0909; \n");
      out.write("                color: #64AAA4;\n");
      out.write("                float: left;\n");
      out.write("                border-radius: 200px;\n");
      out.write("            }\n");
      out.write("            .deal {\n");
      out.write("                padding: 20px 10px 0 0;\n");
      out.write("                font-family: fantasy;\n");
      out.write("            }\n");
      out.write("            .deal span {\n");
      out.write("                display: block;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .deal span:first-of-type {\n");
      out.write("                font-size: 33px;  \n");
      out.write("            }\n");
      out.write("            .deal span:last-of-type {\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            .promo .price {\n");
      out.write("                display: block;\n");
      out.write("                width: 300px;  \n");
      out.write("                background: white;\n");
      out.write("                margin: 25px 0 10px 0;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 25px;\n");
      out.write("                padding: 27px 0 17px 0;\n");
      out.write("                 border-radius: 300px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #booking ul {\n");
      out.write("                display: block;\n");
      out.write("                margin: 20px 0 10px 0;\n");
      out.write("                padding: 0;\n");
      out.write("                list-style-type: none;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #999999;\n");
      out.write("            }\n");
      out.write("            #booking li {\n");
      out.write("                display: block;\n");
      out.write("                margin: 10px 0 0 0;\n");
      out.write("            }\n");
      out.write("            .but  {\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 40px;\n");
      out.write("                background: silver;\n");
      out.write("                color: black;\n");
      out.write("                padding: 15px 37px;\n");
      out.write("                margin: 10px 0 20px 60px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            .scale {\n");
      out.write("                transform: scale(1.2);\n");
      out.write("                box-shadow: 0 0 4px 1px rgba(20, 20, 20, 0.8);\n");
      out.write("            }\n");
      out.write("            .but {\n");
      out.write("                background: silver;\n");
      out.write("            }\n");
      out.write("            .but:hover\n");
      out.write("            {\n");
      out.write("                cursor: pointer;\n");
      out.write("                background-color: #1F6B75;\n");
      out.write("            }\n");
      out.write("            .scale .price {\n");
      out.write("                color: #64AAA4;\n");
      out.write("            }  \n");
      out.write("            #booking hr{\n");
      out.write("                width:40px;\n");
      out.write("                height: 3px;\n");
      out.write("                background: #494949;\n");
      out.write("                border:0;\n");
      out.write("                margin: 0 auto 40px auto;\n");
      out.write("            }\n");
      out.write("            .features{\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-family: initial;\n");
      out.write("            }\n");
      out.write("            /*---------------------------contact------------------------*/\n");
      out.write("            #contact table{\n");
      out.write("                width: auto;\n");
      out.write("            }\n");
      out.write("            #contact  img{\n");
      out.write("                width: 70px;\n");
      out.write("                margin:10px 0px 0 0; \n");
      out.write("            }   \n");
      out.write("            #contact img:hover{\n");
      out.write("                transform: scale(1.3);\n");
      out.write("            }\n");
      out.write("            #contact h4{\n");
      out.write("                margin: 0 auto 0 auto;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-weight: 200;\n");
      out.write("            }            \n");
      out.write("            #contact p{\n");
      out.write("                width: 400px;\n");
      out.write("                font-size: 25px;\n");
      out.write("                color: #656161;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #contact h3{\n");
      out.write("                font-size: 20px;\n");
      out.write("                color:#FF3366;\n");
      out.write("            }\n");
      out.write("  /*--------------------------------Footer------------------------------------------*/\n");
      out.write("            @media (max-width:960px)\n");
      out.write("            {\n");
      out.write("                #footer #largebox #largebox1 {\n");
      out.write("                    width: auto;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            #footer{\n");
      out.write("                background-image:url(\"img/foot.jpg\"); \n");
      out.write("                background-color: #282828;\n");
      out.write("            }\n");
      out.write("            #box1 li{ list-style-type: none; text-align: left;}\n");
      out.write("            #box2 li {list-style-type: none;  }\n");
      out.write("            #box3 li{list-style-type: none;}\n");
      out.write("            #box2 a {text-decoration: none;\n");
      out.write("                     color: white;}\n");
      out.write("            #box href{color: blue;}\n");
      out.write("\n");
      out.write("            #largebox{\n");
      out.write("                width: 1000px;\n");
      out.write("                height: 200px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            #box1{\n");
      out.write("                width: 300px;\n");
      out.write("                height: 200px;\n");
      out.write("                float: left;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            #box2{\n");
      out.write("                width: 300px;\n");
      out.write("                height: 200px;\n");
      out.write("                float: left;\n");
      out.write("                color:white;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            #box3{\n");
      out.write("                width: 300px;\n");
      out.write("                height: 200px;\n");
      out.write("                float: right;\n");
      out.write("                color: white;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #largebox1{\n");
      out.write("                width: 1000px;\n");
      out.write("                height: 250px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            #box4{\n");
      out.write("                width: 500px;\n");
      out.write("                height: 250px;\n");
      out.write("                float: left;\n");
      out.write("                text-align: left;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            #box5{\n");
      out.write("                width: 500px;\n");
      out.write("                height: 250px;\n");
      out.write("                float: right; \n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            #box5  img{\n");
      out.write("                width: 50px;\n");
      out.write("                margin:10px 0px 0 0; \n");
      out.write("            } \n");
      out.write("            #box5 img:hover{\n");
      out.write("                opacity: 0.5;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            #mainfooter{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 40px;\n");
      out.write("                background-color: black;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fade {\n");
      out.write("  -webkit-animation-name: fade;\n");
      out.write("  -webkit-animation-duration: 1.5s;\n");
      out.write("  animation-name: fade;\n");
      out.write("  animation-duration: 1.5s;\n");
      out.write("}\n");
      out.write(".slideshow-container {\n");
      out.write("    size:auto;\n");
      out.write("  max-width: 1000px;\n");
      out.write("  position: relative;\n");
      out.write("  margin: auto;\n");
      out.write("  background-position: center center;\n");
      out.write("                background-size: 120% 100%;\n");
      out.write("                background-attachment: scroll;\n");
      out.write("                background-color: whitesmoke;\n");
      out.write("}\n");
      out.write(".dot {\n");
      out.write("  height: 15px;\n");
      out.write("  width: 15px;\n");
      out.write("  margin: 0 2px;\n");
      out.write("  background-color: #bbb;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  display: inline-block;\n");
      out.write("  transition: background-color 0.6s ease;\n");
      out.write("}.active {\n");
      out.write("  background-color: #717171;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"navbar\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"img/logo.png\" alt=\"logo\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <nav id=\"main-nav\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"\">logout</a></li>\n");
      out.write("                    <li><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-----------------------------------home--------------------------------------->      \n");
      out.write("       \n");
      out.write("        <section>   <br><br><br>  \n");
      out.write("        <div class=\"slideshow-container\">\n");
      out.write("            <b><h1> <u>Others</u></h1></b>\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <img src=\"img/plan1.jpg\" style=\"width:80%;\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("\n");
      out.write("  <img src=\"img/plan2.jpg\" style=\"width:80%;\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("\n");
      out.write("  <img src=\"img/plan3.jpg\" style=\"width:80%\">\n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("  \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div style=\"text-align: center\">\n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var slideIndex = 0;\n");
      out.write("showSlides();\n");
      out.write("\n");
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
      out.write("        </section>\n");
      out.write("    \n");
      out.write("<!-----------------------------booking----------------------------->\n");
      out.write("<section id=\"booking\">\n");
      out.write("    <h3>ALL PLANS</h3><br><hr>\n");
      out.write("    <div class=\"promos\">  \n");
      out.write("        <div class=\"promo\">\n");
      out.write("            <div class=\"deal\">\n");
      out.write("                <span>Basic</span>\n");
      out.write("                <span></span>\n");
      out.write("            </div>\n");
      out.write("            <span class=\"price\">Rs 40,000/-</span>\n");
      out.write("            <ul class=\"features\">\n");
      out.write("                <li>Few Designers</li>\n");
      out.write("                <li>------</li>\n");
      out.write("                <li>Limited time</li>\n");
      out.write("                <li>------</li>\n");
      out.write("                <li>Your home will renovated in<br> 3 weeks</li> \n");
      out.write("                <li>------</li>\n");
      out.write("                <li>With average quality<br>Products</li>\n");
      out.write("            </ul>\n");
      out.write("           <!-- <button>Book now</button>-->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"promo scale\">\n");
      out.write("            <div class=\"deal\">\n");
      out.write("                <span>Awesome</span>\n");
      out.write("                <span></span>\n");
      out.write("            </div>\n");
      out.write("            <span class=\"price\">Rs 80,000/-</span>\n");
      out.write("            <ul class=\"features\">\n");
      out.write("                <li>Many Designers</li>\n");
      out.write("                <li>------</li>\n");
      out.write("                <li>Limited time</li>\n");
      out.write("                <li>------</li>\n");
      out.write("                <li>Your home will renovated in<br> 2 weeks</li> \n");
      out.write("                <li>------</li>\n");
      out.write("                <li>With highly assured quality<br>Products</li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("           <!-- <button>Book now</button>-->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"promo\">\n");
      out.write("            <div class=\"deal\">\n");
      out.write("                <span>Premium</span>\n");
      out.write("                <span></span>\n");
      out.write("            </div>\n");
      out.write("            <span class=\"price\">Rs 60,000/-</span>\n");
      out.write("            <ul class=\"features\">\n");
      out.write("                <li>Minimum Designers</li>\n");
      out.write("                <li>------</li>\n");
      out.write("                <li>Limited time</li>\n");
      out.write("                <li>------</li>\n");
      out.write("                <li>Your home will renovated in<br> 4 weeks</li> \n");
      out.write("                <li>------</li>\n");
      out.write("                <li>With semi-average quality<br>Products</li>\n");
      out.write("            </ul>\n");
      out.write("            <!--<button>Book now</button>-->\n");
      out.write("        </div>\n");
      out.write("    </div>   \n");
      out.write("</section><br><br><br><br><br><br><br><br><br><br><form method=\"post\" action=\"booking.jsp\">\n");
      out.write("    <center><button class=\"but\" ><b>Book now</b></button></center></form>\n");
      out.write("<!-----------------------------contact----------------------------->\n");
      out.write("\n");
      out.write("<div id=\"contact\"><br><br>\n");
      out.write("    <b><h3>For more album?</h3></b>\n");
      out.write("    <table align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("            \n");
      out.write("            <td><a href=\"\"><img src=\"img/instagram.png\"alt=\"avatar\"></a></td>\n");
      out.write("           \n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("        <b>   <td> <h4>instagram</h4></td></b>\n");
      out.write("            \n");
      out.write("        </tr><tr></tr><tr></tr>\n");
      out.write("        <tr>\n");
      out.write("           </tr>\n");
      out.write("    </table><br><br></div><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!----------------------footer---------------------------------->\n");
      out.write("<div id=\"footer\"><br>\n");
      out.write("    <div id=\"largebox\">\n");
      out.write("        <div id=\"box1\">\n");
      out.write("            <li><u><b>Find us</b></u></li><br>\n");
      out.write("            <li><b>Address:</b> #190,7th cross vidyanagar <br>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mysore-570011, India</li><br>\n");
      out.write("            <li><b>Phone:</b>&nbsp;&nbsp;9164815372</li>\n");
      out.write("            <li><b>gmail:</b>&nbsp;&nbsp;decorearcade@gmail.com</li>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"box2\">\n");
      out.write("            <b><u><li>Customer</li></u></b><br>\n");
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"index.jsp\">FAQ'S</a></li>\n");
      out.write("            <li>Chat with admin</li>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"box3\">\n");
      out.write("            <b> <u>  <li> Top Cities</li></u></b><br>\n");
      out.write("            <li>Bangalore</li>\n");
      out.write("            <li>Dharwad</li>\n");
      out.write("            <li>Hubli</li>\n");
      out.write("            <li>Shivmogga</li>\n");
      out.write("            <li>Madikeri</li>\n");
      out.write("            <li>Chikmangalore</li>\n");
      out.write("            <li>Mysuru</li>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"largebox1\">\n");
      out.write("        <div id=\"box4\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"img/logo.png\" alt=\"logo\">\n");
      out.write("                </a>\n");
      out.write("            </div><br><br><br><br><br>\n");
      out.write("            <b>  DecorArcade helps you hire the best professionals from designers to <br>\n");
      out.write("            stylists, tutors, trainers and a lot more. Find pre defined packages at<br> \n");
      out.write("            unbelievable prices from pro's, chat live to check availability and buy instantly to book them. Buy <br>\n");
      out.write("            Packages, from the Best Professionals, its <br>\n");
      out.write("            just a click away </b>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"box5\">\n");
      out.write("            <b> <u> <p>follow us</p></u></b>\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td> <img src=\"img/instagram.png\"alt=\"avatar\"></td><td></td><td></td>\n");
      out.write("                    <td> <img src=\"img/facebook.png\"alt=\"avatar\"></td><td></td><td></td>\n");
      out.write("                    <td> <img src=\"img/twitter.png\"alt=\"avatar\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"mainfooter\"><br>\n");
      out.write("        <b>   © Copyright @harshitham</b>\n");
      out.write("    </div>   \n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
