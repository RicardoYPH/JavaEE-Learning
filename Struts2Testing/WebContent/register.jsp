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
	<s:if test="#request.result == null">
		注册
	</s:if>
	<s:else>
		${ requestScope.result }<br>
	</s:else>
	<s:form action="judge">
		<s:textfield name = "username" label="用户名"></s:textfield>
		<s:password name = "password" label="密码"></s:password>
		<s:submit></s:submit>
	</s:form>
</body>
</html>