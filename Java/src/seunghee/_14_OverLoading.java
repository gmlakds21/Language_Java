package seunghee;

public class _14_OverLoading {
	public static void main(String[] args) {
		
		NonOverloading no = new NonOverloading( );
		no.add1(10, 25);
		no.add2(0.7, 1.3);
		no.add3(10, 20, 30);
		System.out.println();
		
		ApplyOverloading ao = new ApplyOverloading( );
		ao.add(10, 25);
		ao.add(0.7, 1.3);
		ao.add(10, 20, 30);
	}
}

class NonOverloading {
	
	void add1 (int a, int b) {
		System.out.println(a + b);
	}
	
	void add2 (double a, double b) {
		System.out.println(a + b);
	}
	
	void add3 (int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

class ApplyOverloading {
	
	void add(int a, int b) {
		System.out.println(a + b);
	}
	
	void add(double a, double b) {
		System.out.println(a + b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}