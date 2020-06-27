<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>AnaSayfa</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>

<body>
	<br>
	<hr/>
	<div class="container">
	
		<div class="alert alert-info alert-dismissible">
			<button type="button" class="close" data-dismiss="alert">&times;</button>
			<a href="musteri/ekle.html">Ekle</a>
		</div>
		
		<div class="alert alert-secondary alert-dismissible">
			<button type="button" class="close" data-dismiss="alert">&times;</button>
			<a href="musteri/guncelle.html">Güncelle</a>
		</div>
		
		<div class="alert alert-danger alert-dismissible">
			<button type="button" class="close" data-dismiss="alert">&times;</button>
			<a href="musteri/sil.html">Sil</a>
		</div>
	</div>
</body>
</html>