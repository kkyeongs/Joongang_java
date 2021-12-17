package singleton;

public class Main2 {

	public static void main(String[] args) {
		
		Speaker2 s1=Speaker2.getInstance();
		Speaker2 s2=Speaker2.getInstance();
		Speaker2 s3=Speaker2.getInstance();
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		System.out.println("---------------------------");
		s1.setVol(10);
		System.out.println("s1="+s1.getVol());
		System.out.println("s2="+s2.getVol());
		System.out.println("s3="+s3.getVol());
		
		s2.setVol(20);
		System.out.println("s1="+s1.getVol());
		System.out.println("s2="+s2.getVol());
		System.out.println("s3="+s3.getVol());
	}
}