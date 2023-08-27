<%-- 
    Document   : AddEmp
    Created on : Aug 2, 2023, 7:40:54 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-color: whitesmoke;
            }
            h1{
                margin-left: 650px;
                color: green;
            }
            .table1{
                margin: auto;
                font-size: 20px;
                
            }
            .table1 input{
                font-size: 30px;
                margin-top: 12px;
            }
            .s{
                background-color: white;
                color: navajowhite;
            }
        </style>
    </head>
    <body>
        <h1>Add Employee</h1>
        
        <form action="AddController" method="post">
            <table bgcolor='wheat' class="table1">
                
                 <tr>
                    <td>Empno: </td>
                    <td><input type="text" name="empno"></td>
                </tr> 
                 
                <tr>
                    <td>NAME: </td>
                    <td><input type="text" name="name"></td>
                </tr> 
                 <tr>
                    <td>SALARY: </td>
                    <td><input type="text" name="sal"></td>
                </tr> 
                 <tr>
                    <td>DEPTNO: </td>
                    <td><input type="text" name="deptno"></td>
                </tr> 
                 <tr>
                    <td>Commision: </td>
                    <td><input type="text" name="comm"></td>
                </tr> 
                 <tr>
                    <td>GENDER: </td>
                    <td><input type="radio" name="g" value='Male'>M
                    <input type="radio" name="g" value='Female'>F
                    </td>
                </tr> 
                
                
                <tr>
                    <td></td>
                    <td><input type="submit" value='Add Employee' class="s"></td>
                </tr> 
            </table>
        </form>
    </body>
</html>
