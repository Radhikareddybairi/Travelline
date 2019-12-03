<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Service Form</title>

<style>
input[type=text], select {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 50%;
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  align:center;
}

input[type=submit]:hover {
  background-color: #006400;
  
}


</style>
</head>
<body>
<%@include file="serviceProviderHeader.jsp" %>
<div align="center" >
		<h1 style="color:blue;">Add Service</h1>
		<form:form action="saveService" method="post" modelAttribute="service">
		
			<table border="1" bordercolor="dimgray">
				<form:hidden path="serviceId" />
				<tr>
					<td>Service Number:</td>

					<td><form:input path="serviceNumber" /></td>
				</tr>
				<tr>
					<td>From:</td>

					<td><form:input path="srFrom" />
				</td>
				</tr>

				<tr>
					<td>To:</td>

					<td><form:input path="srTo" />
				</tr>
				<tr>
					<td>Bus Type:</td>
					<td><form:input path="type.typeName" /></td>
				</tr>
				<tr>
					<td>Fare:</td>
					<td><form:input path="fare" /></td>
				</tr>
				<tr>
				<tr>
					<td>Distance(kms):</td>

					<td><form:input path="distance" />
				</tr>
				<tr>
				<tr>
					<td>Departure Time:</td>

					<td><form:input path="journeyStartTime" />
				</tr>
				<tr>
				<tr>
					<td>Journey Time(hrs):</td>

					<td><form:input path="journeyDuration" />
				</tr>
				 <tr>
    
    </tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Save" ></td>
						
				</tr>
			
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="cancel" ></td>
						
				</tr>
					<form:hidden path="serviceProviderId"/>
				
				
			</table>
		</form:form>
	</div>
<div>
	
	 
<!-- Footer -->
<footer class="container-fluid text-center"
style="background-color:#EEE9E7;padding-right: 0px;padding-left: 0px; padding-top: 40px;">
<div class="container">
<div class="row-content">
<div class="col-sm-3">
<br> <br>
<div>
<a class="footerOptions" href="#">Help</a>
</div>
<br>
<div>
<a class="footerOptions" href="#">FAQ</a>
</div>
<br>
<div>
<a class="footerOptions" href="#">T & C</a>
</div>
<br>
<div>
<a class="footerOptions" href="#">About</a>
</div>
<br>

</div>
<div class="col-sm-3">
<div>
<h4 style="font-family: 'Montserrat', sans-serif;">Contact Us:</h4>
</div>

<div>
<a class="footerOptions">travelline@travelline.com</a>
</div>
<br>
<div>
<a class="footerOptions">Tel No.: (0832) 2748080/2741122</a>
</div>
<br>
<div>
<div>
<h4 style="font-family: 'Montserrat', sans-serif;">Communication
Address:</h4>
</div>
<div>
<a class="footerOptions">Inner Ring Road, Koyambedu</a>
</div>
<div>
<a class="footerOptions">Chennai, India-600119</a>
</div>
<br>
</div>
</div>
<div class="col-sm-6">
<div class="row-content text-center">
<div>
<span id="footerSpan"
style="font-size: 18px; font-family: 'Montserrat', sans-serif;">Experience
Our WebApp On</span>
</div>
<div class="col-sm-4"
style="border: 2px solid none; padding: 18px;">
<a href="https://play.google.com/store" target="_blank"><img
src="resources/image/googlePlay.png" style="width: 100%;"></a>
</div>
<div class="col-sm-4"
style="border: 2px solid none; padding: 18px;">
<a href="https://www.microsoft.com/en-us" target="_blank"><img
src="resources/image/store.png" style="width: 100%;"></a>
</div>
<div class="col-sm-4"
style="border: 2px solid none; padding: 18px;">
<a href="https://www.apple.com/" target="_blank"><img
src="resources/image/appStore.png" style="width: 100%;"></a>
</div>
</div>
<br>
</div>

<div class="col-sm-6">
<div class="row-content text-center">
<div>
<span id="footerSpan"
style="font-size: 18px; font-family: 'Montserrat', sans-serif;">Be
in touch with </span>
</div>
<br>
</div>
</div>
<div id="social-media">
<a
href="https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en_US"
target="_blank"><img src="resources/image/fbLogo.png" height="20"
width="20"></a> <a
href="https://apps.apple.com/us/app/twitter/id333903271"
target="_blank"><img src="resources/image/twitterLogo.png" height="20"
width="30"></a> <a
href="https://play.google.com/store/apps/details?id=com.google.android.apps.plus&hl=en_IN"
target="_blank"><img src="resources/image/googlePlusLogo.png" height="20"
width="20"></a> <a
href="https://apps.apple.com/us/app/instagram/id389801252"
target="_blank"><img src="resources/image/instagramLogo.png" height="20"
width="20"></a>
</div>
</div>
</div>
	 
	
	
	</div>
	
</body>
</html>