<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="adminHeader.jsp" %>
  <div align="center">
		<h1>Acceptance Form</h1>
		<form:form action="saveServiceProvider" method="post" modelAttribute="serviceProvider">
			<table>
				<form:hidden path="serviceProviderId" />
				<tr>
					<td>ServiceProviderName:</td>

					<td><form:input path="serviceProviderName" /></td>
				</tr>
				
				<tr>
					<td>MailID:</td>

					<td><form:input path="mailId" />
				</tr>
				<tr>
					<td>UserName:</td>
					<td><form:input path="username" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:password path="password" /></td>
				</tr>
				<tr>
					<td>AccountStatus:</td>
					<td><form:input path="accountStatus" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>