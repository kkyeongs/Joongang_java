package singleton;

public class Main1 {

	public static void main(String[] args) {
		
		Speaker1 s1=new Speaker1();
		Speaker1 s2=new Speaker1();
		Speaker1 s3=new Speaker1();
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		System.out.println("---------------------------");
		s1.setVol(10);
		s2.setVol(20);
		System.out.println("s1="+s1.getVol());
		System.out.println("s2="+s2.getVol());
		System.out.println("s3="+s3.getVol());
	}
}