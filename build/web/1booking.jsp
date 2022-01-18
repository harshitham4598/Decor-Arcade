<%-- 
    Document   : 1booking
    Created on : Mar 18, 2019, 5:17:59 AM
    Author     : HARSHI
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="java.sql.*,java.util.*,java.text.*" %>
<%
    Connection con = null;
    Statement st = null;

    Class.forName("com.mysql.jdbc.Driver");
    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
    PreparedStatement ps = con.prepareStatement("insert into booking values(?,?,?,?,?,?,?,?)");

    int x = 0;

    String fn = request.getParameter("fname");
    String phno = request.getParameter("phone");
    String b_email = request.getParameter("email");
    String address = request.getParameter("address");
    String date = request.getParameter("date");
    String pac = request.getParameter("pac");
    String vocher="";
    String a[] = request.getParameterValues("vocher");
    for(int i=0;i<a.length;i++)
    {
        vocher+=a[i]+" ";
    }
    ps.setInt(1, x);
    ps.setString(2, fn);
    ps.setString(3, phno);
    ps.setString(4, b_email);
    ps.setString(5, address);
    ps.setString(6, date);
    ps.setString(7, pac);
    ps.setString(8, vocher);

    
    
     

    int j = ps.executeUpdate();
    //  response.sendRedirect("");ie
    con.close();
%>
<form id="jsform" method="post" action="1last.jsp">
     <input type="label" name="phone" value="<%=request.getParameter("phone")%>" style="display:none;">
  
</form>
     <script>
         document.getElementById('jsform').submit();
         </script>
</body>

