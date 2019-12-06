<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>STRUTS 2 HIBERNATE 4 SELECT HQL CRITERIA 1</title>
</head>
<body>
    <s:iterator value="result">
        <s:property value="idLogin" />
        <s:property value="username" />        
        <s:property value="password" />        
     </s:iterator>    
</body>
</html>