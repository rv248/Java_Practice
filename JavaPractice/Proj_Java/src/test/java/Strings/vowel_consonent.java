package Strings;

public class vowel_consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wife ="Dudiki Divya";
		for(int i=0;i<=wife.length()-1;i++){
		     if(wife.charAt(i)=='a' ||
				wife.charAt(i)=='e' ||
				wife.charAt(i)=='i' ||
				wife.charAt(i)=='o' ||
				wife.charAt(i)=='u') {
		    	System.out.println("it is an owel : " + wife.charAt(i));
		     }
		     else {
			System.out.println("it is an consonent : " + wife.charAt(i));
		     }
	}
	}

}
