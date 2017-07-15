
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Shreya on 7/15/2017.
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        String username=req.getParameter("user");
        String password=req.getParameter("password");

        try {
            Connector c=new Connector();

            PreparedStatement ps = c.con.prepareStatement("SELECT * FROM USERS WHERE username='"+username+"' AND PASSWORD='"+password+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if((username.equals(rs.getString("username")))&&(password.equals(rs.getString("password")))){
                    HttpSession session=req.getSession();
                    session.setAttribute("user",username);
                    resp.sendRedirect("home.jsp");
                }

            }
            out.println("Incorrect values!!");
            req.getRequestDispatcher("index.jsp").include(req,resp);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch(Exception e){
            System.out.println(e);
        }

    }


}
