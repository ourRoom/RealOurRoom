package ourRoom.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ChatMessage {
	
	@Column(name = "ch_num")
	private int chNum;
	
	@Column(name = "m_id")
	private int mId;
	
	@Column(name = "chm_content")
	private int chmContent;
	
	@Column(name = "chm_writeTime")
	private int chmWriteTime;

	public int getChNum() {
		return chNum;
	}

	public void setChNum(int chNum) {
		this.chNum = chNum;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public int getChmContent() {
		return chmContent;
	}

	public void setChmContent(int chmContent) {
		this.chmContent = chmContent;
	}

	public int getChmWriteTime() {
		return chmWriteTime;
	}

	public void setChmWriteTime(int chmWriteTime) {
		this.chmWriteTime = chmWriteTime;
	}

	@Override
	public String toString() {
		return "ChatMessage [chNum=" + chNum + ", mId=" + mId + ", chmContent=" + chmContent + ", chmWriteTime="
				+ chmWriteTime + "]";
	}
	

	
}
