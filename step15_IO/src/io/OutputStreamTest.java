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
		
		String str="����ִ� �ڹ� IO�� �н��ϴ� ��";
		bw.write(str);	// System.out.println(str);�� ����
		bw.flush();		// ���� ����.. �о��

		bw.close(); osw.close();
		
		
	}
}














