package Epam.DesignPrinciples;

import java.util.Scanner;

public class operations {
	
		public static void main(String[] args) throws Exception {
			float num1 = 0;
			float num2 = 0;
			 calci  c = new calci();
			System.out.println("SIMPLE CALCULATOR");
			System.out.println("--------------------");
			System.out.println(" OPERATIONS\n");
		        System.out.println("1.ADDITION(+)");
		        System.out.println("2.SUBTRACTION(-)");
		        System.out.println("3.MULTIPLICATION(*)");
		        System.out.println("4.DIVISION(/)");
		        System.out.println("5.EXIT");
		        
		        while(true){
			    	     System.out.println("Select an option");
			    	     Scanner sc= new Scanner(System.in);
			    	     int options = sc.nextInt();
			    	     if(options >= 5 ){
			    	    	 System.out.println("Thank you");
			    	    	 break;
			    	     }
			    	     if ((options < 1) || (options > 5)) throw new Exception("please enter only 1-5");
			    	     System.out.println("enter 1st number");
			    	     num1 = sc.nextFloat();
			    	     System.out.println("enter 2nd number");
			    	     num2 = sc.nextFloat(); 
			    	     float[] operations = {c.Add(num1,num2),c.Sub(num1,num2),c.Mul(num1,num2),c.Div(num1,num2)};  
			    	     System.out.println(operations[options-1]);
		        }
		        
		}

		



}
