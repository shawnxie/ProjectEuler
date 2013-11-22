

/*Each new term in the Fibonacci sequence is generated by 
 * adding the previous two terms. By starting with 1 and 2, 
 * the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values 
 * do not exceed four million, find the sum of the even-valued terms.
*/

public class Problem2 {
	public static void main(String []args){
		
		int sum=0;
		int i=2;
		int[] fibCount= new int[100000];
		fibCount[0] = 1;
		fibCount[1] = 2;
		
		while(fibCount[i-1]<=4000000){
			
			
			
		fibCount[i]=fibCount[i-1]+fibCount[i-2];
		System.out.println(fibCount[i]);
		
		i++;
		
		}
		
		for(int x=0;x<=i-2;x++){
			if(fibCount[x]%2==0){
				sum=sum+fibCount[x];
			}
		}
		System.out.println(fibCount[i-2]);
		System.out.println(i-2);
		System.out.println(sum);
		
	}

}
