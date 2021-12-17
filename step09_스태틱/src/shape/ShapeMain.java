package shape;

import java.util.DoubleSummaryStatistics;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape spr = new Rectangle(4, 5);
		System.out.println("»ç°¢ÇüÀÇ ³ĞÀÌ : " + spr.getSize());
		
		Shape spt = new Triangle(3, 7);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : " + spt.getSize());
		
		Rectangle rt = new Rectangle(4, 5);
		System.out.println("»ç°¢ÇüÀÇ ³ĞÀÌ : " + rt.getSize());
		
		Triangle tr = new Triangle(3, 7);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : " + tr.getSize());
	}
}