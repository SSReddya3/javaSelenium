package B01JavaUseCases;

public class b02_Sum_of_1st100_Numbers_Operations {

	public static void main(String[] args) {
		
//		Write an Java program, to Calculate the Simple Interest.
//		principleAmount = 2,00,000; rateOfInterest = 3; tenure = 15;
		
//		Formula :  (PTR)/100
		
		Integer principleAmount, rateOfInterest, tenure, interestAmount,s;

			principleAmount = 200000;
			rateOfInterest = 3;
			tenure = 15;


//	Solution is 
		
			interestAmount=((principleAmount*rateOfInterest*tenure)/100);
	
			s = (principleAmount * rateOfInterest * tenure) / 100;
	
 System.out.println("Simple interest Amount is : "+interestAmount);
 
 System.out.println("2 Simple interest Amount is : "+s);
 

	
	}

}
