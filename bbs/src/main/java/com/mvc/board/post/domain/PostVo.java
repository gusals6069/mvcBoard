package com.mvc.board.post.domain;

import java.util.Date;

public class PostVo {
	
	private String postNo;
	private String bbsNo;
	private String categoryId;
	private String categoryNm;
	private String postTitle;
	private String postContent;
	private String postWriter;
	private Date regDate;
	private Date uptDate;
	private int viewCnt;
	private int replyCnt;
	
	//부가기능
	private String curPage;
	private int startRowNum;
	private int endRowNum;
	private String searchType;
	private String searchKeyword;
	
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getBbsNo() {
		return bbsNo;
	}
	public void setBbsNo(String bbsNo) {
		this.bbsNo = bbsNo;
	}
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
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public String getPostWriter() {
		return postWriter;
	}
	public void setPostWriter(String postWriter) {
		this.postWriter = postWriter;
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
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	public int getReplyCnt() {
		return replyCnt;
	}
	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}
	public String getCurPage() {
		return curPage;
	}
	public void setCurPage(String curPage) {
		this.curPage = curPage;
	}
	public int getStartRowNum() {
		return startRowNum;
	}
	public void setStartRowNum(int startRowNum) {
		this.startRowNum = startRowNum;
	}
	public int getEndRowNum() {
		return endRowNum;
	}
	public void setEndRowNum(int endRowNum) {
		this.endRowNum = endRowNum;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	
	@Override
	public String toString() {
		return "postVo [postNo=" + postNo +", bbsNo=" + bbsNo + ", categoryId=" + categoryId + ", categoryNm=" + categoryNm + ", postTitle=" + postTitle + ", postContent=" + postContent + ", postWriter=" + postWriter + ", regDate=" + regDate + ", uptDate=" + uptDate + ", viewCnt=" + viewCnt + ", replyCnt=" + replyCnt + "]";
	}
}
