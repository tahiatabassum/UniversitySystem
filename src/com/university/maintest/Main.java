/**
 * 
 */
package com.university.maintest;

import java.util.List;
import java.util.Scanner;

import com.university.service.StudentServiceImpl;
import com.university.service.StudentServiceInterfaces;
import com.univesity.entities.Grade;
import com.univesity.entities.Person;
import com.univesity.entities.Professor;

import com.univesity.entities.Student;

/**
 * @author tta29
 *
 */
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("	UNIVERSITY SYSTEM	");
		System.out.println("	");

		StudentServiceInterfaces service = new StudentServiceImpl();

		//
		//
		// Get Student by Name:
		// Maria || Sherry || Marcie || Michele || Tee || Christian || Austin || William
		//
		//

		try {

			System.out.println("Student and Professor Information");
			System.out.println("	");

			Scanner in = new Scanner(System.in);

			System.out.println("Please provide Student Name: ");
			System.out.println("	");

			String name = in.nextLine();

			Student studentReturned = service.getStudentByName(name);
			System.out.println("STUDENT NAME: " + studentReturned.getName());
			System.out.println("STUDENT Email: " + studentReturned.getEmail());
			System.out.println("STUDENT Hobby: " + studentReturned.getHobbies());

		} catch (Exception e) {
			e.printStackTrace();

		}

		//
		//
		// Get Student with Grade 'A'
		//
		//

		try {

			char Grade = 'A';
			List<Student> studentsReturned = service.getStudentsBytopGrade(Grade);

			System.out.println("	");

			System.out.println("STUDENT WITH GRADE 'A': ");
			System.out.println("	");

			for (Student eachStudent : studentsReturned) {

				if (eachStudent.getGrade() == (Grade)) {

					System.out.println("STUDENT NAME: " + (eachStudent.getName()));
					System.out.println("STUDENT Email: " + (eachStudent.getEmail()));
					System.out.println("-------------");
				}

			}
			System.out.println("	");

		} catch (Exception e) {
			e.printStackTrace();
		}

		//
		//
		// Get Professor by their ID:
		// professor ID 9865 || 5897 || 2435 || 6248 || 9864
		//
		//

		try {

			Scanner in = new Scanner(System.in);
			System.out.println("	");
			System.out.println("Please provide Professor ID:");
			System.out.println("	");

			int ID = in.nextInt();

			Professor professorsReturned = service.getProfessorById(ID);

			System.out.println("Employee ID: " + professorsReturned.getId() + " || " + " Name: "
					+ professorsReturned.getName() + " || " + " Email: " + professorsReturned.getEmail());
			System.out.println("	");

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		//
		//
		//
		// Save Student By Id
		//
		//
		//

		/*
		 * try { Scanner n = new Scanner(System.in); System.out.println("	");
		 * System.out.println("Please provide Student ID you want to save: ");
		 * System.out.println("	");
		 * 
		 * int Id = n.nextInt(); //String element2 = n.nextLine();
		 * 
		 * Savestudent savestudentlist = service.saveStudentById(Id, null);
		 * System.out.println("Student ID: " + savestudentlist.getSavestudentID());
		 * //System.out.println("Student Name: "+ savestudentlist.getSaveStudentName());
		 * }
		 * 
		 * catch (Exception a) { a.printStackTrace(); }
		 */

		//
		//
		// Get student by their ID:
		// student ID 98 || 55 || 45 || 32 || 56 || 98 || 72 || 11
		//
		//

		try {

			Scanner in = new Scanner(System.in);

			System.out.println("Please provide Student ID:");
			System.out.println("	");

			int id = in.nextInt();

			Student studentsReturned = service.getStudentById(id);

			System.out.println(
					"Student ID: " + studentsReturned.getId() + " || " + " Name: " + studentsReturned.getName() + " || "
							+ " Email: " + studentsReturned.getEmail() + " || " + " Hobby: " + studentsReturned.getHobbies());
			System.out.println("	");

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		//
		//
		// Is Professor rating <3
		// professor name: Linh || Victor || Justin || Jay || Craig
		//
		//

		try {

			Scanner in = new Scanner(System.in);

			System.out.println("Please provide Professor Name:");
			System.out.println("	");

			String prof = in.nextLine();

			// rating 1-5;
			boolean professorsReturned = service.isProfessorRatingBelow3(prof);

			{

				System.out.println("Is professor rating below 3: ?" + " " + professorsReturned);
				System.out.println("	");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		//
		//
		// Get Student with Grade 'C'
		//
		//

		try {

			char Grade = 'C';
			List<Student> studentsReturned = service.getStudentsBytopGrade(Grade);

			System.out.println("	");

			System.out.println("STUDENT WITH GRADE 'C': ");
			System.out.println("	");

			for (Student eachStudent : studentsReturned) {

				if (eachStudent.getGrade() == (Grade)) {

					System.out.println("STUDENT NAME: " + (eachStudent.getName()));
					System.out.println("STUDENT Email: " + (eachStudent.getEmail()));
					//System.out.println("STUDENT Comment: " + (eachStudent.Grade.getgDisc()));
					System.out.println("-------------");
				}

			}
			System.out.println("	");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
