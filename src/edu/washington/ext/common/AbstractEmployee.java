package edu.washington.ext.common;


/**
 * The Class AbstractEmployee.
 */
public abstract class AbstractEmployee implements Employee {

	
	/* (non-Javadoc)
	 * @see edu.washington.ext.common.Employee#getName()
	 */
	@Override
	public String getName() {
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.washington.ext.common.Employee#calculatePay()
	 */
	@Override
	public double calculatePay() {
		return 0;
	}
	
	/**
	 * Calculate commission.
	 *
	 * @return the double
	 */
	public abstract double calculateCommission();
	
	/**
	 * Gets the current sales.
	 *
	 * @return the current sales
	 */
	public double getCurrentSales(){
		return 0;
	}

}
