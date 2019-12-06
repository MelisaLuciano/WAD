package paquete;

import java.io.File;
import org.apache.commons.io.FileUtils;
import com.opensymphony.xwork2.ActionSupport;
//implementa interfaz serialisable
//Deriva de action con success y no se tiene que declarar
public class Upload extends ActionSupport
{
    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
 
    public String execute() {
        try 
        {
            File fileToCreate = new File("c:\\AJAX", this.userImageFileName);
            FileUtils.copyFile(this.userImage, fileToCreate);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            addActionError(e.getMessage());
            return "error";
        }
        return "exitoso";
    }
 
    public File getUserImage() {
        return userImage;
    }
 
    public void setUserImage(File userImage) {
        this.userImage = userImage;
    }
 
    public String getUserImageContentType() {
        return userImageContentType;
    }
 
    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }
 
    public String getUserImageFileName() {
        return userImageFileName;
    }
 
    public void setUserImageFileName(String userImageFileName) {
        this.userImageFileName = userImageFileName;
    }

}
