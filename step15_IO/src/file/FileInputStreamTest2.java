package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;

public class FileInputStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		Reader in=new FileReader("src/file/data2.txt");
		int ch;
		while((ch=in.read())!=-1) {
			System.out.print((char)ch);
		}
		in.close();
		
	}
}