package edu.washington.ext.common;


/**
 * The Class LibraryException.
 */
public class LibraryException extends Exception {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2014;
	
	/** The employee. */
	private AbstractEmployee employee = null;

	/**
	 * Instantiates a new library exception.
	 *
	 * @param emp the emp
	 */
	public LibraryException(AbstractEmployee emp){
		this.employee = emp;
	}
	
	/**
	 * Gets the employee.
	 *
	 * @return the employee
	 */
	public AbstractEmployee getEmployee(){
		return this.employee;
	}

}
