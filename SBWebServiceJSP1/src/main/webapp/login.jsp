<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function login() {
  var un=document.f.un.value;
  var ps=document.f.ps.value;
  alert(un);
  alert(ps);
  alert("successful   1");
  var req=new XMLHttpRequest();
  var url="http://localhost:8082/log/"+un+"/"+ps+"";
  alert("successful   2");
	  
      req.open("GET",url,true);
     req.send();
     req.onreadystatechange=function() {
    	 alert(req.readyState);
	if (req.readyState==4 && req.status==200) {
		
		 alert(req.responseText);
	}	
	}
 
}
</script>
</head>
<body>
<form name="f">
USERNAME<input type="text" name="un">
PASSWORD<input type="text" name="ps">
<input type="button" value="login" onclick="login()">
</form>
</body>
</html>