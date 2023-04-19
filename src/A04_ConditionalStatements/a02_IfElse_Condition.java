package A04_ConditionalStatements;

public class a02_IfElse_Condition {

	public static void main(String[] args) {
		
		//Write an java program, to define Two Integer variables and assign the Values. And perform If Else Condition and Print the Result.
		
				//firstNumber = 14000;secondNumber = 0;
		Integer firstNumber, secondNumber, result;

		firstNumber = 40;
		secondNumber = 0;

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
		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
