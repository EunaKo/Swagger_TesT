package com.swagger.iam_ironMan.domain;

import java.util.Date;

public class BoardDTO {

	private int boNo;
	private String boTitle;
	private String boContent;
	private String boUsernm;
	private String boPasswd;
	private Date boRegdate;

	
	
	public int getBoNo() {
		return boNo;
	}

	public void setBoNo(int boNo) {
		this.boNo = boNo;
	}

	public String getBoTitle() {
		return boTitle;
	}

	public void setBoTitle(String boTitle) {
		this.boTitle = boTitle;
	}

	public String getBoContent() {
		return boContent;
	}

	public void setBoContent(String boContent) {
		this.boContent = boContent;
	}

	public String getBoUsernm() {
		return boUsernm;
	}

	public void setBoUsernm(String boUsernm) {
		this.boUsernm = boUsernm;
	}

	public String getBoPasswd() {
		return boPasswd;
	}

	public void setBoPasswd(String boPasswd) {
		this.boPasswd = boPasswd;
	}

	public Date getBoRegdate() {
		return boRegdate;
	}

	public void setBoRegdate(Date boRegdate) {
		this.boRegdate = boRegdate;
	}

	@Override
	public String toString() {
		return "------BoardDTO입니다~~ [boNo=" + boNo + ", boTitle=" + boTitle + ", boContent=" + boContent + ", boUsernm=" + boUsernm
				+ ", boPasswd=" + boPasswd + ", boRegdate=" + boRegdate + "]";
	}


	
	
	
	
}
