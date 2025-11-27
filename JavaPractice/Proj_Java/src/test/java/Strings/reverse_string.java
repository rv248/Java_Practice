package Strings;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "job need to change";
		
		System.out.println("String before reverse : "+ name);
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));	
		}
		
		
		
	}

}