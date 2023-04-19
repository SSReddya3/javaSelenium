package A01DataTypes;

public class a04Boolean {

	//Write an Java Boolean DataType program, to Calculate the Total Marks and Average Marks of the Student.
	//english = 84;hindi = 76;maths = 93;physics = 61;chemistry = 82;

	public static void main(String[] args) {

		int english = 84;
		int hindi = 76;
		int maths = 93;
		int physics = 61;
		int chemistry = 82;
				
			int	TotalMarks;
			int Average;



	TotalMarks=english+hindi +maths+physics+chemistry;
	Average=TotalMarks/5;
	
	boolean pass=TotalMarks>250;
	
		System.out.println("Total Marks are :"+TotalMarks);
		System.out.println("Student  Pass is  : ' "+pass+" '  Value. ");
		System.out.println("Average Marks are :"+Average);
		
	// Another Type Program	
		int x = 10;
		int y = 90;
		boolean p=x > y;
		System.out.println( "x > y is : '"+p+"' Answer "); // returns true, because 10 is higher than 9

		
		// Another Type Program	
		
		int myAge = 25;
		int votingAge = 18;
		boolean b=myAge >= votingAge;
		System.out.println("Voting age is Eligible is the : ' "+b+" ' Answer ");

	}
	
	
	
	
}
