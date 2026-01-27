package c.r.d;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee2 {
    @Id
    private int Emp_id;
    private String Emp_name;
    public void setEmp_id(int Emp_id){
        this.Emp_id=Emp_id;
    }
    public int getEmp_id(){
        return Emp_id;
    }

    public void setEmp_name(String Emp_name){
        this.Emp_name=Emp_name;
    }
    public String getEmp_name(){
        return Emp_name;
    }


    @ManyToMany
    private List<Project> p;
    public void setP(List<Project> p){
        this.p=p;
    }
    public List<Project> getP(){
        return p;
    }
}
