//class for reverse integer
public class ReverseInteger {
	//main method
public static void main(String args[]) {
	//declare a integer
	 int no=1234,rem,rev=0;
	 //while executes until no value  is not equal to zero
	 while(no!=0) {
		 //remender variable to store remander
		 rem=no%10;
		 //reverse variable to store reverse  number
		 rev=rev*10+rem;
		 no=no/10;
		 
	 }
	 //print reverse number
	 System.out.println(rev);
}
}
