<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title>ourRoomProject</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<link rel= "stylesheet" type="text/css" href="/resources/css/mainFrame.css">
</head>
<body>

	<div id = "top">
		<div class="topIcon"><span class="glyphicon glyphicon-log-out"></span></div>
		<div class="topIcon"><span class="glyphicon glyphicon-bell"></span></div>
		<div class="topIcon"><span class="glyphicon glyphicon-comment"></span></div>
		<div class="topHome"><span class="glyphicon glyphicon-home"></span></div>
	</div>
	<div id = "left">
		<div class="leftIcon" onclick="location.href='home'"><span class="glyphicon glyphicon-home"></span></div>
		<div class="leftIcon" onclick="location.href='project'"><span class="glyphicon glyphicon-briefcase"></span></div>
		<div class="leftIcon" onclick="location.href='address'"><span class="glyphicon glyphicon-phone-alt"></span></div>
		<div class="leftIcon" onclick="location.href='myPage'"><span class="glyphicon glyphicon-user"></span></div>
	</div>
	
	 gantt : ${project_gantt}
	
</body>
</html>