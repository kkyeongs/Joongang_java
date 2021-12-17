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
		return "이름:"+name+" 나이:"+age+" 키:"+tall;
	}

//		[문제4] 아래와 같이 파일 입출력을 완성하시오
//		파일명 : User.java
//		파일명 : UserOutputTest.java
//
//		[조건]
//		1. 데이터가 계속 추가되록 완성하시오 
//		2. 객체직렬화를 사용하세요
//
//		[출력]
//		입력을 종료하시려면 Ctrl+Z를 입력하시오
//		Enter your name:개나리
//		Enter your age:22
//		Enter your tall:164.5
//		계속 입력하려면 Enter키를 누르시오
//
//		user.txt파일이 저장되었습니다
		
}






















