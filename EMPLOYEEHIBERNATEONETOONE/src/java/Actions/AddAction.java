package Actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Employee;
import entity.Employeedetail;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddAction extends ActionSupport 
{
    public String execute() throws Exception 
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t=session.beginTransaction();
        //Employeedetail(String street, String city, String state, String country)
        Employeedetail employeedetail = new Employeedetail("Av. IPN 10", "CDMX", "CDMX", "MEXICO");
         
        //Employee(String firstname, String lastname, Date birthdate, String phone)
        Employee employee = new Employee("RUBEN", "PEREDO", new Date(121212),"123-456-789");
        employee.setEmployeedetail(employeedetail);
        employeedetail.setEmployee(employee);
         
        session.save(employee);
        t.commit();
       
        return SUCCESS;
    }
}
