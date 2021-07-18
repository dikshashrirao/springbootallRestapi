<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title><base>
<script type="text/javascript">
function regiData() {
	alert("in regi fun");
	var uid=document.fn.uid.value;
	var name=document.fn.name.value;
	var un=document.fn.un.value;
	var ps=document.fn.ps.value;
	var addr=document.fn.addr.value;
var user={
		"uid":uid,
        "name":name,
        "un":un,
        "ps":ps,
        "addr":addr
       }
     alert("user");
      var b=JSON.stringify(user);
      var req=new XMLHttpRequest();
      alert(b);
      var url="http://localhost:8082/saveUsers";
      req.open("POST",url,true);
      req.setRequestHeader("Content-Type","application/json");
      req.send(b);
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
<form name="fn">
		<table border="1" align="center">
			<tr>
				<td>ID:-</td>
				<td><input type="text" name="uid"></td>
			</tr>
			<tr>
				<td>NAME:-</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>UNAME:-</td>
				<td><input type="text" name="un"></td>
			</tr>
			<tr>
				<td>PASSWORD:-</td>
				<td><input type="text" name="ps"></td>
			</tr>
			<tr>
				<td>ADDRESS:-</td>
				<td><input type="text" name="addr"></td>
			</tr>
			<tr>
				<td><input type="button" value="Register" onclick="regiData()"></td>
			</tr>
		</table>
			</form>
</body>
</html>