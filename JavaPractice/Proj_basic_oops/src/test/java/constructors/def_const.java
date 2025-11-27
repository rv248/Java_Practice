package constructors;

public class def_const {
	String brand;
	int num;
	def_const(){
		brand = "volvo";
		num = 2345;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		def_const obj1 = new def_const();
		System.out.println("car name is "+obj1.brand +" with nuber "+obj1.num);	
	}

}
