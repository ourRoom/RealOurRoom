package ourRoom.model;

import javax.persistence.Column;

public class ChatMember {

	@Column(name = "ch_num")
	private int chNum;
	
	@Column(name = "m_id")
	private int mId;
	
	@Column(name = "ch_readTime")
	private int chReadTime;

	@Column(name = "ch_invitedTime")
	private int chInvitedTime;

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

	public int getChReadTime() {
		return chReadTime;
	}

	public void setChReadTime(int chReadTime) {
		this.chReadTime = chReadTime;
	}

	public int getChInvitedTime() {
		return chInvitedTime;
	}

	public void setChInvitedTime(int chInvitedTime) {
		this.chInvitedTime = chInvitedTime;
	}

	@Override
	public String toString() {
		return "ChatMember [chNum=" + chNum + ", mId=" + mId + ", chReadTime=" + chReadTime + ", chInvitedTime="
				+ chInvitedTime + "]";
	}
	
	
	
}
