<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.employees"/></title>
</head>
<body>
<div class="titleDiv"><s:text name="application.title"/></div>
<h1><s:text name="label.employees"/></h1>
<s:url id="url" action="inputEmployee" />
<a href="<s:property value="#url"/>">Add New Employee</a>
<br/><br/>
<table class="borderAll">
    
    </table>
</body>
</html>