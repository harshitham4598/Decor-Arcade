<%-- 
    Document   : adminlogout
    Created on : Mar 19, 2019, 2:52:38 AM
    Author     : HARSHI
--%>
<body>
    <% 
session.removeAttribute("email");
session.invalidate();
response.sendRedirect("main.jsp");
%>
</body>
