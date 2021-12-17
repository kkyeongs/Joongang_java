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
		FileWriter fw=new FileWriter("src/test/backup.dat", true); // true면 실행할때 기존의 것에 추가
		Scanner sfi=new Scanner(fr);
		
		List<test5_Student> list=new ArrayList<test5_Student>();
		
		while (sfi.hasNextLine() == true) { // End of File
            // 입력 및 list 객체 생성...
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
		
		// 총 학생수 각 과목별 총점 평균 구한다
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
		
		// 출력 처리 backup.dat 파일 만들기
		fw.write("==========================\n");
		fw.write("총 학생 수 = "+list.size()+"명\n");
		fw.write("국어 총합 = "+sumKor+" 국어 평균= "+avgKor+"\n");
		fw.write("영어 총합 = "+sumEng+" 영어 평균= "+avgEng+"\n");
		fw.write("수학 총합 = "+sumMat+" 수학 평균= "+avgMat+"\n");
		fw.write("==========================");
		
		fw.close();
		sfi.close();
		fr.close();
		
		System.out.println("backup.dat 데이터 파일이 생성되었습니다");
		
		
	}
}


























