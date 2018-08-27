package ourRoom.model;

import javax.persistence.Column;

public class CheckListItemMember {

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
	
	@Column(name = "m_id")
	private int mId;

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

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	@Override
	public String toString() {
		return "CheckListItemMember [pNum=" + pNum + ", tNum=" + tNum + ", iNum=" + iNum + ", clNum=" + clNum
				+ ", ciNum=" + ciNum + ", mId=" + mId + "]";
	}

	
}
