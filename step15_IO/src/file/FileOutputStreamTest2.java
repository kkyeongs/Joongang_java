package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		
//		byte -- InputStream
//			 -- OutputStream
		
//		character -- Reader
//				  -- Writer
		
		OutputStream out=null;
		out=new FileOutputStream("src/file/data2.txt");
		int value;
		System.out.println("���ڿ��� �Է��ϰ� ctrl+z�� �����ϼ���");
		while((value=System.in.read())!=-1){
			out.write(value);
		}
		out.flush();
		out.close();
		System.out.println("data2.txt�� ����Ǿ����ϴ�");
	}
}