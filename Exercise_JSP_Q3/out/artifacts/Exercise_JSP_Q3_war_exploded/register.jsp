<%--
  Created by IntelliJ IDEA.
  User: Shreya
  Date: 7/16/2017
  Time: 12:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12 col-xs-12" style="margin-top: 200px;">
            <div class="panel panel-default" style="margin-left: 300px;margin-right: 300px;">
                <div class="panel-heading text-center">
                    Register
                </div>
                <div class="panel-body">
                    <form class="form-horizontal" action="RegistrationServlet" method="post">
                        <div class="form-group" >
                            <label class="control-label col-md-4" >Email/Username*</label>
                            <div class="col-md-8">
                                <input type="text" name="user" class="form-control" placeholder="Enter username"  required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-4 " >Password*</label>
                            <div class="col-md-8 ">
                                <input type="password" class="form-control"  placeholder="Enter Password" name="password" required>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-default btn-block">Register</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
