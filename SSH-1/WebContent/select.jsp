<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询页面</title>
</head>
<body>

	<s:form action="select.action" method="post">
		<s:textfield name="id" />
		<s:textfield name="name" />
		<s:submit></s:submit>
	</s:form>
	<s:if test="#request.ls == null || #request.ls.size() == 0">
		没有任何员工信息
	</s:if>
	<s:else>
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<td>ID</td>
				<td>NAME</td>
				<td>SEX</td>
				<td>AGE</td>
				<td>TEL</td>
				<td>HOBIT</td>
			</tr>
			<s:iterator value="#request.ls">
				<tr>
					<td>${ sid }</td>
					<td>${ sname }</td>
					<td>${ ssex }</td>
					<td>${ sage }</td>
					<td>${ stelnum }</td>
					<td>${ shobit }</td>
				</tr>
			</s:iterator>
		</table>
	</s:else>
</body>
</html>