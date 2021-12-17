package inheritance;

class Branch {
	public Branch() {
		System.out.println("Branch default constructor");	// 5
	}
	
	public Branch(String str) {
		this();	// 4
		System.out.println(str + " Branch constructor");	// 6
	}
}

class Leaf extends Branch {
	public Leaf() {
		super("마바샤");	// 3
		System.out.println("Leaf default constructor");	// 7
	}
	
	public Leaf(String str, int n) {
		this();	// 2
		System.out.println(str + n + "Leaf default constructor");	// 8
	}
}

public class InheritanceEx3 {

	public static void main(String[] args) {
		
		new Leaf("가나다", 10);	// 1
	}
}

/*
class Branch {
	public Branch() {
		System.out.println("Branch default constructor");	// 4
	}
	
	public Branch(String str) {
		this();	// 3
		System.out.println(str + " Branch constructor");	// 5
	}
}

class Leaf extends Branch {
	public Leaf(String str) {
		super("str");	// 2
		System.out.println(str + "Leaf default constructor");	// 6
	}
}

public class InheritanceEx3 {

	public static void main(String[] args) {
		
		new Leaf("hi~");	// 1
	}
}
*/

/*
class Branch {
	public Branch() {
		System.out.println("Branch default constructor");
	}
	
	public Branch(String str) {
		System.out.println(str + " Branch constructor");
	}
}

class Leaf extends Branch {
	public Leaf() {
		super("hi~");
		System.out.println("Leaf default constructor");
	}
}

public class InheritanceEx3 {

	public static void main(String[] args) {
		
		new Leaf();
	}
}
*/