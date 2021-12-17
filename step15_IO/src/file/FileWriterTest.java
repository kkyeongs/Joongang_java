package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		
		// 절대경로 : root 디렉토리(최상위 디렉토리)를 기준으로 파일 접근
		// 상대경로 : 현재 위치를 기준으로 접근
		//			./ 	현재디렉토리
		//			../ 상위디렉토리
		//			/ 	루트디렉토리
		
		FileWriter writer=null;
//		writer=new FileWriter("C:\\java\\java_lec\\step15_IO\\src\\file\\data3.txt");
		writer=new FileWriter("C:\\java\\java_lec\\step15_IO\\storage\\data3.txt");
		
		StringBuilder str=new StringBuilder();
		str.append("동해물과백두산이마르고닳도록\n");
		str.append("하느님이보우하사우리나라만세\n");
		str.append("무궁화삼천리화려강산\n");
		str.append("대한사람대한으로길이보전하세\n");
		
		writer.write(str.toString());
		writer.close();
		System.out.println("data3.txt로 저장되었습니다");
	}

}
