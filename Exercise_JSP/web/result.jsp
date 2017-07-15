<%--
  Created by IntelliJ IDEA.
  User: Shreya
  Date: 7/13/2017
  Time: 11:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Result</title>
</head>
<body>
<%String a=request.getParameter("limit");%>
Result is::
<%int number=Integer.parseInt(a);
    for(int i=1;i<=number;i++)
    {
%>
<table border="0"><tr><td><%=i %></td></tr></table>
<%} %>

</body>
</html>
