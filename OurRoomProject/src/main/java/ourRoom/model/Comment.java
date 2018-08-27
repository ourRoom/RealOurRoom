package ourRoom.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Comment {

	@Column(name = "p_num")
	private int pNum;
	
	@Column(name = "t_num")
	private int tNum;
	
	@Column(name = "i_num")
	private int iNum;
	
	@Column(name = "cm_num")
	private int cmNum;
	
	@Column(name = "m_id")
	private int mId;
	
	@Column(name = "cm_content")
	private int cmContent;
	
	@Column(name = "cm_writeTime")
	private int cmWriteTime;
	
	@Column(name = "cm_super")
	private int cmSuper;

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

	public int getCmContent() {
		return cmContent;
	}

	public void setCmContent(int cmContent) {
		this.cmContent = cmContent;
	}

	public int getCmWriteTime() {
		return cmWriteTime;
	}

	public void setCmWriteTime(int cmWriteTime) {
		this.cmWriteTime = cmWriteTime;
	}

	public int getCmSuper() {
		return cmSuper;
	}

	public void setCmSuper(int cmSuper) {
		this.cmSuper = cmSuper;
	}

	@Override
	public String toString() {
		return "Comment [pNum=" + pNum + ", tNum=" + tNum + ", iNum=" + iNum + ", cmNum=" + cmNum + ", mId=" + mId
				+ ", cmContent=" + cmContent + ", cmWriteTime=" + cmWriteTime + ", cmSuper=" + cmSuper + "]";
	}
	
	
	
}
