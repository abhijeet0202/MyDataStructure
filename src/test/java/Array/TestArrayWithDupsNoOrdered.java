/**
 * 
 */
package Array;

import java.lang.reflect.Array;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Abhijeet
 *
 */
public class TestArrayWithDupsNoOrdered {

	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered1 = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered2 = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered3 = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered4 = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered5 = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered6 = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered7 = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered8 = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered9 = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered10 = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered11 = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered12 = null;
	ArrayWithDupsNoOrdered arrayWithDupsNoOrdered13 = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ArrayWithDupsNoOrdered.setDataBaseSize(12);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	public void setUp() throws Exception {
		arrayWithDupsNoOrdered1 = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		arrayWithDupsNoOrdered1.insert();
		arrayWithDupsNoOrdered2 = new ArrayWithDupsNoOrdered(2, "Abhijeet", 21);
		arrayWithDupsNoOrdered2.insert();
		arrayWithDupsNoOrdered3 = new ArrayWithDupsNoOrdered(3, "Abhijeet", 21);
		arrayWithDupsNoOrdered3.insert();
		arrayWithDupsNoOrdered4 = new ArrayWithDupsNoOrdered(4, "Abhijeet", 21);
		arrayWithDupsNoOrdered4.insert();
		arrayWithDupsNoOrdered5 = new ArrayWithDupsNoOrdered(5, "Abhijeet", 21);
		arrayWithDupsNoOrdered5.insert();
		arrayWithDupsNoOrdered6 = new ArrayWithDupsNoOrdered(6, "Abhijeet", 21);
		arrayWithDupsNoOrdered6.insert();
		arrayWithDupsNoOrdered7 = new ArrayWithDupsNoOrdered(7, "Abhijeet", 21);
		arrayWithDupsNoOrdered7.insert();
		arrayWithDupsNoOrdered8 = new ArrayWithDupsNoOrdered(8, "Abhijeet", 21);
		arrayWithDupsNoOrdered8.insert();
		arrayWithDupsNoOrdered9 = new ArrayWithDupsNoOrdered(9, "Abhijeet", 21);
		arrayWithDupsNoOrdered9.insert();
		arrayWithDupsNoOrdered10 = new ArrayWithDupsNoOrdered(10, "Abhijeet", 21);
		arrayWithDupsNoOrdered10.insert();
		arrayWithDupsNoOrdered11 = new ArrayWithDupsNoOrdered(11, "Abhijeet", 21);
		arrayWithDupsNoOrdered11.insert();
		arrayWithDupsNoOrdered12 = new ArrayWithDupsNoOrdered(12, "Abhijeet", 21);
		arrayWithDupsNoOrdered12.insert();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link Array.ArrayWithDupsNoOrdered#insert()}.
	 */
	@Test
	public final void testInsert() {
		try {
			setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// boolean flag =
		// ArrayWithDupsNoOrdered.displayDatabase(2).contains(arrayWithDupsNoOrdered.toString());
		arrayWithDupsNoOrdered = new ArrayWithDupsNoOrdered(23, "Abhijeet", 21);
		arrayWithDupsNoOrdered.insert();

	}

	/**
	 * Test method for {@link Array.ArrayWithDupsNoOrdered#delete()}.
	 */
	@Test
	public final void testDelete() {
		try {
			setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		arrayWithDupsNoOrdered5.delete();
		arrayWithDupsNoOrdered1.delete();
		arrayWithDupsNoOrdered12.delete();

		ArrayWithDupsNoOrdered arrayWithDupsNoOrdered32 = new ArrayWithDupsNoOrdered(32, "Abhijeet", 21);
		arrayWithDupsNoOrdered32.delete();

		arrayWithDupsNoOrdered2.delete();
		arrayWithDupsNoOrdered3.delete();
		arrayWithDupsNoOrdered4.delete();
		arrayWithDupsNoOrdered6.delete();
		arrayWithDupsNoOrdered7.delete();
		arrayWithDupsNoOrdered8.delete();
		arrayWithDupsNoOrdered9.delete();
		arrayWithDupsNoOrdered10.delete();
		arrayWithDupsNoOrdered11.delete();

		arrayWithDupsNoOrdered12.delete();

		// System.out.println(ArrayWithDupsNoOrdered.displayDatabase(2));
	}

	/**
	 * Test method for {@link Array.ArrayWithDupsNoOrdered#find()}.
	 */
	@Test
	public final void testFind() {
		try {
			setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		arrayWithDupsNoOrdered10.find();
	}

	
	@Test
	public final void testfindNoElement() {
		arrayWithDupsNoOrdered10 = new ArrayWithDupsNoOrdered();
		arrayWithDupsNoOrdered10.find();
	}

	
	@Test
	public final void testDeleteAllOccuranceNoElement() {
		arrayWithDupsNoOrdered10 = new ArrayWithDupsNoOrdered();
		arrayWithDupsNoOrdered10.deleteAllOccurance();
	}

	/**
	 * Test method for {@link Array.ArrayWithDupsNoOrdered#deleteAllOccurance()}.
	 */
	@Test
	public final void testDeleteAllOccurance() {
		arrayWithDupsNoOrdered1 = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		arrayWithDupsNoOrdered1.insert();
		arrayWithDupsNoOrdered2 = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		arrayWithDupsNoOrdered2.insert();
		arrayWithDupsNoOrdered3 = new ArrayWithDupsNoOrdered(3, "Abhijeet", 21);
		arrayWithDupsNoOrdered3.insert();
		arrayWithDupsNoOrdered4 = new ArrayWithDupsNoOrdered(4, "Abhijeet", 21);
		arrayWithDupsNoOrdered4.insert();
		arrayWithDupsNoOrdered5 = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		arrayWithDupsNoOrdered5.insert();
		arrayWithDupsNoOrdered6 = new ArrayWithDupsNoOrdered(6, "Abhijeet", 21);
		arrayWithDupsNoOrdered6.insert();
		arrayWithDupsNoOrdered7 = new ArrayWithDupsNoOrdered(7, "Abhijeet", 21);
		arrayWithDupsNoOrdered7.insert();
		arrayWithDupsNoOrdered8 = new ArrayWithDupsNoOrdered(8, "Abhijeet", 21);
		arrayWithDupsNoOrdered8.insert();
		arrayWithDupsNoOrdered9 = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		arrayWithDupsNoOrdered9.insert();
		arrayWithDupsNoOrdered10 = new ArrayWithDupsNoOrdered(10, "Abhijeet", 21);
		arrayWithDupsNoOrdered10.insert();
		arrayWithDupsNoOrdered11 = new ArrayWithDupsNoOrdered(11, "Abhijeet", 21);
		arrayWithDupsNoOrdered11.insert();
		arrayWithDupsNoOrdered12 = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		arrayWithDupsNoOrdered12.insert();

		arrayWithDupsNoOrdered12.deleteAllOccurance();

	}

	/**
	 * Test method for {@link Array.ArrayWithDupsNoOrdered#findAllOccurance()}.
	 */
	@Test
	public final void testFindAllOccurance() {
		arrayWithDupsNoOrdered1 = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		arrayWithDupsNoOrdered1.insert();
		arrayWithDupsNoOrdered2 = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		arrayWithDupsNoOrdered2.insert();
		arrayWithDupsNoOrdered3 = new ArrayWithDupsNoOrdered(3, "Abhijeet", 21);
		arrayWithDupsNoOrdered3.insert();
		arrayWithDupsNoOrdered4 = new ArrayWithDupsNoOrdered(4, "Abhijeet", 21);
		arrayWithDupsNoOrdered4.insert();
		arrayWithDupsNoOrdered5 = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		arrayWithDupsNoOrdered5.insert();
		arrayWithDupsNoOrdered6 = new ArrayWithDupsNoOrdered(6, "Abhijeet", 21);
		arrayWithDupsNoOrdered6.insert();
		arrayWithDupsNoOrdered7 = new ArrayWithDupsNoOrdered(7, "Abhijeet", 21);
		arrayWithDupsNoOrdered7.insert();
		arrayWithDupsNoOrdered8 = new ArrayWithDupsNoOrdered(8, "Abhijeet", 21);
		arrayWithDupsNoOrdered8.insert();
		arrayWithDupsNoOrdered9 = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		arrayWithDupsNoOrdered9.insert();
		arrayWithDupsNoOrdered10 = new ArrayWithDupsNoOrdered(10, "Abhijeet", 21);
		arrayWithDupsNoOrdered10.insert();
		arrayWithDupsNoOrdered11 = new ArrayWithDupsNoOrdered(11, "Abhijeet", 21);
		arrayWithDupsNoOrdered11.insert();
		arrayWithDupsNoOrdered12 = new ArrayWithDupsNoOrdered(1, "Abhijeet", 21);
		arrayWithDupsNoOrdered12.insert();

		arrayWithDupsNoOrdered12.findAllOccurance();
	}

}
