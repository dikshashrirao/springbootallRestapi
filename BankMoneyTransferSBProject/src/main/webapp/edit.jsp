<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<table border="1">
<tr><td>Uid:-</td><td><input type="hidden" name="uid" value="${data.uid}"></td></tr>

<tr><td>Aid:-</td><td><input type="hidden" name="ad.aid" value="${data.ad.aid}"></td></tr>

<tr><td>Name:-</td><td><input type="text" name="name" value="${data.name}"></td></tr>

<tr><td>User Name:-</td><td><input type="text" name="un" value="${data.un}"></td></tr>

<tr><td>Password:-</td><td><input type="text" name="ps" value="${data.ps}"></td></tr>

<tr><td>EMAIL:-</td><td><input type="text" name="email" value="${data.email}"></td></tr>

<tr><td>BALANCE:-</td><td><input type="text" name="balance" value="${data.balance}"></td></tr>

<tr><td>City:-</td><td><input type="text" name="ad.city" value="${data.ad.city}"></td></tr>

<tr><td>Area:-</td><td><input type="text" name="ad.area" value="${data.ad.area}"></td></tr>

<tr><td><input type="submit" value="UPDATE"></td></tr>

</table>
</form>
</body>
</html>