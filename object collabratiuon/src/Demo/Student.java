package Demo;

public class Student {
    
	
	int id;
	String name;
	School s;
	Subject sub;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School getS() {
		return s;
	}

	public void setS(School s) {
		this.s = s;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", s=" + s + ", sub=" + sub + "]";
	}
	
	
}
