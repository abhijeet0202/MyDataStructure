/**
 * 
 */
package Array;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Abhijeet
 *
 */
public class TestArrayWithDupsOrdered {
	ArrayWithDupsOrdered arrayWithDupsOrdered1 = null;
	ArrayWithDupsOrdered arrayWithDupsOrdered2 = null;
	ArrayWithDupsOrdered arrayWithDupsOrdered3 = null;
	ArrayWithDupsOrdered arrayWithDupsOrdered4 = null;
	ArrayWithDupsOrdered arrayWithDupsOrdered5 = null;
	ArrayWithDupsOrdered arrayWithDupsOrdered6 = null;
	ArrayWithDupsOrdered arrayWithDupsOrdered7 = null;
	ArrayWithDupsOrdered arrayWithDupsOrdered8 = null;
	ArrayWithDupsOrdered arrayWithDupsOrdered9 = null;
	ArrayWithDupsOrdered arrayWithDupsOrdered10 = null;
	ArrayWithDupsOrdered arrayWithDupsOrdered11 = null;
	ArrayWithDupsOrdered arrayWithDupsOrdered12 = null;
	
	ArrayWithDupsOrdered arrayWithDupsOrdered= null;
	ArrayWithDupsOrdered arrayWithDupsOrdered13 = null;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ArrayWithDupsOrdered.setDataBaseSize(12);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		arrayWithDupsOrdered1 = new ArrayWithDupsOrdered(1,"Abhijeet", 20);
		arrayWithDupsOrdered2 = new ArrayWithDupsOrdered(2,"Abhijeet", 20);
		arrayWithDupsOrdered3 = new ArrayWithDupsOrdered(3,"Abhijeet", 20);
		arrayWithDupsOrdered4 = new ArrayWithDupsOrdered(4,"Abhijeet", 20);
		arrayWithDupsOrdered5 = new ArrayWithDupsOrdered(5,"Abhijeet", 20);
		arrayWithDupsOrdered6 = new ArrayWithDupsOrdered(6,"Abhijeet", 20);
		arrayWithDupsOrdered7 = new ArrayWithDupsOrdered(7,"Abhijeet", 20);
		arrayWithDupsOrdered8 = new ArrayWithDupsOrdered(8,"Abhijeet", 20);
		arrayWithDupsOrdered9 = new ArrayWithDupsOrdered(9,"Abhijeet", 20);
		arrayWithDupsOrdered10 = new ArrayWithDupsOrdered(10,"Abhijeet", 20);
		arrayWithDupsOrdered11 = new ArrayWithDupsOrdered(11,"Abhijeet", 20);
		arrayWithDupsOrdered12 = new ArrayWithDupsOrdered(12,"Abhijeet", 20);
		arrayWithDupsOrdered4.insert();
		arrayWithDupsOrdered10.insert();
		arrayWithDupsOrdered3.insert();
		arrayWithDupsOrdered1.insert();
		arrayWithDupsOrdered12.insert();
		arrayWithDupsOrdered2.insert();
		arrayWithDupsOrdered8.insert();
		arrayWithDupsOrdered11.insert();
		arrayWithDupsOrdered5.insert();
		arrayWithDupsOrdered6.insert();
		arrayWithDupsOrdered9.insert();
		arrayWithDupsOrdered7.insert();
	}


	/**
	 * Test method for {@link Array.ArrayWithDupsOrdered#insert()}.
	 */
	@Test
	public void testInsert() {		
		arrayWithDupsOrdered = new ArrayWithDupsOrdered(0,"MAX_SIZE_REACH", 20);
		arrayWithDupsOrdered.insert();
	}

	/**
	 * Test method for {@link Array.ArrayWithDupsOrdered#delete()}.
	 */
	@Test
	public void testDelete() {
		arrayWithDupsOrdered10.delete();
		arrayWithDupsOrdered4.delete();
		arrayWithDupsOrdered10.delete();
		arrayWithDupsOrdered3.delete();
		arrayWithDupsOrdered1.delete();
		arrayWithDupsOrdered12.delete();
		arrayWithDupsOrdered2.delete();
		arrayWithDupsOrdered8.delete();
		arrayWithDupsOrdered11.delete();
		arrayWithDupsOrdered5.delete();
		arrayWithDupsOrdered6.delete();
		arrayWithDupsOrdered9.delete();
		arrayWithDupsOrdered7.delete();
		
		arrayWithDupsOrdered1.delete();
	}

	/**
	 * Test method for {@link Array.ArrayWithDupsOrdered#find()}.
	 */
	@Test
	public void testFind() {
		arrayWithDupsOrdered10.find();
		
		arrayWithDupsOrdered = new ArrayWithDupsOrdered(0,"NOT_ABLE_TO_FOUND", 20);
		arrayWithDupsOrdered.find();
	}

}
