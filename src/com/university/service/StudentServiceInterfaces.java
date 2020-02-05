package com.university.service;

import java.util.List;

import com.univesity.entities.Professor;

import com.univesity.entities.Student;

public interface StudentServiceInterfaces {
	

/*1*/	Student getStudentByName(String name) throws Exception;
	
/*2*/	List<Student> getStudentsBytopGrade(char Grade);
	
/*3*/	Professor getProfessorById(int ID);
	
/*4*/	 boolean saveStudentById (int id, Student std);
	
/*5*/	Student getStudentById (int id);
	
/*6*/   boolean saveStudentToAProfessor (int id, Student std);

/*7*/   boolean isProfessorRatingBelow3(String prof);
	
/*8*/	List<Student> getStudentsWithGradeC(char Grade);



}
