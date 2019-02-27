package com.mvc.board.reply.domain;

import java.util.Date;

public class ReplyVo {

    private String replyNo;
    private String postNo;
    private String replyContent;
    private String replyWriter;
    private Date regDate;
    private Date uptDate;
    
	public String getReplyNo() {
		return replyNo;
	}
	public void setReplyNo(String replyNo) {
		this.replyNo = replyNo;
	}
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public String getReplyWriter() {
		return replyWriter;
	}
	public void setReplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
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
		return "postVo [replyNo=" + replyNo +", postNo=" + postNo + ", replyContent=" + replyContent + ", replyWriter=" + replyWriter + ", regDate=" + regDate + ", uptDate=" + uptDate + "]";
	}
}
