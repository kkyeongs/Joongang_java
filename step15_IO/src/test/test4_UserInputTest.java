package test;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.StringTokenizer;

public class test4_UserInputTest {

	public static void main(String[] args) throws IOException {
		
		
		try {
			File file=new File("src/test/user.txt");
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
			
			test4_User user;
			
			while(true) {
				try {
					user=(test4_User)ois.readObject();
					System.out.println(user); // .toString()생략되있는거
				} catch (EOFException e) {break;}
				catch (ClassNotFoundException e) {}
			}
		}catch (Exception e) {e.printStackTrace();}

		
	}
}

















