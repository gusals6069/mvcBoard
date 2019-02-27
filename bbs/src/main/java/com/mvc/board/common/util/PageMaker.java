package com.mvc.board.common.util;

import com.mvc.board.post.domain.PostVo;

public class PageMaker {
	
	private PostVo postVo;
	private int pageSize; // 한 페이지에 보일 게시글 수
	private int firstPageNo; // 첫 번째 페이지 번호
	private int prevPageNo; // 이전 페이지 번호
	private int startPageNo; // 시작 페이지 (페이징 네비 기준)
	private int pageNo; // 페이지 번호
	private int endPageNo; // 끝 페이지 (페이징 네비 기준)
	private int nextPageNo; // 다음 페이지 번호
	private int finalPageNo; // 마지막 페이지 번호
	private int totalCount; // 게시글 전체 수
	private int blockSize; // 페이지 번호 링크 개수
	private int startRowNum; // 게시글 조회 쿼리에 들어갈 row 시작점
	private int endRowNum; // 게시글 조회 쿼리에 들어갈 row 끝점
	
	//constructor
	public PageMaker(PostVo postVo){
		this.postVo = postVo;
	}
	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getFirstPageNo() {
		return firstPageNo;
	}

	public void setFirstPageNo(int firstPageNo) {
		this.firstPageNo = firstPageNo;
	}

	public int getPrevPageNo() {
		return prevPageNo;
	}

	public void setPrevPageNo(int prevPageNo) {
		this.prevPageNo = prevPageNo;
	}

	public int getStartPageNo() {
		return startPageNo;
	}

	public void setStartPageNo(int startPageNo) {
		this.startPageNo = startPageNo;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;		
	}

	public int getEndPageNo() {
		return endPageNo;
	}

	public void setEndPageNo(int endPageNo) {
		this.endPageNo = endPageNo;
	}

	public int getNextPageNo() {
		return nextPageNo;
	}

	public void setNextPageNo(int nextPageNo) {
		this.nextPageNo = nextPageNo;
	}

	public int getFinalPageNo() {
		return finalPageNo;
	}

	public void setFinalPageNo(int finalPageNo) {
		this.finalPageNo = finalPageNo;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		this.pageNo = Integer.parseInt(this.postVo.getCurPage());
		this.makePaging();
	}
	
	public int getBlockSize() {
		return blockSize;
	}

	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
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

	private void makePaging() {
		if (this.totalCount == 0)
			return; // 게시글 전체 수가 없는 경우
		if (this.pageNo == 0)
			this.setPageNo(1); // 기본 값 설정
		if (this.pageSize == 0)
			this.setPageSize(10); // 기본 값 설정

		int finalPage = (totalCount + (pageSize - 1)) / pageSize; // 마지막 페이지
		if (this.pageNo > finalPage)
			this.setPageNo(finalPage); // 기본 값 설정

		if (this.pageNo < 0 || this.pageNo > finalPage)
			this.pageNo = 1; // 현재 페이지 유효성 체크

		boolean isNowFirst = pageNo == 1 ? true : false; // 시작 페이지 (전체)
		boolean isNowFinal = pageNo == finalPage ? true : false; // 마지막 페이지 (전체)

		int startPage = ((pageNo - 1) / blockSize) * blockSize + 1; // 시작 페이지 (페이징 네비 기준)
		int endPage = startPage + blockSize - 1; // 끝 페이지 (페이징 네비 기준)

		if (endPage > finalPage) { // [마지막 페이지 (페이징 네비 기준) > 마지막 페이지]보다 큰 경우
			endPage = finalPage;
		}

		this.setFirstPageNo(1); // 첫 번째 페이지 번호

		if (isNowFirst) {
			this.setPrevPageNo(1); // 이전 페이지 번호
		} else {
			this.setPrevPageNo(((pageNo - 1) < 1 ? 1 : (pageNo - 1))); // 이전 페이지 번호
		}

		this.setStartPageNo(startPage); // 시작 페이지 (페이징 네비 기준)
		this.setEndPageNo(endPage); // 끝 페이지 (페이징 네비 기준)

		if (isNowFinal) {
			this.setNextPageNo(finalPage); // 다음 페이지 번호
		} else {
			this.setNextPageNo(((pageNo + 1) > finalPage ? finalPage : (pageNo + 1))); // 다음 페이지 번호
		}

		this.setFinalPageNo(finalPage); // 마지막 페이지 번호
		
		this.setEndRowNum(this.pageNo * this.pageSize);
		this.setStartRowNum(this.endRowNum - (this.pageSize - 1));
		
		postVo.setStartRowNum(this.getStartRowNum());
		postVo.setEndRowNum(this.getEndRowNum());
	}
}