import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Shreya on 7/16/2017.
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("user");
        String password = req.getParameter("password");
        int updated=0;
        try {
            Connector c = new Connector();
            if(username!=null && password!=null) {
                PreparedStatement ps = c.con.prepareStatement("INSERT INTO USERS VALUES (?,?)");
                ps.setString(1,username);
                ps.setString(2,password);
                updated=ps.executeUpdate();
                if(updated>0) {
                    out.println("You have been Registered!!");
                    req.getRequestDispatcher("index.jsp").include(req, resp);
                }
            }
            else{
                out.println("Null values!!");
                req.getRequestDispatcher("register.jsp").include(req, resp);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
