package Strings;

public class str_immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="venu";
		String s2="venu";
		System.out.println(s1==s2);
		String s3="venu";
		s1 = s1 + "raja";
		System.out.println(s3==s1);
		s1="venu";
		System.out.println(s3==s1);
	}

}
