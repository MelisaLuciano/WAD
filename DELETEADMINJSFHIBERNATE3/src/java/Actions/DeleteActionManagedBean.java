package Actions;

import entity.HibernateUtil;
import entity.Login;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
 
@ManagedBean(name="deleteActionManagedBean")
@SessionScoped
public class DeleteActionManagedBean implements Serializable
{
private List lista;   
private int id;   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }
    
    public String TableDelete()
    {
    Session hibernateSession;
  
    hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
    Query consulta=hibernateSession.createQuery("from Login");
    lista=consulta.list(); 
    return "output0" ;
    }

    public String DeleteUser(int id)
    {
    Session hibernateSession;
  
    hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
  
    Transaction t=hibernateSession.beginTransaction(); 
    Login user=(Login)hibernateSession.load(Login.class,id);
    hibernateSession.delete(user);
    t.commit(); 
 
    return "output1" ;
    }    
}