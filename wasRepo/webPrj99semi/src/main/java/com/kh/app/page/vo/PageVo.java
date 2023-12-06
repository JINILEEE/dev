package com.kh.app.page.vo;

public class PageVo {

	// 아래 4개는 기본생성자(null)인것 만들 필요 없다!!! - 이미 정해진 값이라서 
	private int listCount;			//총 게시글 갯수
	private int currentPage;		//현재페이지
	private int pageLimit;			//페이징 영역 페이지 갯수 - 페이지 숫자 몇개 띄울 건지
	private int boardLimit;			//한 페이지에 보여줄 게시글 갯수
	
	// 아래 3개는 위의 4개의 값이 정해지면 저절로 계산된 값이 나오는 것이다.
	private int maxPage;			//가장 마지막 페이지
	private int startPage;			//페이징 영역 시작값
	private int endPage;			//페이징 영역 마지막값
	
	int startRow;		//조회할 첫번째 행 번호(ROWNUM) 
	int lastRow;		//조회할 마지막 행 번호(ROWNUM)
	//따라서 getter만 생성해주면 된다!!!
	
	//생성자
	public PageVo(int listCount, int currentPage, int pageLimit, int boardLimit) {
			this.listCount = listCount;
			this.currentPage = currentPage;
			this.pageLimit = pageLimit;
			this.boardLimit = boardLimit;
			
			this.maxPage = (int)Math.ceil((double)listCount/boardLimit);
			this.startPage = (currentPage - 1) / pageLimit * pageLimit + 1;  
			this.endPage = startPage + pageLimit - 1;
			
			if(endPage > maxPage) {
		         endPage = maxPage;
		      }
			this.startRow = (currentPage-1) * boardLimit + 1;
			this.lastRow = startRow + boardLimit -1;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getLastRow() {
		return lastRow;
	}

	public int getListCount() {
		return listCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getPageLimit() {
		return pageLimit;
	}

	public int getBoardLimit() {
		return boardLimit;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}
	
	
	
}
