import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.washington.ext.Librarian;
import edu.washington.ext.Library;
import edu.washington.ext.LibraryAssociate;
import edu.washington.ext.LibraryEmployee;
import edu.washington.ext.PayrollRecord;
import edu.washington.ext.common.LibraryCommissionException;
import edu.washington.ext.common.LibraryException;

/**
 * The Class LibraryTest.
 */
public class LibraryTest {
	/** The library. */
	private Library library;
	
	/** The librarian. */
	private Librarian librarian;
	
	/** The library employee. */
	private LibraryEmployee libraryEmployee;
	
	/** The library associate1. */
	private LibraryAssociate libraryAssociate1;
	
	/** The library associate2. */
	private LibraryAssociate libraryAssociate2;
	
	/** The library associate3. */
	private LibraryAssociate libraryAssociate3;
	
	/** The librarian name. */
	private static String LIBRARIAN_NAME = "Librarian";
	
	/** The librarian base pay. */
	private static double LIBRARIAN_BASE_PAY = 4000.00;
	
	/** The librarian used book sales. */
	private static double LIBRARIAN_USED_BOOK_SALES = 10000.00;
	
	/** The librarian bonus rate. */
	private static double LIBRARIAN_BONUS_RATE = 0.005;
	
	/** The library employee name. */
	private static String LIBRARY_EMPLOYEE_NAME = "Library Employee";
	
	/** The library employee hourly rate. */
	private static double LIBRARY_EMPLOYEE_HOURLY_RATE = 10.50;
	
	/** The library employee current hours. */
	private static double LIBRARY_EMPLOYEE_CURRENT_HOURS = 160;
	
	/** The library employee current sales. */
	private static double LIBRARY_EMPLOYEE_CURRENT_SALES = 500.00;

	/** The library associate 1 name. */
	private static String LIBRARY_ASSOCIATE_1_NAME = "Library Associate #1";
	
	/** The library associate 1 rate. */
	private static double LIBRARY_ASSOCIATE_1_RATE = 12.50;
	
	/** The library associate 1 current hours. */
	private static double LIBRARY_ASSOCIATE_1_CURRENT_HOURS = 138;
	
	/** The library associate 1 commission rate. */
	private static double LIBRARY_ASSOCIATE_1_COMMISSION_RATE = 0.02;
	
	/** The library associate 1 current sales. */
	private static double LIBRARY_ASSOCIATE_1_CURRENT_SALES = 15000.00;

	/** The library associate 2 name. */
	private static String LIBRARY_ASSOCIATE_2_NAME = "Library Associate #2";
	
	/** The library associate 2 rate. */
	private static double LIBRARY_ASSOCIATE_2_RATE = 14.50;
	
	/** The library associate 2 current hours. */
	private static double LIBRARY_ASSOCIATE_2_CURRENT_HOURS = 160;
	
	/** The library associate 2 commission rate. */
	private static double LIBRARY_ASSOCIATE_2_COMMISSION_RATE = 0.02;
	
	/** The library associate 2 current sales. */
	private static double LIBRARY_ASSOCIATE_2_CURRENT_SALES = 30000.00;

	/** The library associate 3 name. */
	private static String LIBRARY_ASSOCIATE_3_NAME = "Library Associate #3";
	
	/** The library associate 3 rate. */
	private static double LIBRARY_ASSOCIATE_3_RATE = 15.00;
	
	/** The library associate 3 current hours. */
	private static double LIBRARY_ASSOCIATE_3_CURRENT_HOURS = 160;
	
	/** The library associate 3 commission rate. */
	private static double LIBRARY_ASSOCIATE_3_COMMISSION_RATE = 0.03;
	
	/** The library associate 3 current sales. */
	private static double LIBRARY_ASSOCIATE_3_CURRENT_SALES = 45000.00;
	
	/** The librarian pay. */
	private static double LIBRARIAN_PAY = 4502.5;
	
	/** The library employee pay. */
	private static double LIBRARY_EMPLOYEE_PAY = 1680.0;
	
	/** The library associate 1 pay. */
	private static double LIBRARY_ASSOCIATE_1_PAY = 2025.0;
	
	/** The library associate 2 pay. */
	private static double LIBRARY_ASSOCIATE_2_PAY = 2920.0;
	
	/** The library associate 3 pay. */
	private static double LIBRARY_ASSOCIATE_3_PAY = 3750.0;
	
	/** The library current sales. */
	private static double LIBRARY_CURRENT_SALES = 100500.0;
	
	/** The library total commissions. */
	private static double LIBRARY_TOTAL_COMMISSIONS = 2752.50;
	
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		library = new Library(1);
		librarian = new Librarian(LIBRARIAN_NAME);
		libraryEmployee = new LibraryEmployee(LIBRARY_EMPLOYEE_NAME);
		libraryAssociate1 = new LibraryAssociate(LIBRARY_ASSOCIATE_1_NAME);
		libraryAssociate2 = new LibraryAssociate(LIBRARY_ASSOCIATE_2_NAME);
		libraryAssociate3 = new LibraryAssociate(LIBRARY_ASSOCIATE_3_NAME);
		
		librarian.setBasePay(LIBRARIAN_BASE_PAY);
		librarian.setCurrentLibrarianUsedBookTotals(LIBRARIAN_USED_BOOK_SALES);
		Librarian.setCommissionRate(LIBRARIAN_BONUS_RATE);
		
		libraryEmployee.setHourlyRate(LIBRARY_EMPLOYEE_HOURLY_RATE);
		libraryEmployee.setCurrentHours(LIBRARY_EMPLOYEE_CURRENT_HOURS);
		libraryEmployee.setCurrentSales(LIBRARY_EMPLOYEE_CURRENT_SALES);
	
		libraryAssociate1.setHourlyRate(LIBRARY_ASSOCIATE_1_RATE);
		libraryAssociate1.setCurrentHours(LIBRARY_ASSOCIATE_1_CURRENT_HOURS);
		libraryAssociate1.setCommissionRate(LIBRARY_ASSOCIATE_1_COMMISSION_RATE);
		libraryAssociate1.setCurrentSales(LIBRARY_ASSOCIATE_1_CURRENT_SALES);

		libraryAssociate2.setHourlyRate(LIBRARY_ASSOCIATE_2_RATE);
		libraryAssociate2.setCurrentHours(LIBRARY_ASSOCIATE_2_CURRENT_HOURS);
		libraryAssociate2.setCommissionRate(LIBRARY_ASSOCIATE_2_COMMISSION_RATE);
		libraryAssociate2.setCurrentSales(LIBRARY_ASSOCIATE_2_CURRENT_SALES);

		libraryAssociate3.setHourlyRate(LIBRARY_ASSOCIATE_3_RATE);
		libraryAssociate3.setCurrentHours(LIBRARY_ASSOCIATE_3_CURRENT_HOURS);
		libraryAssociate3.setCommissionRate(LIBRARY_ASSOCIATE_3_COMMISSION_RATE);
		libraryAssociate3.setCurrentSales(LIBRARY_ASSOCIATE_3_CURRENT_SALES);

		library.setLibrarian(librarian);
		library.addEmployee(libraryEmployee);
		library.addEmployee(libraryAssociate1);
		library.addEmployee(libraryAssociate2);
		library.addEmployee(libraryAssociate3);
	}

//	@Test
//	public void testLibrary() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetLibraryNumber() {
//		fail("Not yet implemented");
//	}
	/**
	 * Exception1.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void exception1(){
		Library lib = new Library(0);
	}
	/**
	 * Test process payroll.
	 */
	@Test
	public void testProcessPayroll() {
		List<PayrollRecord> payrollList = null;
		try {
			payrollList = library.processPayroll();
		} catch (LibraryException e) {
			e.printStackTrace();
		}
		for (Iterator<PayrollRecord> i = payrollList.iterator(); i.hasNext(); ){
			PayrollRecord record = i.next();
			//System.out.println(record.getEmployeeName()+" pay = "+record.getCurrentPay());
			String name = record.getEmployeeName();
			if (name == LIBRARIAN_NAME){
				assertEquals(LIBRARIAN_PAY, record.getCurrentPay(),0);
			} else if (name == LIBRARY_EMPLOYEE_NAME){
				assertEquals(LIBRARY_EMPLOYEE_PAY, record.getCurrentPay(),0);
			} else if (name == LIBRARY_ASSOCIATE_1_NAME){
				assertEquals(LIBRARY_ASSOCIATE_1_PAY, record.getCurrentPay(),0);
			} else if (name == LIBRARY_ASSOCIATE_2_NAME){
				assertEquals(LIBRARY_ASSOCIATE_2_PAY, record.getCurrentPay(),0);
			} else if (name == LIBRARY_ASSOCIATE_3_NAME){
				assertEquals(LIBRARY_ASSOCIATE_3_PAY, record.getCurrentPay(),0);
			}
		}
	}

	/**
	 * Test get current used book sales.
	 */
	@Test
	public void testGetCurrentUsedBookSales() {
		try {
			System.out.println("Library current sales = "+library.getCurrentUsedBookSales());
			assertEquals(LIBRARY_CURRENT_SALES, library.getCurrentUsedBookSales(),0);
		} catch (LibraryException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test get total commissions.
	 */
	@Test
	public void testGetTotalCommissions() {
		double tempCommission = 0;
		try {
			tempCommission = library.getTotalCommissions();
		} catch (LibraryCommissionException e) {
			e.printStackTrace();
		}
		//System.out.println("Library current total commissions = "+tempCommission);
		assertEquals(LIBRARY_TOTAL_COMMISSIONS, tempCommission,0);
	}

//	@Test
//	public void testAddEmployee() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetLibrarian() {
//		fail("Not yet implemented");
//	}

}
