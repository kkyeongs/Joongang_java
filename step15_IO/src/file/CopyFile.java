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
		
		// 문자 단위 복사 처리
//		FileWriter fw=new FileWriter(file2);
//		fw.write(new String(buf));
//		System.out.println(file1+" 파일이 "+file2+" 파일로 복사되었습니다");
		
		// 바이트 단위 복사 처리
		FileOutputStream fos=new FileOutputStream(file2);
		int readData;
		while((readData=fis.read())!=-1) {
			fos.write(readData);
		}
		System.out.println(file1+" 파일이 "+file2+" 파일로 복사되었습니다");
		bis.close(); fis.close();
	}
}