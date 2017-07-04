<%--
  Created by IntelliJ IDEA.
  User: Shreya
  Date: 6/29/2017
  Time: 9:29 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Blog</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
</head>
<body>
<div class="container">
    <div class="row">
        <div class="well">
        <%
            String testingSession=(String)session.getAttribute("user");
            out.print("Hello ::"+testingSession);
        %>
            <a href="/LogoutServlet" class="btn btn-info pull-right btn-xs">Logout</a>
        </div>

    </div>
 <div class="row">
     <div class="col-md-5">
        <div class="panel panel-default">
             <form action="/BlogingServlet" method="post"><br><br>
                <input type="text" name="id" placeholder="Enter the Blog Id.." class="form-control" required><br><br><br>
                <textarea name="content" placeholder="Enter the Content.." class="form-control" required></textarea><br><br>
                <input type="submit" value="Save" class="btn-primary btn-block"><br>
             </form>
        </div>
     </div>
 </div>
</div>
</body>
</html>
