package edu.washington.ext.common;

/**
 * The Class LibraryCommissionException.
 */
public class LibraryCommissionException extends Exception {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2013;
	
	/** The commission totals. */
	private double commissionTotals = 0;

	/**
	 * Instantiates a new library commission exception.
	 *
	 * @param total the total
	 */
	public LibraryCommissionException(double total){
		this.commissionTotals = total;
	}
	
	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public double getTotal(){
		return this.commissionTotals;
	}

}
