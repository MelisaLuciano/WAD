package paquete;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("image/jpeg");
            try  
            {  
                //Create an image 200 x 200  
                BufferedImage bufferedImage = new BufferedImage(200, 200,   
                             BufferedImage.TYPE_INT_RGB);  
      
                //Draw an oval  
                Graphics g = bufferedImage.getGraphics();  
                g.setColor(Color.blue);  
                g.fillOval(0, 0, 199,199);  
      
                //Free graphic resources  
                g.dispose();  
      
                //Write the image as a jpg 
                ImageIO.write(bufferedImage, "jpg", response.getOutputStream());  
                
            }  
            catch (IOException e)  
            {  
             e.printStackTrace();
            }  
        }  
    

}
