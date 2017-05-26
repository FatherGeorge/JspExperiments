
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title JSP</title>
</head>
<body>

    <p><font color="red">${errorMessage}</font></p>
    <form action="/login.do" method="post">
        name: <input type="text" name="name"/> and
        pass: <input type="password" name="pass"/>
             <input type="submit" value="submit"/>
    </form>
</body>
</html>
