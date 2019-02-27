package com.mvc.board.post.domain;

import java.util.Date;

public class CategoryVo {
	
	private String categoryId;
	private String categoryNm;
	private String bbsNo;	
	private Date regDate;
	private Date uptDate;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryNm() {
		return categoryNm;
	}

	public void setCategoryNm(String categoryNm) {
		this.categoryNm = categoryNm;
	}

	public String getBbsNo() {
		return bbsNo;
	}

	public void setBbsNo(String bbsNo) {
		this.bbsNo = bbsNo;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUptDate() {
		return uptDate;
	}

	public void setUptDate(Date uptDate) {
		this.uptDate = uptDate;
	}

	@Override
	public String toString() {
		return "postVo [categoryId=" + categoryId +", categoryNm=" + categoryNm + ", bbsNo=" + bbsNo + ", regDate=" + regDate + ", uptDate=" + uptDate + "]";
	}
}
