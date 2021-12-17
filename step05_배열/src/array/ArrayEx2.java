package array;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		// 1차원 배열
		String[] car = {"쏘나타", "티코", "스파크", "말리부", "포르테"};
		car[3] = "그랜저";
		
		for (String st : car) 
			System.out.println(st);
		
		// car 변수의 데이터를 for를 이용하여 역순으로 출력
		for (int i = car.length-1; i >= 0; i--) {
			System.out.println(car[i]);
		}
	}
}