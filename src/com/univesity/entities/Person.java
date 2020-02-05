/**
 * 
 */
package com.univesity.entities;

/**
 * @author tta29
 *
 */
public class Person {
	
	// Student or Teacher 
	// Name of person
	// Their email
	// Their Phone Number
	
	private int id;
	private String name;
	private String email;
	private long pNumber;
	/**
	 * @param name
	 * @param email
	 * @param pNumber2
	 * @param id 
	 */
	public Person(int id,String name, String email, long pNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pNumber = pNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the pNumber
	 */
	public long getpNumber() {
		return pNumber;
	}
	/**
	 * @param pNumber the pNumber to set
	 */
	public void setpNumber(long pNumber) {
		this.pNumber = pNumber;
	}
	
	
	
	
	

}
