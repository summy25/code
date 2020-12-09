//program to find the missing number in a given array
//class for missing number
public class MissingNo {
	//main method
	public static void main (String args[]) {
		//input array
		int a[]= {1,2,3,4,5,6,7,9,10};
		//declare sum as 0
		int sum=0;
		for(int i=0;i<a.length;i++) {
			// store sum of all these elements
			sum=sum+a[i];
			
			
		}
		//print the sum
		System.out.println(sum);
		//declare sum1 as 0
		int sum1=0;
		for( int j=1;j<=10;j++) {
			//store sum of all these elements
			sum1=sum1+j;
			
		}
		//prints the sum
		System.out.println(sum1);
		//print the missing number
		System.out.println("missing number="+(sum1-sum));
	}
	

}


