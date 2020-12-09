//java program to reverse string
//class of reverse string
public class ReverseOfString {
	//main method
	public static void main(String args[]) {
		//declare a string having characters
		String name="summy";
		//find the length of the string 
		 int len=name.length();
		 //empty string
		 String rev="";
		 //store result in reverse order
		 for (int i=len-1;i>=0;i--) {
			 rev=rev+name.charAt(i);
			 
		 }
		 //print reverse string
		 System.out.println(rev);   
		}

}
