package objects;

public class basic_object_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add_rst = basic_object_static.add(4,6);
		int sub_rst = basic_object_static.sub(100,60);
		System.out.println(add_rst);
		System.out.println(sub_rst);
	}
	
	public static int add(int x, int y) {
		return x+y;
	}
	
	public static int sub(int x, int y) {
		return x-y;
	}	
}
