package test;

import java.io.Serializable;

public class test4_User implements Serializable {

	String name;
	int age;
	double tall;
	
	public test4_User(String name, int age, double tall) {
		super();
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	
	public String toString() {
		return "�̸�:"+name+" ����:"+age+" Ű:"+tall;
	}

//		[����4] �Ʒ��� ���� ���� ������� �ϼ��Ͻÿ�
//		���ϸ� : User.java
//		���ϸ� : UserOutputTest.java
//
//		[����]
//		1. �����Ͱ� ��� �߰��Ƿ� �ϼ��Ͻÿ� 
//		2. ��ü����ȭ�� ����ϼ���
//
//		[���]
//		�Է��� �����Ͻ÷��� Ctrl+Z�� �Է��Ͻÿ�
//		Enter your name:������
//		Enter your age:22
//		Enter your tall:164.5
//		��� �Է��Ϸ��� EnterŰ�� �����ÿ�
//
//		user.txt������ ����Ǿ����ϴ�
		
}






















