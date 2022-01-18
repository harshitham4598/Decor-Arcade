<%-- 
    Document   : logout
    Created on : Mar 19, 2019, 2:36:15 AM
    Author     : HARSHI
--%>

<body>
    <% 
session.removeAttribute("email");
session.invalidate();
response.sendRedirect("main.jsp");
%>
</body>