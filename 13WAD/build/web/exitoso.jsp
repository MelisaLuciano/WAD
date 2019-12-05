<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        Bienvenido: 
        <% 
            String id=(String)session.getAttribute("id");
            out.println(id);
        %>
    </body>
</html>
