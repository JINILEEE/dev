package VO;

public class ManagetVO {
	
	private String managerNumber;
	private String managerName;
	private String managerHireDate;
	
	public ManagetVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ManagetVO(String managerNumber, String managerName, String managerHireDate) {
		super();
		this.managerNumber = managerNumber;
		this.managerName = managerName;
		this.managerHireDate = managerHireDate;
	}

	@Override
	public String toString() {
		return "ManagetVO [managerNumber=" + managerNumber + ", managerName=" + managerName + ", managerHireDate="
				+ managerHireDate + "]";
	}

	public String getManagerNumber() {
		return managerNumber;
	}

	public void setManagerNumber(String managerNumber) {
		this.managerNumber = managerNumber;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerHireDate() {
		return managerHireDate;
	}

	public void setManagerHireDate(String managerHireDate) {
		this.managerHireDate = managerHireDate;
	}
	

}
