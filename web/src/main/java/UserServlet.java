import by.roman_mayorov.UserDto;
import by.roman_mayorov.UserService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet (value = "/user")
public class UserServlet extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Optional<UserDto> user = userService.getUser(1L);

        resp.setContentType("text/html; charset=utf-8");

        PrintWriter pw = resp.getWriter();

        pw.write("<html><body>");
        pw.write("<h1> Пользователь:" + user.get().getUsername() + "</h1>");
        pw.write("</body></html>");
        pw.close();
    }
}
