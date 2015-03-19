package edu.washington.ext;

import edu.washington.ext.common.AbstractEmployee;
import edu.washington.ext.common.CommissionedEmployee;


/**
 * The Class Librarian.
 */
public class Librarian extends AbstractEmployee implements CommissionedEmployee {
	
	/** The bonus rate. */
	private static double commissionRate;
	
	/** The name. */
	//private String name;
	
	/** The base pay. */
	private double basePay;
	
	/** The current library totals. */
	private double currentLibraryTotals;
	
	/** The current librarian totals. */
	private double currentLibrarianTotals;
	
	/**
	 * Instantiates a new librarian.
	 *
	 * @param name the name
	 */
	public Librarian(String name){
		super(name);
		
	}	

	/**
	 * gets the name.
	 * overrides the AbstraceEmployee method to more appropriately reflect a Librarian
	 *
	 * @return the name
	 */
	public String getName() {
		return super.getName();
	}


	/**
	 * Calculates pay.
	 * overrides the AbstraceEmployee method to more appropriately reflect a Librarian
	 *
	 * @return the pay
	 */
	public double calculatePay() {
		return basePay+calculateCommission();
	}


	/**
	 * Calculates commission.
	 * overrides the AbstraceEmployee method to more appropriately reflect a Librarian
	 *
	 * @return the commission
	 */
	@Override
	public double calculateCommission() {
		double tempCommissions = commissionRate*currentLibraryTotals;
		return tempCommissions;
	}
	


	/**
	 * Sets the bonus rate.
	 *
	 * @param rate the new bonus rate
	 */
	public static void setCommissionRate(Double rate){
		if (rate <= 0){
			throw new IllegalArgumentException("rate must not be 0 or negative");
		} else {
			commissionRate = rate;
		}
		
	}
	
	/**
	 * Gets the commission rate.
	 * overrides the AbstraceEmployee method to more appropriately reflect a Librarian
	 *
	 * @return the commission rate
	 */
	public double getCommisionRate(){
		return commissionRate;
	}
	
	/**
	 * Sets the current librarian used book totals.
	 *
	 * @param totals the new current librarian used book totals
	 */
	public void setCurrentLibrarianUsedBookTotals(double totals){
		if (totals <= 0){
			throw new IllegalArgumentException("totals must not be 0 or negative");
		} else {
			this.currentLibrarianTotals = totals;
		}
	}
	
	/**
	 * Gets the current librarian used book totals.
	 *
	 * @return the current librarian used book totals
	 */
	public double getCurrentLibrarianUsedBookTotals(){
		return this.currentLibrarianTotals;
	}
	
	/**
	 * Sets the base pay.
	 *
	 * @param base_pay the new base pay
	 */
	public void setBasePay(double base_pay){
		if (base_pay <= 0){
			throw new IllegalArgumentException("base_pay must not be 0 or negative");
		} else {
			this.basePay = base_pay;
		}
		
	}
	
	/**
	 * Sets the current library used book sales totals.
	 *
	 * @param totals the new current library used book sales totals
	 */
	public void setCurrentLibraryUsedBookSalesTotals(double totals){
		
		if (totals <= 0){
			throw new IllegalArgumentException("totals must not be 0 or negative");
		} else {
			this.currentLibraryTotals = totals;
		}
	}
	
	/**
	 * Gets the current library used book sales totals.
	 *
	 * @return the current library used book sales totals
	 */
	public double getCurrentLibraryUsedBookSalesTotals(){
		return this.currentLibraryTotals;
	}


}
