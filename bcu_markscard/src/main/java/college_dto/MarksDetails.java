package college_dto;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import StudentDto.Student;

@Entity
public class MarksDetails {
	private int phy7;
	private int phy7_practical;
	private int phy8;
	private int phy8_practical;
	private int maths7;
	private int maths7_practical;
	private int maths8;
	private int maths8_practical;
	private int comp_sc7;
	private int comp_sc7_practical;
	private int comp_sc8;
	private int comp_sc8_practical;
	private int banking_finance;
	@OneToOne
	private Student regno;
	
	public int getPhy7() {
		return phy7;
	}
	public void setPhy7(int phy7) {
		this.phy7 = phy7;
	}
	public int getPhy7_practical() {
		return phy7_practical;
	}
	public void setPhy7_practical(int phy7_practical) {
		this.phy7_practical = phy7_practical;
	}
	public int getPhy8() {
		return phy8;
	}
	public void setPhy8(int phy8) {
		this.phy8 = phy8;
	}
	public int getPhy8_practical() {
		return phy8_practical;
	}
	public void setPhy8_practical(int phy8_practical) {
		this.phy8_practical = phy8_practical;
	}
	public int getMaths7() {
		return maths7;
	}
	public void setMaths7(int maths7) {
		this.maths7 = maths7;
	}
	public int getMaths7_practical() {
		return maths7_practical;
	}
	public void setMaths7_practical(int maths7_practical) {
		this.maths7_practical = maths7_practical;
	}
	public int getMaths8() {
		return maths8;
	}
	public void setMaths8(int maths8) {
		this.maths8 = maths8;
	}
	public int getMaths8_practical() {
		return maths8_practical;
	}
	public void setMaths8_practical(int maths8_practical) {
		this.maths8_practical = maths8_practical;
	}
	public int getComp_sc7() {
		return comp_sc7;
	}
	public void setComp_sc7(int comp_sc7) {
		this.comp_sc7 = comp_sc7;
	}
	public int getComp_sc7_practical() {
		return comp_sc7_practical;
	}
	public void setComp_sc7_practical(int comp_sc7_practical) {
		this.comp_sc7_practical = comp_sc7_practical;
	}
	public int getComp_sc8() {
		return comp_sc8;
	}
	public void setComp_sc8(int comp_sc8) {
		this.comp_sc8 = comp_sc8;
	}
	public int getComp_sc8_practical() {
		return comp_sc8_practical;
	}
	public void setComp_sc8_practical(int comp_sc8_practical) {
		this.comp_sc8_practical = comp_sc8_practical;
	}
	public int getBanking_finance() {
		return banking_finance;
	}
	public void setBanking_finance(int banking_finance) {
		this.banking_finance = banking_finance;
	}
	public Student getRegno() {
		return regno;
	}
	public void setRegno(Student regno) {
		this.regno = regno;
	}
	
	
}
