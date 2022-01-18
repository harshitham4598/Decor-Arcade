 <%-- 
    Document   : 1last
    Created on : Mar 18, 2019, 11:31:23 PM
    Author     : HARSHI
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background-image: linear-gradient(rgba(0,0,0,0.2),rgba(0,0,0,0)),url("img/dark.jpg");
                background-size:cover;
                height:110vh;
            }
/* -------------------------------------header--------------------------------------------------*/
            #navbar a{
                font-family:sans-serif;
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
                background-image:url("img/foot.jpg");
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
                align-content:  center;
               
            }
            #photo td,#photo th{
                color: #fff;
                padding: 20px ;
                text-align: center;
            }
            #photo tr:nth-child(even){
                background-color:transparent;
            }
             #photo tr:hover{
        background-color: #999999;
             }
            #photo th{
              padding-top: 12px;
        padding-bottom: 12px;
        text-align: center;
        background-color: #006666;
        color: white;
            }
            .but  {
                border: #fff;
        border-radius: 60px;
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
                background: #000;
                                align-items: center;

            }
            .but:hover
            {
                cursor: pointer;
                background-color: #cccccc;
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

        rs = stmt.executeQuery("select * from booking where phone= '"+request.getParameter("phone")+"' ");

    %>
    <body>
        <%
        response.setHeader("Cache-Control" , "no-cache, no-store, must-revalidate");
        if(session.getAttribute("em")== null){
         response.sendRedirect("main.jsp");
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
                    <li><a href="logout.jsp">logout</a></li>    
                </ul>
            </nav>
        </header>

        <br><br><br>
    <center>    <h1>Check Once To Confirm</h1></center>
        <div id="tab">
            <table id="photo" align="center" >

                <%
                            while (rs.next()) {%> 
                <tr>              
                    <td>
                        <b>   Name</b>
                    </td>
                    <td>
                        <%=rs.getString("fname")%>
                    </td>
                </tr>

                 <tr>
                    <td>
                        <b>Phone Number</b>
                    </td>
                    <td>
                        <%=rs.getString("phone")%> 
                    </td>
                </tr>

 <tr>
                    <td>
                        <b>Email</b>
                    </td>
                    <td>
                        <%=rs.getString("email")%> 
                    </td>
                </tr>
 <tr>
                    <td>
                        <b>Address</b>
                    </td>
                    <td>
                        <%=rs.getString("address")%> 
                    </td>
                </tr>

                <tr>
                    <td>
                        <b>Date</b>
                    </td>
                    <td>
                        <%=rs.getString("date")%> 
                    </td>
                </tr>
               
                <tr>
                    <td>
                        <b>package</b>
                    </td>
                    <td>
                        <%=rs.getString("package")%>
                    </td> 
                </tr>

                <tr>
                    <td>
                        <b> Design</b>
                    </td>
                    <td>
                        <%=rs.getString("vocher")%>
                    </td> 
                </tr>

            </table>
            <form method="post" action="mail.jsp">
                <input type="label" name="mar"  value="Name: <%=rs.getString("fname")%>       Phone:<%=rs.getString("phone")%>     Email:<%=rs.getString("email")%>        Address:<%=rs.getString("address")%>       Date: <%=rs.getString("date")%>      Package:<%=rs.getString("package")%>    Design:<%=rs.getString("vocher")%>" style="display: none;">
                <center><input type="submit" class="but"  value="CONFIRM"></center>
            </form>
            <%
                }
            %>
        </div>    
    </body>
</html>
