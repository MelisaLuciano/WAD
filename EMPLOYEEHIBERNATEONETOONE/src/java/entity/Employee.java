package entity;
// Generated 25/05/2016 10:44:20 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Employee generated by hbm2java
 */
public class Employee  implements java.io.Serializable {


     private Integer employeeId;
     private String firstname;
     private String lastname;
     private Date birthDate;
     private String phone;
     private Employeedetail employeedetail;

    public Employee() {
    }

	
    public Employee(Date birthDate, String phone) {
        this.birthDate = birthDate;
        this.phone = phone;
    }
    public Employee(String firstname, String lastname, Date birthDate, String phone, Employeedetail employeedetail) {
       this.firstname = firstname;
       this.lastname = lastname;
       this.birthDate = birthDate;
       this.phone = phone;
       this.employeedetail = employeedetail;
    }
    
    public Employee(String firstname, String lastname, Date birthdate, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthdate;
        this.phone = phone;
         
    }
   
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Date getBirthDate() {
        return this.birthDate;
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Employeedetail getEmployeedetail() {
        return this.employeedetail;
    }
    
    public void setEmployeedetail(Employeedetail employeedetail) {
        this.employeedetail = employeedetail;
    }




}


