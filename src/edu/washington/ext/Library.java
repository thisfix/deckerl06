package edu.washington.ext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.washington.ext.common.AbstractEmployee;

/**
 * The Class Library.
 */
public class Library {
	
	/** The library number. */
	private int libraryNumber;
	
	/** The payroll list. */
	private List<PayrollRecord> payrollList = new ArrayList<PayrollRecord>();
	
	/** The staff. */
	private List<AbstractEmployee> staff = new ArrayList<AbstractEmployee>();
	
	/** The librarian. */
	private Librarian librarian = null;
	
	/**
	 * Instantiates a new library.
	 *
	 * @param number the number
	 */
	public Library(int number){
		this.libraryNumber = number;
	}
	
	/**
	 * Gets the library number.
	 *
	 * @return the library number
	 */
	public int getLibraryNumber(){
		return libraryNumber;
	}
	
	/**
	 * Process payroll.
	 *
	 * @return the list
	 */
	public List<PayrollRecord> processPayroll(){
		getCurrentUsedBookSales();
		return payrollList;
	}
	
	/**
	 * Gets the current used book sales.
	 *
	 * @return the current used book sales
	 */
	public double getCurrentUsedBookSales(){
		double usedBookSales = 0;
		for (Iterator<AbstractEmployee> i = staff.iterator(); i.hasNext(); ){
			AbstractEmployee emp = i.next();
			usedBookSales += emp.getCurrentSales();
			PayrollRecord record = new PayrollRecord(emp.getName(), emp.calculatePay());
			payrollList.add(record);
		}
		usedBookSales += this.librarian.getCurrentLibrarianUsedBookTotals();
		librarian.setCurrentLibraryUsedBookSalesTotals(usedBookSales);
		PayrollRecord record = new PayrollRecord(librarian.getName(), librarian.calculatePay());
		payrollList.add(record);
		return usedBookSales;
	}
	
	/**
	 * Gets the total commissions.
	 *
	 * @return the total commissions
	 */
	public double getTotalCommissions(){
		getCurrentUsedBookSales();
		double commissionTotal = 0;
		for (int i=0; i< staff.size(); i++){
			commissionTotal += staff.get(i).calculateCommission();
		}
		commissionTotal += librarian.calculateCommission();
		return commissionTotal;
	}
	
	/**
	 * Adds the employee.
	 *
	 * @param employee the employee
	 */
	public void addEmployee(LibraryEmployee employee){
		staff.add(employee);
		
	}
	
	/**
	 * Sets the librarian.
	 *
	 * @param librarian the new librarian
	 */
	public void setLibrarian(Librarian librarian){
		this.librarian = librarian;
	}

}
