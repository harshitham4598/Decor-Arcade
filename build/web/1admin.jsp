<%-- 
    Document   : 1admin
    Created on : Mar 19, 2019, 1:40:17 AM
    Author     : HARSHI
--%>
<%
String uname=request.getParameter("uname");

String pass=request.getParameter("pass");
if(uname.equals("harshitha")&& pass.equals("harshi$45"))
{
    response.sendRedirect("adminconfirm.jsp");
     session.setAttribute("ad", uname);
}
else{
      response.sendRedirect("admin.jsp");
}

%>