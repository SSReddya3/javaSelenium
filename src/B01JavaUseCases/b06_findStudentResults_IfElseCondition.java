package B01JavaUseCases;

public class b06_findStudentResults_IfElseCondition {

	public static void main(String[] args) {

//		Write an Java program, to Find out the Student Results based on the below conditions.
//		1. We have the 5 Subjects (Ex: English, Hindi, Maths, Physics, and Chemistry)
//		2. Calculate the Total Marks of the Student.
//		3. Find out the Student Result.
//			3.1. PASS : If the Student got more than 40 Marks in all the Subjects.
//			3.2. FAIL : If the Student got less than 40 marks in any of the Subject.
//		English = 84;	maths = 16;	hindi = 61;	physics = 72;	chemistry = 89;
		
//	Solution	
	Integer english, maths, Hindi, physics, chemistry, total;

		english = 84;
		maths = 6;
		Hindi = 61;
		physics = 72;
		chemistry = 89;

	total = english + Hindi + maths + physics + chemistry;
	
	if(english >= 40 && Hindi >= 40 && maths >= 40 && physics >= 40 && chemistry >= 40)
    {
		System.out.println("Congratulations...!! You got PASSED."); 
		System.out.println("Total Marks are....: "+ total);
    }
	else
    {
		System.out.println("You got FAILED. Better luck Next Time."); 
		System.out.println("Total Marks are....: "+ total);
    }


		
		
		
		
		
		
		
	}

}
