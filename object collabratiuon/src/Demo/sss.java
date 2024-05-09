package Demo;

import java.util.Arrays;
import java.util.Scanner;
public class sss {


    public static void main(String[] args) {
     
   	 Scanner sc= new Scanner(System.in);
	 
	    System.out.println("enter the no of  element x and y");
	    
	    int x = sc.nextInt();
	    int y=sc.nextInt();
	    
     
      
//      x=x+y;  
//      y=x-y; 
//      x=x-y;
//      
//      
//      System.out.println("x :" +x + "y :" +y);
//      
      
      x = x ^ y;
      y = x ^ y;
      x = x ^ y;
      
      

      System.out.println("x :" +x + "y :" +y);
      

     
    }
}
