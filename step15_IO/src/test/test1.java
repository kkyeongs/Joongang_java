package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test1 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\java\\java_lec\\step15_IO\\src\\test\\score1.txt");;
		BufferedReader br = new BufferedReader(fr);
		
		int readData;
		String name;
		int k, e, m;
		
		while ((name=br.readLine())!=null) {
			k=Integer.parseInt(br.readLine());
			e=Integer.parseInt(br.readLine());
			m=Integer.parseInt(br.readLine());
			
			System.out.print("¿Ã∏ß : " +name+"\t");
			System.out.print("√—¡° : "+(k+e+m)+"\t");
			System.out.printf("∆Ú±’ %.2f\n", (k+e+m)/3.0);
		}
		br.close();
	}
}
