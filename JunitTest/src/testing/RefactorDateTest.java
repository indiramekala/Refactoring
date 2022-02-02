package testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class RefactorDateTest {
	RefactorDate testing = new RefactorDate(1, 1, 2004);

	int testDay = 1;
	int testMonth = 1;
	int testYear = 2004;

	@Test
	public void testGetMonth() {
		RefactorDate tesing = new RefactorDate(1, 1, 2004);

		testing.getMonthRef();
		Assert.assertTrue(testing.getMonthRef() == testMonth);

	}

	@Test
	public void testDay() {
		RefactorDate testing = new RefactorDate(testMonth, testDay, testYear);
		Assert.assertTrue(testing.getDay() == testDay);
	}

	@Test
	public void testYear() {
		RefactorDate testing = new RefactorDate(testMonth, testDay, testYear);
		Assert.assertTrue(testing.getYear() == testYear);
	}

	@Test
	public void testEquals() {
		RefactorDate testing = new RefactorDate(testMonth, testDay, testYear);

		RefactorDate date1 = new RefactorDate(3, 3, 2005);
		RefactorDate date2 = new RefactorDate("March", 3, 2005);
		RefactorDate dateDiffer = new RefactorDate(1, 1, 2000);

		assertTrue(date1.equals(date2));
		assertFalse(date1.equals(dateDiffer));
	}

	@Test
	public void getMonthTest() {

		testing.getMonthRef();
		Assert.assertEquals(2, 2);
	}

	@Test
	public void testmonthString() {

		Assert.assertTrue(testing.monthStringRef(3).equalsIgnoreCase("March"));
	}

	@Test
	public void testmonthOK() {

		String testMonth = "July";

		Assert.assertTrue(testing.monthOKRef(testMonth) == true);
	}

}
