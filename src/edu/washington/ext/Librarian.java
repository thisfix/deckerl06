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
	private String name;
	
	/** The base pay. */
	private double basePay;
	
	/** The current library totals. */
	private double currentLibraryTotals;
	
	/** The current librarian totals. */
	private double currentLibrarianTotals;
	

	/* (non-Javadoc)
	 * @see edu.washington.ext.common.AbstractEmployee#getName()
	 */
	public String getName() {
		return this.name;
	}


	/* (non-Javadoc)
	 * @see edu.washington.ext.common.AbstractEmployee#calculatePay()
	 */
	public double calculatePay() {
		return basePay+calculateCommission();
	}


	/* (non-Javadoc)
	 * @see edu.washington.ext.common.AbstractEmployee#calculateCommission()
	 */
	@Override
	
	public double calculateCommission() {
		double tempCommissions = commissionRate*currentLibraryTotals;
		return tempCommissions;
	}
	
	/**
	 * Instantiates a new librarian.
	 *
	 * @param name the name
	 */
	public Librarian(String name){
		this.name = name;
		
	}

	/**
	 * Sets the bonus rate.
	 *
	 * @param rate the new bonus rate
	 */
	public static void setCommissionRate(double rate){
		commissionRate = rate;
	}
	
	/**
	 * Sets the current librarian used book totals.
	 *
	 * @param totals the new current librarian used book totals
	 */
	public void setCurrentLibrarianUsedBookTotals(double totals){
		this.currentLibrarianTotals = totals;
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
		this.basePay = base_pay;
	}
	
	/**
	 * Sets the current library used book sales totals.
	 *
	 * @param totals the new current library used book sales totals
	 */
	public void setCurrentLibraryUsedBookSalesTotals(double totals){
		this.currentLibraryTotals = totals;
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
