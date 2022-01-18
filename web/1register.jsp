<%-- 
    Document   : 1register
    Created on : Mar 14, 2019, 3:36:59 AM
    Author     : HARSHI
--%>

<%@ page import="java.sql.*,java.util.*,java.text.*" %>
<style>
    body{
            background:linear-gradient(rgba(0,0,0,2),rgba(0,0,0,0)),url( "img/design.jpg");
            background-size: cover;
            color: whitesmoke;
            
    }
    a{
        color: red;
        text-decoration: none;
        font-size: 30px;
    }
</style>
<% 
           Connection con=null;
            Statement st=null;

            
                Class.forName("com.mysql.jdbc.Driver");
                con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?)");

                
                String fn=request.getParameter("uname");                           
                String e=request.getParameter("pass");
                String p2=request.getParameter("email");             
                ps.setString(1, fn);
                ps.setString(2, e);
                ps.setString(3,p2);
             
                
                
                int j=ps.executeUpdate();
                
                out.println("Welcome "+fn+" You are now registered...<a href='login.jsp'>click to login</a>");
        con.close();   
        %>
                
    </body>
