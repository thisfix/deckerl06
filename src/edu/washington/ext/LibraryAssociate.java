package edu.washington.ext;

import edu.washington.ext.common.CommissionedEmployee;


/**
 * The Class LibraryAssociate.
 */
public class LibraryAssociate extends LibraryEmployee implements CommissionedEmployee {
	
	/** The commission rate. */
	private double commissionRate;

	/**
	 * Instantiates a new library associate.
	 *
	 * @param name the name
	 */
	public LibraryAssociate(String name) {
		super(name);
	}
	
	/**
	 * Sets the commission rate.
	 *
	 * @param rate the new commission rate
	 */
	public void setCommissionRate(double rate){
		this.commissionRate = rate;
	}
	

	/**
	 * Calculates pay.
	 * overrides the LibraryEmployee method to more appropriately reflect a LibraryAssociate
	 *
	 * @return the pay
	 */	
	public double calculatePay() {
		
		return (super.calculatePay()+calculateCommission());
	}

	/**
	 * Calculates commission.
	 * overrides the LibraryEmployee method to more appropriately reflect a LibraryAssociate
	 *
	 * @return the commission
	 */	
	@Override
	public double calculateCommission() {
		double tempCommission = (super.getCurrentSales()*this.commissionRate)+super.calculateCommission();
		return tempCommission;
	}


}
