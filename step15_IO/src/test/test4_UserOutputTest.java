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
			
			System.out.println("입력을 종료하시려면 Ctrl+Z를 입력하시오");
			do {
				System.out.print("Enter your name: ");	name = br.readLine();
				System.out.print("Enter your age: ");	age = Integer.parseInt(br.readLine());
				System.out.print("Enter your tall: ");	tall = Double.parseDouble(br.readLine());
				
				oos.writeObject(new test4_User(name, age, tall));
				
				System.out.println("계속 입력하려면 Enter키를 누르시오");
				System.in.read();
			} while(System.in.read()!=-1);
			oos.flush();
			oos.close();
			System.out.println("user.txt 파일로 저장되었습니다");
		} catch (Exception e) {e.printStackTrace();}
	}
}