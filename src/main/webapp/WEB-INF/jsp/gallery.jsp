<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>

<style>

* {
  box-sizing: border-box;
}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

</style>
</head>
<body>
 <%@include file="passengerHeader.jsp" %>
<!-- Photo Grid -->
<div class="row"> 
  <div class="column">
   
    <img src="resources/image/sbg3.jpg" >
    <img src="resources/image/sbg4.jpg">
    <img src="resources/image/sbg5.jpg">
    <img src="resources/image/sbg6.jfif" >
    <img src="resources/image/sbg7.jpg" >
  </div>
  <div class="column">
    <img src="resources/image/americanExpress.png" >
    <img src="resources/image/bg1.jfif" >
    <img src="resources/image/bg2.png">
    <img src="resources/image/bg3.jfif">
    <img src="resources/image/bus1.jpg" >
  </div>  
  <div class="column">
 
    <img src="resources/image/sbg3.jpg">
    <img src="resources/image/sbg4.jpg" >
    <img src="resources/image/sbg5.jpg" >
    <img src="resources/image/sbg6.jfif" >
    <img src="resources/image/sbg7.jpg">
  </div>
  <div class="column">
     <img src="resources/image/americanExpress.png" >
    
    <img src="resources/image/bg1.jfif" >
    <img src="resources/image/bus1.jpg">
  </div>
</div>

 <%@include file="footer.jsp" %>
</body>
</html>