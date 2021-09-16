<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form id = "formtest">
		<input type="text" name="test"/>
		<input type="button" value="gogogo" id="test"/>
	</form>
	
</body>

<script>
	$("#test").on("click", function(){
		var form = document.getElementById("formtest");
		form.action = "/getIndex";
		form.submit();
	})

</script>

</html>