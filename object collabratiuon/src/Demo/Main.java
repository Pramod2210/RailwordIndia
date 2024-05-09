package Demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		School s= new School("railword india pvt ltd");
		
		Subject sub= new Subject("Java Developer");
		
		Student s1= new Student();
		
		s1.setId(1);
		s1.setName("pramod");
		s1.setS(s);
		s1.setSub(sub);
		System.out.println(s1);
		
	}

}
