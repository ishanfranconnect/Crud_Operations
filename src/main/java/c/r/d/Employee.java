package c.r.d;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="Emp_Table")
public class Employee {
	@Id
	@GeneratedValue
	private int emp_id;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_fname() {
		return emp_fname;
	}
	public void setEmp_fname(String emp_fname) {
		this.emp_fname = emp_fname;
	}
	public String getEmp_lname() {
		return emp_lname;
	}
	public void setEmp_lname(String emp_lname) {
		this.emp_lname = emp_lname;
	}
	public String getEmp_city() {
		return emp_city;
	}
	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}
	@Column(name="Emp_FirstName")
	private String emp_fname;
	@Column(name="Emp_ListName")
	private String emp_lname;
	@Column(name="Emp_City")
	private String emp_city;
}
 