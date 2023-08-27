<%-- 
    Document   : AllEmpData
    Created on : Aug 2, 2023, 7:11:40 AM
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
                background-color: wheat;
            }
            .table1{
                margin-top: 200px;
                display: center;
                margin: auto;
                border: 4px solid grey;
                border-radius:  20px;
            }
            .user{
                margin-top: -50px;
                color: blue;
            }
        </style>
    </head>
   
    <body>
         <%
        String name = (String) session.getAttribute("user");
    %>
    <div class="u">
        <h3 ><a href="AddEmp.jsp"> AddEmployee</a></h3>
        <h1 style="float: right" class="user">Username: <%=name%></h1>
    </div>


        <table class="table1" border="1">

            <tr>

                <th >Empno</th>
                <th>Name</th>
                <th >Salary</th>
                <th>Deptno</th>
                <th>Gender</th>
                <th>Commision</th>
                <th>Edit</th>
                <th>Delete</th>

            </tr>

            <tbody>
                <%
                EmpDao ed=new EmpDao();
                List<Emp> al=ed.FindAll();
                for(Emp x:al){

                %>
                <tr>

                    <td><%=x.getEmpno()%></td>
                    <td><%=x.getName() %></td>
                    <td><%=x.getSal() %></td>
                    <td><%=x.getDeptno()%></td>
                    <td><%=x.getGender()%> </td>
                    <td><%=x.getComm()%></td>


                    <td><button class="button"><a href="EditEmp.jsp?empno=<%=x.getEmpno()%>">EDIT</a></button></td>
                    <td><button class="button"><a href="DeleteController?empno=<%=x.getEmpno()%>">DELETE</a></button></td>

                </tr>
                <%
                }
                %>
            </tbody>


        </table>
    </body>
</html>
