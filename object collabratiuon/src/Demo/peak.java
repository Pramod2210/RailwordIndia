package Demo;

public class peak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int a[]= {5,10,20,15,45,35,2,5,3};
	
		for(int i=1;i<a.length-1;i++) {
			if(a[i-1]<a[i] && a[i+1] < a[i]) {
			
				System.out.println(a[i]);
			}
			
		}
//		
		
	}
}
