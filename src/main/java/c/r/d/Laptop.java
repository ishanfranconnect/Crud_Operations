package c.r.d;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
    @Id
    private int lapy_id;
    private String lapy_name;
    public void setlapy_id(int lapy_id){
        this.lapy_id=lapy_id;
    }
    public int getlapy_id(){
        return lapy_id;
    }
    public void setlapy_name(String lapy_name){
        this.lapy_name=lapy_name;
    }
    public String getlapy_name(){
        return lapy_name;
    }


    @ManyToOne
    private Employee1 e;
    public void setE(Employee1 e){
        this.e=e;
    }
    public Employee1 getE(){
        return e;
    }

    

}
