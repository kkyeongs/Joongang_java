package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class FileInputStreamTest1 {

	public static void main(String[] args) throws IOException {
		
		// 데이터 출력 OutputStream, 스트림은 단방향
		OutputStream out=new FileOutputStream("src/file/data1.txt");
		String name="뽀로로";
		int age=25;
		double tall=183.4;
		
//		getBytes() : 입력된 문자열을 바이트 배열로 인코딩(자료형이 맞지 않을때)
		out.write(name.getBytes()); // name은 string인데 byte형식으로 인코딩
//		out.write(age); // 매개변수를 문자열-->바이트코드로 바꾸어서 사용, 밑에처럼
		out.write(Integer.toString(age).getBytes());
		out.write(Double.toString(tall).getBytes());
		
		// 출력바이트스트림 필터링
		PrintStream ps=new PrintStream(out);
		ps.printf("\n\n\r이름:%s 나이:%d 신장:%.1f\n", name, age, tall);
		ps.flush();
		
		PrintStream pw=new PrintStream(out);
		pw.printf("\n\n\r이름:%s 나이:%d 신장:%.1f\n", name, age, tall);
		pw.flush();
		
		System.out.println("저장되었습니다");
		pw.close();
		ps.close();
		out.close();
	}
}