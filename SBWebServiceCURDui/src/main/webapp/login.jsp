<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
  function getData() {
	  alert("in login fun");
	var un=document.my.un.value;
	var ps=document.my.ps.value;
	 alert(un);
	     alert(ps);
	 var req=new XMLHttpRequest();
	 var url="http://localhost:8082/getAllUsers/"+un+"/"+ps+"";
	
	 req.open("GET",url,true);
	 req.send();
	 req.onreadystatechange=function()
     {
 	  alert(req.readyState);
 	  if(req.readyState==4 && req.status==200)
 		  {
 		  alert(req.responseText);
 		  }
     }
}
</script>
</head>
<body>
<form name="my">
		<table border="1" align="center">
			<tr>
				<td>USERNAME:</td>
				<td><input type="text" name="un"></td>
			</tr>
			<tr>
				<td>PASSWORD:</td>
				<td><input type="password" name="ps"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" onclick="getData()"></td>
			</tr>
			<tr>
				<td><a href="registration.jsp">New User</a></td>
			</tr>
		</table>


	</form>
</body>
</html>