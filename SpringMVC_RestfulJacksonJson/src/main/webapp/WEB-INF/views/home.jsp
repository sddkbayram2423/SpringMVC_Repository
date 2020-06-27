<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>


<c:if test="{personeller not empty}">
<c:forEach items="personeller"  var="personel">
	<P>  ${personel.adi} <font color="red">${personel.id}</font> </P>
	</c:forEach>
</c:if>
<c:if test="{personeller}">
<font color="red">boş</font>

</c:if>

</body>
</html>
