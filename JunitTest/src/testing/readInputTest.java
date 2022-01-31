package testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class readInputTest {
	int testDay = 1;
	int testMonth = 1;
	int testYear = 2019;

	Date testing = new Date(testMonth, testDay, testYear);

	@Test
	public void testMonth() {

		Assert.assertTrue(testing.getMonth() == testMonth);

	}

	@Test
	public void testDay() {
		Assert.assertTrue(testing.getDay() == testDay);

	}

	@Test
	public void testYear() {
		Assert.assertTrue(testing.getYear() == testYear);
	}

	@Test
	public void testEquals() {
		Date dateSame1 = new Date(3, 3, 2005);
		Date dateSame2 = new Date("March", 3, 2005);
		Date dateDifferent = new Date(1, 1, 2000);

		assertTrue(dateSame1.equals(dateSame2));
		assertFalse(dateSame1.equals(dateDifferent));
	}

}
