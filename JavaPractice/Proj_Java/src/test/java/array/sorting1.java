package array;

public class sorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {1,23,45,0,45,64,12};
		int size=num.length-1;
		System.out.println("size: "+ size);
		int max;
				
		for(int i=0;i<=size;i++) {
			for(int j=i+1;j<=size;j++) {	
				System.out.println("i value :" + i+ "    j value : " + j);
				if(num[i]<num[j]) {
					max = num[i];
					num[i] = num[j];
					num[j] = max;
					System.out.println("max value: "+  max);
				}
			}
		}
		
		for(int i=0;i<=size;i++) {
			System.out.print(num[i]+"\t");
		}

	}

}
