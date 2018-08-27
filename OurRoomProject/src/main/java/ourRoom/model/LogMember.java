package ourRoom.model;

import javax.persistence.Column;

public class LogMember {

	@Column(name = "p_num")
	private int pNum;
	
	@Column(name = "m_id")
	private int mId;
	
	@Column(name = "l_num")
	private int lNum;

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
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

	@Override
	public String toString() {
		return "LogMember [pNum=" + pNum + ", mId=" + mId + ", lNum=" + lNum + "]";
	}
	
	

}
