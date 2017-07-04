public class Fib{
	public static int f(int x){
		// Base Case
		if (x == 0 || x == 1){
			return 1;
		}

		// Recursive Call
		return f(x-1) + f(x-2);
	}

	public static final void main(String[] args){

		int x = Integer.parseInt(args[0]);

		System.out.print(x);

		System.out.println(f(x));

	}
}