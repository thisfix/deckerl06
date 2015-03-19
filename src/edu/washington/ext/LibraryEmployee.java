package edu.washington.ext;

import edu.washington.ext.common.AbstractEmployee;

/**
 * The Class LibraryEmployee.
 */
public class LibraryEmployee extends AbstractEmployee {


	/**
	 * Instantiates a new library employee.
	 *
	 * @param name the name
	 */
	public LibraryEmployee(String name){
		//initialize the instance
		super(name);
	}
	
	/**
	 * Calculates commission.
	 * overrides the AbstractEmployee method to more appropriately reflect a LibraryEmployee
	 *
	 * @return the commission
	 */	
	@Override
	public double calculateCommission() {
		return 0;
	}



}
