package swichex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.util.Calendar;

public class SwitchEx3 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// ����
		// args�� �Էµ� month�� �� ���� ���ϼ���
		// 
		// $ java SwitchEx3 3
		// 3���� 31�ϱ��� �ֽ��ϴ�
		
		// ���� run config�� �ϼ��� �Է��ߴµ� ������ ���� �Է¹���
		int �̽��� = Integer.parseInt(args[0]);
		int ��� = Integer.parseInt(args[1]);
		int ����� = Integer.parseInt(args[2]);
		
		int month = 1;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "���� " + ����� + "�ϱ��� �ֽ��ϴ�");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println(month + "���� " + ��� + "�ϱ��� �ֽ��ϴ�");
			break;
			
		case 2: 
			System.out.println(month + "���� " + �̽��� + "�ϱ��� �ֽ��ϴ�");
		}
		System.out.println("-----------------------------------");
		
		// ������ �Է�
		int monet = Integer.parseInt(args[0]);
		int day = 0;
		// run config~ �� 3�� �Է�
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2: 
			day = 28;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
		}
		System.out.println(month + "����" + day + "�ϱ��� �ֽ��ϴ�");
	}
}