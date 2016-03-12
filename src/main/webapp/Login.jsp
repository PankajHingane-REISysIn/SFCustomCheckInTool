<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<link href="<s:url value='/css/main.css'/>" rel="stylesheet"
	type="text/css" />
<style>
td {
	white-space: nowrap;
}
</style>
<title><s:property value="#title" /></title>
</head>
<body>
	<div class="titleDiv">
		<s:text name="label.login" />
	</div>
	<h1>
		<s:property value="#title" />
	</h1>
	<s:actionerror />
	<s:actionmessage />
	<s:form action="login" method="post">
		<s:textfield name="login.userName" value="%{login.userName}"
			label="%{getText('label.userName')}" size="40" />
		<s:textfield name="login.password" value="%{login.password}"
			label="%{getText('label.password')}" size="40" />
		<%--     <s:select name="employee.department.departmentId" value="%{employee.department.departmentId}" list="departments" listKey="departmentId" listValue="name"/> --%>
		<%--     <s:hidden name="employee.employeeId" value="%{employee.employeeId}"/> --%>
		<s:submit value="%{getText('button.label.submit')}" />
		<s:submit value="%{getText('button.label.cancel')}" />
	</s:form>
</body>
</html>