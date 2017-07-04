package com.home;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Shreya on 6/30/2017.
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        try{
            HttpSession session=request.getSession(false);
            if(session!=null)
                session.invalidate();
            response.sendRedirect("index.jsp");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
