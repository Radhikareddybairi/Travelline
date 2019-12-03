<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<!--  jQuery -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.11.3.min.js"></script>

<!-- Isolated Version of Bootstrap, not needed if your site already uses Bootstrap -->
<link href="https://fonts.googleapis.com/css?family=Lobster&display=swap" rel="stylesheet">
<link rel="stylesheet"
	href="https://formden.com/static/cdn/bootstrap-iso.css" />

<!-- Bootstrap Date-Picker Plugin -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css" />
<script>
	$(document).ready(
			function() {
				var date_input = $('input[name="date"]'); //our date input has the name "date"
				var container = $('.bootstrap-iso form').length > 0 ? $(
						'.bootstrap-iso form').parent() : "body";
				var options = {
					format : 'mm/dd/yyyy',
					container : container,
					todayHighlight : true,
					autoclose : true,
				};
				date_input.datepicker(options);
			})
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link rel="shortcut icon" href="image/icon.png">
<link href="<c:url value="/resources/image/bus1.jpg"/>" rel="image">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link
	href="https://fonts.googleapis.com/css?family=Fascinate+Inline|Lobster|Comfortaa:700|Alex+Brush|Niconne|Satisfy|Amiri|Fredericka+the+Great|Montserrat&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style type="text/css">
<
script
  src ="https: //code.jquery.com /jquery-3.4.1.js "
  integrity ="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin ="anonymous"> </script>body {
	background-image: url("image/bus3.jpeg");
	background-attachment: fixed;
	background-position: center;
	background-size: cover;
	background-repeat: no-repeat;
	overflow-x: hidden;
}

/* Remove borders */
.navbar {
	-webkit-border-radius: 0;
	-moz-border-radius: 0;
	border-radius: 0;
	margin-bottom: 0;
}

/* Center all items */
.navbar-nav {
	width: 100%;
	text-align: center;
}

.navbar-nav>li {
	display: inline-block;
	float: none;
	font-family: 'Comfortaa', cursive;
}

/* Main Service */
#serviceId {
	background-image: url("resources/image/pav.png");
	background-position: center;
	background-size: cover;
	padding: 150px 150px 200px 150px;
}

/* Absolute positioning of input boxes */
.inner-addon {
	position: relative;
}

/* style glyphicons */
.inner-addon .glyphicon {
	position: absolute;
	padding: 5px;
	font-size: large;
	color: #2f97d6;
	/* transition-property: color position padding font-size;
transition-duration: .25s;
transition-timing-function: ease-in-out; */
}

/* align glyph */
.left-addon .glyphicon {
	left: 0px;
}

.right-addon .glyphicon {
	right: 0px;
}

/* style font awsome */
.inner-addon .fa {
	position: absolute;
	padding: 7px;
	font-size: large;
	color: #0075c4;
}

.left-addon .fa {
	left: 0px;
}

.right-addon .fa {
	right: 0px;
}

/* add padding  */
.left-addon input {
	padding-left: 30px;
}

.right-addon input {
	padding-right: 30px;
}

#serviceInput {
	border-radius: 0px;
	font-size: 16px;
	padding: 24px 0px 24px 44px;
	box-shadow: 0px 0px 20px 4px #000000;
}

#serviceInput:focus {
	border-radius: 0px;
	font-size: 16px;
	padding: 24px 0px 24px 44px;
	box-shadow: 0px 0px 20px 4px #ffffff;
	border: 1px ridge #f9cb64;
}

/* #serviceInput:focus+.glyphicon {
position: absolute;
padding: 12px;
color: #f32165;
font-size: x-large;
} */

/* Onscroll divs in Feedback */
#feedbackRow {
	padding-bottom: 40px;
	opacity: 0;
	padding-top: 250px;
	transition-property: opacity padding-top;
	transition-duration: 1s;
	transition-timing-function: ease-out;
}

.feedback {
	padding-right: 50px;
	padding-left: 50px;
	background-color: #ecececa6;
	box-shadow: 0px 8px 10px 0px #000000;
}

.feedback>p {
	font-family: 'Amiri', cursive;
} /* Editing footer */
footer #social-media img {
	display: inline-block;
	margin: 0 15px 0 15px;
}
/*anchor tag*/
.newanchor:link {
	color: orange;
}

.newanchor:visited {
	color: green;
}

.newanhor:hover {
	color: yellow;
}

.newanchor:active {
	color: red;
}

footer .footerOptions {
	font-family: Trebuchet MS;
	text-decoration: none;
	color:black;
}
</style>
<title>Home Page</title>
</head>
<body>
	<!-- Company Name Jumbotron -->
	<div class="jumbotron text-center"
		style="background-color:#0180cdd1; width: 100%; margin-bottom: 0px;padding-top: 30px;padding-bottom: 30px;">
		<h1
			style="text-shadow: 5px 5px 5px #000000; color: white;font-family: 'Lobster', cursive;margin-bottom: 0px;">
			Tipsy &nbsp;Travels</h1>
			<h2 style="text-shadow: 5px 5px 5px #000000; color:red; font-family: 'Lobster', cursive;margin-top: 0px;padding-left: 380px;"> travel.. explore..</h2>
	</div>

	<!-- Navbar -->
	<nav class="navbar navbar-fixed-top"
		style="position: sticky;">
	<div class="container-fluid">
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<!-- <li><a href="#">Contact Us</a></li> -->
			<!-- <li><a href="retrieval">Retrieval</a></li> -->
			<li><a href="viewFeedback">Feedback</a></li>
			<!-- <li><a href="#">Gallery</a></li> -->
			<!-- //<li><a href="#">Schedules</a></li> -->
			<li><a data-toggle="modal" data-target="#loginModal">Login</a></li>
		</ul>
	</div>
	</nav>

	<!-- Modal -->
	<div class="modal fade" id="loginModal" role="dialog">
		<div class="modal-dialog">


			<!-- Modal content-->

			<div class="modal-content">

				<div class="modal-body">

					<div class="row">
						<div class="col-md-6">
							<img src="resources/image/login-icon-3058.png">
						</div>
						<div class="col-md-6">
							<button type="button" class="close" data-dismiss="modal">&times;</button>

							<div class="modal-body" style="padding: 40px 50px;">
								<form:form action="AccountHolderLogin" method="post">
									<div class="form-group">
										<label for="usrname"><span
											class="glyphicon glyphicon-user"></span> Username</label>
										<form:input path="username" class="form-control"
											required="true"></form:input>
									</div>
									<div class="form-group">
										<label for="psw"><span
											class="glyphicon glyphicon-eye-open"></span> Password</label>
										<form:password path="password" class="form-control"
											required="true"></form:password>
									</div>
									<div class="checkbox">
										<label><input type="checkbox" value="unchecked">Remember
											me</label>
									</div>
									<button type="submit" class="btn btn-success btn-block">
										<span class="glyphicon glyphicon-off"></span> Login
									</button>
									<br>
									<br>

									<a href="newUser">New User ? Register here</a>
								</form:form>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Transitioned Image -->
	<div id="serviceId" class="row">
		<form:form action="search" method="post" modelAttribute="service">

			<div class="col-md-3 form-group">
				<div class="inner-addon left-addon">
					<i class="glyphicon glyphicon-record"></i>
					<form:input path="srFrom" class="form-control"></form:input>

				</div>
			</div>

			<div class="col-md-3 form-group">
				<div class="inner-addon left-addon">
					<i class="glyphicon glyphicon-map-marker"></i>
					<form:input path="srTo" type="text" class="form-control"
						placeholder="To"></form:input>
				</div>
			</div>

			<div class="col-md-3 form-group">
				<div class="inner-addon left-addon">
					<i class="glyphicon glyphicon-calendar"></i>
					<form:input path="journeyDate" class="form-control"
						placeholder="DD-MM-YYYY" type="date"></form:input>
				</div>
			</div>

			<div class="col-md-3 form-group">
				<div class="inner-addon left-addon">
					<i class="fa fa-users"></i> <input type="text" type="text"
						class="form-control" name="noOfSeats"
						placeholder="No. of Passengers" />
				</div>
			</div>

			<div class="text-center">
				<input type="submit" value="Search">
			</div>
			
		</form:form>
	</div>
	

	
	<!-- Feedbacks -->
	<div class="container-fluid"
		style="background: url('image/feedback2.jpg'); padding-top: 25px; background-position: center; background-size: cover; background-attachment: fixed;">
		<div class="jumbotron text-center" style="opacity: .8; background-color:#777 ;">
			<h1 style="font-family: garamond; color:white">Customer Feedbacks</h1>
		</div>
		<div id="feedbackRow" class="row text-center">
			<div class="col-sm-4"
				style="padding-left: 30px; padding-right: 30px;">
				<div class="col-sm-12 feedback">
					<h3 style="font-family: 'Satisfy', cursive;">"Convenient and
						Reliable"</h3>
					<p style="font-size: 18px;">I had to book tickets at the
						eleventh hour, most services were full. I don't know how, but
						Travel Line confirmed all my tickets. Wow!</p>
					<p style="float: right;">- Sam Monet</p>
				</div>
			</div>
			<div class="col-sm-4"
				style="padding-left: 30px; padding-right: 30px;">
				<div class="col-sm-12 feedback">
					<h3 style="font-family: 'Satisfy', cursive;">"Commendable
						Customer Support"</h3>
					<p style="font-size: 18px;">None of my queries went unanswered
						by customer support representatives, very helpful and friendly
						staff. They took an extra effort to ensure that my cashback was
						delivered. Had a great experience.</p>
					<p style="float: right;">- Chris Rod</p>
				</div>
			</div>
			<div class="col-sm-4"
				style="padding-left: 30px; padding-right: 30px;">
				<div class="col-sm-12 feedback">
					<h3 style="font-family: 'Satisfy', cursive;">"Efficient and
						hassle free!"</h3>
					<p style="font-size: 18px;">A very innovative platform, used
						the service for the first time and would definitely not be the
						last. Very pleased!</p>
					<p style="float: right;">- Megha Paul</p>
				</div>
			</div>
		</div>

		<!-- Personal feedback inputs -->

		<div class="jumbotron text-center" style="opacity: .8;">
			<h1 style="font-family: garamond;">Submit Your Valuable Feedback</h1>
		</div>
		
		<div
			style="padding-left: 250px; padding-right: 250px; font-family: algeria;">
			<form action="addFeedback" method="post" autocomplete="off">
				<div class="form-group">
					<input type="text" class="form-control"
						placeholder="Enter Name"  name="pName" required />
				</div>
				<div class="form-group">
					<input type="email" class="form-control"
						placeholder="Enter Email Id" required name="emailId" />
				</div>
				<div class="form-group">
					<textarea class="form-control"  required name="comments" rows="3"
						placeholder="Your feedback..." style="resize: vertical;" ></textarea>
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
		
		<br> <br>
	</div>
	<div>
		<a href="servcieproviderregistration" class="newanchor" align="center">Interested
			in providing the service?Click Here</a>
	</div>

	<script type="text/javascript">
		$(window).scroll(function() {
			if ($(window).scrollTop() > 800) {
				$('#feedbackRow').css('opacity', 1);
				$('#feedbackRow').css('padding-top', 0);
			}
		});
	</script>
	<!-- Footer -->
	<footer class="container-fluid text-center"
		style="background-color:#0075c4b8;padding-right: 0px;padding-left: 0px; padding-top: 40px;">
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
					<h4 style="font-family: 'Montserrat', sans-serif;  color:white">Contact Us:</h4>
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
						<h4 style="font-family: 'Montserrat', sans-serif; color:white">Communication
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
							style="font-size: 18px; font-family: 'Montserrat', sans-serif; color:white">Experience
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
							style="font-size: 18px; font-family: 'Montserrat', sans-serif;  color:white">Be
							in touch with </span>
					</div>
					<br>
				</div>
			</div>
			<div id="social-media">
				<a
					href="https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en_US"
					target="_blank"><img src="resources/image/fbLogo.png"
					height="20" width="20"></a> <a
					href="https://apps.apple.com/us/app/twitter/id333903271"
					target="_blank"><img src="resources/image/twitterLogo.png"
					height="20" width="30"></a> <a
					href="https://play.google.com/store/apps/details?id=com.google.android.apps.plus&hl=en_IN"
					target="_blank"><img src="resources/image/googlePlusLogo.png"
					height="20" width="20"></a> <a
					href="https://apps.apple.com/us/app/instagram/id389801252"
					target="_blank"><img src="resources/image/instagramLogo.png"
					height="20" width="20"></a>
			</div>
		</div>
	</div>

	<div class="container-fluid"
		style="padding: 7px 7px 7px 7px; background-color: #DFDDE0;">
		<div class="row-content">
			<div class="col-sm-2">
				<img src="resources/image/pci.png" style="width: 40%;">
			</div>
			<div class="col-sm-2">
				<img src="resources/image/verisign.png" style="width: 40%;">
			</div>
			<div class="col-sm-2">
				<img src="resources/image/visa.png" style="width: 40%;">
			</div>
			<div class="col-sm-2">
				<img src="resources/image/mastercard.png" style="width: 40%;">
			</div>
			<div class="col-sm-2">
				<img src="resources/image/americanExpress.png" style="width: 40%;">
			</div>
			<div class="col-sm-2">
				<img src="resources/image/rupay.png" style="width: 40%;">
			</div>
		</div>
	</div>


	<div class="container-fluid" style="background-color:0075c4b8;">
		<div class="container text-center">
			<p
				style="padding-top: 5px; color: white; padding-bottom: 0px; font-family: verdana; margin: 0px 0px;">©
				2019 www.travelline.com All rights reserved</p>
		</div>
	</div>
	</footer>
</body>
</html>

