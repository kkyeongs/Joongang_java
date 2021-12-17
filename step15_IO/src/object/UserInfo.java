package object;

import java.io.Serializable;

public class UserInfo implements Serializable {
	
	private static final long serialVersionUID=1L; // �� ����ȭ�� �Ҷ� ���� üũ
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
		System.out.print("�̸� : "+name);
		System.out.print("\t���� : "+age);
		System.out.println("\t�̸� : "+score);
	}
}