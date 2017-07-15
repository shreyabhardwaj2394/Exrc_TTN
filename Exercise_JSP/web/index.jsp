<%--
  Created by IntelliJ IDEA.
  User: Shreya
  Date: 7/13/2017
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Questions</title>
  </head>
  <body>
  Hello!  The time is..<%out.print( java.util.Calendar.getInstance().getTime()); %>


  <!--Question 2-->
  <form action="result.jsp">
    Enter the value of n::<input type="text" name="limit">
    <input type="submit" value="submit">
  </form>

  </body>
</html>
