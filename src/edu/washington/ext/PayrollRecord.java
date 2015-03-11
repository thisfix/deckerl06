package edu.washington.ext;

// TODO: Auto-generated Javadoc
/**
 * The Class PayrollRecord.
 */
public class PayrollRecord {
	
	/** The employee name. */
	private String employeeName;
	
	/** The current pay. */
	private double currentPay;
	
	/**
	 * Instantiates a new payroll record.
	 *
	 * @param name the name
	 * @param pay the pay
	 */
	public PayrollRecord(String name, double pay){
		this.employeeName = name;
		this.currentPay = pay;
	}
	
	/**
	 * Gets the current pay.
	 *
	 * @return the current pay
	 */
	public double getCurrentPay(){
		return this.currentPay;
	}
	
	/**
	 * Gets the employee name.
	 *
	 * @return the employee name
	 */
	public String getEmployeeName(){
		return this.employeeName;
	}

}
