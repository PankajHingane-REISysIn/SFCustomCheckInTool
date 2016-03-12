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
<%-- <s:form action="getJiraTicketList" method="post"> --%>
			Please select Jira ticket number:
			<s:select name="selectedJiraTicket" value="%{jiraTickets.Id}" list="jiraTickets"
				listKey="Id" listValue="Name" />
<%-- 		<s:submit value="continue" /> --%>
<%-- 	</s:form> --%>
</body>
</html>