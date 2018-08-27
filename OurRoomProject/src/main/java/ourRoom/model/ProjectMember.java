package ourRoom.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ProjectMember {

	@Column(name = "p_num")
	private int pNum;
	
	@Column(name = "m_id")
	private int mId;
	
	@Column(name = "pm_isAdmin")
	private int pmIsAdmin;
	
	@Column(name = "pm_isAuth")
	private int pmIsAuth;
	
	@Column(name = "pm_fav")
	private int pmFav;

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

	public int getPmIsAdmin() {
		return pmIsAdmin;
	}

	public void setPmIsAdmin(int pmIsAdmin) {
		this.pmIsAdmin = pmIsAdmin;
	}

	public int getPmIsAuth() {
		return pmIsAuth;
	}

	public void setPmIsAuth(int pmIsAuth) {
		this.pmIsAuth = pmIsAuth;
	}

	public int getPmFav() {
		return pmFav;
	}

	public void setPmFav(int pmFav) {
		this.pmFav = pmFav;
	}

	@Override
	public String toString() {
		return "ProjectMember [pNum=" + pNum + ", mId=" + mId + ", pmIsAdmin=" + pmIsAdmin + ", pmIsAuth=" + pmIsAuth
				+ ", pmFav=" + pmFav + "]";
	}
	
	
	

}
