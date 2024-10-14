package top.jonakls.dentalclinic.servlet.login;

import top.jonakls.dentalclinic.controller.UserPersistenceController;
import top.jonakls.dentalclinic.entity.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {

    private final static UserPersistenceController USER_PERSISTENCE_CONTROLLER = new UserPersistenceController();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String rawDni = req.getParameter("inputDni");

        if (rawDni == null || rawDni.isEmpty()) {
            resp.sendRedirect("/register.jsp?error=1");
            return;
        }

        int dni;

        try {
            dni = Integer.parseInt(rawDni);
        } catch (NumberFormatException e) {
            resp.sendRedirect("/register.jsp?error=3");
            return;
        }

        final String name = req.getParameter("inputFirstName");
        final String secondName = req.getParameter("inputLastName");
        final String password = req.getParameter("inputPassword");

        final UserEntity user = new UserEntity();
        user.setDni(dni);
        user.setName(name + " " + secondName);
        user.setPassword(password);

        USER_PERSISTENCE_CONTROLLER.registerUser(user);
        req.getSession().setAttribute("user", user);
        resp.sendRedirect(req.getContextPath() + "/dashboard.jsp");
    }
}
