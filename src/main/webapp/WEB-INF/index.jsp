<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h1 style = "text-align : center;">Hello App Engine!</h1>
    
    Enter First Number :<br>
    <input type = "text" id = "fnum" name = "first"><br>
    
    Enter Second Number :<br>
    <input type = "text" id = "snum" name = "second"><br>

    <input type ="submit" value = "Add" onclick = "add()">
    <input type ="submit" value = "Sub" onclick = "sub()">
    <input type ="submit" value = "Mul" onclick = "mul()">
    <input type ="submit" value = "Div" onclick = "div()">
    
    <div id = "Result"></div>
    
    <script type="text/javascript" src = "AddJS.js"></script>

</body>
</html>