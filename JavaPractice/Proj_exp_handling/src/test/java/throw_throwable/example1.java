package throw_throwable;

public class example1 {
	
    public static void validateAge(int age) {
        if (age < 18) {
            // Explicitly throwing an IllegalArgumentException
            throw new IllegalArgumentException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted.");
        }
    }

	public static void main (String [] args) {
		try {
            validateAge(15);
        } catch (Exception e) {
            System.err.println("Validation failed: " + e.getMessage());
        }

	}

}
