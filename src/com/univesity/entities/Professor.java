package com.univesity.entities;

import java.util.List;

public class Professor extends Person {

	private int rating;
	private String professorName;
	private int professorSubjectId;
	private String studentNameAdded;

	/**
	 * @param name
	 * @param email
	 * @param pNumber
	 * @param rating
	 * @param subject
	 */

	public void saveSubjects(String professorName, int professorSubjectId) {
		this.professorName = professorName;
		this.professorSubjectId = professorSubjectId;

	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public int getProfessorSubjectId() {
		return professorSubjectId;
	}

	public void setProfessorSubjectId(int professorSubjectId) {
		this.professorSubjectId = professorSubjectId;
	}

	//
	//
	//
	//
	public void saveStudentName(String studentNameAdded) {
		this.studentNameAdded = studentNameAdded;
	}

	public String getStudentNameAdded() {
		return studentNameAdded;
	}

	public void setStudentNameAdded(String studentNameAdded) {
		this.studentNameAdded = studentNameAdded;
	}

	//
	//
	//
	//
	public Professor(int id, String name, String email, long pNumber, int rating) {
		super(id, name, email, pNumber);
		this.rating = rating;

	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

}
