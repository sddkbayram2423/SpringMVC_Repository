<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
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
		<div class="col-md-6">
				<font color="green"><strong>GELEN BİLGİLER</strong></font><hr>
				<table class="table table-striped">
					<tbody>
						<tr>
							<td><output><strong>ADI     :</strong></output> </td>
							<td>${kullanici.adi}</td>
						</tr>
						<tr>
							<td><output><strong>SOYADI  :</strong></output> </td>
							<td>${kullanici.soyadi}</td>
						</tr>
						<tr>
							<td><output><strong>NUMARA  :</strong></output> </td>
							<td>${kullanici.numara}</td>
						</tr>
					</tbody>
				</table>
		</div>
	</div>
</body>
</html>
