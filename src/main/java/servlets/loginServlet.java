package servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class loginServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
  {
      String email = req.getParameter("email");
      String password = req.getParameter("password");

    System.out.println("from do post method ");
    System.out.println("email "+ email);
    System.out.println("password "+ password);
    System.out.println("end of do post method....");
  }
}
