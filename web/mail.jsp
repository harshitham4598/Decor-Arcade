<%-- 
    Document   : mail
    Created on : Mar 12, 2019, 9:05:35 PM
    Author     : user
--%>
<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>

<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background-image:linear-gradient(rgba(0,0,0,2),rgba(0,0,0,0)),url("img/dark.jpg");
                  background-size:cover;
                height:110vh;
            }
            h1{
                color: whitesmoke;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email</title>     

        <%! int flag = 0;%>

        <%

            try {
                String host = "smtp.gmail.com";
                String user = "decorarcade6@gmail.com";
                String pass = "decorarcade@1998";
                String to ="abc@gmail.com";

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
        %>


    </head>

    <body>
<%
        response.setHeader("Cache-Control" , "no-cache, no-store, must-revalidate");
        if(session.getAttribute("em")== null){
         response.sendRedirect("main.jsp");
        }
%>     <br><br>   
<center> <h1>You have successfully booked your package.<br> We will be sending you a confirmation mail.</h1> <br><br>
     <h1>press OK to logout </h1><br>
        <a href="logout.jsp"><input type="button" value="Ok"></a></center> 
    </body>

</html>