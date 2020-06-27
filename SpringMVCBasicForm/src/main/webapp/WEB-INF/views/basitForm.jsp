<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AnaSayfaView</title>
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
<hr>
	<div class="container">
		<div class="col-md-6">
			<form:form action="sonucForm.html" commandName="kullanici">
					<font color="red">KULLANICI BİLGİLERİ</font>
				<table class="table">
					<tbody>
						<tr>
							<td>KULLANİCİ ADİ:</td>
							<td><form:input path="kullaniciAdi"/></td>
						</tr>
						<tr>
							<td>EMAİL:</td>
							<td><form:input path="email"/></td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit"  value="Gönder"/></td>
						</tr>
					</tbody>
				</table>
			</form:form>
		</div>
	</div>
</body>
</html>