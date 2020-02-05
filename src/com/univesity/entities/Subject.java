package com.univesity.entities;

import java.util.List;


public class Subject  {
	
	List<Subject> subject;
	private int subjectId;
	/**
	 * @param subject
	 * @param subjectId
	 */
	public Subject(List<Subject> subject, int subjectId) {
		super();
		this.subject = subject;
		this.subjectId = subjectId;
	}
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	
	
}
	

