<%-- 
    Document   : 1login
    Created on : Mar 14, 2019, 3:42:48 AM
    Author     : HARSHI
--%>

<%@page import="javax.sql.*"%>
<%@page import ="java.sql.*" %>
<form action="index.jsp">
<%
    String email= request.getParameter("email");    
    String pwd = request.getParameter("pass");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root", "");
    Statement st = con.createStatement();
   
    ResultSet rs;
    rs = st.executeQuery("select * from register where email='" + email + "'and pass='" + pwd + "'");
    if (rs.next()) 
    {
        //out.println("Login succesfull..................Press OK to continue...<a href='index.jsp'>Click here for home page</a>");
       session.setAttribute("em", email);
        response.sendRedirect("home.jsp");
        
    }
    else {
        //out.println("Invalid password <a href='userlogin.jsp'>try again</a>");
        response.sendRedirect("login.jsp");
    }
%>
</form>
