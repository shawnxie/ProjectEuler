/* If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 */

// Find the sum of all the multiples of 3 or 5 below 1000.

public class Problem1 {
	
	static int sum=0;
	
	
	public static void main(String []args){
		//multiple of 3
		for(int x = 0; x<1000; x++){
			if(x % 3 == 0 ){
			sum = x + sum;	
			System.out.println(sum);
			}
			else if(x % 5 == 0){
			sum = x + sum;
			System.out.println(sum);
			}
			
		}
	System.out.println("The sum of all muliples of 3 and 5 below 1000 is : " + sum);
	}
}
