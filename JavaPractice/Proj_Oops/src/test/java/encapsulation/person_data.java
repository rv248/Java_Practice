package encapsulation;

public class person_data {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	private void setAge(int age) {
		 if (age > 0 && age < 120) 
		 	{
	            this.age = age;
	        } 
		 else 
		 	{
	            System.out.println("Error: " + age + " is not a valid age.");
	        }
	}

	private void setName(String name) {
		this.name=name;	
	}
	public static void main (String [] ags) {
		System.out.println("person data");
		System.out.println("--------------------------------------");
		person_data person = new person_data();
		person.setName("venu");
        person.setAge(25);
        
        System.out.println("Age after invalid attempt: " + person.getAge());
        System.out.println(person.getName() + " is " + person.getAge());
        
        person.setAge(-5); 
        System.out.println("Age after invalid attempt: " + person.getAge());
        System.out.println(person.getName() + " is " + person.getAge());
        
        person.setAge(34); 
        System.out.println("Age after invalid attempt: " + person.getAge());
        System.out.println(person.getName() + " is " + person.getAge());
		
	}


}
