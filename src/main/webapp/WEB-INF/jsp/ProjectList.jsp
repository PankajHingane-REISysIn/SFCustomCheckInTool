<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
    <style>td { white-space:nowrap; }</style>
    <title><s:property value="#title"/></title>
</head>
<body>
<s:property value="IlastUsedProjectd"/>
    <s:select name="Projects.Id" value="%{Projects.Id}" list="Projects" listKey="Id" listValue="Name"/>
<table class="borderAll">
    <tr>
        <th><s:text name="label.firstName"/></th>
        <th><s:text name="label.lastName"/></th>
        <th><s:text name="label.age"/></th>
        <th><s:text name="label.department"/></th>
        <th>&nbsp;</th>
    </tr>
    <s:iterator value="Projects" status="status">
        <tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
            <td class="nowrap"><s:property value="Id"/></td>
            <td class="nowrap"><s:property value="Name"/></td>
            <td class="nowrap"><s:property value="Name"/></td>
            <td class="nowrap"><s:property value="Name"/></td>
            <td class="nowrap">
            </td>
        </tr>
    </s:iterator>
    </table>
</body>
</html>