package B01JavaUseCases;

public class b01_TotalMarks_AverageMarks_Operations {

	public static void main(String[] args) {
		
		//Write an Java program, to Calculate the Total Marks and Average Marks of the Student.
            //english = 84; hindi = 76; maths = 93; physics = 61; 	chemistry = 82;

 Integer english , hindi,maths ,physics ,chemistry,Total,Average ;

 //int english , hindi,maths ,physics ,chemistry,Total,Average ;

 
 english = 84; 
 hindi = 76; 
 maths = 93; 
 physics = 61; 	
 chemistry = 82;	
	
 Total= english+hindi+maths+physics+chemistry;
 Average=Total/5 ;
   
 System.out.println("Total Marks are : "+Total);
 
 System.out.println("Average Marks are : "+Average );
 
 
	}

}
