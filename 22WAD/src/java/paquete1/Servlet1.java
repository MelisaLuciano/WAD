package paquete1;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Servlet1 extends HttpServlet {
  private static final String CONTENT_TYPE = "text/html";
  //Initialize global variables
  @Override
  public void init() throws ServletException {
  }
  //Process the HTTP Get request
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType(CONTENT_TYPE);
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>Servlet1</title></head>");
    out.println("<body bgcolor=\"#ffffff\">");
    out.println("<p>API Servlets.</p>");
    request.setAttribute("hola","10");
    request.setAttribute("adios","6");
    Enumeration enum1 = request.getAttributeNames();
    while(enum1.hasMoreElements())
    {
      String atributo = (String) enum1.nextElement();
      out.println("atributo (" + atributo + ") " );
    }
    out.println("</body></html>");
  }
  //Clean up resources
  @Override
  public void destroy() {
  }
}