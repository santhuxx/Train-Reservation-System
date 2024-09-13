package user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logincontrol")
public class logincontrol extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        // Retrieve the username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean isdone;

        // Validate the user's credentials
        isdone = usermethod.validate(username, password);

        if (isdone == true) {
            // If validation is successful, retrieve user details
            List<user> userDetails = usermethod.getuser(username);
            request.setAttribute("userDetails", userDetails);

            // Forward the request to the "home.jsp" page
            RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
            dis.forward(request, response);
        } else {
            // If validation fails, display an alert and redirect to the "Login.jsp" page
            out.println("<script type='text/javascript'>");
            out.println("alert('Your username or password is incorrect');");
            out.println("location='Login.jsp'");
            out.println("</script>");
        }
    }
}
