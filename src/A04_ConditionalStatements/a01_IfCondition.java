package A04_ConditionalStatements;

public class a01_IfCondition {

	public static void main(String[] args) {
		
		//Write an java program, to define Two Integer variables and assign the Values. And perform If Condition and Print the Result.
		
				//firstNumber = 14000;secondNumber = 0;
		Integer firstNumber, secondNumber, result;

		firstNumber = 40;
		secondNumber = 20;

		result = firstNumber + secondNumber;
       System.out.println("Addition Result is....: "+ result);

		result = firstNumber - secondNumber;
		System.out.println("Subtraction Result is....: "+ result);

		if(secondNumber > 0)
        {
		result = firstNumber * secondNumber;
		System.out.println("Multiply Result is....: " + result);

		
        	result = firstNumber / secondNumber;
        	System.out.println("Division Result is....: "+ result);
    
            result = firstNumber%secondNumber;
            System.out.println("Reminder Value is....: "+ result);    
        }
		else
        {
			System.out.println("We cannot Perform the Division,Persentage and Multiply Operations. As the Second Number Value is Zero.");
        }	

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
