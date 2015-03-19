package edu.washington.ext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.washington.ext.common.AbstractEmployee;
import edu.washington.ext.common.LibraryCommissionException;
import edu.washington.ext.common.LibraryException;

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
	 * @throws IllegalArgumentException the illegal argument exception
	 */
	public Library(int number) throws IllegalArgumentException{
		if (number <= 0){
			throw new IllegalArgumentException("number must not be 0 or negative");
		} else {
			this.libraryNumber = number;
		}
		
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
	 * @throws LibraryException the library exception
	 */
	public List<PayrollRecord> processPayroll() throws LibraryException{
		getCurrentUsedBookSales();
		if (staff.size()>0){
			for (Iterator<AbstractEmployee> i = staff.iterator(); i.hasNext(); ){
				AbstractEmployee emp = i.next();
				if (emp.getCommisionRate()>100) {
					throw new LibraryException(emp);
				}
			}
		} else {
			throw new LibraryException(null);
		}
		return payrollList;
	}
	
	/**
	 * Gets the current used book sales.
	 *
	 * @return the current used book sales
	 * @throws LibraryException the library exception
	 */
	public double getCurrentUsedBookSales() throws LibraryException{
		double usedBookSales = 0;
		if (staff.size()>0){
			for (Iterator<AbstractEmployee> i = staff.iterator(); i.hasNext(); ){
				AbstractEmployee emp = i.next();
				usedBookSales += emp.getCurrentSales();
				PayrollRecord record = new PayrollRecord(emp.getName(), emp.calculatePay());
				payrollList.add(record);
			}
		} else {
			throw new LibraryException(null);
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
	 * @throws LibraryCommissionException the library commission exception
	 */
	public double getTotalCommissions() throws LibraryCommissionException{
		try {
			getCurrentUsedBookSales();
		} catch (LibraryException e){
			System.out.println(e.getMessage());
		}
		double commissionTotal = 0;
		for (int i=0; i< staff.size(); i++){
			commissionTotal += staff.get(i).calculateCommission();
		}
		commissionTotal += librarian.calculateCommission();
		if (commissionTotal<=0){
			throw new LibraryCommissionException(commissionTotal);
		}
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
