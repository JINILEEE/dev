package VO;

public class StudentVO {

	private String studentNumber;
	private String studentName;
	private String koreanScore;
	private String englishScore;
	private String mathScore;
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentVO(String studentNumber, String studentName, String koreanScore, String englishScore,
			String mathScore) {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	@Override
	public String toString() {
		return "StudentVO [studentNumber=" + studentNumber + ", studentName=" + studentName + ", koreanScore="
				+ koreanScore + ", englishScore=" + englishScore + ", mathScore=" + mathScore + "]";
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(String koreanScore) {
		this.koreanScore = koreanScore;
	}

	public String getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(String englishScore) {
		this.englishScore = englishScore;
	}

	public String getMathScore() {
		return mathScore;
	}

	public void setMathScore(String mathScore) {
		this.mathScore = mathScore;
	}
	
	
	
	
}
