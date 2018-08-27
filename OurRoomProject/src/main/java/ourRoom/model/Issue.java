package ourRoom.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Issue {

	@Column(name = "p_num")
	private int pNum;
	
	@Column(name = "t_num")
	private int tNum;
	
	@Column(name = "i_num")
	private int iNum;
	
	@Column(name = "i_step")
	private int iStep;
	
	@Column(name = "i_order")
	private int iOrder;
	
	@Column(name = "i_name")
	private String iName;
	
	@Column(name = "i_dscr")
	private String iDscr;
	
	@Column(name = "i_startDate")
	private Date iStartDate;
	
	@Column(name = "i_endDate")
	private Date iEndDate;
	
	@Column(name = "i_impr")
	private int iImpr;

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	public int gettNum() {
		return tNum;
	}

	public void settNum(int tNum) {
		this.tNum = tNum;
	}

	public int getiNum() {
		return iNum;
	}

	public void setiNum(int iNum) {
		this.iNum = iNum;
	}

	public int getiStep() {
		return iStep;
	}

	public void setiStep(int iStep) {
		this.iStep = iStep;
	}

	public int getiOrder() {
		return iOrder;
	}

	public void setiOrder(int iOrder) {
		this.iOrder = iOrder;
	}

	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	public String getiDscr() {
		return iDscr;
	}

	public void setiDscr(String iDscr) {
		this.iDscr = iDscr;
	}

	public Date getiStartDate() {
		return iStartDate;
	}

	public void setiStartDate(Date iStartDate) {
		this.iStartDate = iStartDate;
	}

	public Date getiEndDate() {
		return iEndDate;
	}

	public void setiEndDate(Date iEndDate) {
		this.iEndDate = iEndDate;
	}

	public int getiImpr() {
		return iImpr;
	}

	public void setiImpr(int iImpr) {
		this.iImpr = iImpr;
	}

	@Override
	public String toString() {
		return "Issue [pNum=" + pNum + ", tNum=" + tNum + ", iNum=" + iNum + ", iStep=" + iStep + ", iOrder=" + iOrder
				+ ", iName=" + iName + ", iDscr=" + iDscr + ", iStartDate=" + iStartDate + ", iEndDate=" + iEndDate
				+ ", iImpr=" + iImpr + "]";
	}
	
	
	
}
