package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// $ java CopyFile src/file/data2.txt src/file/data5.txt 
		
		String file1=args[0];
		String file2=args[1];
		
		File file=new File(file1);
		FileInputStream fis=new FileInputStream(file1);
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		byte[] buf=new byte[(int)file.length()];
		bis.read(buf, 0, buf.length);
		System.out.println(new String(buf));
		
		// ���� ���� ���� ó��
//		FileWriter fw=new FileWriter(file2);
//		fw.write(new String(buf));
//		System.out.println(file1+" ������ "+file2+" ���Ϸ� ����Ǿ����ϴ�");
		
		// ����Ʈ ���� ���� ó��
		FileOutputStream fos=new FileOutputStream(file2);
		int readData;
		while((readData=fis.read())!=-1) {
			fos.write(readData);
		}
		System.out.println(file1+" ������ "+file2+" ���Ϸ� ����Ǿ����ϴ�");
		bis.close(); fis.close();
	}
}