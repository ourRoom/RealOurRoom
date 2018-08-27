package ourRoom.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "p_num")
	private int pNum;
	
	@Column(name = "p_name")
	private String pName;
	
	@Column(name = "p_startdate")
	private Timestamp pStartDate;
	
	@Column(name = "p_enddate")
	private Timestamp pEndDate;
	
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Timestamp getpStartDate() {
		return pStartDate;
	}
	public void setpStartDate(Timestamp pStartDate) {
		this.pStartDate = pStartDate;
	}
	public Timestamp getpEndDate() {
		return pEndDate;
	}
	public void setpEndDate(Timestamp pEndDate) {
		this.pEndDate = pEndDate;
	}
	@Override
	public String toString() {
		return "Project [pNum=" + pNum + ", pName=" + pName + ", pStartDate=" + pStartDate + ", pEndDate=" + pEndDate
				+ "]";
	}
	
}
