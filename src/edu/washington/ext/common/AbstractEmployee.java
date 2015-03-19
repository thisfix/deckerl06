package edu.washington.ext.common;


/**
 * The Class AbstractEmployee.
 */
public abstract class AbstractEmployee implements Employee {
	
	/** The current hours. */
	private double currentHours;
	
	/** The hourly rate. */
	private double hourlyRate;
	
	/** The name. */
	private String name;
	
	/** The current sales. */
	private double currentSales;
	
	/**
	 * Instantiates a new abstract employee.
	 *
	 * @param name the name
	 * @throws IllegalArgumentException the illegal argument exception
	 */
	public AbstractEmployee(String name) throws IllegalArgumentException{
		//initialize the instance
		if (name == "" || name == null) {
			throw new IllegalArgumentException("name must not be null or '' ");
		} else {
			this.currentHours = 0;
			this.hourlyRate = 0;
			this.name = name;
			this.currentSales = 0;
		}
	}
	/**
	 * Gets the current sales.
	 *
	 * @return the current sales
	 */
	public double getCurrentSales(){
		return currentSales;
	}
	/**
	 * Sets the current sales.
	 *
	 * @param cur_sales the new current sales
	 */
	public void setCurrentSales(Double cur_sales){
		if ((cur_sales == null) || (cur_sales<0)){
			throw new IllegalArgumentException("current sales must not be null or negative");
		} else {
			this.currentSales = cur_sales;
		}
	}
	/**
	 * gets the name.
	 * overrides the Employee interface method to more appropriately reflect a AbstractEmployee
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the hourly rate.
	 *
	 * @param rate the new hourly rate
	 */
	public void setHourlyRate(Double rate){
		if ((rate == null) || (rate<0)){
			throw new IllegalArgumentException("rate must not be null or negative");
		} else {
			this.hourlyRate = rate;
		}
		
	}
	
	/**
	 * Sets the current hours.
	 *
	 * @param cur_hours the new current hours
	 */
	public void setCurrentHours(Double cur_hours){
		if ((cur_hours == null) || (cur_hours<0)){
			throw new IllegalArgumentException("rate must not be null or negative");
		} else {
			this.currentHours = cur_hours;
		}
		
	}	
	
	
	
	
	
	/**
	 * calculates the pay.
	 * overrides the Employee interface method to more appropriately reflect a AbstractEmployee
	 *
	 * @return the pay
	 */
	public double calculatePay() {
		return currentHours*hourlyRate;
	}
	

	/**
	 * Gets the commision rate.
	 *
	 * @return the commision rate
	 */
	public double getCommisionRate(){
		return 0;
	}

	
	/**
	 * Calculate commission.
	 *
	 * @return the double
	 */
	public abstract double calculateCommission();
	

}
