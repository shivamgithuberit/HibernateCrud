<%-- 
    Document   : Register
    Created on : Aug 2, 2023, 1:24:31 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Users.css">
    </head>
    <body>
        <div class="login-box">
            <h2>Register</h2>
            <form action="RegisterController">
                <div class="user-box">
                    <input type="text" name="name" required>
                    <label>Name</label>
                </div>

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
                    <input type="submit" value="Register">



                </div>

            </form>
        </div>  
    </body>
</html>
