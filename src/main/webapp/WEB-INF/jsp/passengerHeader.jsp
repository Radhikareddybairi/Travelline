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
<nav class="navbar navbar-inverse navbar-fixed-top"
style="position: sticky;">
<div class="container-fluid">
<ul class="nav navbar-nav">
<li class="active"><a href=#>Home</a></li>fff
<!-- <li><a href="contactUs.jsp">Contact Us</a></li>
<li><a href="Retrievalform">Retrievals</a></li> -->
<!-- <li><a href="#">Schedules</a></li> -->
<li><a href="gallery">Gallery</a></li>
 <li><a href="viewFeedback">Feedback</a></li>
 <li><a href="logout">Logout</a></li>l

<!--<li><a data-toggle="modal" data-target="#loginModal">Login</a></li>-->
</ul>
</div>
</nav>



</body>
</html>

