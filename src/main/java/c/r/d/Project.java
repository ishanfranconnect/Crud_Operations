package c.r.d;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
    @Id
    private int pro_id;
    private String pro_name;

    public void setPro_id(int pro_id){
        this.pro_id=pro_id;
    }
    public int getPro_id(){
        return pro_id;
    }
    public void setPro_name(String pro_name){
        this.pro_name=pro_name;
    }
    public String getPro_name(){
        return pro_name;
    }

    @ManyToMany
    private List<Employee2> e;

    public void setE(List<Employee2> e){
        this.e=e;
    }
    public List<Employee2> getE(){
        return e;
    }
}
