package ourRoom.model;

import javax.persistence.Column;

public class CheckList {

	@Column(name = "p_num")
	private int pNum;
	
	@Column(name = "t_num")
	private int tNum;
	
	@Column(name = "i_num")
	private int iNum;

	@Column(name = "cl_num")
	private int clNum;
	
	@Column(name = "cl_name")
	private int clName;

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

	public int getClName() {
		return clName;
	}

	public void setClName(int clName) {
		this.clName = clName;
	}

	@Override
	public String toString() {
		return "CheckList [pNum=" + pNum + ", tNum=" + tNum + ", iNum=" + iNum + ", clNum=" + clNum + ", clName="
				+ clName + "]";
	}
	
	
}
