package test57;

public class test57 {

	public static void main(String[] args) {
		
		ScoreTable[] s= new ScoreTable[3];  
		s[0] = new ScoreTable("�ε鷡", 5);
		s[1] = new ScoreTable("���޷�", 3);
		s[2] = new ScoreTable("������", 0);
		
		System.out.println("�̸�\t����");
		ScoreTable st = new ScoreTable();
		for (int i = 0; i < s.length; i++) {
			s[i].printView();
		}
	}
}