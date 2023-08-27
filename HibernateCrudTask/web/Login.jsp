<%-- 
    Document   : Login
    Created on : Aug 2, 2023, 11:29:19 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link rel="stylesheet" type="text/css" href="Users.css">
    <style>
        .register{
            color: green;
            font-size: 25px;
        }
    </style>
    </head>
    <body>
        <div class="login-box">
            <h2>Login</h2>
            <form action="LoginController">
                <div class="user-box">
                    <input type="text" name="uname" required>
                    <label>Username</label>
                </div>

                <div class="user-box">
                    <input type="password" name="pass" required>
                    <label >Password</label>
                </div>
                <div class="btn">

                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                    <input type="submit" value="Login"><br>
                    
                </div>
                <p class="register" >Not a user ?  <a href="Register.jsp">Register here</a></p>
            </form>
        </div>  
    </body>
</html>
