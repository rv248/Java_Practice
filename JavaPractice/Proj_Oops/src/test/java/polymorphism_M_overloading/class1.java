package polymorphism_M_overloading;

public class class1 extends class2{

	public static void main(String[] args) {
			class1 obj1 = new class1();
			obj1.add(12,12);
			obj1.add(12,12,12);
			obj1.add(25, 123.34f, "venu");
			
		}

	private void add(int i, float f, String string) {
		// TODO Auto-generated method stub
		System.out.println(i + f +"\n"+ string);
	}

	private void add(int i, int j, int k) {
		// TODO Auto-generated method stub
		System.out.println(i + j + k);
	}

}
