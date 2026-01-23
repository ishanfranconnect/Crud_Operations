package c.r.d;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Capital {
    @Id
    private int C_id;
    private String C_name;
    
    @OneToOne
    private State s;
    
    public void setS(State s){
    	this.s=s;
    }
    public State getS() {
    	return s;
    }
    
    
//    setter geeter for id

    public void setC_id(int c_id){
        this.C_id=c_id;
    }
    public int getC_id(){
        return C_id;
    }
    
//    setter getter for name

    public void setC_name(String c_name){
        this.C_name=c_name;
    }
    public String getC_name(){
        return C_name;
    }
}
