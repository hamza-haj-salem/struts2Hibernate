<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
	<p> username : hamza // password: 123</p>
	<div align="center">
		<h2>Login</h2>
		<s:form action="loginAction" class="loginForm">
			<s:textfield key="global.userName" name="userName" class="formTextField" />
			<s:password key="global.password" name="password"  class="formTextField" />
			<s:submit key="global.login" class="actionBtn" />
		</s:form>
		
		<s:url action="changeLocalAction" var="urlEn">
			<s:param name="request_locale">en</s:param>
		</s:url>
		<a href="${urlEn}">English</a>
		
		<s:url action="changeLocalAction" var="urlFr">
			<s:param name="request_locale">fr</s:param>
		</s:url>
		<a href="${urlFr}">Francais</a>
	</div>
</body>
</html>