package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class test2 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("src/test/score2.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("src/test/dest.txt"));
		
		String name;
		int k, e, m;
		
		while((name=br.readLine())!=null) {
			k=Integer.parseInt(br.readLine());
			e=Integer.parseInt(br.readLine());
			m=Integer.parseInt(br.readLine());
			
			bw.write(String.format("¿Ã∏ß:%s √—¡°:%d ∆Ú±’:%.2f\n", name, (k+e+m), (k+e+m)/3.0));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}









