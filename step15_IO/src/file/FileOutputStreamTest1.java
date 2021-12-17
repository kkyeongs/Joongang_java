package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileOutputStreamTest1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Reader is=new FileReader("src/file/data1.txt");				// 문자 단위 처리
		BufferedReader br=new BufferedReader(is);
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
			Thread.sleep(100);
		}
		br.close(); is.close(); 
		
//		InputStreamReader isr=new FileReader("src/file/data1.txt"); // 문자 단위 처리
//		int readDataa;
//		while(true) {
//			readDataa=isr.read(); // 문자 단위로 읽기, 한글안깨짐(Reader가 가지는 특성)
//			if(readDataa==-1)	// read()의 결과가 -1일 경우 데이터스트림의 끝으로 판단
//				break;
//			System.out.print(readDataa);
//		}
//		isr.close();
//		
//		InputStream is=new FileInputStream("src/file/data1.txt");	// 바이트 단위 처리
//		int readData;
//		while(true) {
//			readData=is.read(); // 바이트단위로 읽기, 한글깨짐(InputStream이 가지는 특성)
//			if(readData==-1)	// read()의 결과가 -1일 경우 데이터스트림의 끝으로 판단
//				break;
//			System.out.print(readData);
//		}
//		is.close();
	}

}
