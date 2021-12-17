package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class FileInputStreamTest1 {

	public static void main(String[] args) throws IOException {
		
		// ������ ��� OutputStream, ��Ʈ���� �ܹ���
		OutputStream out=new FileOutputStream("src/file/data1.txt");
		String name="�Ƿη�";
		int age=25;
		double tall=183.4;
		
//		getBytes() : �Էµ� ���ڿ��� ����Ʈ �迭�� ���ڵ�(�ڷ����� ���� ������)
		out.write(name.getBytes()); // name�� string�ε� byte�������� ���ڵ�
//		out.write(age); // �Ű������� ���ڿ�-->����Ʈ�ڵ�� �ٲپ ���, �ؿ�ó��
		out.write(Integer.toString(age).getBytes());
		out.write(Double.toString(tall).getBytes());
		
		// ��¹���Ʈ��Ʈ�� ���͸�
		PrintStream ps=new PrintStream(out);
		ps.printf("\n\n\r�̸�:%s ����:%d ����:%.1f\n", name, age, tall);
		ps.flush();
		
		PrintStream pw=new PrintStream(out);
		pw.printf("\n\n\r�̸�:%s ����:%d ����:%.1f\n", name, age, tall);
		pw.flush();
		
		System.out.println("����Ǿ����ϴ�");
		pw.close();
		ps.close();
		out.close();
	}
}