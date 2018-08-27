package ourRoom.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class IssueMember {

	@Column(name = "p_num")
	private int pNum;
	
	@Column(name = "t_num")
	private int tNum;
	
	@Column(name = "i_num")
	private int iNum;
	
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

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	@Override
	public String toString() {
		return "IssueMember [pNum=" + pNum + ", tNum=" + tNum + ", iNum=" + iNum + ", mId=" + mId + "]";
	}
	
	

}
