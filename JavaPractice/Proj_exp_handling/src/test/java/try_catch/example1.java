package try_catch;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int res =10/0;
			System.out.println(res);
			System.out.println("division operation is successful");
		}catch(Exception e){
			
			System.err.println(e.getMessage());	
			System.out.println("division operation is failed by the reason above: ");
		}
		
	}

}
