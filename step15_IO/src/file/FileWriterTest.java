package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		
		// ������ : root ���丮(�ֻ��� ���丮)�� �������� ���� ����
		// ����� : ���� ��ġ�� �������� ����
		//			./ 	������丮
		//			../ �������丮
		//			/ 	��Ʈ���丮
		
		FileWriter writer=null;
//		writer=new FileWriter("C:\\java\\java_lec\\step15_IO\\src\\file\\data3.txt");
		writer=new FileWriter("C:\\java\\java_lec\\step15_IO\\storage\\data3.txt");
		
		StringBuilder str=new StringBuilder();
		str.append("���ع�����λ��̸�����⵵��\n");
		str.append("�ϴ����̺����ϻ�츮���󸸼�\n");
		str.append("����ȭ��õ��ȭ������\n");
		str.append("���ѻ���������α��̺����ϼ�\n");
		
		writer.write(str.toString());
		writer.close();
		System.out.println("data3.txt�� ����Ǿ����ϴ�");
	}

}
