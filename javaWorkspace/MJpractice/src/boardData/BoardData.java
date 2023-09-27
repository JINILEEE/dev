package boardData;

public class BoardData {

	//기본 생성자
	public BoardData() {
		
	}
	
	//제목, 작성자만 있는 생성자
	public BoardData(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}
	
	//모든 필드 채우는 생성자
	public BoardData(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	//멤버 변수== 필드
	private String title;
	private String content;
	private String writer;
	
	//getter/setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	//toString
	@Override
	public String toString() {
		return "BoartData [Title: "+title+" / Content: "+content+" / Writer: "+writer;
	}
	
	
}
