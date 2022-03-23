package class12;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Prg2Test {
	@Test
	void test() {
		Assert.assertEquals(1000,Prg2.sanath(100));
		Assert.assertEquals(100,Prg2.sanath(10));
		Assert.assertNotEquals(50, Prg2.sanath(5));
	}
}
