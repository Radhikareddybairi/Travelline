
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link href="<c:url value="/resources/css/check.css"/>" rel="stylesheet">


</head>
<body>
<body>
    <div align="center">
        <h1>Travel Line</h1>
        <h3>
            AccountHolderDetails
        </h3>
        <table border="1">
 
            <th>Name</th>
            <th>MailId</th>
            <th>password</th>
            <th>MobileNo</th>
            <th>Action</th>
 
            <c:forEach var="user" items="${listofaccounts}">
                <tr>
 
                    <td>${user.accountHolderName}</td>
                    <td>${user.accountHolderMailId}</td>
                    <td>${user.accountHolderPassword}</td>
                    <td>${user.accountHolderMobileNo}</td>
                    <td><a href="editAccountdetails?id=${user.accountId}">Edit</a>
                             
                       <a href="deleteAccount?id=${user.accountId}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
         <a href="newUser">New to travelline register here </a>
         <a href="login">already have an account
                          click here to login</a>
    </div>
</body>
</html>

</body>
</html>