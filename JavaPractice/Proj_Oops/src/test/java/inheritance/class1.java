package inheritance;

public class class1 extends class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj1= new class1();
		int add_result = obj1.add(12,45);
		System.out.println("class1_addition result: "+add_result);
		int sub_result = obj1.sub(12,45);
		System.out.println("class1->2_subtration result: "+sub_result);
		int mul_result = obj1.mul(12,45);
		System.out.println("class1->3_subtration result: "+mul_result);
	}
	
	public int add(int x, int y) {
		return x+y;
	}

}
