<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body background="/resources/img2.jpg">
<div align="center" color:"blue">
        <h1>Registrationform</h1>
        <form:form action="saveAccountHolder" method="post" modelAttribute="accountHolder">
     
        <form:hidden path="accountId"/>
          
          
                Name:
                <form:input path="accountHolderName" padding="50px"/><br>
          
                Email:
                <form:input path="accountHolderMailId" /><br>
            
            
               password:
                <form:password path="accountHolderPassword" /><br>
            
            
                mobileno:
               <form:input path="accountHolderMobileNo" /><br>
            
            
                <input type="submit" value="Save">
            
    
        </form:form>
    </div>



</body>