package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		
		// output 
//		FileOutputStream file = new FileOutputStream("src/io/result.txt"); // 파일 위치
//		DataOutputStream dos = new DataOutputStream(file);
//		DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/io/result.txt"));
//		
//		dos.writeUTF("보라돌이");
//		dos.writeInt(30);
//		dos.writeDouble(153.4);
//		
//		dos.writeUTF("Enql");
//		dos.writeInt(30);
//		dos.writeDouble(143.4);
//		
//		dos.close();
//		file.close();
//		System.out.println("rseult.txt 파일로 저장되었습니다");
		
		// intput
		try {
			FileInputStream file=new FileInputStream("src/io/result.txt");
			DataInputStream dis=new DataInputStream(file);
			
			System.out.println("이름 : "+dis.readUTF());
			System.out.println("나이 : "+dis.readInt());
			System.out.println("키 : "+dis.readDouble());
			
			System.out.println("이름 : "+dis.readUTF());
			System.out.println("나이 : "+dis.readInt());
			System.out.println("키 : "+dis.readDouble());
			
			dis.close();
			file.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}