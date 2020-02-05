package com.univesity.entities;

import java.util.List;

// grade, hobbies, list of Subjects

public class Student extends Person {

	private char grade;
	private Grade gradez;
	private String hobbies;
	private int studentSubjectId;
	private String studentName;

	/**
	 * @param name
	 * @param email
	 * @param pNumber
	 * @param grade
	 * @param hobbies
	 * @param subject
	 */

	public void saveSubjects(String studentName, int studentSubjectId) {
		this.studentName = studentName;
		this.studentSubjectId = studentSubjectId;
	}

	public int getStudentSubjectId() {
		return studentSubjectId;
	}

	public void setStudentSubjectId(int studentSubjectId) {
		this.studentSubjectId = studentSubjectId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(int id, String name, String email, long pNumber, char grade, Grade gradez, String hobbies) {
		super(id, name, email, pNumber);
		this.grade = grade;
		this.hobbies = hobbies;
		this.gradez = gradez;

	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public Grade getGradez() {
		return gradez;
	}

	public void setGradez(Grade gradez) {
		this.gradez = gradez;
	}

}