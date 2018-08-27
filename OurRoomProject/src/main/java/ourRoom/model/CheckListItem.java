package ourRoom.model;

import javax.persistence.Column;

public class CheckListItem {

	@Column(name = "p_num")
	private int pNum;
	
	@Column(name = "t_num")
	private int tNum;
	
	@Column(name = "i_num")
	private int iNum;

	@Column(name = "cl_num")
	private int clNum;

	@Column(name = "ci_num")
	private int ciNum;
	
	@Column(name = "ci_name")
	private int ciName;
	
	@Column(name = "ci_isDone")
	private int ciIsDone;

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

	public int getClNum() {
		return clNum;
	}

	public void setClNum(int clNum) {
		this.clNum = clNum;
	}

	public int getCiNum() {
		return ciNum;
	}

	public void setCiNum(int ciNum) {
		this.ciNum = ciNum;
	}

	public int getCiName() {
		return ciName;
	}

	public void setCiName(int ciName) {
		this.ciName = ciName;
	}

	public int getCiIsDone() {
		return ciIsDone;
	}

	public void setCiIsDone(int ciIsDone) {
		this.ciIsDone = ciIsDone;
	}

	@Override
	public String toString() {
		return "CheckListItem [pNum=" + pNum + ", tNum=" + tNum + ", iNum=" + iNum + ", clNum=" + clNum + ", ciNum="
				+ ciNum + ", ciName=" + ciName + ", ciIsDone=" + ciIsDone + "]";
	}
	
	
	
	
	
}
