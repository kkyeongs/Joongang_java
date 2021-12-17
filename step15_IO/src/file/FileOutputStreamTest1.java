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
		
		Reader is=new FileReader("src/file/data1.txt");				// ���� ���� ó��
		BufferedReader br=new BufferedReader(is);
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
			Thread.sleep(100);
		}
		br.close(); is.close(); 
		
//		InputStreamReader isr=new FileReader("src/file/data1.txt"); // ���� ���� ó��
//		int readDataa;
//		while(true) {
//			readDataa=isr.read(); // ���� ������ �б�, �ѱ۾ȱ���(Reader�� ������ Ư��)
//			if(readDataa==-1)	// read()�� ����� -1�� ��� �����ͽ�Ʈ���� ������ �Ǵ�
//				break;
//			System.out.print(readDataa);
//		}
//		isr.close();
//		
//		InputStream is=new FileInputStream("src/file/data1.txt");	// ����Ʈ ���� ó��
//		int readData;
//		while(true) {
//			readData=is.read(); // ����Ʈ������ �б�, �ѱ۱���(InputStream�� ������ Ư��)
//			if(readData==-1)	// read()�� ����� -1�� ��� �����ͽ�Ʈ���� ������ �Ǵ�
//				break;
//			System.out.print(readData);
//		}
//		is.close();
	}

}
