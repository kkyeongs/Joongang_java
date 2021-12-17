package object;

import java.io.Serializable;

public class UserInfo implements Serializable {
	
	private static final long serialVersionUID=1L; // 역 직렬화를 할때 버전 체크
	private String name;
	private int age;
	private double score;
	
	public UserInfo() {
		
	}

	public UserInfo(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void dsip() {
		System.out.print("이름 : "+name);
		System.out.print("\t나이 : "+age);
		System.out.println("\t이름 : "+score);
	}
}