<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form:form style="width:600px" action="welcome" modelAttribute="user" method="post">
			<div class="form-group col-md-10">
			 	<form:label path="firstname">Adı:</form:label>
				<form:input class="form-control" path="firstname" />
			</div>
			 <div>
			 	<form:errors path="firstname"/>
			 </div>

			<div class="form-group col-md-10">
				<form:label path="lastname">Soyad:</form:label>
				<form:input class="form-control" path="lastname" />
			</div>
			 <div>
			 	<form:errors path="lastname"/>
			 </div>
			<div class="form-group col-md-10">
				<form:label path="age">Yaş:</form:label>
				<form:input class="form-control" path="age"/>
			</div>
			 <div>
			 	<form:errors path="age"/>
			 </div>
			
			<div class="form-group col-md-10">
				<button type="submit" class="btn btn-outline-danger">Gönder</button>
			</div>
		</form:form>
		
	</div>
</body>
</html>
