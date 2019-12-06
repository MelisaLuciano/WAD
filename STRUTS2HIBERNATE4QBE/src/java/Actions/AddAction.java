package Actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Login;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class AddAction extends ActionSupport 
{
private List result;

    public List getResult() {
        return result;
    }

    public void setResult(List result) {
        this.result = result;
    }


    public String execute() throws Exception 
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Login.class);
        Login login = new Login();
        login.setUsername("rperedo");
        criteria.add(Example.create(login));
        result=criteria.list();
        
        return SUCCESS;
    }
    
}



































