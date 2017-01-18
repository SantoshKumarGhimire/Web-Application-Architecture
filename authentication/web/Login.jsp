<%-- 
    Document   : Login
    Created on : Jan 16, 2017, 12:08:06 PM
    Author     : 985277
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="Loginservlet">
              <label>Username</label><input type="text" name="username"><br>
            <label>Password</label><input type="password" name="password"><br>
        <input type="submit" name="submit" value="Login">
        </form>
        <span>${error}</span>
    </body>
</html>
