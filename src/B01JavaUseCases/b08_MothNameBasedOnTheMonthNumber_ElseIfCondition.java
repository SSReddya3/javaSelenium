package B01JavaUseCases;

public class b08_MothNameBasedOnTheMonthNumber_ElseIfCondition {

	public static void main(String[] args) {

//		Write an Java  program, Perform Else If Condition to Print the Moth Name based on the Month Number as below.
		
//		Moth Name				Month Number		
//	------------------------------------------
//		January			          1  			
//		February                  2							
//	    March		         	  3										   
//	    April                     4
//      May                       5  
//      June                      6
//      July                      7 
//      August                    8
//      September                 9
//      October                   10
//      November                  11
//      December.	              12
//	

		int monthNumber = 2;

	      if(monthNumber == 1)
	{
			System.out.println("January");
	}
			else if(monthNumber == 2)
		{
				System.out.println("February");
		}
			else if(monthNumber ==3)
		{
				System.out.println("March");
		}
			else if(monthNumber == 4)
			{
					System.out.println("April");
			}
			else if(monthNumber ==5)
			{
					System.out.println("May");
			}
			else if(monthNumber == 6)
		    {
				System.out.println("June");
		    }
			else if(monthNumber ==7)
		    {
				System.out.println("July");
		    }
			else if(monthNumber == 8)
		    {
			System.out.println("August");
	        }
		    else if(monthNumber ==9)
	        {
			System.out.println("September");
	       }
	    	else if(monthNumber == 10)
		   {
	     	System.out.println("October");
		   }
			else if(monthNumber ==11)
		   {
				System.out.println("November");
		   }
			else if(monthNumber ==12)
			   {
					System.out.println("December");
			   }
			else
			{
			  System.out.println("Invalid Month Number. Please Enter the Valid Month Number between : 1 - 12.");					
			}

    }
	
	}


