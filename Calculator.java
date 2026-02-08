public class Calculator{
	public static int add(int x, int y){
		return x+y;
	}
	public static int multiply(int x, int y){
		return x*y;
	}
	public static int square(int x){
		return x*x;
	}
	public static void main(String []args){
		
	int t = square(add(multiply(3, 4), multiply(5, 7)));
	System.out.println("1. " + t);
	
	int r = add(square(add(4, 7)), square(add(8, 3)));
	System.out.println("2. " + r);
	}
}
