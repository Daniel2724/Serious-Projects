import java.util.*;

public class School_Grades_2 {

	/*
	 * Name : Daniel 
	 * Date : Start of work process : 14.12.2018 , End of the work process : 19.12.2018 
	 * This program need to say : 
	 * 1a. What`s the average of the grades in each specific class 
	 * 1b. It need to say how much students failed in each specific class 
	 * 2a. What`s the average of the grades in the hole school
	 * 2b. It need to say how much students failed in the hole school 
	 * 2c. It need to say which class have the most amount of failed students in the hole school !
	 * Version : 2 ( Just add description in the top of the code {Name,Date,description etc})
	 * 
	 */
	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("How much classes are there in the school : "); // asking how much class in the school
		int classes = reader.nextInt(); // getting the number
		int grade = 0, stu = 0, f = 0, stuT = 0, fT = 0;
		double sumGrades = 0, avg;
		double sumT = 0, avgT;

		while (classes > 0) // it is to stop the loop when all the classes got there grades
		{
			System.out.println(
					"-------------------------------------------------------------------------------------------"); // just a  dividing  line

			while (grade != -1) // sentinel ( if the user enter -1 the program will stop asking more grades )
			{
				System.out.println("Give me the grades for class " + classes + " ( To stop write '-1' )"); // asking for a grade

				grade = reader.nextInt(); // getting the grade
				if (grade != -1) // checking if the input is -1
				{
					if (grade <= 100) // if the grade is more then 100 the program skip to the "else" and S.O.P that this grade is too big

						if (grade < 60) // if the grade is less then 60 the program and 1 ((looser:-)) to the int f
						{
							stu = stu + 1;
							sumGrades = sumGrades + grade;
							f = f + 1;
						} 
						else // just in case every thing is right the program simply add 1 to the count of the sudents (int stu) and add the grade to the sum of the grades (double sumGrades)
						{
							stu = stu + 1;
							sumGrades = sumGrades + grade;
						}
					else
						System.out.println("The Grade is too big !!!");

				}

			}
			avg = sumGrades / stu; // calculate the average of the grades
			System.out.println("The avarage of class " + classes + " is " + avg); // print the average of the specific class in the school

			System.out.println(f + " studenst in this class has faild"); // print how much students in this specific class failed

			sumT = sumT + sumGrades; // add to the total sum of the grades in all the classes (double sumT) the grade of the last class (double sumGrades)

			stuT = stuT + stu; // add to the total amount of students in the school (int stuT), the amount of the students in the last class

			classes = classes - 1;
			grade = 0; // zeroing the grade parameter, `couse now (int) grade is -1 (from the last time) and now to make the next while loop work the (int) grade need to be { != } to -1 so it was zeroed !

			fT = fT + f;
		}
		avgT = sumT / stuT;
		System.out.println("The average of the grades is " + avgT);
		System.out.println(fT + " student/s has failed");

	}
}
