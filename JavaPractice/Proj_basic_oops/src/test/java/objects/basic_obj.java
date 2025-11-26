package objects;

public class basic_obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basic_obj mul_obj = new basic_obj();
		basic_obj div_obj = new basic_obj();
		
		int mul_rst = mul_obj.multi(23, 45);
		int div_rst = div_obj.divis(45, 5);
		
		System.out.println(mul_rst);
		System.out.println(div_rst);
		
	}
	
	public int multi (int x, int y) {
		return x*y;
	}
	public int divis (int x, int y) {
		return x/y;
	}

}
