package paquete1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String[] arreglo = null;
        Cookie galleta2 = new Cookie("id2", "12");
        Cookie galleta3 = new Cookie("id3", "13");
        galleta2.setMaxAge(365 * 24 * 60 * 60 * 1000);//timepo de vida galleta en milisegundos (1 año)
        response.addCookie(galleta2);
        response.addCookie(galleta3);
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hola</h1>");
        out.println("</body>");
        out.println("</html>");

    }

}
