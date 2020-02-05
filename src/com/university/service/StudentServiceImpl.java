package com.university.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.univesity.entities.Grade;
import com.univesity.entities.Professor;
import com.univesity.entities.Person;
import com.univesity.entities.Student;

public class StudentServiceImpl implements StudentServiceInterfaces {
	
	//
	//
	// Get Student by Name:
	// Maria || Sherry || Marcie || Michele || Tee || Christian || Austin || William
	//
	//

	@Override
	public Student getStudentByName(String name) throws Exception {

		List<Student> studentsReturned = studentsData();

		for (Student eachStudent : studentsReturned) {
			if (eachStudent.getName().equals(name)) {
				return eachStudent;
			}
		}
		return null;
	}

	//
	//
	// Get Student with Grade 'A'
	//
	//
	
	@Override

	public List<Student> getStudentsBytopGrade(char Grade) {

		List<Student> studentlist = studentsData();

		for (Student eachStudent : studentlist) {

			if (eachStudent.getGrade() == (Grade)) {

				return studentsData();
			}
		}

		return null;

	}
	
	//
	//
	// Get Professor by their ID:
	// professor ID 9865 || 5897 || 2435 || 6248 || 9864
	//
	//

	public Professor getProfessorById(int ID) {


		List<Professor> professorsReturned = professorssData();

		for (Professor eachProfessor : professorsReturned) {

			if (eachProfessor.getId() == (ID)) {
				return eachProfessor;
			}

		}
		return null;

	}
	
	//
	//
	// Save student by ID
	//
	//

	@Override public boolean saveStudentById(int id, Student std) {
		return false;
	  

		HashMap<Integer, String> newStudent = new HashMap<Integer, String>();
		Scanner in = new Scanner (System.in);
		for (int i=0; i<3; i++) {
			int Integer = id; 
			Student String = std;
			id = in.nextInt();
			
			List<Student> studentsData() {
				List<Student> students = new ArrayList<Student>();
				
			List<Student> std = studentsData();
			
			return true;
		}
		return false;
		}
	  
	  }

	/*
	 * public Savestudent saveStudentById(int Id) { ArrayList<Savestudent>
	 * saveData(){ ArrayList<Savestudent> savestudentlist = new
	 * ArrayList<Savestudent>(); for ( int j=0; j<100; j++ ) { // String element2 =
	 * null;
	 * 
	 * savestudentlist.add (new Savestudent(Id)); } ArrayList<Savestudent>
	 * saveStudentListReturned = saveData(); for(Savestudent eachSaveStudent :
	 * saveStudentListReturned) {
	 * 
	 * if (eachSaveStudent.getSavestudentID() == (Id)) {
	 * 
	 * return eachSaveStudent; } } } return null;
	 * 
	 * }
	 */
	
	//
	//
	// Get student by their ID:
	// student ID 98 || 55 || 45 || 32 || 56 || 98 || 72 || 11
	//
	//

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub

		List<Student> studentsReturned = studentsData();

		for (Student eachStudent : studentsReturned) {

			if (eachStudent.getId() == (id)) {
				return eachStudent;
			}

		}
		return null;
	}

	@Override
	public boolean saveStudentToAProfessor(int id, Student std) {

		return false;

		/*
		 * ArrayList<saveStudentName> savestudentnamelist = new
		 * ArrayList<saveStudentName>(); for ( int j=0; j<100; j++ ) { // String
		 * element2 = null;
		 * 
		 * 
		 * savestudentnamelist.add (new saveStudentName(Name));
		 * 
		 * }
		 */

	}
	
	//
	//
	// Is Professor rating <3
	// professor name: Linh || Victor || Justin || Jay || Craig
	//
	//
	
	@Override
	public boolean isProfessorRatingBelow3(String prof) {

		List<Professor> professorsReturned = professorssData();

		for (Professor eachProfessor : professorsReturned) {

			if (eachProfessor.getRating() > 3) {

				return false;

			} else {
				return true;
			}
		}

		return null != null;
	}
	
	//
	//
	// Get Student with Grade 'C'
	//
	//
	
	@Override

	public List<Student> getStudentsWithGradeC(char grade) {

		List<Student> studentlist = studentsData();

		{
			if (((Student) studentlist).getGrade() == (grade)) {

				return studentsData();
			}
		}

		return null;

	}



	private static List<Student> studentsData() {
		List<Student> students = new ArrayList<Student>();

		/*
		 * //Student Getting Grade Student s = new Student(98, "Marcie", "Mar@uni.edu",
		 * 4957896542L, 'B', new Grade('A', "Excelent"), "Cars");
		 * 
		 * Grade grade = s.getGradez(); if(grade != null) { grade.getgDisc();
		 * 
		 * Code c = grade.getCode(); }
		 */

		// Student (ID, Name, Email, PhoneNumber, Grade, Gradez, Hobbies)

		students.add(new Student(98, "Marcie", "Mar@uni.edu", 4957896542L, 'B', new Grade('B', "Excelent"), "Cars"));
		students.add(new Student(55, "Sherry", "Sher@uni.edu", 9406872569L, 'A', new Grade('A', "Avg"), "Violin"));
		students.add(new Student(45, "Michele", "Mic@uni.edu", 2138956478L, 'B', new Grade('B', "Excelent"), "Makeup"));
		students.add(new Student(32, "Maria", "Ma@uni.edu", 9406582257L, 'C', new Grade('C', "Excelent"), "Cooking"));
		students.add(new Student(56, "Tee", "Tee@uni.edu", 49587925648L, 'D', new Grade('D', "Excelent"), "Gym"));
		students.add(
				new Student(98, "Chriastian", "Chr@uni.edu", 8957259465L, 'A', new Grade('A', "Excelent"), "KongFu"));
		students.add(
				new Student(72, "Austin", "Aus@uni.edu", 2565892256L, 'B', new Grade('B', "Excelent"), "Basketball"));
		students.add(
				new Student(11, "William", "Will@uni.edu", 9682567486L, 'C', new Grade('C', "Excelent"), "Knitting"));

		return students;

	}

	private static List<Professor> professorssData() {
		List<Professor> professors = new ArrayList<Professor>();

		// Student (id, name, email, pNumber, rating)

		professors.add(new Professor(9865, "Linh", "Linh@uni.edu", 2457892256L, 5));
		professors.add(new Professor(5897, "Victor", "Vic@uni.edu", 9406895489L, 2));
		professors.add(new Professor(2435, "Justin", "Just@uni.edu", 2136894558L, 1));
		professors.add(new Professor(6248, "Jay", "Jay@uni.edu", 7892567895L, 3));
		professors.add(new Professor(9864, "Craig", "Cra@uni.edu", 4096572459L, 4));

		return professors;

	}

}
