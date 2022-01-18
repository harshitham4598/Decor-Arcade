<%-- 
    Document   : adminlast
    Created on : Mar 19, 2019, 2:07:03 AM
    Author     : HARSHI
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background-image:linear-gradient(rgba(0,0,0,2),rgba(0,0,0,0)), url("img/dark.jpg"); 
                background-size: cover;
            }
/* -------------------------------------header--------------------------------------------------*/
            #navbar a{
                font-family: cursive;
                font-weight: 400;
                color: whitesmoke;
                text-transform: uppercase; 
                text-decoration: none;
            }
            #navbar{
                width: 100%;
                height: 65px;
                position: fixed;
                top: 0;
                left: 0;
                background: black;
                box-shadow: 10px;
                z-index: 1;
                background-image:linear-gradient(rgba(0,0,0,2),rgba(0,0,0,0)),url("img/texture.jpg");
            }
            #logo{
                width: 100px;
                float:left;
                margin:10px 0px 0 0;
            }
            #logo img{
                width: 100%;
            }
            #logo:hover{opacity: 0.5;}

            header nav{
                float:right;
                margin: 10px 50px 0 0;
            }
            #navbar nav ul li{
                float: left;
                margin-right: 25px;
            }
            #navbar nav ul li a{
                font-size: 13px;
            }
            #navbar nav ul li:hover{
                padding-top: 5px;
            }

            #photo{
                font-family: "Trebuchet Ms",Arial,Helvetica,sans-serif;
                border-collapse: collapse;
                width: 90%;
            }
            #photo td,#photo th{
                color: #398B93;
                padding: 20px;
                text-align: center;
                border-radius: 0px;
            }
            #photo tr:nth-child(even){
                background-color: rgba(128,128,128,0.6);
            }

            #photo th{
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: center;
                background-color: #4CAF50;
                color: white;
                border-radius: 0px;
                width:30px;
            }
            .but  {
                border: none;
                border-radius: 40px;
                background: #292b2e;
                color: #f9f9f9;
                padding: 15px 37px;
                margin: 10px 0 20px 60px;
                margin-left: auto;
                margin-right: auto;
            }
            .scale {
                transform: scale(1.2);
                box-shadow: 0 0 4px 1px rgba(20, 20, 20, 0.8);
            }
            .but {
                background: #64AAA4;
            }
            .but:hover
            {
                cursor: pointer;
                background-color: #1F6B75;
            }
            #tab{
                width: 50%;          
                right: 20%;
            }
            h1{
                color: white;
            }
        </style>
    </head>

    <%@ page import="java.sql.*" %>

    <%
        Connection con = null;
        Statement st = null;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
        Statement stmt = con.createStatement();

        ResultSet rs;

        rs = stmt.executeQuery("select * from booking where id= '"+request.getParameter("user_id")+"' ");

    %>
    <body>
       <%
        response.setHeader("Cache-Control" , "no-cache, no-store, must-revalidate");
        if(session.getAttribute("ad")== null){
         response.sendRedirect("admin.jsp");
        }
        %>

        <!----------------------header------------------------------------>

        <header id="navbar">
            <div id="logo">
                <a href="#">
                    <img src="img/logo.png" alt="logo">
                </a>
            </div>

            <nav id="main-nav">
                <ul>
                    <li><a href="adminlogout.jsp">logout</a></li>    
                </ul>
            </nav>
        </header>

        <br><br><br>
        <h1>Check Once To Confirm</h1>
        <div id="tab">
            <table id="photo" align="center" >

                <%
                            while (rs.next()) {%> 
                <tr>              
                    <td>
                        First Name
                    </td>
                    <td>
                        <%=rs.getString("fname")%>
                    </td>
                </tr>

                 <tr>
                    <td>
                        Phone Number
                    </td>
                    <td>
                        <%=rs.getString("phone")%> 
                    </td>
                </tr>

 <tr>
                    <td>
                        Email
                    </td>
                    <td>
                        <%=rs.getString("email")%> 
                    </td>
                </tr>
 <tr>
                    <td>
                        Address
                    </td>
                    <td>
                        <%=rs.getString("address")%> 
                    </td>
                </tr>

                <tr>
                    <td>
                        Date
                    </td>
                    <td>
                        <%=rs.getString("date")%> 
                    </td>
                </tr>
               
                <tr>
                    <td>
                        package
                    </td>
                    <td>
                        <%=rs.getString("package")%>
                    </td> 
                </tr>

                <tr>
                    <td>
                        Design
                    </td>
                    <td>
                        <%=rs.getString("vocher")%>
                    </td> 
                </tr>

            </table>
            <form method="post" action="adminmail.jsp">
                <input type="label" name="email" value="<%=rs.getString("email")%>" style="display: none;"
          
                <center><input type="submit" class="but"  value="CONFIRM"></center>
            </form>
            <%
                }
            %>
        </div>    
    </body>
</html>
