package ourRoom.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Noti {

	@Column(name = "p_num")
	private int pNum;
	
	@Column(name = "l_num")
	private int lNum;
	
	@Column(name = "m_id")
	private int mId;
	
	@Column(name = "n_isRead")
	private int nIsRead;

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	public int getlNum() {
		return lNum;
	}

	public void setlNum(int lNum) {
		this.lNum = lNum;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public int getnIsRead() {
		return nIsRead;
	}

	public void setnIsRead(int nIsRead) {
		this.nIsRead = nIsRead;
	}

	@Override
	public String toString() {
		return "Noti [pNum=" + pNum + ", lNum=" + lNum + ", mId=" + mId + ", nIsRead=" + nIsRead + "]";
	}
	
	

}
