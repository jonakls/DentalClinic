package top.jonakls.dentalclinic.servlet.login;

import top.jonakls.dentalclinic.controller.UserPersistenceController;
import top.jonakls.dentalclinic.entity.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    private final static UserPersistenceController USER_PERSISTENCE_CONTROLLER = new UserPersistenceController();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String dni = req.getParameter("inputDni");
        final String password = req.getParameter("inputPassword");

        System.out.println("dni: " + dni);
        System.out.println("password: " + password);

        if (dni == null || dni.isEmpty() || password == null || password.isEmpty()) {
            resp.sendRedirect(req.getContextPath() + "/login.jsp?error=1");
            return;
        }

        final UserEntity user = USER_PERSISTENCE_CONTROLLER.loginUser(Integer.parseInt(dni), password);

        if (user == null) {
            resp.sendRedirect(req.getContextPath() + "/login.jsp?error=2");
            return;
        }

        req.getSession().setAttribute("user", user);
        resp.sendRedirect(req.getContextPath() + "/dashboard.jsp");
    }
}
