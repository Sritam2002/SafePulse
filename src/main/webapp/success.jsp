<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<style>
.alert {
  padding: 20px;
  background-color: green; 
  color: white;
  margin: 20px;
}

.closebtn {
  margin-left: 15px;
  color: white;
  font-weight: bold;
  float: right;
  font-size: 22px;
  line-height: 20px;
  cursor: pointer;
  transition: 0.3s;
}


.closebtn:hover {
  color: black;
}
</style>
</head>
<body>
       <jsp:scriptlet>
            String message=(String)request.getAttribute("success_message");
        </jsp:scriptlet>
        <div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
		<div class="alert" style="border-radius:60px">
        <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
        <h4><center><jsp:expression>message</jsp:expression></center></h4> 
        </div>
        </div>
         <div class="col-md-3"></div> 
        </div>
</body>
</html>