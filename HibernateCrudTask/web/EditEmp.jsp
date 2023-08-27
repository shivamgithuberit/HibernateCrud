<%-- 
    Document   : EditEmp
    Created on : Aug 2, 2023, 9:43:46 AM
    Author     : Administrator
--%>

<%@page import="java.util.List"%>
<%@page import="com.ram.bean.Emp"%>
<%@page import="com.ram.dao.EmpDao"%>
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
            .u{
                margin-left: 560px;
                font-size: 30px;
                color: green;
            }
            .update{
                  margin: auto;
                font-size: 20px;
                border: 4px solid green;
                margin-left: 500px;
                width: 500px;
                background-color: wheat;
                height: 300px;
            }
            .tb{
                margin: auto;
                margin-left: 50px;
                font-size: 25px;
                margin-top: 20px;
            }
            .tb input{
                font-size: 20px;
            }
        </style>
    </head>
    <body>
        <%
            int empno = Integer.parseInt(request.getParameter("empno"));
            EmpDao ed = new EmpDao();
            List<Emp> x = ed.FindById(empno);
        %>
         <div class="u">
                <h3>Update Employee Profile</h3>
            </div>
        <div class="update">
           
            <div class="tb">
                <form action="UpdateController" method="post">
                    <div >

                        <table  border="0" cellspacing='0' class="table"  >

                            <tr>

                                <td> <input type="hidden" name="empno" value="<%=x.get(0).getEmpno()%>" > </td>
                            </tr>
                            <tr>
                                <td>Name:</td>
                                <td> <input type="text" name="name" value="<%=x.get(0).getName()%>"required> </td>
                            </tr>

                            <tr>
                                <td>Salary:</td>
                                <td> <input type="text" name="sal"  value="<%=x.get(0).getSal()%>"required>
                                </td>
                            </tr>

                            <tr>
                                <td>Deptno:</td>
                                <td> <input type="text" name="deptno" value="<%=x.get(0).getDeptno()%>"required></td>
                            </tr>          

               

                            <tr>
                                <td>Commision:</td>
                                <td><input type="text" name="comm" value="<%=x.get(0).getComm()%>" required></td>
                            </tr>
                            <tr>
                                <td>GENDER: </td>
                                <td><input type="radio" name="gender" value='Male' required>Male
                                    <input type="radio" name="gender" value='Female'>Female
                                </td>
                            </tr>

                            <tr>
                                <td></td>
                                <td ><input type="submit" value="Update"></td>
                            </tr>      


                        </table> 
                    </div>
                </form>                  
            </div>
    </body>
</html>
