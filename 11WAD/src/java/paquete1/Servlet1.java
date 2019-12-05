/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        HttpSession sesion = request.getSession();
        String cadena = new String("hola sesion");
        sesion.setAttribute("clave", cadena);
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<body>");
        out.println("HELLO WORLD");
        out.println("</body>");
        out.println("</html>");

    }

}
