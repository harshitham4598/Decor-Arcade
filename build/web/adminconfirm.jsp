<%-- 
    Document   : adminconfirm
    Created on : Mar 19, 2019, 1:51:56 AM
    Author     : HARSHI
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="javax.jms.Session"%>
<style>
    body{
        background-image:linear-gradient(rgba(0,0,0,2),rgba(0,0,0,0)),url("img/texture.jpg");
        background-size: cover;
    }
    #navbar a{
        font-family: sans-serif;
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
        padding-top: 3px;
    }

    #photo{
        font-family: "Trebuchet Ms",Arial,Helvetica,sans-serif;
        border-collapse: collapse;
        width: 90%;
        align-items: center;
    }
    #photo td,#photo th{
        color: #fff;
        padding: 0px;
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
        background: #006666;
    }
    .but:hover
    {
        cursor: pointer;
        background-color: #cccccc;
    }
</style>
<%@ page import="java.sql.*" %>

<%
    Connection con = null;
    Statement st = null;

    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
    Statement stmt = con.createStatement();

    ResultSet rs;

    rs = stmt.executeQuery("select * from booking where 1");

%>
<body background="">

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
</header><br><br><br><br>
<!----------------------------table------------------------------------------>
<table id="photo" align="center">

    <tr>

        <th>
            Name
        </th>
        &nbsp; &nbsp;&nbsp;&nbsp;               
        <th>
            Phone
        </th>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <th>
            Email             
        </th>
        &nbsp;&nbsp;&nbsp;
        &nbsp;
        <th>
            date               
        </th>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <th>Package</th>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <th>Design</th>&nbsp;&nbsp;&nbsp;&nbsp;
        <th>confirm</th>&nbsp;&nbsp;&nbsp;&nbsp;
    </tr>

</tr>
<%
                                  while (rs.next()) {%>      

<tr>
    <td>                  
        <%=rs.getString("fname")%>
    </td>
    

    <td>
        <%=rs.getString("phone")%>                          
    </td>
    <td>
        <%=rs.getString("email")%>
    </td>
     
<td>
        <%=rs.getString("date")%>                          
    </td>
    <td>
        <%=rs.getString("package")%>                          
    </td>
    <td>
        <%=rs.getString("vocher")%>                          
    </td>


    <td><input type="submit" class="but"  value="mail"  onclick="javascript:window.location = 'adminlast.jsp?user_id=<%=rs.getInt("id")%>'">

    </td>

        <%
            }
        %>        
</table>
        </body>
        </html>



