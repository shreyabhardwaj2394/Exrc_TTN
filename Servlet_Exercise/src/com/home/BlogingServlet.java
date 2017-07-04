package com.home;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

/**
 * Created by Shreya on 6/30/2017.
 */
@WebServlet("/BlogingServlet")
public class BlogingServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String blogId=request.getParameter("id");
        String blogContent=request.getParameter("content");
        HttpSession session=request.getSession(false);
        String sessionValue;
        if(session!=null) {
            sessionValue = (String)session.getAttribute("user");
        }
        else
            sessionValue=null;

        int r=0;
        try{
            Connector c=new Connector();
            PreparedStatement preparedStatement=c.con.prepareStatement("INSERT INTO BLOG VALUES(?,?,?)");
            preparedStatement.setString(1,blogId);
            preparedStatement.setString(2,blogContent);
            preparedStatement.setString(3,sessionValue);
            r=preparedStatement.executeUpdate();
            System.out.println(r);

            if(r>0) {
                out.println("Data Inserted!!");
                request.getRequestDispatcher("Blog.jsp").include(request,response);
             }



        }catch (Exception e){
            out.println("No data inserted!!");
            request.getRequestDispatcher("Blog.jsp").include(request,response);

        }
    }


}
