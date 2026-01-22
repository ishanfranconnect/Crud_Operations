package c.r.d;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable 
// Embeddable annotation ka meaning ye hota h jo phone naam ka seperate table nahi bnayega uske aandar jo entity likhi oh kisi table me jake merge ho jayga
public class Phone {
    @Column(name="phone_number")
    private int no;
    public int getId(){
        return no;
    }
    public void setId(int no){
        this.no=no;
    }
    }
    
    // private String state,city,country;
    // public String getCity(){
    //     return city;
    // }
    // public void setCity(String city){
    //     this.city=city;
    // }
    // public String getState(){
    //     return state;   
    // }       
    // public void setState(String state){
    //     this.state=state;
    // }
    // public String getCountry(){
    //     return country;
    // }
    // public void setCountry(String country){
    //     this.country=country;
    // }

