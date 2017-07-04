public class Factorial{
	public static int  fact(int x){
		// Base Case
		if (x == 0){
			return 1;
		}
		
		// Recursive Call
		return x * fact(x-1);
	}
}