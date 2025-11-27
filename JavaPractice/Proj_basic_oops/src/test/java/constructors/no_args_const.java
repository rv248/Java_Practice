package constructors;

public class no_args_const {
	String name;
	double phone;
	char lucky_letter;
	no_args_const (){
		name = "venu";
		phone = 945.1991;
		lucky_letter = 'D';
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		no_args_const obj_123 = new no_args_const();
		System.out.println(obj_123.lucky_letter+"\n"+obj_123.name+"\n"+obj_123.phone);
	}

}
