package skillbuilders;

import java.util.Scanner;

public class StudentRoster 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int numStudents;
		String[] students;
		
		System.out.print("How many students are there? ");
		numStudents = input.nextInt();
		input.nextLine();
		
		students = new String[numStudents];
		
		for(int i = 0; i < students.length; i++) 
		{
			System.out.print("Enter the name of student " + (i + 1) + ": ");
			students[i] = input.nextLine();
		}
		
		System.out.println(" ");
		System.out.println("Student Roster: ");
		
		for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

	}

}
