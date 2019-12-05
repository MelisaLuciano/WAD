package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>Servlet1</title></head>");
    out.println("<body bgcolor=\"#ffffff\">");
    out.println("<p>API Servlets.</p>");
    Enumeration enum1 = request.getParameterNames();
    while(enum1.hasMoreElements())
    {
      String nombre = (String) enum1.nextElement();

      String valores[] = request.getParameterValues(nombre);
      if (valores != null) {
      for (int i = 0; i < valores.length; i++) {
      out.println(nombre + " (" + i + "): " + valores[i]);
    }
    }
    }
    out.println("</body></html>");
  }
  //Clean up resources
  public void destroy() {
  }
}

