<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
<style>

 .alert {
  padding: 20px;
  background-color: #f44336; /* Red */
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
            String message=(String)request.getAttribute("error_message");
        </jsp:scriptlet>
        <div>
        <center class="alert">
        <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
         <h4><jsp:expression>message</jsp:expression></h4> 
        </center>
           
          
        </div>
      

</body>
</html>