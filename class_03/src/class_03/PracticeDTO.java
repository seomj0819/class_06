package class_03;

public class PracticeDTO {
	private String id, pw;
	public PracticeDTO(String id, String pw) {
			this.id = id;
			this.pw = pw;}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
}
