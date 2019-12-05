<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <html:form action="Accion" method="post">
            <html:text property="id" />
            <html:password property="password" />
            <html:submit />
            
        </html:form>
    </body>
</html>
