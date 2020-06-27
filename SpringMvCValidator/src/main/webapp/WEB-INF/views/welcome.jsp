<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<div class="container">
	<table class="tabel table-secondary">
	<tbody>
				<tr>
					<td>Ad:</td>
					<td>${user.firstname}</td>
				</tr>
				<tr>
					<td>Soyadı:</td>
					<td>${user.lastname}</td>
				</tr>
				<tr>
					<td>Yaş:</td>
					<td>${user.age}</td>
				</tr>
			</tbody>
	</table>
	</div>

</body>
</html>