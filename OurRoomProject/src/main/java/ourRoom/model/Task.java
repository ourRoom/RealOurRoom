package ourRoom.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Task {
	
	@Column(name = "p_num")
	private int pNum;
	
	@Column(name = "t_num")
	private int tNum;
	
	@Column(name = "t_order")
	private int tOrder;
	
	@Column(name = "t_name")
	private String tName;
	
	@Column(name = "t_dcsr")
	private String tDcsr;
	
	@Column(name = "t_startDate")
	private Date tStartDate;
	
	@Column(name = "t_endDate")
	private Date tEndDate;
	
	@Column(name = "t_notiName")
	private String tNotiName;
	
	@Column(name = "t_notiContent")
	private String tNotiContent;
	
	@Column(name = "t_notiWriteTime")
	
	private Timestamp tNotiWriteTime;

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

	public int gettOrder() {
		return tOrder;
	}

	public void settOrder(int tOrder) {
		this.tOrder = tOrder;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettDcsr() {
		return tDcsr;
	}

	public void settDcsr(String tDcsr) {
		this.tDcsr = tDcsr;
	}

	public Date gettStartDate() {
		return tStartDate;
	}

	public void settStartDate(Date tStartDate) {
		this.tStartDate = tStartDate;
	}

	public Date gettEndDate() {
		return tEndDate;
	}

	public void settEndDate(Date tEndDate) {
		this.tEndDate = tEndDate;
	}

	public String gettNotiName() {
		return tNotiName;
	}

	public void settNotiName(String tNotiName) {
		this.tNotiName = tNotiName;
	}

	public String gettNotiContent() {
		return tNotiContent;
	}

	public void settNotiContent(String tNotiContent) {
		this.tNotiContent = tNotiContent;
	}

	public Timestamp gettNotiWriteTime() {
		return tNotiWriteTime;
	}

	public void settNotiWriteTime(Timestamp tNotiWriteTime) {
		this.tNotiWriteTime = tNotiWriteTime;
	}

	@Override
	public String toString() {
		return "task [pNum=" + pNum + ", tNum=" + tNum + ", tOrder=" + tOrder + ", tName=" + tName + ", tDcsr=" + tDcsr
				+ ", tStartDate=" + tStartDate + ", tEndDate=" + tEndDate + ", tNotiName=" + tNotiName
				+ ", tNotiContent=" + tNotiContent + ", tNotiWriteTime=" + tNotiWriteTime + "]";
	}
	
	
	
	
}
