package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test5_StudentTest {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("src/test/student.dat");
		FileWriter fw=new FileWriter("src/test/backup.dat", true); // true�� �����Ҷ� ������ �Ϳ� �߰�
		Scanner sfi=new Scanner(fr);
		
		List<test5_Student> list=new ArrayList<test5_Student>();
		
		while (sfi.hasNextLine() == true) { // End of File
            // �Է� �� list ��ü ����...
			String line=sfi.nextLine();
			StringTokenizer token=new StringTokenizer(line, "-:/");
			
			String name=null;
			int kor=0, eng=0, mat=0;
			name=token.nextToken();
			token.nextToken();
			kor=Integer.parseInt(token.nextToken());
			token.nextToken();
			eng=Integer.parseInt(token.nextToken());
			token.nextToken();
			mat=Integer.parseInt(token.nextToken());
			
			test5_Student stu=new test5_Student(name, kor, eng, mat);
			
			list.add(stu);
		}
		
		// �� �л��� �� ���� ���� ��� ���Ѵ�
		int sumKor=0, sumEng=0, sumMat=0;
		int avgKor=0, avgEng=0, avgMat=0;
		
		for (test5_Student st:list) {
			sumKor+=st.getKor();
			sumEng+=st.getEng();
			sumMat+=st.getMat();
		}
		avgKor=sumKor/list.size();
		avgEng=sumEng/list.size();
		avgMat=sumMat/list.size();
		
		// ��� ó�� backup.dat ���� �����
		fw.write("==========================\n");
		fw.write("�� �л� �� = "+list.size()+"��\n");
		fw.write("���� ���� = "+sumKor+" ���� ���= "+avgKor+"\n");
		fw.write("���� ���� = "+sumEng+" ���� ���= "+avgEng+"\n");
		fw.write("���� ���� = "+sumMat+" ���� ���= "+avgMat+"\n");
		fw.write("==========================");
		
		fw.close();
		sfi.close();
		fr.close();
		
		System.out.println("backup.dat ������ ������ �����Ǿ����ϴ�");
		
		
	}
}


























