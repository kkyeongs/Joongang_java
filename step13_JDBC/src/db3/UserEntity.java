package db3;

public class UserEntity {
	
	private int num;
	private String id;
	private String passwd;
	private String name;
	private double score;
	
	public UserEntity() {
	}
	
	public UserEntity(String id) {
		super();
		this.id = id;
	}
	
	public UserEntity(String id, String passwd, String name, double score) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.score = score;
	}

	public UserEntity(int num, String id, String passwd, String name, double score) {
		super();
		this.num = num;
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.score = score;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String psswd) {
		this.passwd = psswd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}

























