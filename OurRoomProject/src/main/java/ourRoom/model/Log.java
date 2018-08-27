package ourRoom.model;

import javax.persistence.Column;

public class Log {

	@Column(name = "p_num")
	private int pNum;
	
	@Column(name = "t_num")
	private int tNum;
	
	@Column(name = "i_num")
	private int iNum;
	
	@Column(name = "cl_num")
	private int clNum;
	
	@Column(name = "cm_num")	
	private int cmNum;
	
	@Column(name = "m_id")
	private int mId;
	
	@Column(name = "l_num")
	private int lNum;
	
	@Column(name = "l_cat")
	private int lCat;
	
	@Column(name = "l_time")
	private int lTime;

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

	public int getCmNum() {
		return cmNum;
	}

	public void setCmNum(int cmNum) {
		this.cmNum = cmNum;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public int getlNum() {
		return lNum;
	}

	public void setlNum(int lNum) {
		this.lNum = lNum;
	}

	public int getlCat() {
		return lCat;
	}

	public void setlCat(int lCat) {
		this.lCat = lCat;
	}

	public int getlTime() {
		return lTime;
	}

	public void setlTime(int lTime) {
		this.lTime = lTime;
	}

	@Override
	public String toString() {
		return "Log [pNum=" + pNum + ", tNum=" + tNum + ", iNum=" + iNum + ", clNum=" + clNum + ", cmNum=" + cmNum
				+ ", mId=" + mId + ", lNum=" + lNum + ", lCat=" + lCat + ", lTime=" + lTime + "]";
	}
	
	

}
