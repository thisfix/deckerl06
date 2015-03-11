package edu.washington.ext;

import edu.washington.ext.common.AbstractEmployee;

/**
 * The Class LibraryEmployee.
 */
public class LibraryEmployee extends AbstractEmployee {

	/** The current hours. */
	private double currentHours;
	
	/** The hourly rate. */
	private double hourlyRate;
	
	/** The name. */
	private String name;
	
	/** The current sales. */
	private double currentSales;
	
	/**
	 * Instantiates a new library employee.
	 *
	 * @param name the name
	 */
	public LibraryEmployee(String name){
		//initialize the instance
		this.currentHours = 0;
		this.hourlyRate = 0;
		this.name = name;
		this.currentSales = 0;
	}
	


	/* (non-Javadoc)
	 * @see edu.washington.ext.common.AbstractEmployee#getName()
	 */
	public String getName() {
		return name;
	}

	
	/* (non-Javadoc)
	 * @see edu.washington.ext.common.AbstractEmployee#calculatePay()
	 */
	public double calculatePay() {
		return currentHours*hourlyRate;
	}

	/* (non-Javadoc)
	 * @see edu.washington.ext.common.AbstractEmployee#calculateCommission()
	 */
	@Override
	
	public double calculateCommission(){
		return 0;
	}

	
	/**
	 * Sets the current sales.
	 *
	 * @param cur_sales the new current sales
	 */
	public void setCurrentSales(double cur_sales){
		this.currentSales = cur_sales;
	}
	
	/**
	 * Gets the current sales.
	 *
	 * @return the current sales
	 */
	public double getCurrentSales(){
		return currentSales+super.getCurrentSales();
	}
	
	/**
	 * Sets the hourly rate.
	 *
	 * @param rate the new hourly rate
	 */
	public void setHourlyRate(double rate){
		this.hourlyRate = rate;
	}
	
	/**
	 * Sets the current hours.
	 *
	 * @param cur_hours the new current hours
	 */
	public void setCurrentHours(double cur_hours){
		this.currentHours = cur_hours;
	}



}
