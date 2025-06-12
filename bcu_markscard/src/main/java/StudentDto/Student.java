package StudentDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Stuent_markscard")
public class Student {
	@Id
	private String regNo;
	private String name;
	private String fname;
	private String collegeName;
	private String Examination;
	private String sem;
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getExamination() {
		return Examination;
	}
	public void setExamination(String examination) {
		Examination = examination;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", name=" + name + ", fname=" + fname + ", collegeName=" + collegeName
				+ ", Examination=" + Examination + ", sem=" + sem + "]";
	}

}
