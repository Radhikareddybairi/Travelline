<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"></script>


</head>
<body>
<%@include file="passengerHeader.jsp" %>
<div align="center">
<h1><font color="blue" >Ticket Details</font></h1>
		<h3>Service Details</h3>
		 <table border="1" bordercolor="dimgray">
		   <th>PNR NO</th>
		   <th>Service No</th>
		     <th>Fare</th>
		   
		     <th>From</th>
		   
		     <th>To</th>
		   
		   <th>DepartureTime</th>
		     <th>JourneyDuration</th>
		   
                <tr>

                <td>${ticketdetails.getPnrNO()}</td>
               <td>${service.getServiceNumber()}</td>
              
               
          <td> ${service.getFare()}</td>
               <td>${service.getSrFrom()}</td>
             
               
            
               <td>${service.getSrTo()}</td>
               <td>${service.getJourneyStartTime()}</td>
              
               <td>${service.getJourneyDuration()}</td>
              
            </tr>
                
              
            </table>
		
		
	</div>
	<div align="center">
		<h3>Passenger Details</h3>
		 <table border="1" bordercolor="dimgray">
		   <th>PassengerName</th>
		   <th>Age</th>
		   <th>Gender</th>
		   <th>Proof Id Number</th>
                <tr><c:forEach var="passenger" items="${passenger}">
                 <tr>
                    <td>${passenger.getPassengerName()}</td>
                    <td>${passenger.getPassengerAge()}</td>
                    <td>${passenger.getPassengerGender()}</td>
                    <td>${passenger.getProofIdNumber()}</td>
                 
                </tr>
                </c:forEach>
                
                
                
                
             
               

              
            </tr>
                
              
            </table>
		
		
	</div>
	<br><br>
	<form>
<div class="print text-center">
	<center><input type="button" value="print Ticket" onClick="window.print()"/></center>
	</div>
	</form>
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
	</div>
</body>
</html>