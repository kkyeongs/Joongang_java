package forex;

public class ForEx3 {

	public static void main(String[] args) {
		
		// 1 ~ 100 사이의 7의 배수만 출력하세요
		int n = 7;
		for (int i = 0; i < 100; i++) {
			if(i % n != 0)
				continue;
				System.out.println(n + "의 배수는 : " + i);
		}
	}
}