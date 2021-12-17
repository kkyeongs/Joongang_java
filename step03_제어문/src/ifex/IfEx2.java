package ifex;

public class IfEx2 {

	public static void main(String[] args) {
		// 중첩 if 문 : if문 안에 또 다른 if문 사용
		int age = 35;
		if(age >= 20) {
			if(age < 30) {
				System.out.println("즐거운 시간 되세요~");
			} else {
				System.out.println("국빈관으로 가세요~");
			}
		} else {
			System.out.println("애들은 가라~");
		}
		System.out.println("--------------------------");
	}
}