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
//		1. ���� �Է� �޾� ���Ϸ� ���
//		���ϸ� : EmpOutputTest.java
//		ó�� ����:������ ���̿� \t�� �߰� �Ͽ� �����ϼ���
//			ex)name+"\t"+dept+"\t"+salary+"\n"
//
//		�Է��� �����Ϸ��� Ctrl+Z�� �Է��ϼ���
//	[�������]
//	�Է��� �����Ϸ��� Ctrl+Z�� �Է��ϼ���
//
//	�̸��� �Է��Ͻÿ� : ��ȣ��
//	�μ��� �Է��Ͻÿ� : ���ߺ�
//	�޿��� �Է��Ͻÿ� : 1000000
//	��� �Է��Ϸ��� EnterŰ�� ��������	
//
//	�̸��� �Է��Ͻÿ� : �Ƿη�
//	�μ��� �Է��Ͻÿ� : ���ߺ�
//	�޿��� �Է��Ͻÿ� : 2000000
//	��� �Է��Ϸ��� EnterŰ�� ��������
//	Ctrl+Z
//
//	emp.txt ������ ����Ǿ����ϴ�
		File file=new File("src/test/emp.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str, name, dept, salary;
		
		System.out.println("�Է��� �����Ϸ��� ctrl+z�� �Է��ϼ���\nEnter������ ����"); 
		// ctrl+z�� null��, �� ���͸� �Է��ؾ� do-while ��� ����, while���� do-while�� ���°� ����
		while((str=br.readLine())!=null) {
			System.out.print("�̸��� �Է��Ͻÿ� : ");	name=br.readLine();
			System.out.print("�μ��� �Է��Ͻÿ� : ");	dept=br.readLine();
			System.out.print("�޿��� �Է��Ͻÿ� : ");	salary=br.readLine();
			System.out.println("��� �Է��Ϸ��� EnterŰ�� ��������");

			fw.write(name+" ");
			fw.write(dept+" ");
			fw.write(salary+" ");
		}
		System.out.println("emp.txt ������ ����Ǿ����ϴ�");
		fw.flush();
		fw.close();
		br.close();
		
//		�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѰ������ ������ �ͤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		FileOutputStream out=new FileOutputStream("src/test/emp.txt");
//		PrintWriter pw=new PrintWriter(out);
//		
//		String name=null;
//		String dept=null;
//		int salary=null;
//		
//		System.out.println("�Է��� �����Ϸ��� ctrl+z�� �Է��ϼ���\nEnter������ ����");
//		
//		do {
//			System.out.print("�̸��� �Է��Ͻÿ� : ");	name=br.readLine();
//			System.out.print("�μ��� �Է��Ͻÿ� : ");	dept=br.readLine();
//			System.out.print("�޿��� �Է��Ͻÿ� : ");	salary=Integer.parseInt(br.readLine());
//			
//			pw.write(name+"\t"+dept+"\t"+salary+"\n");
//			pw.flush();
//			
//			System.out.println("��� �Է��Ϸ��� EnterŰ�� ��������");
//		} while (br.readLine()!=null); // ctrl+z :null;, �� ���͸� �Է��ؾ� do-while ��� ����
//		pw.close();
//		System.out.println("emp.txt ������ ����Ǿ����ϴ�");
	}
}




















