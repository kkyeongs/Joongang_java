package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class test4_UserOutputTest {

	public static void main(String[] args) {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		int age;
		double tall;

		try {
			File file=new File("src/test/user.txt");
			ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(file));
			
			System.out.println("�Է��� �����Ͻ÷��� Ctrl+Z�� �Է��Ͻÿ�");
			do {
				System.out.print("Enter your name: ");	name = br.readLine();
				System.out.print("Enter your age: ");	age = Integer.parseInt(br.readLine());
				System.out.print("Enter your tall: ");	tall = Double.parseDouble(br.readLine());
				
				oos.writeObject(new test4_User(name, age, tall));
				
				System.out.println("��� �Է��Ϸ��� EnterŰ�� �����ÿ�");
				System.in.read();
			} while(System.in.read()!=-1);
			oos.flush();
			oos.close();
			System.out.println("user.txt ���Ϸ� ����Ǿ����ϴ�");
		} catch (Exception e) {e.printStackTrace();}
	}
}