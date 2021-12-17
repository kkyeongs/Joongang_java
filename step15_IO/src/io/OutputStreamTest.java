package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		
//		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		OutputStreamWriter osw=new OutputStreamWriter(System.out);
		BufferedWriter bw=new BufferedWriter(osw);
		
		String str="재미있는 자바 IO를 학습하는 중";
		bw.write(str);	// System.out.println(str);과 같음
		bw.flush();		// 버퍼 비우기.. 밀어내기

		bw.close(); osw.close();
		
		
	}
}














