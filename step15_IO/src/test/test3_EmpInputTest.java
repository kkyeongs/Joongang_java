package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;


public class test3_EmpInputTest {

	public static void main(String[] args) throws IOException {
		
		File file=new File("src/test/emp.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		int readData;
		char[] cbuf = new char[100];

		while ((readData = fr.read(cbuf)) != -1) {
		}

		String data = String.valueOf(cbuf);

		StringTokenizer st = new StringTokenizer(data);
		int i=0;
//		System.out.println(st.countTokens());
		String[] a=new String[7];
		while (st.hasMoreTokens()) {
			a[i] = st.nextToken();
			i++;
		}
		System.out.print("이름:"+a[0]+" 부서:"+a[1]+" 급여:"+a[2]+"\n");
		System.out.print("이름:"+a[3]+" 부서:"+a[4]+" 급여:"+a[5]);
		fr.close();
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ강사님이 진행한 것ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		Reader reader=new FileReader("");
//		BufferedReader br=new BufferedReader(reader);
//		
//		String name=null;
//		String dept=null;
//		int salary=0;
//		
//		String str;
//		StringTokenizer st=null;
//		while((str=br.readLine())!=null) {
//			st=new StringTokenizer(str, "\t");
//			name=st.nextToken();
//			dept=st.nextToken();
//			salary=Integer.parseInt(st.nextToken());
//			System.out.println("이름:"+name+" 부서:"+dept+" 급여"+salary);
//		}
//		br.close();
	}
}













