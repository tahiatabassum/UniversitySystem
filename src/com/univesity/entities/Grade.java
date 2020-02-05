/**
 * 
 */
package com.univesity.entities;

/**
 * @author tta29
 *
 */
public class Grade {

	// Grade A, B, C, D
	// Grade Description.

	private char grade;
	private String gDisc;

	/**
	 * @param grade
	 * @param gDisc
	 */
	public Grade(char grade, String gDisc) {
		super();
		this.grade = grade;
		this.gDisc = gDisc;
	}

	/**
	 * @return the grade
	 */
	public char getGrade1() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade1(char grade) {
		this.grade = grade;
	}

	/**
	 * @return the gDisc
	 */
	public String getgDisc() {
		return gDisc;
	}

	/**
	 * @param gDisc the gDisc to set
	 */
	public void setgDisc(String gDisc) {
		this.gDisc = gDisc;
	}

}