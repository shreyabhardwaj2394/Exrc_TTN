<%--
  Created by IntelliJ IDEA.
  User: Shreya
  Date: 7/15/2017
  Time: 11:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="well">
            <%
                String testingSession=(String)session.getAttribute("user");
                out.print("Hello ::"+testingSession);
            %>
            <a href="LogoutServlet" class="btn btn-info pull-right btn-xs">Logout</a>
        </div>

    </div>
</body>
</html>
