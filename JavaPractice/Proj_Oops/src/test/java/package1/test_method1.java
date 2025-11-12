package package1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_method1 {

	@Test
	public void test() {
		assertEquals(16, new class1().method_add(4));
	}

}
