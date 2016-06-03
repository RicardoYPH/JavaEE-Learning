<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	hello ${name} <br>
	<s:form action="sayhello">
		<s:textfield name = "name"></s:textfield>
		<s:submit></s:submit>
	</s:form>
	<s:a href="./register.jsp">注册</s:a>
</body>
</html>