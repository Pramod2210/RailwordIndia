package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        float f= 2.5245f;
//        double d= 2.45558;
//        
//        System.out.printf("%.3f",f);
//        System.out.println();
//        System.out.printf("%.2f",d);
		
	 Scanner sc= new Scanner(System.in);
	 
	    System.out.println("enter the no of  element");
	    
	    int range = sc.nextInt();
	    
	    int a[]= new int[range];
	    
	    for(int i=0;i<range;i++) {
	    	System.out.println("eter te element");
	    	int x= sc.nextInt();
	    	a[i]=x;
	    }
	    
	    int temp;
	    
	    
	    for(int i=0;i<a.length;i++) {
	    	for(int j=i+1;j<a.length;j++){
	    		if(a[i]<a[j]) {
	    			temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    		}
	    	}
	    	
	    }
	    
	    int max=a[0];  //50
	    int max2=a[0];  //50
	    
	    for(int i=1;i<range;i++) {
	    	if(a[i]<max) {
	    		max2=a[i];
	    		break;
	    	}
	    	
	    }
	    System.out.println(max2);
	   
	    
	 
	}

}
