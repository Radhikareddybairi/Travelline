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
		<h1>Station</h1>
		<form:form action="saveStation" method="post" modelAttribute="station">
			<table border="1" bordercolor="dimgray">
				<form:hidden path="stationId" />
				<tr>
					<td>StationName:</td>

					<td><form:input path ="stationName" required="true"/></td>
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
