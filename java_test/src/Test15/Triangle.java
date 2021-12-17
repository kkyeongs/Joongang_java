package Test15;

public class Triangle {

	private double base;
    private double height;
    
    public void setData(int base, int height) {
       this.base = base;
       this.height = height;
    }
    
    public double getSize() {
       return (base * height) / 2;
    }
    
    public String getView() {
       return "»ï°¢ÇüÀÇ ³ĞÀÌ : " + getSize();
    }
}
