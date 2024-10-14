<%@ page import="top.jonakls.dentalclinic.entity.UserEntity" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="es">
<head>
    <title>Session Validator</title>
</head>
<body>
<script>
    alert("Session Validator");
</script>
<%
    final UserEntity user = (UserEntity) session.getAttribute("user");
    if (user == null) {
        out.println("<script>alert('En efecto, es nulo')</script>");
        response.sendRedirect(request.getContextPath() + "/index.jsp?error=1");
        return;
    }
%>
</body>
</html>
