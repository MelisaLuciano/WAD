<%-- 
    jsp: pagina html que permite incrustar codigo java dentro de ella
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            out.print("hola mel");
        %>
        <%="Alo?"%>
    </body>
</html>
