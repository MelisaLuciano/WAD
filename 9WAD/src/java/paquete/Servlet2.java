package paquete1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Cookie[] galletas = request.getCookies();
       // out.println("Galletas:" + galletas);
        //out.println("galletas:"+galletas.toString());
        String cadena = (String) request.getAttribute("atributorequest");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hola mundo </h1>");
        for (int i = 0; i < galletas.length; i++) {
            out.println("El nombre de la galleta es:" + galletas[i].getName() + "\n<br>");
            out.println("El valor de la galleta es:" + galletas[i].getValue() + "\n<br>");

        }
        out.println("</body>");
        out.println("</html>");

    }

}
