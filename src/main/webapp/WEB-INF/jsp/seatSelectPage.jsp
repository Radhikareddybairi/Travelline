
<%@ page language="java" import="java.util.*,com.virtusa.travelline.model.Service"  contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.header {
	text-align: center;
	padding: 32px;
}

.row {
	display: -ms-flexbox; /* IE 10 */
	display: flex;
	-ms-flex-wrap: wrap; /* IE 10 */
	flex-wrap: wrap;
	padding: 0 4px;
}

.spanBox {
	display: inline-block;
	width: 15px;
	height: 15px;
	padding: 1px 3px;
	border: 4px double white;
	background-color: #ddd;
	margin-top: 2%;
}
/* Create two equal columns that sits next to each other */
.column {
	-ms-flex: 50%; /* IE 10 */
	flex: 50%;
	padding: 0 4px;
}

.column img {
	margin-top: 8px;
	vertical-align: middle;
}

.wrapper {
	text-align: center;
}

.btn btn-warning seatsBtn {
	position: absolute;
	top: 50%;
}





</style>
</head>
<body>
<%@include file="passengerHeader.jsp"  %>
<table align="center" border="3" width="50%">
<th>servicenumber</th>
<th>type</th>>
<th>fare</th>
<th>departuretime</th>
 <% Service service= (Service)session.getAttribute("service1");
       out.print("<tr>");
        out.print("<td>"+service.getServiceNumber()+"</td>");  
       out.print("<td>"+service.getType().getTypeName()+"</td>");  
       out.print("<td>"+service.getFare()+"</td>");  
        out.print("<td>"+service.getJourneyStartTime()+"</td>"); 
        out.print("</tr>");
      
       %>
       </table>
	
<%-- <% List list=new ArrayList(); %> --%>

<script>

var a=[];
function image(x) {
	
	
	
	
	
  
	if(x.src=="http://localhost:8080/TravelLine/resources/image/emptyseat.png")
	{
		x.src="resources/image/greenSeat.jpg";
		a.add(x.id)
		
<%-- <%list.add(x.id);%> --%>

		
		
	}
	else  {
		
		//console.log("other");
		x.src="resources/image/emptyseat.png";
	}
	
  
	console.log(x.src);

}

</script>

    


	<!-- seat Grid -->
	<br>
	<br>
	<br>

	<h2 align="center" style="color: blue;">Please select a seat</h2>
	<form action="saveseats" >


	<div class="row" align="center">
		<div class="column">

			<img src="resources/image/emptyseat.png" style="width: 3%" id="1"
				onclick="image(this)"> <label for="1">1</label>&nbsp <img
				src="resources/image/emptyseat.png" style="width: 3%" id="2"
				onclick="image(this)"><label for="2">2</label>&nbsp <img
				src="resources/image/emptyseat.png" style="width: 3%"
				 id="3" onclick="image(this)"><label for="3">3</label>&nbsp
			<img src="resources/image/emptyseat.png" style="width: 3%" id="4"
				onclick="image(this)"><label for="4">4</label>&nbsp <img
				src="resources/image/emptyseat.png" style="width: 3%" id="5"
				onclick="image(this)"><label for="5">5</label>

		</div>
		<div class="column">
			<img src="resources/image/emptyseat.png" style="width: 3%" id="6"
				onclick="image(this)"> <label for="6">6</label>&nbsp <img
				src="resources/image/emptyseat.png" style="width: 3%" id="7"
				onclick="image(this)"> <label for="7">7</label>&nbsp <img
				src="resources/image/emptyseat.png" style="width: 3%"
				class="selected" id="8" onclick="image(this)"> <label for="8">8</label>&nbsp
			<img src="resources/image/emptyseat.png" style="width: 3%" id="9"
				onclick="image(this)"> <label for="9">9</label>&nbsp <img
				src="resources/image/emptyseat.png" style="width: 3%" id="10"
				onclick="image(this)"> <label for="10">10</label>

		</div>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<div class="column">
			<img src="resources/image/emptyseat.png" style="width: 3%" id="11"
				onclick="image(this)"> <label for="11">11</label>&nbsp <img
				src="resources/image/emptyseat.png" style="width: 3%" id="12"
				onclick="image(this)"> <label for="12">12</label>&nbsp <img
				src="resources/image/redSeat.jpg" style="width: 3%"
				id="13" onclick="image(this)"> <label
				for="13">13</label>&nbsp <img src="resources/image/emptyseat.png"
				style="width: 3%" id="14" onclick="image(this)"> <label
				for="14">14</label>&nbsp <img src="resources/image/emptyseat.png"
				style="width: 3%" id="15" onclick="image(this)"> <label
				for="15">15</label>

		</div>
		<div class="column">
			<img src="resources/image/emptyseat.png" style="width: 3%" id="16"
				onclick="image(this)"> <label for="16">16</label>&nbsp <img
				src="resources/image/emptyseat.png" style="width: 3%" id="17"
				onclick="image(this)"> <label for="17">17</label>&nbsp <img
				src="resources/image/emptyseat.png" style="width: 3%" id="18"
				onclick="image(this)"> <label for="18">18</label>&nbsp <img
				src="resources/image/emptyseat.png" style="width: 3%" id="19"
				onclick="image(this)"> <label for="19">19</label>&nbsp <img
				src="resources/image/redSeat.jpg" style="width: 3%" id="20"
				onclick="image(this)"> <label for="20">20</label>

		</div>
	</div>
	</table>
	<br>
	<br>
	<div class="wrapper">
		<input type="submit" value="continue"/>
	</div>
	<div align="center">
		<span class="spanBox" style='Background-color: green'></span><label>Selected
			Seats</label> <span class="spanBox" style='Background-color: red'></span><label>Reserved
			Seats</label> <span class="spanBox"></span><label>Empty Seats</label>
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


