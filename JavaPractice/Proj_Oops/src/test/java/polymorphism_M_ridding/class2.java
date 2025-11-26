package polymorphism_M_ridding;

public class class2 extends class1{
	
	String colour = "Venu Rajavrapu";
	public static void main(String[] args) {
        class2 d = new class2();
        
        System.out.println("--- Testing Super Variable ---");
        d.printColor();
        
        System.out.println("\n--- Testing Super Method ---");
        d.action();
        
        
    }
	
		public void printColor() {
		    // Prints the color belonging to Dog class
		    System.out.println("color from child: " + colour); 
		    
		    // Prints the color belonging to Animal class using 'super'
		    System.out.println("color from super: " + super.colour); 
		}
		
		public void eat() {
		    System.out.println("child Dog is eating bread...");
		}
		
		public void action() {
		    eat();          // Calls the Dog's eat()
		    super.eat();    // Calls the Animal's eat() using 'super'
		}

}
