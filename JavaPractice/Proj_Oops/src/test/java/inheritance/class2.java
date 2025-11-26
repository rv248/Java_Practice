package inheritance;

public class class2 extends class3 {
	
	public int sub(int x, int y) {
		class2 obj1 = new class2();
		int mul_result = obj1.mul(34,12);
		System.out.println("class2->3_multipilation result: "+mul_result);
		return y-x;
	}
}
