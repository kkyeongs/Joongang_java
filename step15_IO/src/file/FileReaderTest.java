package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		// ���� ���� ó��
		Reader in=new FileReader("storage/data3.txt");
		int ch;
		while((ch=in.read())>-1) {
			System.out.println((char)ch);
		}
		in.close();
		
//		FileReader str=null;
//		str=new FileReader("C:\\java\\java_lec\\step15_IO\\storage\\data3.txt");
//		int n;
//		while((n=str.read())>-1) {
//			System.out.print((char)n);
//		}
		
		// ����Ʈ ���� ó��, �ѱ� ����
		InputStream is=new FileInputStream("storage/data3.txt");
		int readData;
		while(true) {
			readData=is.read();
			if(readData==-1) {
				break;
			}
			System.out.print((char)readData);
		}
		is.close();
		
		// ����Ʈ ���� ó��, �ѱ� ó�� ����
		File file=new File("storage/data3.txt");
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		
		byte[] buf=new byte[(int)file.length()];
		bis.read(buf,0,buf.length);
		System.out.println(new String(buf));
		bis.close();
	}
}


















