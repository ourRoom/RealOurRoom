<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://unpkg.com/react@15/dist/react.js"></script>
<script src="https://unpkg.com/react-dom@15/dist/react-dom.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/babel-core/5.8.34/browser.js"></script>



<title>Insert title here</title>
</head>
<body style="background-color: black; color: white;">
	<div id="here"></div>

	<button id="test" class="btn">버튼</button>

	<!-- 	<script type="text/javascript">
	$(document).ready(function() {

		$('#test').click(function() {
			$.ajax({
				url : "projectList", 
				success : function(data){
					for(var i = 0; i < data.length; i++ ){
						$('#here')
						.append('프로젝트 이름 : ').append(data[i].pNum).append('<br>')
						.append('프로젝트 넘버 : ').append(data[i].pName).append('<br>')
						.append('프로젝트  시작일: ').append(data[i].pStartDate).append('<br>')
						.append('프로젝트 종료일 : ').append(data[i].pEndDate).append('<br>')

					}
						
				}
			})
		})
	})
	</script>
 -->
    <script type="text/babel" src="<c:url value='/resources/js/tt.js'/>"></script>

	
</body>
</html>