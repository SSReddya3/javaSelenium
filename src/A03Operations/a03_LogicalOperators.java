package A03Operations;

public class a03_LogicalOperators {

	public static void main(String[] args) {
		
//Write an java program, Compare the a,b,c Values And perform all the Logical Operations and Print the Result.
		
		//a=10; b=5;c=20;

		

//Solutaion is 
		Integer a,b,c;
		
		

		  a=10;  
		  b=5;  
		  c=20;  
		 System.out.println( a<b&&a<c);//false && true = false  
		 System.out.println(a<b&a<c);//false & true = false  
		 
		 System.out.println(a>b||a<c);//true || true = true  
		 System.out.println(a>b|a<c);//true | true = true  
		 
		 Boolean a1,b1;
			a1=true;
			b1=false;
			System.out.print("a&&b =");
			System.out.println( a1&&b1);// both are true then only result showing ture
			System.out.print( "a ||b= ");
			System.out.println( a1||b1);// any  one is true then  result showing ture
			
			System.out.println("!a ="+!a1);// !a is showing opposite result		
			System.out.println("!b ="+!b1);// !b is showing opposite result		
			
			
		
		
		
		
		
		
		
	}

}
