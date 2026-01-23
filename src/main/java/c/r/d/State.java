package c.r.d;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {
	@Id
    private int S_id;
    private String S_name;
    
    @OneToOne  
    private Capital c;
    public Capital getC() {
		return c;
	}
    
	public void setC(Capital c) {
		this.c = c;
	}
	
	public void setS_id(int s_id){
        this.S_id=s_id;
    }
    public int getS_id(){
        return S_id;
    }
    public void setS_name(String s_name){
        this.S_name=s_name;
    }
    public String getS_name(){
        return S_name;
    }
}
