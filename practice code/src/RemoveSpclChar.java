//class for remove special character
public class RemoveSpclChar {
	//main method
	public static void main(String args[]) {
		//declare a string having special characters
		String str="si##ng**h";
		//adding characters into empty string
		str=str.replaceAll("[^a-zA-Z0-9]","");
		//printing the character which store in the string
		System.out.println(str);
	}

}
