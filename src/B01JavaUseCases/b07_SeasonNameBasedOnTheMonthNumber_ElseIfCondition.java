package B01JavaUseCases;

public class b07_SeasonNameBasedOnTheMonthNumber_ElseIfCondition {

	public static void main(String[] args) {

//		Write an Java  program, Perform Else If Condition to Print the Season Name based on the Month Number as below.
		
//		Season Name				Month Number		
//	------------------------------------------
//		Winter Season.			1 - 4					
//		Summer Season.			5 - 8					
//	   Spring Season.			9 - 12										   
//	Invalid Month Number.    <1 OR >12

	

		int monthNumber = 23;

	if(monthNumber >= 1 && monthNumber <= 4)
	{
			System.out.println("Winter Season.");
	}
			else if(monthNumber >= 5 && monthNumber <= 8)
		{
				System.out.println("Summer Season.");
		}
			else if(monthNumber >= 9 && monthNumber <= 12)
		{
				System.out.println("Spring Season.");
		}
			else
			{
			  System.out.println("Invalid Month Number. Please Enter the Month Number between : 1 - 12.");					
			}

    }
	
	}


