package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

import io.inputStreamTest;

public class test3_EmpOutputTest {

	public static void main(String[] args) throws IOException {
//		1. 값을 입력 받아 파일로 출력
//		파일명 : EmpOutputTest.java
//		처리 조건:데이터 사이에 \t를 추가 하여 저장하세요
//			ex)name+"\t"+dept+"\t"+salary+"\n"
//
//		입력을 종료하려면 Ctrl+Z를 입력하세요
//	[출력형태]
//	입력을 종료하려면 Ctrl+Z를 입력하세요
//
//	이름을 입력하시오 : 강호동
//	부서를 입력하시오 : 개발부
//	급여를 입력하시오 : 1000000
//	계속 입력하려면 Enter키를 누르세요	
//
//	이름을 입력하시오 : 뽀로로
//	부서를 입력하시오 : 개발부
//	급여를 입력하시오 : 2000000
//	계속 입력하려면 Enter키를 누르세요
//	Ctrl+Z
//
//	emp.txt 파일이 저장되었습니다
		File file=new File("src/test/emp.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str, name, dept, salary;
		
		System.out.println("입력을 종료하려면 ctrl+z를 입력하세요\nEnter누르면 시작"); 
		// ctrl+z는 null임, 즉 엔터를 입력해야 do-while 계속 실행, while보다 do-while을 쓰는게 좋음
		while((str=br.readLine())!=null) {
			System.out.print("이름을 입력하시오 : ");	name=br.readLine();
			System.out.print("부서를 입력하시오 : ");	dept=br.readLine();
			System.out.print("급여를 입력하시오 : ");	salary=br.readLine();
			System.out.println("계속 입력하려면 Enter키를 누르세요");

			fw.write(name+" ");
			fw.write(dept+" ");
			fw.write(salary+" ");
		}
		System.out.println("emp.txt 파일이 저장되었습니다");
		fw.flush();
		fw.close();
		br.close();
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ강사님이 진행한 것ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		FileOutputStream out=new FileOutputStream("src/test/emp.txt");
//		PrintWriter pw=new PrintWriter(out);
//		
//		String name=null;
//		String dept=null;
//		int salary=null;
//		
//		System.out.println("입력을 종료하려면 ctrl+z를 입력하세요\nEnter누르면 시작");
//		
//		do {
//			System.out.print("이름을 입력하시오 : ");	name=br.readLine();
//			System.out.print("부서를 입력하시오 : ");	dept=br.readLine();
//			System.out.print("급여를 입력하시오 : ");	salary=Integer.parseInt(br.readLine());
//			
//			pw.write(name+"\t"+dept+"\t"+salary+"\n");
//			pw.flush();
//			
//			System.out.println("계속 입력하려면 Enter키를 누르세요");
//		} while (br.readLine()!=null); // ctrl+z :null;, 즉 엔터를 입력해야 do-while 계속 실행
//		pw.close();
//		System.out.println("emp.txt 파일이 저장되었습니다");
	}
}




















