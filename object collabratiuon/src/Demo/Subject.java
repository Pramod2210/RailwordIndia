package Demo;

public class Subject {
    
   String subname;

public Subject(String subname) {
	super();
	this.subname = subname;
}

public String getSubname() {
	return subname;
}

public void setSubname(String subname) {
	this.subname = subname;
}

@Override
public String toString() {
	return "Subject [subname=" + subname + "]";
}
   
   
   
   
	 
}
